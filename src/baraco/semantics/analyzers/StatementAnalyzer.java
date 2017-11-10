package baraco.semantics.analyzers;

import baraco.antlr.parser.BaracoParser.*;
import baraco.execution.ExecutionManager;
import baraco.execution.commands.controlled.IConditionalCommand;
import baraco.execution.commands.controlled.IControlledCommand;
import baraco.execution.commands.simple.PrintCommand;
import baraco.semantics.statements.StatementControlOverseer;

public class StatementAnalyzer {

    public StatementAnalyzer() {

    }

    public void analyze(StatementContext ctx) {

        if(ctx.printStatement() != null) {
            this.handlePrintStatement(ctx);
        }

    }

    private void handlePrintStatement(StatementContext ctx) {
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
}
