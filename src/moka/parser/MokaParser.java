package moka.parser;

// Generated from Moka.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MokaParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_funcdecl_list = 1, RULE_function_declaration = 2, 
		RULE_function_return = 3, RULE_function_noreturn = 4, RULE_function_name = 5, 
		RULE_parameter_list = 6, RULE_parameters = 7, RULE_function_content = 8, 
		RULE_vardecl_list = 9, RULE_var_decl = 10, RULE_data_type = 11, RULE_identifier_list = 12, 
		RULE_identifier = 13, RULE_subscript = 14, RULE_statement = 15, RULE_statement_end = 16, 
		RULE_assignment_statement = 17, RULE_funccall_statement = 18, RULE_actual_parameter_list = 19, 
		RULE_actual_params = 20, RULE_scan_statement = 21, RULE_print_statement = 22, 
		RULE_return_statement = 23, RULE_if_statement = 24, RULE_while_statement = 25, 
		RULE_do_while_statement = 26, RULE_for_statement = 27, RULE_statement_list = 28, 
		RULE_expression = 29, RULE_string_expression = 30, RULE_num_expression = 31, 
		RULE_num_term = 32, RULE_num_factor = 33, RULE_num_identifier = 34, RULE_string_identifier = 35, 
		RULE_bool_expression = 36, RULE_rel_op = 37, RULE_bool_logical = 38, RULE_bool_term = 39, 
		RULE_bool_factor = 40, RULE_bool_identifier = 41, RULE_constdecl_list = 42, 
		RULE_const_statement = 43, RULE_const_identifier = 44, RULE_constant = 45, 
		RULE_integer = 46, RULE_sign = 47, RULE_floating_point = 48, RULE_floating = 49, 
		RULE_character = 50, RULE_string = 51, RULE_characters = 52, RULE_ascii_charplus = 53, 
		RULE_ascii_char = 54, RULE_digitsplus = 55, RULE_letterplus = 56, RULE_letter_or_digitplus = 57;
	public static final String[] ruleNames = {
		"program", "funcdecl_list", "function_declaration", "function_return", 
		"function_noreturn", "function_name", "parameter_list", "parameters", 
		"function_content", "vardecl_list", "var_decl", "data_type", "identifier_list", 
		"identifier", "subscript", "statement", "statement_end", "assignment_statement", 
		"funccall_statement", "actual_parameter_list", "actual_params", "scan_statement", 
		"print_statement", "return_statement", "if_statement", "while_statement", 
		"do_while_statement", "for_statement", "statement_list", "expression", 
		"string_expression", "num_expression", "num_term", "num_factor", "num_identifier", 
		"string_identifier", "bool_expression", "rel_op", "bool_logical", "bool_term", 
		"bool_factor", "bool_identifier", "constdecl_list", "const_statement", 
		"const_identifier", "constant", "integer", "sign", "floating_point", "floating", 
		"character", "string", "characters", "ascii_charplus", "ascii_char", "digitsplus", 
		"letterplus", "letter_or_digitplus"
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
        null, "INT", "DECIMAL", "STRING", "BREAK", "CONTINUE", "NEWLINE", "AND", "SQUOTE", "DQUOTE", "BSLASH", "VOID",
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

	@Override
	public String getGrammarFileName() { return "Moka.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MokaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Constdecl_listContext constdecl_list() {
			return getRuleContext(Constdecl_listContext.class,0);
		}
		public Funcdecl_listContext funcdecl_list() {
			return getRuleContext(Funcdecl_listContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			constdecl_list();
			setState(117);
			funcdecl_list();
			setState(118);
			statement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funcdecl_listContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Funcdecl_listContext funcdecl_list() {
			return getRuleContext(Funcdecl_listContext.class,0);
		}
		public Funcdecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterFuncdecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitFuncdecl_list(this);
		}
	}

	public final Funcdecl_listContext funcdecl_list() throws RecognitionException {
		Funcdecl_listContext _localctx = new Funcdecl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcdecl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			function_declaration();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << VOID))) != 0)) {
				{
				setState(121);
				funcdecl_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Function_noreturnContext function_noreturn() {
			return getRuleContext(Function_noreturnContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_declaration);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				function_return();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				function_noreturn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_returnContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Function_contentContext function_content() {
			return getRuleContext(Function_contentContext.class,0);
		}
		public Function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterFunction_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitFunction_return(this);
		}
	}

	public final Function_returnContext function_return() throws RecognitionException {
		Function_returnContext _localctx = new Function_returnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			data_type();
			setState(129);
			function_name();
			setState(130);
			match(LPAREN);
			setState(131);
			parameter_list();
			setState(132);
			match(RPAREN);
			setState(133);
			function_content();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_noreturnContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Function_contentContext function_content() {
			return getRuleContext(Function_contentContext.class,0);
		}
		public Function_noreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_noreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterFunction_noreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitFunction_noreturn(this);
		}
	}

	public final Function_noreturnContext function_noreturn() throws RecognitionException {
		Function_noreturnContext _localctx = new Function_noreturnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_noreturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(VOID);
			setState(136);
			function_name();
			setState(137);
			match(LPAREN);
			setState(138);
			parameter_list();
			setState(139);
			match(RPAREN);
			setState(140);
			function_content();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public LetterplusContext letterplus() {
			return getRuleContext(LetterplusContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			letterplus();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				setState(144);
				parameters();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameters);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				var_decl();
				setState(148);
				match(COMMA);
				setState(149);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				var_decl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_contentContext extends ParserRuleContext {
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Function_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterFunction_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitFunction_content(this);
		}
	}

	public final Function_contentContext function_content() throws RecognitionException {
		Function_contentContext _localctx = new Function_contentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			vardecl_list();
			setState(155);
			statement_list();
			setState(156);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vardecl_listContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Statement_endContext statement_end() {
			return getRuleContext(Statement_endContext.class,0);
		}
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public Vardecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterVardecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitVardecl_list(this);
		}
	}

	public final Vardecl_listContext vardecl_list() throws RecognitionException {
		Vardecl_listContext _localctx = new Vardecl_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vardecl_list);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				var_decl();
				setState(159);
				statement_end();
				setState(160);
				vardecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				var_decl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			data_type();
			setState(166);
			identifier_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitIdentifier_list(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identifier_list);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				identifier();
				setState(171);
				match(COMMA);
				setState(172);
				identifier_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Letter() { return getToken(MokaParser.Letter, 0); }
		public Letter_or_digitplusContext letter_or_digitplus() {
			return getRuleContext(Letter_or_digitplusContext.class,0);
		}
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(Letter);
			setState(178);
			letter_or_digitplus();
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					subscript();
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitSubscript(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(LBRACK);
			setState(186);
			integer();
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(187);
				match(RBRACK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Statement_endContext statement_end() {
			return getRuleContext(Statement_endContext.class,0);
		}
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Scan_statementContext scan_statement() {
			return getRuleContext(Scan_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				assignment_statement();
				setState(191);
				statement_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				funccall_statement();
				setState(194);
				statement_end();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				if_statement();
				setState(197);
				statement_end();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				while_statement();
				setState(200);
				statement_end();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				do_while_statement();
				setState(203);
				statement_end();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				for_statement();
				setState(206);
				statement_end();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				return_statement();
				setState(209);
				statement_end();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(211);
				print_statement();
				setState(212);
				statement_end();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(214);
				scan_statement();
				setState(215);
				statement_end();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(217);
				match(T__3);
				setState(218);
				statement_end();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(219);
				match(T__4);
				setState(220);
				statement_end();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_endContext extends ParserRuleContext {
		public Statement_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterStatement_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitStatement_end(this);
		}
	}

	public final Statement_endContext statement_end() throws RecognitionException {
		Statement_endContext _localctx = new Statement_endContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			identifier();
			setState(226);
			match(ASSIGN);
			setState(227);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funccall_statementContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public Statement_endContext statement_end() {
			return getRuleContext(Statement_endContext.class,0);
		}
		public Funccall_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterFunccall_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitFunccall_statement(this);
		}
	}

	public final Funccall_statementContext funccall_statement() throws RecognitionException {
		Funccall_statementContext _localctx = new Funccall_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funccall_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			function_name();
			setState(230);
			match(LPAREN);
			setState(231);
			actual_parameter_list();
			setState(232);
			match(RPAREN);
			setState(233);
			statement_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_parameter_listContext extends ParserRuleContext {
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public Actual_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterActual_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitActual_parameter_list(this);
		}
	}

	public final Actual_parameter_listContext actual_parameter_list() throws RecognitionException {
		Actual_parameter_listContext _localctx = new Actual_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_actual_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Letter) {
				{
				setState(235);
				actual_params();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_paramsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public Actual_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterActual_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitActual_params(this);
		}
	}

	public final Actual_paramsContext actual_params() throws RecognitionException {
		Actual_paramsContext _localctx = new Actual_paramsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_actual_params);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				identifier();
				setState(239);
				match(COMMA);
				setState(240);
				actual_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scan_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Floating_pointContext floating_point() {
			return getRuleContext(Floating_pointContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Scan_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterScan_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitScan_statement(this);
		}
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_scan_statement);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				identifier();
				setState(246);
				match(ASSIGN);
				setState(247);
				match(SCANINT);
				setState(248);
				match(LPAREN);
				setState(249);
				integer();
				setState(250);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				identifier();
				setState(253);
				match(ASSIGN);
				setState(254);
				match(SCANDEC);
				setState(255);
				match(LPAREN);
				setState(256);
				floating_point();
				setState(257);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				identifier();
				setState(260);
				match(ASSIGN);
				setState(261);
				match(SCANSTR);
				setState(262);
				match(LPAREN);
				setState(263);
				string();
				setState(264);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_statementContext extends ParserRuleContext {
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitPrint_statement(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_print_statement);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(PRINT);
				setState(269);
				match(LPAREN);
				setState(270);
				string_expression();
				setState(271);
				match(RPAREN);
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(PRINTLN);
				setState(274);
				match(LPAREN);
				setState(275);
				string_expression();
				setState(276);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_endContext statement_end() {
			return getRuleContext(Statement_endContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(RETURN);
			setState(281);
			expression(0);
			setState(282);
			statement_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if_statement);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(IF);
				setState(285);
				match(LPAREN);
				setState(286);
				bool_expression();
				setState(287);
				match(RPAREN);
				setState(288);
				statement();
				setState(289);
				match(END);
				setState(290);
				match(ELSE);
				setState(291);
				statement();
				setState(292);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(IF);
				setState(295);
				match(LPAREN);
				setState(296);
				bool_expression();
				setState(297);
				match(RPAREN);
				setState(298);
				statement();
				setState(299);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(WHILE);
			setState(304);
			match(LPAREN);
			setState(305);
			bool_expression();
			setState(306);
			match(RPAREN);
			setState(307);
			statement();
			setState(308);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_statementContext extends ParserRuleContext {
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(DO);
			setState(311);
			match(WHILE);
			setState(312);
			match(LPAREN);
			setState(313);
			bool_expression();
			setState(314);
			match(RPAREN);
			setState(315);
			statement();
			setState(316);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public List<Assignment_statementContext> assignment_statement() {
			return getRuleContexts(Assignment_statementContext.class);
		}
		public Assignment_statementContext assignment_statement(int i) {
			return getRuleContext(Assignment_statementContext.class,i);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(FOR);
			setState(319);
			match(LPAREN);
			setState(320);
			assignment_statement();
			setState(321);
			match(SEMI);
			setState(322);
			bool_expression();
			setState(323);
			match(SEMI);
			setState(324);
			assignment_statement();
			setState(325);
			match(RPAREN);
			setState(326);
			statement();
			setState(327);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_endContext statement_end() {
			return getRuleContext(Statement_endContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			statement();
			setState(330);
			statement_end();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << PRINT) | (1L << PRINTLN) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR))) != 0) || _la==Letter) {
				{
				setState(331);
				statement_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(335);
				string_expression();
				}
				break;
			case 2:
				{
				setState(336);
				num_expression();
				}
				break;
			case 3:
				{
				setState(337);
				bool_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(340);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(341);
					match(LPAREN);
					setState(342);
					actual_parameter_list();
					setState(343);
					match(RPAREN);
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class String_expressionContext extends ParserRuleContext {
		public String_identifierContext string_identifier() {
			return getRuleContext(String_identifierContext.class,0);
		}
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterString_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitString_expression(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_string_expression);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				string_identifier();
				setState(351);
				match(ADD);
				setState(352);
				string_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				string();
				setState(355);
				match(ADD);
				setState(356);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				string_identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_expressionContext extends ParserRuleContext {
		public Num_termContext num_term() {
			return getRuleContext(Num_termContext.class,0);
		}
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public Num_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterNum_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitNum_expression(this);
		}
	}

	public final Num_expressionContext num_expression() throws RecognitionException {
		Num_expressionContext _localctx = new Num_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_num_expression);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				num_term();
				setState(363);
				match(ADD);
				setState(364);
				num_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				num_term();
				setState(367);
				match(SUB);
				setState(368);
				num_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				num_term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_termContext extends ParserRuleContext {
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public Num_termContext num_term() {
			return getRuleContext(Num_termContext.class,0);
		}
		public Num_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterNum_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitNum_term(this);
		}
	}

	public final Num_termContext num_term() throws RecognitionException {
		Num_termContext _localctx = new Num_termContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_num_term);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				num_factor();
				setState(374);
				match(MUL);
				setState(375);
				num_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				num_factor();
				setState(378);
				match(DIV);
				setState(379);
				num_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				num_factor();
				setState(382);
				match(MOD);
				setState(383);
				num_term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				num_factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_factorContext extends ParserRuleContext {
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Floating_pointContext floating_point() {
			return getRuleContext(Floating_pointContext.class,0);
		}
		public Num_identifierContext num_identifier() {
			return getRuleContext(Num_identifierContext.class,0);
		}
		public Num_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterNum_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitNum_factor(this);
		}
	}

	public final Num_factorContext num_factor() throws RecognitionException {
		Num_factorContext _localctx = new Num_factorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_num_factor);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(LPAREN);
				setState(389);
				num_expression();
				setState(390);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				character();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				integer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				floating_point();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(395);
				num_identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Num_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterNum_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitNum_identifier(this);
		}
	}

	public final Num_identifierContext num_identifier() throws RecognitionException {
		Num_identifierContext _localctx = new Num_identifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_num_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public String_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterString_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitString_identifier(this);
		}
	}

	public final String_identifierContext string_identifier() throws RecognitionException {
		String_identifierContext _localctx = new String_identifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_string_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expressionContext extends ParserRuleContext {
		public List<Num_expressionContext> num_expression() {
			return getRuleContexts(Num_expressionContext.class);
		}
		public Num_expressionContext num_expression(int i) {
			return getRuleContext(Num_expressionContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public Bool_logicalContext bool_logical() {
			return getRuleContext(Bool_logicalContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_bool_expression);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				num_expression();
				setState(403);
				rel_op();
				setState(404);
				num_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				string_expression();
				setState(407);
				match(EQUAL);
				setState(408);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				string_expression();
				setState(411);
				match(NOTEQUAL);
				setState(412);
				string_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				bool_logical();
				setState(415);
				match(EQUAL);
				setState(416);
				bool_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				bool_logical();
				setState(419);
				match(NOTEQUAL);
				setState(420);
				bool_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(422);
				bool_logical();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_logicalContext extends ParserRuleContext {
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_logicalContext bool_logical() {
			return getRuleContext(Bool_logicalContext.class,0);
		}
		public Bool_logicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterBool_logical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitBool_logical(this);
		}
	}

	public final Bool_logicalContext bool_logical() throws RecognitionException {
		Bool_logicalContext _localctx = new Bool_logicalContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_bool_logical);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				bool_term();
				setState(428);
				match(OR);
				setState(429);
				bool_logical();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				bool_term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_termContext extends ParserRuleContext {
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bool_term);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				bool_factor();
				setState(435);
				match(T__6);
				setState(436);
				bool_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				bool_factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_factorContext extends ParserRuleContext {
		public Bool_logicalContext bool_logical() {
			return getRuleContext(Bool_logicalContext.class,0);
		}
		public Bool_identifierContext bool_identifier() {
			return getRuleContext(Bool_identifierContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitBool_factor(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bool_factor);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(LPAREN);
				setState(442);
				bool_logical();
				setState(443);
				match(RPAREN);
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(BANG);
				setState(446);
				bool_logical();
				}
				break;
			case Letter:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				bool_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Bool_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterBool_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitBool_identifier(this);
		}
	}

	public final Bool_identifierContext bool_identifier() throws RecognitionException {
		Bool_identifierContext _localctx = new Bool_identifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bool_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constdecl_listContext extends ParserRuleContext {
		public Const_statementContext const_statement() {
			return getRuleContext(Const_statementContext.class,0);
		}
		public Constdecl_listContext constdecl_list() {
			return getRuleContext(Constdecl_listContext.class,0);
		}
		public Constdecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterConstdecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitConstdecl_list(this);
		}
	}

	public final Constdecl_listContext constdecl_list() throws RecognitionException {
		Constdecl_listContext _localctx = new Constdecl_listContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_constdecl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			const_statement();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(453);
				constdecl_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_statementContext extends ParserRuleContext {
		public Const_identifierContext const_identifier() {
			return getRuleContext(Const_identifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Const_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterConst_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitConst_statement(this);
		}
	}

	public final Const_statementContext const_statement() throws RecognitionException {
		Const_statementContext _localctx = new Const_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_const_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(CONST);
			setState(457);
			const_identifier();
			setState(458);
			match(ASSIGN);
			setState(459);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_identifierContext extends ParserRuleContext {
		public TerminalNode Letter() { return getToken(MokaParser.Letter, 0); }
		public Letter_or_digitplusContext letter_or_digitplus() {
			return getRuleContext(Letter_or_digitplusContext.class,0);
		}
		public Const_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterConst_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitConst_identifier(this);
		}
	}

	public final Const_identifierContext const_identifier() throws RecognitionException {
		Const_identifierContext _localctx = new Const_identifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_const_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(Letter);
			setState(462);
			letter_or_digitplus();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Floating_pointContext floating_point() {
			return getRuleContext(Floating_pointContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constant);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				floating_point();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				character();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public DigitsplusContext digitsplus() {
			return getRuleContext(DigitsplusContext.class,0);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			sign();
			setState(471);
			digitsplus();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_sign);
		int _la;
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD) {
					{
					setState(473);
					match(ADD);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(476);
					match(SUB);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Floating_pointContext extends ParserRuleContext {
		public FloatingContext floating() {
			return getRuleContext(FloatingContext.class,0);
		}
		public Floating_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterFloating_point(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitFloating_point(this);
		}
	}

	public final Floating_pointContext floating_point() throws RecognitionException {
		Floating_pointContext _localctx = new Floating_pointContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_floating_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			floating();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingContext extends ParserRuleContext {
		public List<DigitsplusContext> digitsplus() {
			return getRuleContexts(DigitsplusContext.class);
		}
		public DigitsplusContext digitsplus(int i) {
			return getRuleContext(DigitsplusContext.class,i);
		}
		public FloatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterFloating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitFloating(this);
		}
	}

	public final FloatingContext floating() throws RecognitionException {
		FloatingContext _localctx = new FloatingContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_floating);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				digitsplus();
				setState(484);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(DOT);
				setState(487);
				digitsplus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				digitsplus();
				setState(489);
				match(DOT);
				setState(490);
				digitsplus();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterContext extends ParserRuleContext {
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(T__7);
			setState(495);
			character();
			setState(496);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public Ascii_charplusContext ascii_charplus() {
			return getRuleContext(Ascii_charplusContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(T__8);
			setState(499);
			ascii_charplus();
			setState(500);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharactersContext extends ParserRuleContext {
		public Ascii_charContext ascii_char() {
			return getRuleContext(Ascii_charContext.class,0);
		}
		public CharactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterCharacters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitCharacters(this);
		}
	}

	public final CharactersContext characters() throws RecognitionException {
		CharactersContext _localctx = new CharactersContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_characters);
		try {
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				ascii_char();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(T__5);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				match(T__9);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(506);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ascii_charplusContext extends ParserRuleContext {
		public Ascii_charContext ascii_char() {
			return getRuleContext(Ascii_charContext.class,0);
		}
		public Ascii_charplusContext ascii_charplus() {
			return getRuleContext(Ascii_charplusContext.class,0);
		}
		public Ascii_charplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascii_charplus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterAscii_charplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitAscii_charplus(this);
		}
	}

	public final Ascii_charplusContext ascii_charplus() throws RecognitionException {
		Ascii_charplusContext _localctx = new Ascii_charplusContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ascii_charplus);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				ascii_char();
				setState(510);
				ascii_charplus();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				ascii_char();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ascii_charContext extends ParserRuleContext {
		public TerminalNode Letter() { return getToken(MokaParser.Letter, 0); }
		public TerminalNode Digit() { return getToken(MokaParser.Digit, 0); }
		public Ascii_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascii_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterAscii_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitAscii_char(this);
		}
	}

	public final Ascii_charContext ascii_char() throws RecognitionException {
		Ascii_charContext _localctx = new Ascii_charContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_ascii_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_la = _input.LA(1);
			if ( !(_la==Letter || _la==Digit) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitsplusContext extends ParserRuleContext {
		public TerminalNode Digit() { return getToken(MokaParser.Digit, 0); }
		public DigitsplusContext digitsplus() {
			return getRuleContext(DigitsplusContext.class,0);
		}
		public DigitsplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitsplus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterDigitsplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitDigitsplus(this);
		}
	}

	public final DigitsplusContext digitsplus() throws RecognitionException {
		DigitsplusContext _localctx = new DigitsplusContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_digitsplus);
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(Digit);
				setState(518);
				digitsplus();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(Digit);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetterplusContext extends ParserRuleContext {
		public TerminalNode Letter() { return getToken(MokaParser.Letter, 0); }
		public LetterplusContext letterplus() {
			return getRuleContext(LetterplusContext.class,0);
		}
		public LetterplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letterplus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterLetterplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitLetterplus(this);
		}
	}

	public final LetterplusContext letterplus() throws RecognitionException {
		LetterplusContext _localctx = new LetterplusContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_letterplus);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				match(Letter);
				setState(523);
				letterplus();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(Letter);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Letter_or_digitplusContext extends ParserRuleContext {
		public TerminalNode Letter() { return getToken(MokaParser.Letter, 0); }
		public Letter_or_digitplusContext letter_or_digitplus() {
			return getRuleContext(Letter_or_digitplusContext.class,0);
		}
		public TerminalNode Digit() { return getToken(MokaParser.Digit, 0); }
		public Letter_or_digitplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter_or_digitplus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).enterLetter_or_digitplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MokaListener ) ((MokaListener)listener).exitLetter_or_digitplus(this);
		}
	}

	public final Letter_or_digitplusContext letter_or_digitplus() throws RecognitionException {
		Letter_or_digitplusContext _localctx = new Letter_or_digitplusContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_letter_or_digitplus);
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(Letter);
				setState(528);
				letter_or_digitplus();
				}
				break;
			case Digit:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				match(Digit);
				setState(530);
				letter_or_digitplus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0218\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\5\3}\n\3\3\4\3\4\5\4\u0081\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\5\b\u0094\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u009b\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a6"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00b2\n\16\3\17"+
		"\3\17\3\17\7\17\u00b7\n\17\f\17\16\17\u00ba\13\17\3\20\3\20\3\20\5\20"+
		"\u00bf\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00e0\n\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\5\25\u00ef\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00f6\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010d\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0119\n\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0130\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u014f\n\36\3\37"+
		"\3\37\3\37\3\37\5\37\u0155\n\37\3\37\3\37\3\37\3\37\3\37\7\37\u015c\n"+
		"\37\f\37\16\37\u015f\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u016b\n \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0176\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u0185\n\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u018f\n"+
		"#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u01aa\n&\3\'\3\'\3(\3(\3(\3(\3(\5(\u01b3\n(\3)\3)\3)\3)\3)"+
		"\5)\u01ba\n)\3*\3*\3*\3*\3*\3*\3*\5*\u01c3\n*\3+\3+\3,\3,\5,\u01c9\n,"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\5/\u01d7\n/\3\60\3\60\3\60\3\61\5"+
		"\61\u01dd\n\61\3\61\5\61\u01e0\n\61\5\61\u01e2\n\61\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01ef\n\63\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u01fe\n\66\3\67\3\67"+
		"\3\67\3\67\5\67\u0204\n\67\38\38\39\39\39\59\u020b\n9\3:\3:\3:\5:\u0210"+
		"\n:\3;\3;\3;\3;\5;\u0216\n;\3;\2\3<<\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\5\3\2\3"+
		"\5\4\2%&+.\3\2FG\2\u021f\2v\3\2\2\2\4z\3\2\2\2\6\u0080\3\2\2\2\b\u0082"+
		"\3\2\2\2\n\u0089\3\2\2\2\f\u0090\3\2\2\2\16\u0093\3\2\2\2\20\u009a\3\2"+
		"\2\2\22\u009c\3\2\2\2\24\u00a5\3\2\2\2\26\u00a7\3\2\2\2\30\u00aa\3\2\2"+
		"\2\32\u00b1\3\2\2\2\34\u00b3\3\2\2\2\36\u00bb\3\2\2\2 \u00df\3\2\2\2\""+
		"\u00e1\3\2\2\2$\u00e3\3\2\2\2&\u00e7\3\2\2\2(\u00ee\3\2\2\2*\u00f5\3\2"+
		"\2\2,\u010c\3\2\2\2.\u0118\3\2\2\2\60\u011a\3\2\2\2\62\u012f\3\2\2\2\64"+
		"\u0131\3\2\2\2\66\u0138\3\2\2\28\u0140\3\2\2\2:\u014b\3\2\2\2<\u0154\3"+
		"\2\2\2>\u016a\3\2\2\2@\u0175\3\2\2\2B\u0184\3\2\2\2D\u018e\3\2\2\2F\u0190"+
		"\3\2\2\2H\u0192\3\2\2\2J\u01a9\3\2\2\2L\u01ab\3\2\2\2N\u01b2\3\2\2\2P"+
		"\u01b9\3\2\2\2R\u01c2\3\2\2\2T\u01c4\3\2\2\2V\u01c6\3\2\2\2X\u01ca\3\2"+
		"\2\2Z\u01cf\3\2\2\2\\\u01d6\3\2\2\2^\u01d8\3\2\2\2`\u01e1\3\2\2\2b\u01e3"+
		"\3\2\2\2d\u01ee\3\2\2\2f\u01f0\3\2\2\2h\u01f4\3\2\2\2j\u01fd\3\2\2\2l"+
		"\u0203\3\2\2\2n\u0205\3\2\2\2p\u020a\3\2\2\2r\u020f\3\2\2\2t\u0215\3\2"+
		"\2\2vw\5V,\2wx\5\4\3\2xy\5:\36\2y\3\3\2\2\2z|\5\6\4\2{}\5\4\3\2|{\3\2"+
		"\2\2|}\3\2\2\2}\5\3\2\2\2~\u0081\5\b\5\2\177\u0081\5\n\6\2\u0080~\3\2"+
		"\2\2\u0080\177\3\2\2\2\u0081\7\3\2\2\2\u0082\u0083\5\30\r\2\u0083\u0084"+
		"\5\f\7\2\u0084\u0085\7\32\2\2\u0085\u0086\5\16\b\2\u0086\u0087\7\33\2"+
		"\2\u0087\u0088\5\22\n\2\u0088\t\3\2\2\2\u0089\u008a\7\r\2\2\u008a\u008b"+
		"\5\f\7\2\u008b\u008c\7\32\2\2\u008c\u008d\5\16\b\2\u008d\u008e\7\33\2"+
		"\2\u008e\u008f\5\22\n\2\u008f\13\3\2\2\2\u0090\u0091\5r:\2\u0091\r\3\2"+
		"\2\2\u0092\u0094\5\20\t\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\17\3\2\2\2\u0095\u0096\5\26\f\2\u0096\u0097\7\"\2\2\u0097\u0098\5\20"+
		"\t\2\u0098\u009b\3\2\2\2\u0099\u009b\5\26\f\2\u009a\u0095\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\21\3\2\2\2\u009c\u009d\5\24\13\2\u009d\u009e\5:\36"+
		"\2\u009e\u009f\7!\2\2\u009f\23\3\2\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2"+
		"\5\"\22\2\u00a2\u00a3\5\24\13\2\u00a3\u00a6\3\2\2\2\u00a4\u00a6\5\26\f"+
		"\2\u00a5\u00a0\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\25\3\2\2\2\u00a7\u00a8"+
		"\5\30\r\2\u00a8\u00a9\5\32\16\2\u00a9\27\3\2\2\2\u00aa\u00ab\t\2\2\2\u00ab"+
		"\31\3\2\2\2\u00ac\u00ad\5\34\17\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\5\32"+
		"\16\2\u00af\u00b2\3\2\2\2\u00b0\u00b2\5\34\17\2\u00b1\u00ac\3\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\33\3\2\2\2\u00b3\u00b4\7F\2\2\u00b4\u00b8\5t;\2\u00b5"+
		"\u00b7\5\36\20\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\35\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\7\36\2\2\u00bc\u00be\5^\60\2\u00bd\u00bf\7\37\2\2\u00be\u00bd\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\37\3\2\2\2\u00c0\u00c1\5$\23\2\u00c1"+
		"\u00c2\5\"\22\2\u00c2\u00e0\3\2\2\2\u00c3\u00c4\5&\24\2\u00c4\u00c5\5"+
		"\"\22\2\u00c5\u00e0\3\2\2\2\u00c6\u00c7\5\62\32\2\u00c7\u00c8\5\"\22\2"+
		"\u00c8\u00e0\3\2\2\2\u00c9\u00ca\5\64\33\2\u00ca\u00cb\5\"\22\2\u00cb"+
		"\u00e0\3\2\2\2\u00cc\u00cd\5\66\34\2\u00cd\u00ce\5\"\22\2\u00ce\u00e0"+
		"\3\2\2\2\u00cf\u00d0\58\35\2\u00d0\u00d1\5\"\22\2\u00d1\u00e0\3\2\2\2"+
		"\u00d2\u00d3\5\60\31\2\u00d3\u00d4\5\"\22\2\u00d4\u00e0\3\2\2\2\u00d5"+
		"\u00d6\5.\30\2\u00d6\u00d7\5\"\22\2\u00d7\u00e0\3\2\2\2\u00d8\u00d9\5"+
		",\27\2\u00d9\u00da\5\"\22\2\u00da\u00e0\3\2\2\2\u00db\u00dc\7\6\2\2\u00dc"+
		"\u00e0\5\"\22\2\u00dd\u00de\7\7\2\2\u00de\u00e0\5\"\22\2\u00df\u00c0\3"+
		"\2\2\2\u00df\u00c3\3\2\2\2\u00df\u00c6\3\2\2\2\u00df\u00c9\3\2\2\2\u00df"+
		"\u00cc\3\2\2\2\u00df\u00cf\3\2\2\2\u00df\u00d2\3\2\2\2\u00df\u00d5\3\2"+
		"\2\2\u00df\u00d8\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"!\3\2\2\2\u00e1\u00e2\7\b\2\2\u00e2#\3\2\2\2\u00e3\u00e4\5\34\17\2\u00e4"+
		"\u00e5\7$\2\2\u00e5\u00e6\5<\37\2\u00e6%\3\2\2\2\u00e7\u00e8\5\f\7\2\u00e8"+
		"\u00e9\7\32\2\2\u00e9\u00ea\5(\25\2\u00ea\u00eb\7\33\2\2\u00eb\u00ec\5"+
		"\"\22\2\u00ec\'\3\2\2\2\u00ed\u00ef\5*\26\2\u00ee\u00ed\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef)\3\2\2\2\u00f0\u00f1\5\34\17\2\u00f1\u00f2\7\"\2"+
		"\2\u00f2\u00f3\5*\26\2\u00f3\u00f6\3\2\2\2\u00f4\u00f6\5\34\17\2\u00f5"+
		"\u00f0\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6+\3\2\2\2\u00f7\u00f8\5\34\17"+
		"\2\u00f8\u00f9\7$\2\2\u00f9\u00fa\7\16\2\2\u00fa\u00fb\7\32\2\2\u00fb"+
		"\u00fc\5^\60\2\u00fc\u00fd\7\33\2\2\u00fd\u010d\3\2\2\2\u00fe\u00ff\5"+
		"\34\17\2\u00ff\u0100\7$\2\2\u0100\u0101\7\17\2\2\u0101\u0102\7\32\2\2"+
		"\u0102\u0103\5b\62\2\u0103\u0104\7\33\2\2\u0104\u010d\3\2\2\2\u0105\u0106"+
		"\5\34\17\2\u0106\u0107\7$\2\2\u0107\u0108\7\20\2\2\u0108\u0109\7\32\2"+
		"\2\u0109\u010a\5h\65\2\u010a\u010b\7\33\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u00f7\3\2\2\2\u010c\u00fe\3\2\2\2\u010c\u0105\3\2\2\2\u010d-\3\2\2\2"+
		"\u010e\u010f\7\21\2\2\u010f\u0110\7\32\2\2\u0110\u0111\5> \2\u0111\u0112"+
		"\7\33\2\2\u0112\u0119\3\2\2\2\u0113\u0114\7\22\2\2\u0114\u0115\7\32\2"+
		"\2\u0115\u0116\5> \2\u0116\u0117\7\33\2\2\u0117\u0119\3\2\2\2\u0118\u010e"+
		"\3\2\2\2\u0118\u0113\3\2\2\2\u0119/\3\2\2\2\u011a\u011b\7\23\2\2\u011b"+
		"\u011c\5<\37\2\u011c\u011d\5\"\22\2\u011d\61\3\2\2\2\u011e\u011f\7\24"+
		"\2\2\u011f\u0120\7\32\2\2\u0120\u0121\5J&\2\u0121\u0122\7\33\2\2\u0122"+
		"\u0123\5 \21\2\u0123\u0124\7!\2\2\u0124\u0125\7\25\2\2\u0125\u0126\5 "+
		"\21\2\u0126\u0127\7!\2\2\u0127\u0130\3\2\2\2\u0128\u0129\7\24\2\2\u0129"+
		"\u012a\7\32\2\2\u012a\u012b\5J&\2\u012b\u012c\7\33\2\2\u012c\u012d\5 "+
		"\21\2\u012d\u012e\7!\2\2\u012e\u0130\3\2\2\2\u012f\u011e\3\2\2\2\u012f"+
		"\u0128\3\2\2\2\u0130\63\3\2\2\2\u0131\u0132\7\26\2\2\u0132\u0133\7\32"+
		"\2\2\u0133\u0134\5J&\2\u0134\u0135\7\33\2\2\u0135\u0136\5 \21\2\u0136"+
		"\u0137\7!\2\2\u0137\65\3\2\2\2\u0138\u0139\7\27\2\2\u0139\u013a\7\26\2"+
		"\2\u013a\u013b\7\32\2\2\u013b\u013c\5J&\2\u013c\u013d\7\33\2\2\u013d\u013e"+
		"\5 \21\2\u013e\u013f\7!\2\2\u013f\67\3\2\2\2\u0140\u0141\7\30\2\2\u0141"+
		"\u0142\7\32\2\2\u0142\u0143\5$\23\2\u0143\u0144\7 \2\2\u0144\u0145\5J"+
		"&\2\u0145\u0146\7 \2\2\u0146\u0147\5$\23\2\u0147\u0148\7\33\2\2\u0148"+
		"\u0149\5 \21\2\u0149\u014a\7!\2\2\u014a9\3\2\2\2\u014b\u014c\5 \21\2\u014c"+
		"\u014e\5\"\22\2\u014d\u014f\5:\36\2\u014e\u014d\3\2\2\2\u014e\u014f\3"+
		"\2\2\2\u014f;\3\2\2\2\u0150\u0151\b\37\1\2\u0151\u0155\5> \2\u0152\u0155"+
		"\5@!\2\u0153\u0155\5J&\2\u0154\u0150\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0153\3\2\2\2\u0155\u015d\3\2\2\2\u0156\u0157\f\3\2\2\u0157\u0158\7\32"+
		"\2\2\u0158\u0159\5(\25\2\u0159\u015a\7\33\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u0156\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e=\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\5H%\2\u0161\u0162"+
		"\7\63\2\2\u0162\u0163\5> \2\u0163\u016b\3\2\2\2\u0164\u0165\5h\65\2\u0165"+
		"\u0166\7\63\2\2\u0166\u0167\5> \2\u0167\u016b\3\2\2\2\u0168\u016b\5H%"+
		"\2\u0169\u016b\5h\65\2\u016a\u0160\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u0169\3\2\2\2\u016b?\3\2\2\2\u016c\u016d\5B\"\2\u016d\u016e"+
		"\7\63\2\2\u016e\u016f\5@!\2\u016f\u0176\3\2\2\2\u0170\u0171\5B\"\2\u0171"+
		"\u0172\7\64\2\2\u0172\u0173\5@!\2\u0173\u0176\3\2\2\2\u0174\u0176\5B\""+
		"\2\u0175\u016c\3\2\2\2\u0175\u0170\3\2\2\2\u0175\u0174\3\2\2\2\u0176A"+
		"\3\2\2\2\u0177\u0178\5D#\2\u0178\u0179\7\65\2\2\u0179\u017a\5B\"\2\u017a"+
		"\u0185\3\2\2\2\u017b\u017c\5D#\2\u017c\u017d\7\66\2\2\u017d\u017e\5B\""+
		"\2\u017e\u0185\3\2\2\2\u017f\u0180\5D#\2\u0180\u0181\7:\2\2\u0181\u0182"+
		"\5B\"\2\u0182\u0185\3\2\2\2\u0183\u0185\5D#\2\u0184\u0177\3\2\2\2\u0184"+
		"\u017b\3\2\2\2\u0184\u017f\3\2\2\2\u0184\u0183\3\2\2\2\u0185C\3\2\2\2"+
		"\u0186\u0187\7\32\2\2\u0187\u0188\5@!\2\u0188\u0189\7\33\2\2\u0189\u018f"+
		"\3\2\2\2\u018a\u018f\5f\64\2\u018b\u018f\5^\60\2\u018c\u018f\5b\62\2\u018d"+
		"\u018f\5F$\2\u018e\u0186\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018b\3\2\2"+
		"\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018fE\3\2\2\2\u0190\u0191"+
		"\5\34\17\2\u0191G\3\2\2\2\u0192\u0193\5\34\17\2\u0193I\3\2\2\2\u0194\u0195"+
		"\5@!\2\u0195\u0196\5L\'\2\u0196\u0197\5@!\2\u0197\u01aa\3\2\2\2\u0198"+
		"\u0199\5> \2\u0199\u019a\7+\2\2\u019a\u019b\5> \2\u019b\u01aa\3\2\2\2"+
		"\u019c\u019d\5> \2\u019d\u019e\7.\2\2\u019e\u019f\5> \2\u019f\u01aa\3"+
		"\2\2\2\u01a0\u01a1\5N(\2\u01a1\u01a2\7+\2\2\u01a2\u01a3\5J&\2\u01a3\u01aa"+
		"\3\2\2\2\u01a4\u01a5\5N(\2\u01a5\u01a6\7.\2\2\u01a6\u01a7\5J&\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01aa\5N(\2\u01a9\u0194\3\2\2\2\u01a9\u0198\3\2\2"+
		"\2\u01a9\u019c\3\2\2\2\u01a9\u01a0\3\2\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a8"+
		"\3\2\2\2\u01aaK\3\2\2\2\u01ab\u01ac\t\3\2\2\u01acM\3\2\2\2\u01ad\u01ae"+
		"\5P)\2\u01ae\u01af\7\60\2\2\u01af\u01b0\5N(\2\u01b0\u01b3\3\2\2\2\u01b1"+
		"\u01b3\5P)\2\u01b2\u01ad\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3O\3\2\2\2\u01b4"+
		"\u01b5\5R*\2\u01b5\u01b6\7\t\2\2\u01b6\u01b7\5P)\2\u01b7\u01ba\3\2\2\2"+
		"\u01b8\u01ba\5R*\2\u01b9\u01b4\3\2\2\2\u01b9\u01b8\3\2\2\2\u01baQ\3\2"+
		"\2\2\u01bb\u01bc\7\32\2\2\u01bc\u01bd\5N(\2\u01bd\u01be\7\33\2\2\u01be"+
		"\u01c3\3\2\2\2\u01bf\u01c0\7\'\2\2\u01c0\u01c3\5N(\2\u01c1\u01c3\5T+\2"+
		"\u01c2\u01bb\3\2\2\2\u01c2\u01bf\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3S\3"+
		"\2\2\2\u01c4\u01c5\5\34\17\2\u01c5U\3\2\2\2\u01c6\u01c8\5X-\2\u01c7\u01c9"+
		"\5V,\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9W\3\2\2\2\u01ca\u01cb"+
		"\7\31\2\2\u01cb\u01cc\5Z.\2\u01cc\u01cd\7$\2\2\u01cd\u01ce\5\\/\2\u01ce"+
		"Y\3\2\2\2\u01cf\u01d0\7F\2\2\u01d0\u01d1\5t;\2\u01d1[\3\2\2\2\u01d2\u01d7"+
		"\5^\60\2\u01d3\u01d7\5b\62\2\u01d4\u01d7\5f\64\2\u01d5\u01d7\5h\65\2\u01d6"+
		"\u01d2\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2"+
		"\2\2\u01d7]\3\2\2\2\u01d8\u01d9\5`\61\2\u01d9\u01da\5p9\2\u01da_\3\2\2"+
		"\2\u01db\u01dd\7\63\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01e2\3\2\2\2\u01de\u01e0\7\64\2\2\u01df\u01de\3\2\2\2\u01df\u01e0\3"+
		"\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01dc\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2"+
		"a\3\2\2\2\u01e3\u01e4\5d\63\2\u01e4c\3\2\2\2\u01e5\u01e6\5p9\2\u01e6\u01e7"+
		"\7#\2\2\u01e7\u01ef\3\2\2\2\u01e8\u01e9\7#\2\2\u01e9\u01ef\5p9\2\u01ea"+
		"\u01eb\5p9\2\u01eb\u01ec\7#\2\2\u01ec\u01ed\5p9\2\u01ed\u01ef\3\2\2\2"+
		"\u01ee\u01e5\3\2\2\2\u01ee\u01e8\3\2\2\2\u01ee\u01ea\3\2\2\2\u01efe\3"+
		"\2\2\2\u01f0\u01f1\7\n\2\2\u01f1\u01f2\5f\64\2\u01f2\u01f3\7\n\2\2\u01f3"+
		"g\3\2\2\2\u01f4\u01f5\7\13\2\2\u01f5\u01f6\5l\67\2\u01f6\u01f7\7\13\2"+
		"\2\u01f7i\3\2\2\2\u01f8\u01fe\5n8\2\u01f9\u01fe\7\b\2\2\u01fa\u01fe\7"+
		"\f\2\2\u01fb\u01fe\7\n\2\2\u01fc\u01fe\7\13\2\2\u01fd\u01f8\3\2\2\2\u01fd"+
		"\u01f9\3\2\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2"+
		"\2\2\u01fek\3\2\2\2\u01ff\u0200\5n8\2\u0200\u0201\5l\67\2\u0201\u0204"+
		"\3\2\2\2\u0202\u0204\5n8\2\u0203\u01ff\3\2\2\2\u0203\u0202\3\2\2\2\u0204"+
		"m\3\2\2\2\u0205\u0206\t\4\2\2\u0206o\3\2\2\2\u0207\u0208\7G\2\2\u0208"+
		"\u020b\5p9\2\u0209\u020b\7G\2\2\u020a\u0207\3\2\2\2\u020a\u0209\3\2\2"+
		"\2\u020bq\3\2\2\2\u020c\u020d\7F\2\2\u020d\u0210\5r:\2\u020e\u0210\7F"+
		"\2\2\u020f\u020c\3\2\2\2\u020f\u020e\3\2\2\2\u0210s\3\2\2\2\u0211\u0212"+
		"\7F\2\2\u0212\u0216\5t;\2\u0213\u0214\7G\2\2\u0214\u0216\5t;\2\u0215\u0211"+
		"\3\2\2\2\u0215\u0213\3\2\2\2\u0216u\3\2\2\2&|\u0080\u0093\u009a\u00a5"+
		"\u00b1\u00b8\u00be\u00df\u00ee\u00f5\u010c\u0118\u012f\u014e\u0154\u015d"+
		"\u016a\u0175\u0184\u018e\u01a9\u01b2\u01b9\u01c2\u01c8\u01d6\u01dc\u01df"+
		"\u01e1\u01ee\u01fd\u0203\u020a\u020f\u0215";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}