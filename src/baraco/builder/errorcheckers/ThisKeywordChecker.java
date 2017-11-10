package baraco.builder.errorcheckers;

import baraco.antlr.parser.BaracoParser;
import baraco.builder.BuildChecker;
import baraco.builder.ErrorRepository;

public class ThisKeywordChecker implements IErrorChecker{

    private BaracoParser.ExpressionContext exprCtx;
    private int lineNumber;

    public ThisKeywordChecker(BaracoParser.ExpressionContext exprCtx) {
        this.exprCtx = exprCtx;
        this.lineNumber = this.exprCtx.getStart().getLine();
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.builder.errorcheckers.IErrorChecker#verify()
     */
    @Override
    public void verify() {
        if(exprCtx.Identifier() == null && this.exprCtx.primary() == null) {
            BuildChecker.reportCustomError(ErrorRepository.MISSING_THIS_KEYWORD, "", this.exprCtx.getText(), this.lineNumber);
        }
    }
}
