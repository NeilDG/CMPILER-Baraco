// Generated from Moka.G4 by ANTLR 4.7
package moka.parser;
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
	public static final int
		RULE_program = 0, RULE_funcdecl_list = 1, RULE_function_declaration = 2, 
		RULE_function_return = 3, RULE_function_noreturn = 4, RULE_function_name = 5, 
		RULE_parameter_list = 6, RULE_parameters = 7, RULE_function_content = 8, 
		RULE_vardecl_list = 9, RULE_var_decl = 10, RULE_data_type = 11, RULE_identifier_list = 12, 
		RULE_statement = 13, RULE_assignment_statement = 14, RULE_funccall_statement = 15, 
		RULE_actual_parameter_list = 16, RULE_actual_params = 17, RULE_scan_statement = 18, 
		RULE_print_statement = 19, RULE_return_statement = 20, RULE_if_statement = 21, 
		RULE_while_statement = 22, RULE_do_while_statement = 23, RULE_for_statement = 24, 
		RULE_statement_list = 25, RULE_expression = 26, RULE_string_expression = 27, 
		RULE_num_expression = 28, RULE_num_term = 29, RULE_num_factor = 30, RULE_num_identifier = 31, 
		RULE_string_identifier = 32, RULE_bool_expression = 33, RULE_rel_op = 34, 
		RULE_bool_logical = 35, RULE_bool_term = 36, RULE_bool_factor = 37, RULE_bool_identifier = 38, 
		RULE_constdecl_list = 39, RULE_const_statement = 40, RULE_const_identifier = 41, 
		RULE_constant = 42;
	public static final String[] ruleNames = {
		"program", "funcdecl_list", "function_declaration", "function_return", 
		"function_noreturn", "function_name", "parameter_list", "parameters", 
		"function_content", "vardecl_list", "var_decl", "data_type", "identifier_list", 
		"statement", "assignment_statement", "funccall_statement", "actual_parameter_list", 
		"actual_params", "scan_statement", "print_statement", "return_statement", 
		"if_statement", "while_statement", "do_while_statement", "for_statement", 
		"statement_list", "expression", "string_expression", "num_expression", 
		"num_term", "num_factor", "num_identifier", "string_identifier", "bool_expression", 
		"rel_op", "bool_logical", "bool_term", "bool_factor", "bool_identifier", 
		"constdecl_list", "const_statement", "const_identifier", "constant"
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
		null, null, null, null, null, null, null, "STMTEND", "VOID", "SCANINT", 
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

	@Override
	public String getGrammarFileName() { return "Moka.G4"; }

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
			setState(86);
			constdecl_list();
			setState(87);
			funcdecl_list();
			setState(88);
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
			setState(90);
			function_declaration();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << VOID))) != 0)) {
				{
				setState(91);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				function_return();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
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
			setState(98);
			data_type();
			setState(99);
			function_name();
			setState(100);
			match(LPAREN);
			setState(101);
			parameter_list();
			setState(102);
			match(RPAREN);
			setState(103);
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
			setState(105);
			match(VOID);
			setState(106);
			function_name();
			setState(107);
			match(LPAREN);
			setState(108);
			parameter_list();
			setState(109);
			match(RPAREN);
			setState(110);
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
		public TerminalNode Identifier() { return getToken(MokaParser.Identifier, 0); }
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
			setState(112);
			match(Identifier);
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				setState(114);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				var_decl();
				setState(118);
				match(COMMA);
				setState(119);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
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
			setState(124);
			vardecl_list();
			setState(125);
			statement_list();
			setState(126);
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
		public TerminalNode STMTEND() { return getToken(MokaParser.STMTEND, 0); }
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				var_decl();
				setState(129);
				match(STMTEND);
				setState(130);
				vardecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
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
			setState(135);
			data_type();
			setState(136);
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
			setState(138);
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
		public TerminalNode Identifier() { return getToken(MokaParser.Identifier, 0); }
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(Identifier);
				setState(141);
				match(COMMA);
				setState(142);
				identifier_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode STMTEND() { return getToken(MokaParser.STMTEND, 0); }
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
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				assignment_statement();
				setState(147);
				match(STMTEND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				funccall_statement();
				setState(150);
				match(STMTEND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				if_statement();
				setState(153);
				match(STMTEND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				while_statement();
				setState(156);
				match(STMTEND);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				do_while_statement();
				setState(159);
				match(STMTEND);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				for_statement();
				setState(162);
				match(STMTEND);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				return_statement();
				setState(165);
				match(STMTEND);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				print_statement();
				setState(168);
				match(STMTEND);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(170);
				scan_statement();
				setState(171);
				match(STMTEND);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(173);
				match(T__3);
				setState(174);
				match(STMTEND);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(175);
				match(T__4);
				setState(176);
				match(STMTEND);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MokaParser.Identifier, 0); }
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
		enterRule(_localctx, 28, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(Identifier);
			setState(180);
			match(ASSIGN);
			setState(181);
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
		public TerminalNode STMTEND() { return getToken(MokaParser.STMTEND, 0); }
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
		enterRule(_localctx, 30, RULE_funccall_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			function_name();
			setState(184);
			match(LPAREN);
			setState(185);
			actual_parameter_list();
			setState(186);
			match(RPAREN);
			setState(187);
			match(STMTEND);
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
		enterRule(_localctx, 32, RULE_actual_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(189);
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
		public TerminalNode Identifier() { return getToken(MokaParser.Identifier, 0); }
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
		enterRule(_localctx, 34, RULE_actual_params);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(Identifier);
				setState(193);
				match(COMMA);
				setState(194);
				actual_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(Identifier);
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
		public TerminalNode Identifier() { return getToken(MokaParser.Identifier, 0); }
		public TerminalNode IntegerLiteral() { return getToken(MokaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(MokaParser.FloatingPointLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(MokaParser.StringLiteral, 0); }
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
		enterRule(_localctx, 36, RULE_scan_statement);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(Identifier);
				setState(199);
				match(ASSIGN);
				setState(200);
				match(SCANINT);
				setState(201);
				match(LPAREN);
				setState(202);
				match(IntegerLiteral);
				setState(203);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(Identifier);
				setState(205);
				match(ASSIGN);
				setState(206);
				match(SCANDEC);
				setState(207);
				match(LPAREN);
				setState(208);
				match(FloatingPointLiteral);
				setState(209);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(Identifier);
				setState(211);
				match(ASSIGN);
				setState(212);
				match(SCANSTR);
				setState(213);
				match(LPAREN);
				setState(214);
				match(StringLiteral);
				setState(215);
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
		enterRule(_localctx, 38, RULE_print_statement);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(PRINT);
				setState(219);
				match(LPAREN);
				setState(220);
				string_expression();
				setState(221);
				match(RPAREN);
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(PRINTLN);
				setState(224);
				match(LPAREN);
				setState(225);
				string_expression();
				setState(226);
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
		public TerminalNode STMTEND() { return getToken(MokaParser.STMTEND, 0); }
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
		enterRule(_localctx, 40, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(RETURN);
			setState(231);
			expression(0);
			setState(232);
			match(STMTEND);
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
		enterRule(_localctx, 42, RULE_if_statement);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(IF);
				setState(235);
				match(LPAREN);
				setState(236);
				bool_expression();
				setState(237);
				match(RPAREN);
				setState(238);
				statement();
				setState(239);
				match(END);
				setState(240);
				match(ELSE);
				setState(241);
				statement();
				setState(242);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(IF);
				setState(245);
				match(LPAREN);
				setState(246);
				bool_expression();
				setState(247);
				match(RPAREN);
				setState(248);
				statement();
				setState(249);
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
		enterRule(_localctx, 44, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(WHILE);
			setState(254);
			match(LPAREN);
			setState(255);
			bool_expression();
			setState(256);
			match(RPAREN);
			setState(257);
			statement();
			setState(258);
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
		enterRule(_localctx, 46, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(DO);
			setState(261);
			match(WHILE);
			setState(262);
			match(LPAREN);
			setState(263);
			bool_expression();
			setState(264);
			match(RPAREN);
			setState(265);
			statement();
			setState(266);
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
		enterRule(_localctx, 48, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(FOR);
			setState(269);
			match(LPAREN);
			setState(270);
			assignment_statement();
			setState(271);
			match(SEMI);
			setState(272);
			bool_expression();
			setState(273);
			match(SEMI);
			setState(274);
			assignment_statement();
			setState(275);
			match(RPAREN);
			setState(276);
			statement();
			setState(277);
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
		public TerminalNode STMTEND() { return getToken(MokaParser.STMTEND, 0); }
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
		enterRule(_localctx, 50, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			statement();
			setState(280);
			match(STMTEND);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << PRINT) | (1L << PRINTLN) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR))) != 0) || _la==Identifier) {
				{
				setState(281);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(285);
				string_expression();
				}
				break;
			case 2:
				{
				setState(286);
				num_expression();
				}
				break;
			case 3:
				{
				setState(287);
				bool_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(290);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(291);
					match(LPAREN);
					setState(292);
					actual_parameter_list();
					setState(293);
					match(RPAREN);
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public TerminalNode StringLiteral() { return getToken(MokaParser.StringLiteral, 0); }
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
		enterRule(_localctx, 54, RULE_string_expression);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				string_identifier();
				setState(301);
				match(ADD);
				setState(302);
				string_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(StringLiteral);
				setState(305);
				match(ADD);
				setState(306);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				string_identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(StringLiteral);
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
		enterRule(_localctx, 56, RULE_num_expression);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				num_term();
				setState(312);
				match(ADD);
				setState(313);
				num_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				num_term();
				setState(316);
				match(SUB);
				setState(317);
				num_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
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
		enterRule(_localctx, 58, RULE_num_term);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				num_factor();
				setState(323);
				match(MUL);
				setState(324);
				num_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				num_factor();
				setState(327);
				match(DIV);
				setState(328);
				num_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				num_factor();
				setState(331);
				match(MOD);
				setState(332);
				num_term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
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
		public TerminalNode CharacterLiteral() { return getToken(MokaParser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(MokaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(MokaParser.FloatingPointLiteral, 0); }
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
		enterRule(_localctx, 60, RULE_num_factor);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(LPAREN);
				setState(338);
				num_expression();
				setState(339);
				match(RPAREN);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(CharacterLiteral);
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				match(FloatingPointLiteral);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				num_identifier();
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

	public static class Num_identifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MokaParser.Identifier, 0); }
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
		enterRule(_localctx, 62, RULE_num_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(Identifier);
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
		public TerminalNode Identifier() { return getToken(MokaParser.Identifier, 0); }
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
		enterRule(_localctx, 64, RULE_string_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(Identifier);
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
		enterRule(_localctx, 66, RULE_bool_expression);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				num_expression();
				setState(352);
				rel_op();
				setState(353);
				num_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				string_expression();
				setState(356);
				match(EQUAL);
				setState(357);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				string_expression();
				setState(360);
				match(NOTEQUAL);
				setState(361);
				string_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				bool_logical();
				setState(364);
				match(EQUAL);
				setState(365);
				bool_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				bool_logical();
				setState(368);
				match(NOTEQUAL);
				setState(369);
				bool_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
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
		enterRule(_localctx, 68, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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
		enterRule(_localctx, 70, RULE_bool_logical);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				bool_term();
				setState(377);
				match(OR);
				setState(378);
				bool_logical();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
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
		enterRule(_localctx, 72, RULE_bool_term);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				bool_factor();
				setState(384);
				match(T__5);
				setState(385);
				bool_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
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
		enterRule(_localctx, 74, RULE_bool_factor);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(LPAREN);
				setState(391);
				bool_logical();
				setState(392);
				match(RPAREN);
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(BANG);
				setState(395);
				bool_logical();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
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
		public TerminalNode Identifier() { return getToken(MokaParser.Identifier, 0); }
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
		enterRule(_localctx, 76, RULE_bool_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(Identifier);
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
		enterRule(_localctx, 78, RULE_constdecl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			const_statement();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(402);
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
		enterRule(_localctx, 80, RULE_const_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(CONST);
			setState(406);
			const_identifier();
			setState(407);
			match(ASSIGN);
			setState(408);
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
		public TerminalNode Identifier() { return getToken(MokaParser.Identifier, 0); }
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
		enterRule(_localctx, 82, RULE_const_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(Identifier);
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
		public TerminalNode IntegerLiteral() { return getToken(MokaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(MokaParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(MokaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(MokaParser.StringLiteral, 0); }
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
		enterRule(_localctx, 84, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3L\u01a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\3\3\5\3_\n\3\3\4\3\4\5\4c\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\5\bv\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0088"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0093\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00b4\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\5\22\u00c1\n\22\3\23\3\23\3\23\3\23\5\23\u00c7\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u00db\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00e7\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00fe\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\5\33\u011d\n\33\3\34\3\34\3\34\3\34\5\34\u0123\n\34\3\34\3\34\3"+
		"\34\3\34\3\34\7\34\u012a\n\34\f\34\16\34\u012d\13\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\5\35\u0138\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0143\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0152\n\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \5 \u015c\n \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\5#\u0177\n#\3$\3$\3%\3%\3%\3%\3%\5%\u0180\n%\3&"+
		"\3&\3&\3&\3&\5&\u0187\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0190\n\'\3("+
		"\3(\3)\3)\5)\u0196\n)\3*\3*\3*\3*\3*\3+\3+\3,\3,\3,\2\3\66-\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\5"+
		"\3\2\3\5\4\2#$),\4\2DDFH\2\u01a5\2X\3\2\2\2\4\\\3\2\2\2\6b\3\2\2\2\bd"+
		"\3\2\2\2\nk\3\2\2\2\fr\3\2\2\2\16u\3\2\2\2\20|\3\2\2\2\22~\3\2\2\2\24"+
		"\u0087\3\2\2\2\26\u0089\3\2\2\2\30\u008c\3\2\2\2\32\u0092\3\2\2\2\34\u00b3"+
		"\3\2\2\2\36\u00b5\3\2\2\2 \u00b9\3\2\2\2\"\u00c0\3\2\2\2$\u00c6\3\2\2"+
		"\2&\u00da\3\2\2\2(\u00e6\3\2\2\2*\u00e8\3\2\2\2,\u00fd\3\2\2\2.\u00ff"+
		"\3\2\2\2\60\u0106\3\2\2\2\62\u010e\3\2\2\2\64\u0119\3\2\2\2\66\u0122\3"+
		"\2\2\28\u0137\3\2\2\2:\u0142\3\2\2\2<\u0151\3\2\2\2>\u015b\3\2\2\2@\u015d"+
		"\3\2\2\2B\u015f\3\2\2\2D\u0176\3\2\2\2F\u0178\3\2\2\2H\u017f\3\2\2\2J"+
		"\u0186\3\2\2\2L\u018f\3\2\2\2N\u0191\3\2\2\2P\u0193\3\2\2\2R\u0197\3\2"+
		"\2\2T\u019c\3\2\2\2V\u019e\3\2\2\2XY\5P)\2YZ\5\4\3\2Z[\5\64\33\2[\3\3"+
		"\2\2\2\\^\5\6\4\2]_\5\4\3\2^]\3\2\2\2^_\3\2\2\2_\5\3\2\2\2`c\5\b\5\2a"+
		"c\5\n\6\2b`\3\2\2\2ba\3\2\2\2c\7\3\2\2\2de\5\30\r\2ef\5\f\7\2fg\7\30\2"+
		"\2gh\5\16\b\2hi\7\31\2\2ij\5\22\n\2j\t\3\2\2\2kl\7\n\2\2lm\5\f\7\2mn\7"+
		"\30\2\2no\5\16\b\2op\7\31\2\2pq\5\22\n\2q\13\3\2\2\2rs\7I\2\2s\r\3\2\2"+
		"\2tv\5\20\t\2ut\3\2\2\2uv\3\2\2\2v\17\3\2\2\2wx\5\26\f\2xy\7 \2\2yz\5"+
		"\20\t\2z}\3\2\2\2{}\5\26\f\2|w\3\2\2\2|{\3\2\2\2}\21\3\2\2\2~\177\5\24"+
		"\13\2\177\u0080\5\64\33\2\u0080\u0081\7\37\2\2\u0081\23\3\2\2\2\u0082"+
		"\u0083\5\26\f\2\u0083\u0084\7\t\2\2\u0084\u0085\5\24\13\2\u0085\u0088"+
		"\3\2\2\2\u0086\u0088\5\26\f\2\u0087\u0082\3\2\2\2\u0087\u0086\3\2\2\2"+
		"\u0088\25\3\2\2\2\u0089\u008a\5\30\r\2\u008a\u008b\5\32\16\2\u008b\27"+
		"\3\2\2\2\u008c\u008d\t\2\2\2\u008d\31\3\2\2\2\u008e\u008f\7I\2\2\u008f"+
		"\u0090\7 \2\2\u0090\u0093\5\32\16\2\u0091\u0093\7I\2\2\u0092\u008e\3\2"+
		"\2\2\u0092\u0091\3\2\2\2\u0093\33\3\2\2\2\u0094\u0095\5\36\20\2\u0095"+
		"\u0096\7\t\2\2\u0096\u00b4\3\2\2\2\u0097\u0098\5 \21\2\u0098\u0099\7\t"+
		"\2\2\u0099\u00b4\3\2\2\2\u009a\u009b\5,\27\2\u009b\u009c\7\t\2\2\u009c"+
		"\u00b4\3\2\2\2\u009d\u009e\5.\30\2\u009e\u009f\7\t\2\2\u009f\u00b4\3\2"+
		"\2\2\u00a0\u00a1\5\60\31\2\u00a1\u00a2\7\t\2\2\u00a2\u00b4\3\2\2\2\u00a3"+
		"\u00a4\5\62\32\2\u00a4\u00a5\7\t\2\2\u00a5\u00b4\3\2\2\2\u00a6\u00a7\5"+
		"*\26\2\u00a7\u00a8\7\t\2\2\u00a8\u00b4\3\2\2\2\u00a9\u00aa\5(\25\2\u00aa"+
		"\u00ab\7\t\2\2\u00ab\u00b4\3\2\2\2\u00ac\u00ad\5&\24\2\u00ad\u00ae\7\t"+
		"\2\2\u00ae\u00b4\3\2\2\2\u00af\u00b0\7\6\2\2\u00b0\u00b4\7\t\2\2\u00b1"+
		"\u00b2\7\7\2\2\u00b2\u00b4\7\t\2\2\u00b3\u0094\3\2\2\2\u00b3\u0097\3\2"+
		"\2\2\u00b3\u009a\3\2\2\2\u00b3\u009d\3\2\2\2\u00b3\u00a0\3\2\2\2\u00b3"+
		"\u00a3\3\2\2\2\u00b3\u00a6\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00ac\3\2"+
		"\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b6"+
		"\7I\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8\5\66\34\2\u00b8\37\3\2\2\2\u00b9"+
		"\u00ba\5\f\7\2\u00ba\u00bb\7\30\2\2\u00bb\u00bc\5\"\22\2\u00bc\u00bd\7"+
		"\31\2\2\u00bd\u00be\7\t\2\2\u00be!\3\2\2\2\u00bf\u00c1\5$\23\2\u00c0\u00bf"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1#\3\2\2\2\u00c2\u00c3\7I\2\2\u00c3\u00c4"+
		"\7 \2\2\u00c4\u00c7\5$\23\2\u00c5\u00c7\7I\2\2\u00c6\u00c2\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7%\3\2\2\2\u00c8\u00c9\7I\2\2\u00c9\u00ca\7\"\2\2\u00ca"+
		"\u00cb\7\13\2\2\u00cb\u00cc\7\30\2\2\u00cc\u00cd\7D\2\2\u00cd\u00db\7"+
		"\31\2\2\u00ce\u00cf\7I\2\2\u00cf\u00d0\7\"\2\2\u00d0\u00d1\7\f\2\2\u00d1"+
		"\u00d2\7\30\2\2\u00d2\u00d3\7F\2\2\u00d3\u00db\7\31\2\2\u00d4\u00d5\7"+
		"I\2\2\u00d5\u00d6\7\"\2\2\u00d6\u00d7\7\r\2\2\u00d7\u00d8\7\30\2\2\u00d8"+
		"\u00d9\7H\2\2\u00d9\u00db\7\31\2\2\u00da\u00c8\3\2\2\2\u00da\u00ce\3\2"+
		"\2\2\u00da\u00d4\3\2\2\2\u00db\'\3\2\2\2\u00dc\u00dd\7\16\2\2\u00dd\u00de"+
		"\7\30\2\2\u00de\u00df\58\35\2\u00df\u00e0\7\31\2\2\u00e0\u00e7\3\2\2\2"+
		"\u00e1\u00e2\7\17\2\2\u00e2\u00e3\7\30\2\2\u00e3\u00e4\58\35\2\u00e4\u00e5"+
		"\7\31\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00e1\3\2\2\2"+
		"\u00e7)\3\2\2\2\u00e8\u00e9\7\20\2\2\u00e9\u00ea\5\66\34\2\u00ea\u00eb"+
		"\7\t\2\2\u00eb+\3\2\2\2\u00ec\u00ed\7\21\2\2\u00ed\u00ee\7\30\2\2\u00ee"+
		"\u00ef\5D#\2\u00ef\u00f0\7\31\2\2\u00f0\u00f1\5\34\17\2\u00f1\u00f2\7"+
		"\37\2\2\u00f2\u00f3\7\22\2\2\u00f3\u00f4\5\34\17\2\u00f4\u00f5\7\37\2"+
		"\2\u00f5\u00fe\3\2\2\2\u00f6\u00f7\7\21\2\2\u00f7\u00f8\7\30\2\2\u00f8"+
		"\u00f9\5D#\2\u00f9\u00fa\7\31\2\2\u00fa\u00fb\5\34\17\2\u00fb\u00fc\7"+
		"\37\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ec\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fe"+
		"-\3\2\2\2\u00ff\u0100\7\23\2\2\u0100\u0101\7\30\2\2\u0101\u0102\5D#\2"+
		"\u0102\u0103\7\31\2\2\u0103\u0104\5\34\17\2\u0104\u0105\7\37\2\2\u0105"+
		"/\3\2\2\2\u0106\u0107\7\24\2\2\u0107\u0108\7\23\2\2\u0108\u0109\7\30\2"+
		"\2\u0109\u010a\5D#\2\u010a\u010b\7\31\2\2\u010b\u010c\5\34\17\2\u010c"+
		"\u010d\7\37\2\2\u010d\61\3\2\2\2\u010e\u010f\7\25\2\2\u010f\u0110\7\30"+
		"\2\2\u0110\u0111\5\36\20\2\u0111\u0112\7\36\2\2\u0112\u0113\5D#\2\u0113"+
		"\u0114\7\36\2\2\u0114\u0115\5\36\20\2\u0115\u0116\7\31\2\2\u0116\u0117"+
		"\5\34\17\2\u0117\u0118\7\37\2\2\u0118\63\3\2\2\2\u0119\u011a\5\34\17\2"+
		"\u011a\u011c\7\t\2\2\u011b\u011d\5\64\33\2\u011c\u011b\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\65\3\2\2\2\u011e\u011f\b\34\1\2\u011f\u0123\58\35\2\u0120"+
		"\u0123\5:\36\2\u0121\u0123\5D#\2\u0122\u011e\3\2\2\2\u0122\u0120\3\2\2"+
		"\2\u0122\u0121\3\2\2\2\u0123\u012b\3\2\2\2\u0124\u0125\f\3\2\2\u0125\u0126"+
		"\7\30\2\2\u0126\u0127\5\"\22\2\u0127\u0128\7\31\2\2\u0128\u012a\3\2\2"+
		"\2\u0129\u0124\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\67\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\5B\"\2\u012f"+
		"\u0130\7\61\2\2\u0130\u0131\58\35\2\u0131\u0138\3\2\2\2\u0132\u0133\7"+
		"H\2\2\u0133\u0134\7\61\2\2\u0134\u0138\58\35\2\u0135\u0138\5B\"\2\u0136"+
		"\u0138\7H\2\2\u0137\u012e\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0136\3\2\2\2\u01389\3\2\2\2\u0139\u013a\5<\37\2\u013a\u013b"+
		"\7\61\2\2\u013b\u013c\5:\36\2\u013c\u0143\3\2\2\2\u013d\u013e\5<\37\2"+
		"\u013e\u013f\7\62\2\2\u013f\u0140\5:\36\2\u0140\u0143\3\2\2\2\u0141\u0143"+
		"\5<\37\2\u0142\u0139\3\2\2\2\u0142\u013d\3\2\2\2\u0142\u0141\3\2\2\2\u0143"+
		";\3\2\2\2\u0144\u0145\5> \2\u0145\u0146\7\63\2\2\u0146\u0147\5<\37\2\u0147"+
		"\u0152\3\2\2\2\u0148\u0149\5> \2\u0149\u014a\7\64\2\2\u014a\u014b\5<\37"+
		"\2\u014b\u0152\3\2\2\2\u014c\u014d\5> \2\u014d\u014e\78\2\2\u014e\u014f"+
		"\5<\37\2\u014f\u0152\3\2\2\2\u0150\u0152\5> \2\u0151\u0144\3\2\2\2\u0151"+
		"\u0148\3\2\2\2\u0151\u014c\3\2\2\2\u0151\u0150\3\2\2\2\u0152=\3\2\2\2"+
		"\u0153\u0154\7\30\2\2\u0154\u0155\5:\36\2\u0155\u0156\7\31\2\2\u0156\u015c"+
		"\3\2\2\2\u0157\u015c\7G\2\2\u0158\u015c\7D\2\2\u0159\u015c\7F\2\2\u015a"+
		"\u015c\5@!\2\u015b\u0153\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3\2\2"+
		"\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c?\3\2\2\2\u015d\u015e"+
		"\7I\2\2\u015eA\3\2\2\2\u015f\u0160\7I\2\2\u0160C\3\2\2\2\u0161\u0162\5"+
		":\36\2\u0162\u0163\5F$\2\u0163\u0164\5:\36\2\u0164\u0177\3\2\2\2\u0165"+
		"\u0166\58\35\2\u0166\u0167\7)\2\2\u0167\u0168\58\35\2\u0168\u0177\3\2"+
		"\2\2\u0169\u016a\58\35\2\u016a\u016b\7,\2\2\u016b\u016c\58\35\2\u016c"+
		"\u0177\3\2\2\2\u016d\u016e\5H%\2\u016e\u016f\7)\2\2\u016f\u0170\5D#\2"+
		"\u0170\u0177\3\2\2\2\u0171\u0172\5H%\2\u0172\u0173\7,\2\2\u0173\u0174"+
		"\5D#\2\u0174\u0177\3\2\2\2\u0175\u0177\5H%\2\u0176\u0161\3\2\2\2\u0176"+
		"\u0165\3\2\2\2\u0176\u0169\3\2\2\2\u0176\u016d\3\2\2\2\u0176\u0171\3\2"+
		"\2\2\u0176\u0175\3\2\2\2\u0177E\3\2\2\2\u0178\u0179\t\3\2\2\u0179G\3\2"+
		"\2\2\u017a\u017b\5J&\2\u017b\u017c\7.\2\2\u017c\u017d\5H%\2\u017d\u0180"+
		"\3\2\2\2\u017e\u0180\5J&\2\u017f\u017a\3\2\2\2\u017f\u017e\3\2\2\2\u0180"+
		"I\3\2\2\2\u0181\u0182\5L\'\2\u0182\u0183\7\b\2\2\u0183\u0184\5J&\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0187\5L\'\2\u0186\u0181\3\2\2\2\u0186\u0185\3\2"+
		"\2\2\u0187K\3\2\2\2\u0188\u0189\7\30\2\2\u0189\u018a\5H%\2\u018a\u018b"+
		"\7\31\2\2\u018b\u0190\3\2\2\2\u018c\u018d\7%\2\2\u018d\u0190\5H%\2\u018e"+
		"\u0190\5N(\2\u018f\u0188\3\2\2\2\u018f\u018c\3\2\2\2\u018f\u018e\3\2\2"+
		"\2\u0190M\3\2\2\2\u0191\u0192\7I\2\2\u0192O\3\2\2\2\u0193\u0195\5R*\2"+
		"\u0194\u0196\5P)\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196Q\3\2"+
		"\2\2\u0197\u0198\7\26\2\2\u0198\u0199\5T+\2\u0199\u019a\7\"\2\2\u019a"+
		"\u019b\5V,\2\u019bS\3\2\2\2\u019c\u019d\7I\2\2\u019dU\3\2\2\2\u019e\u019f"+
		"\t\4\2\2\u019fW\3\2\2\2\32^bu|\u0087\u0092\u00b3\u00c0\u00c6\u00da\u00e6"+
		"\u00fd\u011c\u0122\u012b\u0137\u0142\u0151\u015b\u0176\u017f\u0186\u018f"+
		"\u0195";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}