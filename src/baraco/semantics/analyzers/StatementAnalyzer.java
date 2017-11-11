package baraco.semantics.analyzers;

import baraco.antlr.lexer.BaracoLexer;
import baraco.antlr.parser.BaracoParser.*;
import baraco.execution.ExecutionManager;
import baraco.execution.commands.controlled.*;
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
        else if(isIFStatement(ctx)) {
            //Console.log("Par expression: " +ctx.parExpression().getText());

            StatementContext statementCtx = ctx.statement(0);

            //Console.log(LogType.DEBUG, "IF statement: " +statementCtx.getText());

            IfCommand ifCommand = new IfCommand(ctx.parExpression());
            StatementControlOverseer.getInstance().openConditionalCommand(ifCommand);

            StatementAnalyzer statementAnalyzer = new StatementAnalyzer();
            statementAnalyzer.analyze(statementCtx);

            StatementControlOverseer.getInstance().reportExitPositiveRule();

            //check if there is an ELSE statement
            if (isELSEStatement(ctx)) {
                statementCtx = ctx.statement(1);

                //Console.log(LogType.DEBUG, "ELSE statement: " +statementCtx.getText());
                statementAnalyzer.analyze(statementCtx);
            }

            StatementControlOverseer.getInstance().compileControlledCommand();
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
        else if(isWHILEStatement(ctx)) {
            //Console.log(LogType.DEBUG, "While par expression: " +ctx.parExpression().getText());

            StatementContext statementCtx = ctx.statement(0);

            WhileCommand whileCommand = new WhileCommand(ctx.parExpression());
            StatementControlOverseer.getInstance().openControlledCommand(whileCommand);

            StatementAnalyzer statementAnalyzer = new StatementAnalyzer();
            statementAnalyzer.analyze(statementCtx);

            StatementControlOverseer.getInstance().compileControlledCommand();
            //Console.log(LogType.DEBUG, "End of WHILE expression: " +ctx.parExpression().getText());
        }
        else if(isDOWHILEStatement(ctx)) {
            //Console.log(LogType.DEBUG, "Do while expression: " +ctx.parExpression().getText());

            StatementContext statementCtx = ctx.statement(0);

            DoWhileCommand doWhileCommand = new DoWhileCommand(ctx.parExpression());
            StatementControlOverseer.getInstance().openControlledCommand(doWhileCommand);

            StatementAnalyzer statementAnalyzer = new StatementAnalyzer();
            statementAnalyzer.analyze(statementCtx);

            StatementControlOverseer.getInstance().compileControlledCommand();
            //Console.log(LogType.DEBUG, "End of DO-WHILE expression: " +ctx.parExpression().getText());
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

    public static boolean isIFStatement(StatementContext ctx) {
        List<TerminalNode> tokenList = ctx.getTokens(BaracoLexer.IF);

        return (tokenList.size() != 0);
    }

    public static boolean isELSEStatement(StatementContext ctx) {
        List<TerminalNode> tokenList = ctx.getTokens(BaracoLexer.ELSE);

        return (tokenList.size() != 0);
    }

    public static boolean isWHILEStatement(StatementContext ctx) {
        List<TerminalNode> whileTokenList = ctx.getTokens(BaracoLexer.WHILE);
        List<TerminalNode> doTokenList = ctx.getTokens(BaracoLexer.DO);

        return (whileTokenList.size() != 0 && doTokenList.size() == 0);
    }

    public static boolean isDOWHILEStatement(StatementContext ctx) {
        List<TerminalNode> whileTokenList = ctx.getTokens(BaracoLexer.WHILE);
        List<TerminalNode> doTokenList = ctx.getTokens(BaracoLexer.DO);

        return (whileTokenList.size() != 0 && doTokenList.size() != 0);
    }

}
