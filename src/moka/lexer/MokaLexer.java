package moka.lexer;

// Generated from Moka.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MokaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, VOID=11, SCANINT=12, SCANDEC=13, SCANSTR=14, PRINT=15, PRINTLN=16, 
		RETURN=17, IF=18, ELSE=19, WHILE=20, DO=21, FOR=22, CONST=23, LPAREN=24, 
		RPAREN=25, LBRACE=26, RBRACE=27, LBRACK=28, RBRACK=29, SEMI=30, END=31, 
		COMMA=32, DOT=33, ASSIGN=34, GT=35, LT=36, BANG=37, TILDE=38, QUESTION=39, 
		COLON=40, EQUAL=41, LE=42, GE=43, NOTEQUAL=44, AND=45, OR=46, INC=47, 
		DEC=48, ADD=49, SUB=50, MUL=51, DIV=52, BITAND=53, BITOR=54, CARET=55, 
		MOD=56, ADD_ASSIGN=57, SUB_ASSIGN=58, MUL_ASSIGN=59, DIV_ASSIGN=60, AND_ASSIGN=61, 
		OR_ASSIGN=62, XOR_ASSIGN=63, MOD_ASSIGN=64, LSHIFT_ASSIGN=65, RSHIFT_ASSIGN=66, 
		URSHIFT_ASSIGN=67, Letter=68, Digit=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "VOID", "SCANINT", "SCANDEC", "SCANSTR", "PRINT", "PRINTLN", "RETURN", 
		"IF", "ELSE", "WHILE", "DO", "FOR", "CONST", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "END", "COMMA", "DOT", "ASSIGN", 
		"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
		"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Letter", "Digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'decimal'", "'string'", "'break'", "'continue'", "'\n'", 
		"'and'", "'''", "'\"'", "'\\'", "'void'", "'scanInt'", "'scanDecimal'", 
		"'scanString'", "'print'", "'println'", "'return'", "'if'", "'else'", 
		"'while'", "'do'", "'for'", "'const'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "'end'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", 
		"'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'or'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "DECIMAL", "STRING", "BREAK", "CONTINUE", "NEWLINE", "AND", null, null, null, "VOID",
		"SCANINT", "SCANDEC", "SCANSTR", "PRINT", "PRINTLN", "RETURN", "IF", "ELSE", 
		"WHILE", "DO", "FOR", "CONST", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMI", "END", "COMMA", "DOT", "ASSIGN", "GT", "LT", 
		"BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
		"CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Letter", "Digit"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MokaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Moka.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u0184\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/"+
		"\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3"+
		"=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3"+
		"D\3D\3D\3E\3E\3F\3F\2\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\3\2\4\6\2&&C\\aac|\5\2&&\62;aa\2\u0183\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u0091\3\2\2"+
		"\2\7\u0099\3\2\2\2\t\u00a0\3\2\2\2\13\u00a6\3\2\2\2\r\u00af\3\2\2\2\17"+
		"\u00b1\3\2\2\2\21\u00b5\3\2\2\2\23\u00b7\3\2\2\2\25\u00b9\3\2\2\2\27\u00bb"+
		"\3\2\2\2\31\u00c0\3\2\2\2\33\u00c8\3\2\2\2\35\u00d4\3\2\2\2\37\u00df\3"+
		"\2\2\2!\u00e5\3\2\2\2#\u00ed\3\2\2\2%\u00f4\3\2\2\2\'\u00f7\3\2\2\2)\u00fc"+
		"\3\2\2\2+\u0102\3\2\2\2-\u0105\3\2\2\2/\u0109\3\2\2\2\61\u010f\3\2\2\2"+
		"\63\u0111\3\2\2\2\65\u0113\3\2\2\2\67\u0115\3\2\2\29\u0117\3\2\2\2;\u0119"+
		"\3\2\2\2=\u011b\3\2\2\2?\u011d\3\2\2\2A\u0121\3\2\2\2C\u0123\3\2\2\2E"+
		"\u0125\3\2\2\2G\u0127\3\2\2\2I\u0129\3\2\2\2K\u012b\3\2\2\2M\u012d\3\2"+
		"\2\2O\u012f\3\2\2\2Q\u0131\3\2\2\2S\u0133\3\2\2\2U\u0136\3\2\2\2W\u0139"+
		"\3\2\2\2Y\u013c\3\2\2\2[\u013f\3\2\2\2]\u0142\3\2\2\2_\u0145\3\2\2\2a"+
		"\u0148\3\2\2\2c\u014b\3\2\2\2e\u014d\3\2\2\2g\u014f\3\2\2\2i\u0151\3\2"+
		"\2\2k\u0153\3\2\2\2m\u0155\3\2\2\2o\u0157\3\2\2\2q\u0159\3\2\2\2s\u015b"+
		"\3\2\2\2u\u015e\3\2\2\2w\u0161\3\2\2\2y\u0164\3\2\2\2{\u0167\3\2\2\2}"+
		"\u016a\3\2\2\2\177\u016d\3\2\2\2\u0081\u0170\3\2\2\2\u0083\u0173\3\2\2"+
		"\2\u0085\u0177\3\2\2\2\u0087\u017b\3\2\2\2\u0089\u0180\3\2\2\2\u008b\u0182"+
		"\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090"+
		"\4\3\2\2\2\u0091\u0092\7f\2\2\u0092\u0093\7g\2\2\u0093\u0094\7e\2\2\u0094"+
		"\u0095\7k\2\2\u0095\u0096\7o\2\2\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2"+
		"\u0098\6\3\2\2\2\u0099\u009a\7u\2\2\u009a\u009b\7v\2\2\u009b\u009c\7t"+
		"\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7i\2\2\u009f\b"+
		"\3\2\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7m\2\2\u00a5\n\3\2\2\2\u00a6\u00a7\7e\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7k\2\2"+
		"\u00ab\u00ac\7p\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7g\2\2\u00ae\f\3\2"+
		"\2\2\u00af\u00b0\7\f\2\2\u00b0\16\3\2\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7p\2\2\u00b3\u00b4\7f\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7)\2\2\u00b6\22"+
		"\3\2\2\2\u00b7\u00b8\7$\2\2\u00b8\24\3\2\2\2\u00b9\u00ba\7^\2\2\u00ba"+
		"\26\3\2\2\2\u00bb\u00bc\7x\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00bf\7f\2\2\u00bf\30\3\2\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7e\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7K\2\2\u00c5\u00c6\7p\2\2"+
		"\u00c6\u00c7\7v\2\2\u00c7\32\3\2\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7"+
		"e\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7F\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7o\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3\34\3\2\2\2\u00d4\u00d5\7u\2\2\u00d5"+
		"\u00d6\7e\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7U\2\2"+
		"\u00d9\u00da\7v\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd"+
		"\7p\2\2\u00dd\u00de\7i\2\2\u00de\36\3\2\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1"+
		"\7t\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7v\2\2\u00e4"+
		" \3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7p\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7p\2\2"+
		"\u00ec\"\3\2\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7v"+
		"\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7p\2\2\u00f3$\3"+
		"\2\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7h\2\2\u00f6&\3\2\2\2\u00f7\u00f8"+
		"\7g\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"(\3\2\2\2\u00fc\u00fd\7y\2\2\u00fd\u00fe\7j\2\2\u00fe\u00ff\7k\2\2\u00ff"+
		"\u0100\7n\2\2\u0100\u0101\7g\2\2\u0101*\3\2\2\2\u0102\u0103\7f\2\2\u0103"+
		"\u0104\7q\2\2\u0104,\3\2\2\2\u0105\u0106\7h\2\2\u0106\u0107\7q\2\2\u0107"+
		"\u0108\7t\2\2\u0108.\3\2\2\2\u0109\u010a\7e\2\2\u010a\u010b\7q\2\2\u010b"+
		"\u010c\7p\2\2\u010c\u010d\7u\2\2\u010d\u010e\7v\2\2\u010e\60\3\2\2\2\u010f"+
		"\u0110\7*\2\2\u0110\62\3\2\2\2\u0111\u0112\7+\2\2\u0112\64\3\2\2\2\u0113"+
		"\u0114\7}\2\2\u0114\66\3\2\2\2\u0115\u0116\7\177\2\2\u01168\3\2\2\2\u0117"+
		"\u0118\7]\2\2\u0118:\3\2\2\2\u0119\u011a\7_\2\2\u011a<\3\2\2\2\u011b\u011c"+
		"\7=\2\2\u011c>\3\2\2\2\u011d\u011e\7g\2\2\u011e\u011f\7p\2\2\u011f\u0120"+
		"\7f\2\2\u0120@\3\2\2\2\u0121\u0122\7.\2\2\u0122B\3\2\2\2\u0123\u0124\7"+
		"\60\2\2\u0124D\3\2\2\2\u0125\u0126\7?\2\2\u0126F\3\2\2\2\u0127\u0128\7"+
		"@\2\2\u0128H\3\2\2\2\u0129\u012a\7>\2\2\u012aJ\3\2\2\2\u012b\u012c\7#"+
		"\2\2\u012cL\3\2\2\2\u012d\u012e\7\u0080\2\2\u012eN\3\2\2\2\u012f\u0130"+
		"\7A\2\2\u0130P\3\2\2\2\u0131\u0132\7<\2\2\u0132R\3\2\2\2\u0133\u0134\7"+
		"?\2\2\u0134\u0135\7?\2\2\u0135T\3\2\2\2\u0136\u0137\7>\2\2\u0137\u0138"+
		"\7?\2\2\u0138V\3\2\2\2\u0139\u013a\7@\2\2\u013a\u013b\7?\2\2\u013bX\3"+
		"\2\2\2\u013c\u013d\7#\2\2\u013d\u013e\7?\2\2\u013eZ\3\2\2\2\u013f\u0140"+
		"\7(\2\2\u0140\u0141\7(\2\2\u0141\\\3\2\2\2\u0142\u0143\7q\2\2\u0143\u0144"+
		"\7t\2\2\u0144^\3\2\2\2\u0145\u0146\7-\2\2\u0146\u0147\7-\2\2\u0147`\3"+
		"\2\2\2\u0148\u0149\7/\2\2\u0149\u014a\7/\2\2\u014ab\3\2\2\2\u014b\u014c"+
		"\7-\2\2\u014cd\3\2\2\2\u014d\u014e\7/\2\2\u014ef\3\2\2\2\u014f\u0150\7"+
		",\2\2\u0150h\3\2\2\2\u0151\u0152\7\61\2\2\u0152j\3\2\2\2\u0153\u0154\7"+
		"(\2\2\u0154l\3\2\2\2\u0155\u0156\7~\2\2\u0156n\3\2\2\2\u0157\u0158\7`"+
		"\2\2\u0158p\3\2\2\2\u0159\u015a\7\'\2\2\u015ar\3\2\2\2\u015b\u015c\7-"+
		"\2\2\u015c\u015d\7?\2\2\u015dt\3\2\2\2\u015e\u015f\7/\2\2\u015f\u0160"+
		"\7?\2\2\u0160v\3\2\2\2\u0161\u0162\7,\2\2\u0162\u0163\7?\2\2\u0163x\3"+
		"\2\2\2\u0164\u0165\7\61\2\2\u0165\u0166\7?\2\2\u0166z\3\2\2\2\u0167\u0168"+
		"\7(\2\2\u0168\u0169\7?\2\2\u0169|\3\2\2\2\u016a\u016b\7~\2\2\u016b\u016c"+
		"\7?\2\2\u016c~\3\2\2\2\u016d\u016e\7`\2\2\u016e\u016f\7?\2\2\u016f\u0080"+
		"\3\2\2\2\u0170\u0171\7\'\2\2\u0171\u0172\7?\2\2\u0172\u0082\3\2\2\2\u0173"+
		"\u0174\7>\2\2\u0174\u0175\7>\2\2\u0175\u0176\7?\2\2\u0176\u0084\3\2\2"+
		"\2\u0177\u0178\7@\2\2\u0178\u0179\7@\2\2\u0179\u017a\7?\2\2\u017a\u0086"+
		"\3\2\2\2\u017b\u017c\7@\2\2\u017c\u017d\7@\2\2\u017d\u017e\7@\2\2\u017e"+
		"\u017f\7?\2\2\u017f\u0088\3\2\2\2\u0180\u0181\t\2\2\2\u0181\u008a\3\2"+
		"\2\2\u0182\u0183\t\3\2\2\u0183\u008c\3\2\2\2\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}