package moka.error;

import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

/**
 * Created by patricktobias on 18/10/2017.
 */
public class BaracoErrorStrategy implements ANTLRErrorStrategy {
    @Override
    public void reset(Parser parser) {

    }

    @Override
    public Token recoverInline(Parser parser) throws RecognitionException {
        return null;
    }

    @Override
    public void recover(Parser parser, RecognitionException e) throws RecognitionException {

    }

    @Override
    public void sync(Parser parser) throws RecognitionException {

    }

    @Override
    public boolean inErrorRecoveryMode(Parser parser) {
        return false;
    }

    @Override
    public void reportMatch(Parser parser) {

    }

    @Override
    public void reportError(Parser parser, RecognitionException e) {

    }
}
