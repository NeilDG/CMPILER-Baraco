// Generated from Moka.G4 by ANTLR 4.7
package moka.lexer;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STMTEND=7, VOID=8, SCANINT=9, 
		SCANDEC=10, SCANSTR=11, PRINT=12, PRINTLN=13, RETURN=14, IF=15, ELSE=16, 
		WHILE=17, DO=18, FOR=19, CONST=20, NULL=21, LPAREN=22, RPAREN=23, LBRACE=24, 
		RBRACE=25, LBRACK=26, RBRACK=27, SEMI=28, END=29, COMMA=30, DOT=31, ASSIGN=32, 
		GT=33, LT=34, BANG=35, TILDE=36, QUESTION=37, COLON=38, EQUAL=39, LE=40, 
		GE=41, NOTEQUAL=42, AND=43, OR=44, INC=45, DEC=46, ADD=47, SUB=48, MUL=49, 
		DIV=50, BITAND=51, BITOR=52, CARET=53, MOD=54, ADD_ASSIGN=55, SUB_ASSIGN=56, 
		MUL_ASSIGN=57, DIV_ASSIGN=58, AND_ASSIGN=59, OR_ASSIGN=60, XOR_ASSIGN=61, 
		MOD_ASSIGN=62, LSHIFT_ASSIGN=63, RSHIFT_ASSIGN=64, URSHIFT_ASSIGN=65, 
		IntegerLiteral=66, BooleanLiteral=67, FloatingPointLiteral=68, CharacterLiteral=69, 
		StringLiteral=70, Identifier=71, WS=72, COMMENT=73, LINE_COMMENT=74;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "STMTEND", "NEWLINE", 
		"VOID", "SCANINT", "SCANDEC", "SCANSTR", "PRINT", "PRINTLN", "RETURN", 
		"IF", "ELSE", "WHILE", "DO", "FOR", "CONST", "NULL", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "END", "COMMA", "DOT", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
		"BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "IntegerLiteral", "DecimalIntegerLiteral", 
		"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitOrUnderscore", 
		"OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitOrUnderscore", 
		"BinaryNumeral", "BinaryDigits", "BinaryDigit", "BinaryDigitOrUnderscore", 
		"BooleanLiteral", "FloatingPointLiteral", "DecimalFloatingPointLiteral", 
		"ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", 
		"HexadecimalFloatingPointLiteral", "HexSignificand", "BinaryExponent", 
		"BinaryExponentIndicator", "CharacterLiteral", "SingleCharacter", "StringLiteral", 
		"StringCharacters", "StringCharacter", "EscapeSequence", "OctalEscape", 
		"UnicodeEscape", "ZeroToThree", "Identifier", "Letter", "LetterOrDigit", 
		"WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'decimal'", "'string'", "'break'", "'continue'", "'and'",
		null, "'void'", "'scanInt'", "'scanDecimal'", "'scanString'", "'print'",
		"'println'", "'return'", "'if'", "'else'", "'while'", "'do'", "'for'", 
		"'const'", "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
		"'end'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'or'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "DEC", "STRING", "BREAK", "CONTINUE", "AND", "STMTEND", "VOID", "SCANINT",
		"SCANDEC", "SCANSTR", "PRINT", "PRINTLN", "RETURN", "IF", "ELSE", "WHILE", 
		"DO", "FOR", "CONST", "NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMI", "END", "COMMA", "DOT", "ASSIGN", "GT", "LT", 
		"BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
		"CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "IntegerLiteral", "BooleanLiteral", 
		"FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "Identifier", 
		"WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Moka.G4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u031d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\6\b\u0115\n\b\r\b\16\b\u0116\3\t\3\t\3\t\5\t\u011c\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/"+
		"\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>"+
		"\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D"+
		"\3D\3D\5D\u01ec\nD\3E\3E\5E\u01f0\nE\3F\3F\5F\u01f4\nF\3G\3G\5G\u01f8"+
		"\nG\3H\3H\5H\u01fc\nH\3I\3I\3J\3J\3J\5J\u0203\nJ\3J\3J\3J\5J\u0208\nJ"+
		"\5J\u020a\nJ\3K\3K\7K\u020e\nK\fK\16K\u0211\13K\3K\5K\u0214\nK\3L\3L\5"+
		"L\u0218\nL\3M\3M\3N\3N\5N\u021e\nN\3O\6O\u0221\nO\rO\16O\u0222\3P\3P\3"+
		"P\3P\3Q\3Q\7Q\u022b\nQ\fQ\16Q\u022e\13Q\3Q\5Q\u0231\nQ\3R\3R\3S\3S\5S"+
		"\u0237\nS\3T\3T\5T\u023b\nT\3T\3T\3U\3U\7U\u0241\nU\fU\16U\u0244\13U\3"+
		"U\5U\u0247\nU\3V\3V\3W\3W\5W\u024d\nW\3X\3X\3X\3X\3Y\3Y\7Y\u0255\nY\f"+
		"Y\16Y\u0258\13Y\3Y\5Y\u025b\nY\3Z\3Z\3[\3[\5[\u0261\n[\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\5\\\u026c\n\\\3]\3]\5]\u0270\n]\3^\3^\3^\5^\u0275"+
		"\n^\3^\5^\u0278\n^\3^\5^\u027b\n^\3^\3^\3^\5^\u0280\n^\3^\5^\u0283\n^"+
		"\3^\3^\3^\5^\u0288\n^\3^\3^\3^\5^\u028d\n^\3_\3_\3_\3`\3`\3a\5a\u0295"+
		"\na\3a\3a\3b\3b\3c\3c\3d\3d\3d\5d\u02a0\nd\3e\3e\5e\u02a4\ne\3e\3e\3e"+
		"\5e\u02a9\ne\3e\3e\5e\u02ad\ne\3f\3f\3f\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\5h\u02bc\nh\3i\3i\3j\3j\5j\u02c2\nj\3j\3j\3k\6k\u02c7\nk\rk\16k\u02c8"+
		"\3l\3l\5l\u02cd\nl\3m\3m\3m\3m\5m\u02d3\nm\3n\3n\3n\3n\3n\3n\3n\3n\3n"+
		"\3n\3n\5n\u02e0\nn\3o\3o\3o\3o\3o\3o\3o\3p\3p\3q\3q\7q\u02ed\nq\fq\16"+
		"q\u02f0\13q\3r\3r\3r\3r\5r\u02f6\nr\3s\3s\3s\3s\5s\u02fc\ns\3t\6t\u02ff"+
		"\nt\rt\16t\u0300\3t\3t\3u\3u\3u\3u\7u\u0309\nu\fu\16u\u030c\13u\3u\3u"+
		"\3u\3u\3u\3v\3v\3v\3v\7v\u0317\nv\fv\16v\u031a\13v\3v\3v\3\u030a\2w\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\n\25\13\27\f\31\r\33\16\35\17\37"+
		"\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36="+
		"\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67"+
		"o8q9s:u;w<y={>}?\177@\u0081A\u0083B\u0085C\u0087D\u0089\2\u008b\2\u008d"+
		"\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f"+
		"\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1"+
		"\2\u00b3\2\u00b5\2\u00b7E\u00b9F\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3"+
		"\2\u00c5\2\u00c7\2\u00c9\2\u00cb\2\u00cd\2\u00cfG\u00d1\2\u00d3H\u00d5"+
		"\2\u00d7\2\u00d9\2\u00db\2\u00dd\2\u00df\2\u00e1I\u00e3\2\u00e5\2\u00e7"+
		"J\u00e9K\u00ebL\3\2\31\4\2\f\f\17\17\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;C"+
		"Hch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\5\2"+
		"\17\17))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0081"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\13"+
		"\16\17\"\"\3\2\17\17\2\u032c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2"+
		"\2\2\u00cf\3\2\2\2\2\u00d3\3\2\2\2\2\u00e1\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9"+
		"\3\2\2\2\2\u00eb\3\2\2\2\3\u00ed\3\2\2\2\5\u00f1\3\2\2\2\7\u00f9\3\2\2"+
		"\2\t\u0100\3\2\2\2\13\u0106\3\2\2\2\r\u010f\3\2\2\2\17\u0114\3\2\2\2\21"+
		"\u011b\3\2\2\2\23\u011d\3\2\2\2\25\u0122\3\2\2\2\27\u012a\3\2\2\2\31\u0136"+
		"\3\2\2\2\33\u0141\3\2\2\2\35\u0147\3\2\2\2\37\u014f\3\2\2\2!\u0156\3\2"+
		"\2\2#\u0159\3\2\2\2%\u015e\3\2\2\2\'\u0164\3\2\2\2)\u0167\3\2\2\2+\u016b"+
		"\3\2\2\2-\u0171\3\2\2\2/\u0176\3\2\2\2\61\u0178\3\2\2\2\63\u017a\3\2\2"+
		"\2\65\u017c\3\2\2\2\67\u017e\3\2\2\29\u0180\3\2\2\2;\u0182\3\2\2\2=\u0184"+
		"\3\2\2\2?\u0188\3\2\2\2A\u018a\3\2\2\2C\u018c\3\2\2\2E\u018e\3\2\2\2G"+
		"\u0190\3\2\2\2I\u0192\3\2\2\2K\u0194\3\2\2\2M\u0196\3\2\2\2O\u0198\3\2"+
		"\2\2Q\u019a\3\2\2\2S\u019d\3\2\2\2U\u01a0\3\2\2\2W\u01a3\3\2\2\2Y\u01a6"+
		"\3\2\2\2[\u01a9\3\2\2\2]\u01ac\3\2\2\2_\u01af\3\2\2\2a\u01b2\3\2\2\2c"+
		"\u01b4\3\2\2\2e\u01b6\3\2\2\2g\u01b8\3\2\2\2i\u01ba\3\2\2\2k\u01bc\3\2"+
		"\2\2m\u01be\3\2\2\2o\u01c0\3\2\2\2q\u01c2\3\2\2\2s\u01c5\3\2\2\2u\u01c8"+
		"\3\2\2\2w\u01cb\3\2\2\2y\u01ce\3\2\2\2{\u01d1\3\2\2\2}\u01d4\3\2\2\2\177"+
		"\u01d7\3\2\2\2\u0081\u01da\3\2\2\2\u0083\u01de\3\2\2\2\u0085\u01e2\3\2"+
		"\2\2\u0087\u01eb\3\2\2\2\u0089\u01ed\3\2\2\2\u008b\u01f1\3\2\2\2\u008d"+
		"\u01f5\3\2\2\2\u008f\u01f9\3\2\2\2\u0091\u01fd\3\2\2\2\u0093\u0209\3\2"+
		"\2\2\u0095\u020b\3\2\2\2\u0097\u0217\3\2\2\2\u0099\u0219\3\2\2\2\u009b"+
		"\u021d\3\2\2\2\u009d\u0220\3\2\2\2\u009f\u0224\3\2\2\2\u00a1\u0228\3\2"+
		"\2\2\u00a3\u0232\3\2\2\2\u00a5\u0236\3\2\2\2\u00a7\u0238\3\2\2\2\u00a9"+
		"\u023e\3\2\2\2\u00ab\u0248\3\2\2\2\u00ad\u024c\3\2\2\2\u00af\u024e\3\2"+
		"\2\2\u00b1\u0252\3\2\2\2\u00b3\u025c\3\2\2\2\u00b5\u0260\3\2\2\2\u00b7"+
		"\u026b\3\2\2\2\u00b9\u026f\3\2\2\2\u00bb\u028c\3\2\2\2\u00bd\u028e\3\2"+
		"\2\2\u00bf\u0291\3\2\2\2\u00c1\u0294\3\2\2\2\u00c3\u0298\3\2\2\2\u00c5"+
		"\u029a\3\2\2\2\u00c7\u029c\3\2\2\2\u00c9\u02ac\3\2\2\2\u00cb\u02ae\3\2"+
		"\2\2\u00cd\u02b1\3\2\2\2\u00cf\u02bb\3\2\2\2\u00d1\u02bd\3\2\2\2\u00d3"+
		"\u02bf\3\2\2\2\u00d5\u02c6\3\2\2\2\u00d7\u02cc\3\2\2\2\u00d9\u02d2\3\2"+
		"\2\2\u00db\u02df\3\2\2\2\u00dd\u02e1\3\2\2\2\u00df\u02e8\3\2\2\2\u00e1"+
		"\u02ea\3\2\2\2\u00e3\u02f5\3\2\2\2\u00e5\u02fb\3\2\2\2\u00e7\u02fe\3\2"+
		"\2\2\u00e9\u0304\3\2\2\2\u00eb\u0312\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee"+
		"\u00ef\7p\2\2\u00ef\u00f0\7v\2\2\u00f0\4\3\2\2\2\u00f1\u00f2\7f\2\2\u00f2"+
		"\u00f3\7g\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7o\2\2"+
		"\u00f6\u00f7\7c\2\2\u00f7\u00f8\7n\2\2\u00f8\6\3\2\2\2\u00f9\u00fa\7u"+
		"\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe"+
		"\7p\2\2\u00fe\u00ff\7i\2\2\u00ff\b\3\2\2\2\u0100\u0101\7d\2\2\u0101\u0102"+
		"\7t\2\2\u0102\u0103\7g\2\2\u0103\u0104\7c\2\2\u0104\u0105\7m\2\2\u0105"+
		"\n\3\2\2\2\u0106\u0107\7e\2\2\u0107\u0108\7q\2\2\u0108\u0109\7p\2\2\u0109"+
		"\u010a\7v\2\2\u010a\u010b\7k\2\2\u010b\u010c\7p\2\2\u010c\u010d\7w\2\2"+
		"\u010d\u010e\7g\2\2\u010e\f\3\2\2\2\u010f\u0110\7c\2\2\u0110\u0111\7p"+
		"\2\2\u0111\u0112\7f\2\2\u0112\16\3\2\2\2\u0113\u0115\5\21\t\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\20\3\2\2\2\u0118\u0119\7\17\2\2\u0119\u011c\7\f\2\2\u011a\u011c\t\2\2"+
		"\2\u011b\u0118\3\2\2\2\u011b\u011a\3\2\2\2\u011c\22\3\2\2\2\u011d\u011e"+
		"\7x\2\2\u011e\u011f\7q\2\2\u011f\u0120\7k\2\2\u0120\u0121\7f\2\2\u0121"+
		"\24\3\2\2\2\u0122\u0123\7u\2\2\u0123\u0124\7e\2\2\u0124\u0125\7c\2\2\u0125"+
		"\u0126\7p\2\2\u0126\u0127\7K\2\2\u0127\u0128\7p\2\2\u0128\u0129\7v\2\2"+
		"\u0129\26\3\2\2\2\u012a\u012b\7u\2\2\u012b\u012c\7e\2\2\u012c\u012d\7"+
		"c\2\2\u012d\u012e\7p\2\2\u012e\u012f\7F\2\2\u012f\u0130\7g\2\2\u0130\u0131"+
		"\7e\2\2\u0131\u0132\7k\2\2\u0132\u0133\7o\2\2\u0133\u0134\7c\2\2\u0134"+
		"\u0135\7n\2\2\u0135\30\3\2\2\2\u0136\u0137\7u\2\2\u0137\u0138\7e\2\2\u0138"+
		"\u0139\7c\2\2\u0139\u013a\7p\2\2\u013a\u013b\7U\2\2\u013b\u013c\7v\2\2"+
		"\u013c\u013d\7t\2\2\u013d\u013e\7k\2\2\u013e\u013f\7p\2\2\u013f\u0140"+
		"\7i\2\2\u0140\32\3\2\2\2\u0141\u0142\7r\2\2\u0142\u0143\7t\2\2\u0143\u0144"+
		"\7k\2\2\u0144\u0145\7p\2\2\u0145\u0146\7v\2\2\u0146\34\3\2\2\2\u0147\u0148"+
		"\7r\2\2\u0148\u0149\7t\2\2\u0149\u014a\7k\2\2\u014a\u014b\7p\2\2\u014b"+
		"\u014c\7v\2\2\u014c\u014d\7n\2\2\u014d\u014e\7p\2\2\u014e\36\3\2\2\2\u014f"+
		"\u0150\7t\2\2\u0150\u0151\7g\2\2\u0151\u0152\7v\2\2\u0152\u0153\7w\2\2"+
		"\u0153\u0154\7t\2\2\u0154\u0155\7p\2\2\u0155 \3\2\2\2\u0156\u0157\7k\2"+
		"\2\u0157\u0158\7h\2\2\u0158\"\3\2\2\2\u0159\u015a\7g\2\2\u015a\u015b\7"+
		"n\2\2\u015b\u015c\7u\2\2\u015c\u015d\7g\2\2\u015d$\3\2\2\2\u015e\u015f"+
		"\7y\2\2\u015f\u0160\7j\2\2\u0160\u0161\7k\2\2\u0161\u0162\7n\2\2\u0162"+
		"\u0163\7g\2\2\u0163&\3\2\2\2\u0164\u0165\7f\2\2\u0165\u0166\7q\2\2\u0166"+
		"(\3\2\2\2\u0167\u0168\7h\2\2\u0168\u0169\7q\2\2\u0169\u016a\7t\2\2\u016a"+
		"*\3\2\2\2\u016b\u016c\7e\2\2\u016c\u016d\7q\2\2\u016d\u016e\7p\2\2\u016e"+
		"\u016f\7u\2\2\u016f\u0170\7v\2\2\u0170,\3\2\2\2\u0171\u0172\7p\2\2\u0172"+
		"\u0173\7w\2\2\u0173\u0174\7n\2\2\u0174\u0175\7n\2\2\u0175.\3\2\2\2\u0176"+
		"\u0177\7*\2\2\u0177\60\3\2\2\2\u0178\u0179\7+\2\2\u0179\62\3\2\2\2\u017a"+
		"\u017b\7}\2\2\u017b\64\3\2\2\2\u017c\u017d\7\177\2\2\u017d\66\3\2\2\2"+
		"\u017e\u017f\7]\2\2\u017f8\3\2\2\2\u0180\u0181\7_\2\2\u0181:\3\2\2\2\u0182"+
		"\u0183\7=\2\2\u0183<\3\2\2\2\u0184\u0185\7g\2\2\u0185\u0186\7p\2\2\u0186"+
		"\u0187\7f\2\2\u0187>\3\2\2\2\u0188\u0189\7.\2\2\u0189@\3\2\2\2\u018a\u018b"+
		"\7\60\2\2\u018bB\3\2\2\2\u018c\u018d\7?\2\2\u018dD\3\2\2\2\u018e\u018f"+
		"\7@\2\2\u018fF\3\2\2\2\u0190\u0191\7>\2\2\u0191H\3\2\2\2\u0192\u0193\7"+
		"#\2\2\u0193J\3\2\2\2\u0194\u0195\7\u0080\2\2\u0195L\3\2\2\2\u0196\u0197"+
		"\7A\2\2\u0197N\3\2\2\2\u0198\u0199\7<\2\2\u0199P\3\2\2\2\u019a\u019b\7"+
		"?\2\2\u019b\u019c\7?\2\2\u019cR\3\2\2\2\u019d\u019e\7>\2\2\u019e\u019f"+
		"\7?\2\2\u019fT\3\2\2\2\u01a0\u01a1\7@\2\2\u01a1\u01a2\7?\2\2\u01a2V\3"+
		"\2\2\2\u01a3\u01a4\7#\2\2\u01a4\u01a5\7?\2\2\u01a5X\3\2\2\2\u01a6\u01a7"+
		"\7(\2\2\u01a7\u01a8\7(\2\2\u01a8Z\3\2\2\2\u01a9\u01aa\7q\2\2\u01aa\u01ab"+
		"\7t\2\2\u01ab\\\3\2\2\2\u01ac\u01ad\7-\2\2\u01ad\u01ae\7-\2\2\u01ae^\3"+
		"\2\2\2\u01af\u01b0\7/\2\2\u01b0\u01b1\7/\2\2\u01b1`\3\2\2\2\u01b2\u01b3"+
		"\7-\2\2\u01b3b\3\2\2\2\u01b4\u01b5\7/\2\2\u01b5d\3\2\2\2\u01b6\u01b7\7"+
		",\2\2\u01b7f\3\2\2\2\u01b8\u01b9\7\61\2\2\u01b9h\3\2\2\2\u01ba\u01bb\7"+
		"(\2\2\u01bbj\3\2\2\2\u01bc\u01bd\7~\2\2\u01bdl\3\2\2\2\u01be\u01bf\7`"+
		"\2\2\u01bfn\3\2\2\2\u01c0\u01c1\7\'\2\2\u01c1p\3\2\2\2\u01c2\u01c3\7-"+
		"\2\2\u01c3\u01c4\7?\2\2\u01c4r\3\2\2\2\u01c5\u01c6\7/\2\2\u01c6\u01c7"+
		"\7?\2\2\u01c7t\3\2\2\2\u01c8\u01c9\7,\2\2\u01c9\u01ca\7?\2\2\u01cav\3"+
		"\2\2\2\u01cb\u01cc\7\61\2\2\u01cc\u01cd\7?\2\2\u01cdx\3\2\2\2\u01ce\u01cf"+
		"\7(\2\2\u01cf\u01d0\7?\2\2\u01d0z\3\2\2\2\u01d1\u01d2\7~\2\2\u01d2\u01d3"+
		"\7?\2\2\u01d3|\3\2\2\2\u01d4\u01d5\7`\2\2\u01d5\u01d6\7?\2\2\u01d6~\3"+
		"\2\2\2\u01d7\u01d8\7\'\2\2\u01d8\u01d9\7?\2\2\u01d9\u0080\3\2\2\2\u01da"+
		"\u01db\7>\2\2\u01db\u01dc\7>\2\2\u01dc\u01dd\7?\2\2\u01dd\u0082\3\2\2"+
		"\2\u01de\u01df\7@\2\2\u01df\u01e0\7@\2\2\u01e0\u01e1\7?\2\2\u01e1\u0084"+
		"\3\2\2\2\u01e2\u01e3\7@\2\2\u01e3\u01e4\7@\2\2\u01e4\u01e5\7@\2\2\u01e5"+
		"\u01e6\7?\2\2\u01e6\u0086\3\2\2\2\u01e7\u01ec\5\u0089E\2\u01e8\u01ec\5"+
		"\u008bF\2\u01e9\u01ec\5\u008dG\2\u01ea\u01ec\5\u008fH\2\u01eb\u01e7\3"+
		"\2\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec"+
		"\u0088\3\2\2\2\u01ed\u01ef\5\u0093J\2\u01ee\u01f0\5\u0091I\2\u01ef\u01ee"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u008a\3\2\2\2\u01f1\u01f3\5\u009fP"+
		"\2\u01f2\u01f4\5\u0091I\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u008c\3\2\2\2\u01f5\u01f7\5\u00a7T\2\u01f6\u01f8\5\u0091I\2\u01f7\u01f6"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u008e\3\2\2\2\u01f9\u01fb\5\u00afX"+
		"\2\u01fa\u01fc\5\u0091I\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u0090\3\2\2\2\u01fd\u01fe\t\3\2\2\u01fe\u0092\3\2\2\2\u01ff\u020a\7\62"+
		"\2\2\u0200\u0207\5\u0099M\2\u0201\u0203\5\u0095K\2\u0202\u0201\3\2\2\2"+
		"\u0202\u0203\3\2\2\2\u0203\u0208\3\2\2\2\u0204\u0205\5\u009dO\2\u0205"+
		"\u0206\5\u0095K\2\u0206\u0208\3\2\2\2\u0207\u0202\3\2\2\2\u0207\u0204"+
		"\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u01ff\3\2\2\2\u0209\u0200\3\2\2\2\u020a"+
		"\u0094\3\2\2\2\u020b\u0213\5\u0097L\2\u020c\u020e\5\u009bN\2\u020d\u020c"+
		"\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0214\5\u0097L\2\u0213\u020f"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0096\3\2\2\2\u0215\u0218\7\62\2\2"+
		"\u0216\u0218\5\u0099M\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218"+
		"\u0098\3\2\2\2\u0219\u021a\t\4\2\2\u021a\u009a\3\2\2\2\u021b\u021e\5\u0097"+
		"L\2\u021c\u021e\7a\2\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021e\u009c"+
		"\3\2\2\2\u021f\u0221\7a\2\2\u0220\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u009e\3\2\2\2\u0224\u0225\7\62"+
		"\2\2\u0225\u0226\t\5\2\2\u0226\u0227\5\u00a1Q\2\u0227\u00a0\3\2\2\2\u0228"+
		"\u0230\5\u00a3R\2\u0229\u022b\5\u00a5S\2\u022a\u0229\3\2\2\2\u022b\u022e"+
		"\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022f\u0231\5\u00a3R\2\u0230\u022c\3\2\2\2\u0230\u0231"+
		"\3\2\2\2\u0231\u00a2\3\2\2\2\u0232\u0233\t\6\2\2\u0233\u00a4\3\2\2\2\u0234"+
		"\u0237\5\u00a3R\2\u0235\u0237\7a\2\2\u0236\u0234\3\2\2\2\u0236\u0235\3"+
		"\2\2\2\u0237\u00a6\3\2\2\2\u0238\u023a\7\62\2\2\u0239\u023b\5\u009dO\2"+
		"\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d"+
		"\5\u00a9U\2\u023d\u00a8\3\2\2\2\u023e\u0246\5\u00abV\2\u023f\u0241\5\u00ad"+
		"W\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0247\5\u00ab"+
		"V\2\u0246\u0242\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u00aa\3\2\2\2\u0248"+
		"\u0249\t\7\2\2\u0249\u00ac\3\2\2\2\u024a\u024d\5\u00abV\2\u024b\u024d"+
		"\7a\2\2\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024d\u00ae\3\2\2\2\u024e"+
		"\u024f\7\62\2\2\u024f\u0250\t\b\2\2\u0250\u0251\5\u00b1Y\2\u0251\u00b0"+
		"\3\2\2\2\u0252\u025a\5\u00b3Z\2\u0253\u0255\5\u00b5[\2\u0254\u0253\3\2"+
		"\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u0259\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025b\5\u00b3Z\2\u025a\u0256"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u00b2\3\2\2\2\u025c\u025d\t\t\2\2\u025d"+
		"\u00b4\3\2\2\2\u025e\u0261\5\u00b3Z\2\u025f\u0261\7a\2\2\u0260\u025e\3"+
		"\2\2\2\u0260\u025f\3\2\2\2\u0261\u00b6\3\2\2\2\u0262\u0263\7v\2\2\u0263"+
		"\u0264\7t\2\2\u0264\u0265\7w\2\2\u0265\u026c\7g\2\2\u0266\u0267\7h\2\2"+
		"\u0267\u0268\7c\2\2\u0268\u0269\7n\2\2\u0269\u026a\7u\2\2\u026a\u026c"+
		"\7g\2\2\u026b\u0262\3\2\2\2\u026b\u0266\3\2\2\2\u026c\u00b8\3\2\2\2\u026d"+
		"\u0270\5\u00bb^\2\u026e\u0270\5\u00c7d\2\u026f\u026d\3\2\2\2\u026f\u026e"+
		"\3\2\2\2\u0270\u00ba\3\2\2\2\u0271\u0272\5\u0095K\2\u0272\u0274\7\60\2"+
		"\2\u0273\u0275\5\u0095K\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u0277\3\2\2\2\u0276\u0278\5\u00bd_\2\u0277\u0276\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u027b\5\u00c5c\2\u027a\u0279\3\2\2"+
		"\2\u027a\u027b\3\2\2\2\u027b\u028d\3\2\2\2\u027c\u027d\7\60\2\2\u027d"+
		"\u027f\5\u0095K\2\u027e\u0280\5\u00bd_\2\u027f\u027e\3\2\2\2\u027f\u0280"+
		"\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u0283\5\u00c5c\2\u0282\u0281\3\2\2"+
		"\2\u0282\u0283\3\2\2\2\u0283\u028d\3\2\2\2\u0284\u0285\5\u0095K\2\u0285"+
		"\u0287\5\u00bd_\2\u0286\u0288\5\u00c5c\2\u0287\u0286\3\2\2\2\u0287\u0288"+
		"\3\2\2\2\u0288\u028d\3\2\2\2\u0289\u028a\5\u0095K\2\u028a\u028b\5\u00c5"+
		"c\2\u028b\u028d\3\2\2\2\u028c\u0271\3\2\2\2\u028c\u027c\3\2\2\2\u028c"+
		"\u0284\3\2\2\2\u028c\u0289\3\2\2\2\u028d\u00bc\3\2\2\2\u028e\u028f\5\u00bf"+
		"`\2\u028f\u0290\5\u00c1a\2\u0290\u00be\3\2\2\2\u0291\u0292\t\n\2\2\u0292"+
		"\u00c0\3\2\2\2\u0293\u0295\5\u00c3b\2\u0294\u0293\3\2\2\2\u0294\u0295"+
		"\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\5\u0095K\2\u0297\u00c2\3\2\2"+
		"\2\u0298\u0299\t\13\2\2\u0299\u00c4\3\2\2\2\u029a\u029b\t\f\2\2\u029b"+
		"\u00c6\3\2\2\2\u029c\u029d\5\u00c9e\2\u029d\u029f\5\u00cbf\2\u029e\u02a0"+
		"\5\u00c5c\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u00c8\3\2\2"+
		"\2\u02a1\u02a3\5\u009fP\2\u02a2\u02a4\7\60\2\2\u02a3\u02a2\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02ad\3\2\2\2\u02a5\u02a6\7\62\2\2\u02a6\u02a8\t"+
		"\5\2\2\u02a7\u02a9\5\u00a1Q\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2"+
		"\u02a9\u02aa\3\2\2\2\u02aa\u02ab\7\60\2\2\u02ab\u02ad\5\u00a1Q\2\u02ac"+
		"\u02a1\3\2\2\2\u02ac\u02a5\3\2\2\2\u02ad\u00ca\3\2\2\2\u02ae\u02af\5\u00cd"+
		"g\2\u02af\u02b0\5\u00c1a\2\u02b0\u00cc\3\2\2\2\u02b1\u02b2\t\r\2\2\u02b2"+
		"\u00ce\3\2\2\2\u02b3\u02b4\7)\2\2\u02b4\u02b5\5\u00d1i\2\u02b5\u02b6\7"+
		")\2\2\u02b6\u02bc\3\2\2\2\u02b7\u02b8\7)\2\2\u02b8\u02b9\5\u00d9m\2\u02b9"+
		"\u02ba\7)\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b3\3\2\2\2\u02bb\u02b7\3\2"+
		"\2\2\u02bc\u00d0\3\2\2\2\u02bd\u02be\n\16\2\2\u02be\u00d2\3\2\2\2\u02bf"+
		"\u02c1\7$\2\2\u02c0\u02c2\5\u00d5k\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3"+
		"\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7$\2\2\u02c4\u00d4\3\2\2\2\u02c5"+
		"\u02c7\5\u00d7l\2\u02c6\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c6"+
		"\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u00d6\3\2\2\2\u02ca\u02cd\n\17\2\2"+
		"\u02cb\u02cd\5\u00d9m\2\u02cc\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd"+
		"\u00d8\3\2\2\2\u02ce\u02cf\7^\2\2\u02cf\u02d3\t\20\2\2\u02d0\u02d3\5\u00db"+
		"n\2\u02d1\u02d3\5\u00ddo\2\u02d2\u02ce\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2"+
		"\u02d1\3\2\2\2\u02d3\u00da\3\2\2\2\u02d4\u02d5\7^\2\2\u02d5\u02e0\5\u00ab"+
		"V\2\u02d6\u02d7\7^\2\2\u02d7\u02d8\5\u00abV\2\u02d8\u02d9\5\u00abV\2\u02d9"+
		"\u02e0\3\2\2\2\u02da\u02db\7^\2\2\u02db\u02dc\5\u00dfp\2\u02dc\u02dd\5"+
		"\u00abV\2\u02dd\u02de\5\u00abV\2\u02de\u02e0\3\2\2\2\u02df\u02d4\3\2\2"+
		"\2\u02df\u02d6\3\2\2\2\u02df\u02da\3\2\2\2\u02e0\u00dc\3\2\2\2\u02e1\u02e2"+
		"\7^\2\2\u02e2\u02e3\7w\2\2\u02e3\u02e4\5\u00a3R\2\u02e4\u02e5\5\u00a3"+
		"R\2\u02e5\u02e6\5\u00a3R\2\u02e6\u02e7\5\u00a3R\2\u02e7\u00de\3\2\2\2"+
		"\u02e8\u02e9\t\21\2\2\u02e9\u00e0\3\2\2\2\u02ea\u02ee\5\u00e3r\2\u02eb"+
		"\u02ed\5\u00e5s\2\u02ec\u02eb\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec"+
		"\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u00e2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1"+
		"\u02f6\t\22\2\2\u02f2\u02f6\n\23\2\2\u02f3\u02f4\t\24\2\2\u02f4\u02f6"+
		"\t\25\2\2\u02f5\u02f1\3\2\2\2\u02f5\u02f2\3\2\2\2\u02f5\u02f3\3\2\2\2"+
		"\u02f6\u00e4\3\2\2\2\u02f7\u02fc\t\26\2\2\u02f8\u02fc\n\23\2\2\u02f9\u02fa"+
		"\t\24\2\2\u02fa\u02fc\t\25\2\2\u02fb\u02f7\3\2\2\2\u02fb\u02f8\3\2\2\2"+
		"\u02fb\u02f9\3\2\2\2\u02fc\u00e6\3\2\2\2\u02fd\u02ff\t\27\2\2\u02fe\u02fd"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302\u0303\bt\2\2\u0303\u00e8\3\2\2\2\u0304\u0305\7\61"+
		"\2\2\u0305\u0306\7,\2\2\u0306\u030a\3\2\2\2\u0307\u0309\13\2\2\2\u0308"+
		"\u0307\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u030b\3\2\2\2\u030a\u0308\3\2"+
		"\2\2\u030b\u030d\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u030e\7,\2\2\u030e"+
		"\u030f\7\61\2\2\u030f\u0310\3\2\2\2\u0310\u0311\bu\3\2\u0311\u00ea\3\2"+
		"\2\2\u0312\u0313\7\61\2\2\u0313\u0314\7\61\2\2\u0314\u0318\3\2\2\2\u0315"+
		"\u0317\n\30\2\2\u0316\u0315\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3"+
		"\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\3\2\2\2\u031a\u0318\3\2\2\2\u031b"+
		"\u031c\bv\3\2\u031c\u00ec\3\2\2\2\66\2\u0116\u011b\u01eb\u01ef\u01f3\u01f7"+
		"\u01fb\u0202\u0207\u0209\u020f\u0213\u0217\u021d\u0222\u022c\u0230\u0236"+
		"\u023a\u0242\u0246\u024c\u0256\u025a\u0260\u026b\u026f\u0274\u0277\u027a"+
		"\u027f\u0282\u0287\u028c\u0294\u029f\u02a3\u02a8\u02ac\u02bb\u02c1\u02c8"+
		"\u02cc\u02d2\u02df\u02ee\u02f5\u02fb\u0300\u030a\u0318\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}