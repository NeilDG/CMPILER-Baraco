package baraco.semantics.analyzers;

import baraco.antlr.lexer.BaracoLexer;
import baraco.antlr.parser.BaracoParser.*;
import baraco.execution.ExecutionManager;
import baraco.execution.commands.controlled.ForCommand;
import baraco.execution.commands.controlled.IConditionalCommand;
import baraco.execution.commands.controlled.IControlledCommand;
import baraco.execution.commands.simple.PrintCommand;
import baraco.semantics.statements.StatementControlOverseer;
import baraco.semantics.symboltable.scopes.LocalScopeCreator;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class StatementAnalyzer {

    public StatementAnalyzer() {

    }

    public void analyze(StatementContext ctx) {

        if(ctx.PRINT() != null) {
            this.handlePrintStatement(ctx);
        }
        //an expression
        else if(ctx.statementExpression() != null) {
            StatementExpressionAnalyzer expressionAnalyzer = new StatementExpressionAnalyzer();
            expressionAnalyzer.analyze(ctx.statementExpression());
        }

        //a block statement
        else if(ctx.block() != null) {
            BlockContext blockCtx = ctx.block();

            BlockAnalyzer blockAnalyzer = new BlockAnalyzer();
            blockAnalyzer.analyze(blockCtx);
        }
        else if(isFORStatement(ctx)) {
            System.out.println("FOR expression: " +ctx.forControl().getText());

            LocalScopeCreator.getInstance().openLocalScope();

            ForControlAnalyzer forControlAnalyzer = new ForControlAnalyzer();
            forControlAnalyzer.analyze(ctx.forControl());

            ForCommand forCommand = new ForCommand(forControlAnalyzer.getLocalVarDecContext(), forControlAnalyzer.getExprContext(), forControlAnalyzer.getUpdateCommand());
            StatementControlOverseer.getInstance().openControlledCommand(forCommand);

            StatementContext statementCtx = ctx.statement(0);
            StatementAnalyzer statementAnalyzer = new StatementAnalyzer();
            statementAnalyzer.analyze(statementCtx);

            StatementControlOverseer.getInstance().compileControlledCommand();

            LocalScopeCreator.getInstance().closeLocalScope();
            System.out.println("End of FOR loop");
        }
    }

    private void handlePrintStatement(StatementContext ctx) {
        System.out.println("HANDLE PRINT: " + ctx.expression().size());

        PrintCommand printCommand = new PrintCommand(ctx.expression(0));

        StatementControlOverseer statementControl = StatementControlOverseer.getInstance();
        //add to conditional controlled command
        if(statementControl.isInConditionalCommand()) {
            IConditionalCommand conditionalCommand = (IConditionalCommand) statementControl.getActiveControlledCommand();

            if(statementControl.isInPositiveRule()) {
                conditionalCommand.addPositiveCommand(printCommand);
            }
            else {
                conditionalCommand.addNegativeCommand(printCommand);
            }
        }

        else if(statementControl.isInControlledCommand()) {
            IControlledCommand controlledCommand = (IControlledCommand) statementControl.getActiveControlledCommand();
            controlledCommand.addCommand(printCommand);
        }
        else {
            ExecutionManager.getInstance().addCommand(printCommand);
        }

    }

    public static boolean isFORStatement(StatementContext ctx) {
        List<TerminalNode> forTokenList = ctx.getTokens(BaracoLexer.FOR);

        return (forTokenList.size() != 0);
    }
}
