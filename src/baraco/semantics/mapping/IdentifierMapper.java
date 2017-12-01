package baraco.semantics.mapping;

import baraco.antlr.parser.BaracoParser;
import baraco.execution.MethodTracker;
import baraco.representations.BaracoValue;

public class IdentifierMapper implements IValueMapper{
    private final static String TAG = "IdentifierMapper";

    private IValueMapper valueMapper;

    public IdentifierMapper(String originalExp) {
        if(MethodTracker.getInstance().isInsideFunction()) {
            this.valueMapper = new MethodIdentifierMapper(originalExp, MethodTracker.getInstance().getLatestFunction());
        }
        else {
            this.valueMapper = new ClassIdentifierMapper(originalExp);
        }
    }

    @Override
    public void analyze(BaracoParser.ExpressionContext exprCtx) {
        this.valueMapper.analyze(exprCtx);
    }

    @Override
    public void analyze(BaracoParser.ParExpressionContext exprCtx) {
        this.valueMapper.analyze(exprCtx);
    }

    @Override
    public String getOriginalExp() {
        return this.valueMapper.getOriginalExp();
    }

    @Override
    public String getModifiedExp() {
        return this.valueMapper.getModifiedExp();
    }

    @Override
    public BaracoValue getBaracoValue() {
        return this.valueMapper.getBaracoValue();
    }
}