package baraco.semantics.mapping;

import baraco.antlr.parser.BaracoParser;
import baraco.representations.BaracoValue;

public interface IValueMapper {

    public abstract void analyze(BaracoParser.ExpressionContext exprCtx);
    public abstract void analyze(BaracoParser.ParExpressionContext exprCtx);
    public abstract String getOriginalExp();
    public abstract String getModifiedExp();
    public abstract BaracoValue getBaracoValue();
}
