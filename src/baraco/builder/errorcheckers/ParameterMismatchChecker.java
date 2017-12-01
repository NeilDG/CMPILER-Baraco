package baraco.builder.errorcheckers;

import baraco.antlr.parser.BaracoParser;
import baraco.builder.BuildChecker;
import baraco.builder.ErrorRepository;
import baraco.representations.BaracoMethod;

import java.util.List;

public class ParameterMismatchChecker implements IErrorChecker {

    private BaracoMethod baracoMethod;
    private List<BaracoParser.ExpressionContext> exprCtxList;
    private int lineNumber;

    public ParameterMismatchChecker(BaracoMethod baracoMethod, BaracoParser.ArgumentsContext argumentsCtx) {
        this.baracoMethod = baracoMethod;

        if(argumentsCtx.expressionList() != null) {
            this.exprCtxList = argumentsCtx.expressionList().expression();
        }

        this.lineNumber = argumentsCtx.getStart().getLine();
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.builder.errorcheckers.IErrorChecker#verify()
     */
    @Override
    public void verify() {
        if(this.baracoMethod == null) {
            return;
        }

        if(this.exprCtxList == null && this.baracoMethod.getParameterValueSize() != 0) {
            BuildChecker.reportCustomError(ErrorRepository.PARAMETER_COUNT_MISMATCH, "", this.baracoMethod.getMethodName(), this.lineNumber);
        }
        else if(this.exprCtxList != null && this.exprCtxList.size() != this.baracoMethod.getParameterValueSize()) {
            BuildChecker.reportCustomError(ErrorRepository.PARAMETER_COUNT_MISMATCH, "", this.baracoMethod.getMethodName(), this.lineNumber);
        }
    }
}
