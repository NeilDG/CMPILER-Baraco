// Generated from Baraco.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BaracoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOL=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, DECIMAL=20, FOR=21, IF=22, 
		GOTO=23, IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, 
		LONG=29, NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, 
		RETURN=36, SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, SCANINT=51, SCANDEC=52, SCANSTR=53, PRINT=54, PRINTLN=55, END=56, 
		IntegerLiteral=57, FloatingPointLiteral=58, BooleanLiteral=59, CharacterLiteral=60, 
		StringLiteral=61, NullLiteral=62, LPAREN=63, RPAREN=64, LBRACE=65, RBRACE=66, 
		LBRACK=67, RBRACK=68, SEMI=69, COMMA=70, DOT=71, ASSIGN=72, GT=73, LT=74, 
		BANG=75, TILDE=76, QUESTION=77, COLON=78, EQUAL=79, LE=80, GE=81, NOTEQUAL=82, 
		AND=83, OR=84, INC=85, DEC=86, ADD=87, SUB=88, MUL=89, DIV=90, BITAND=91, 
		BITOR=92, CARET=93, MOD=94, ADD_ASSIGN=95, SUB_ASSIGN=96, MUL_ASSIGN=97, 
		DIV_ASSIGN=98, AND_ASSIGN=99, OR_ASSIGN=100, XOR_ASSIGN=101, MOD_ASSIGN=102, 
		LSHIFT_ASSIGN=103, RSHIFT_ASSIGN=104, URSHIFT_ASSIGN=105, Identifier=106, 
		AT=107, ELLIPSIS=108, WS=109, COMMENT=110, LINE_COMMENT=111;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_typeList = 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_methodDeclaration = 21, RULE_genericMethodDeclaration = 22, RULE_constructorDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_fieldDeclaration = 25, RULE_interfaceBodyDeclaration = 26, 
		RULE_interfaceMemberDeclaration = 27, RULE_constDeclaration = 28, RULE_constantDeclarator = 29, 
		RULE_interfaceMethodDeclaration = 30, RULE_genericInterfaceMethodDeclaration = 31, 
		RULE_variableDeclarators = 32, RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34, 
		RULE_variableInitializer = 35, RULE_arrayInitializer = 36, RULE_enumConstantName = 37, 
		RULE_typeType = 38, RULE_classOrInterfaceType = 39, RULE_primitiveType = 40, 
		RULE_typeArguments = 41, RULE_typeArgument = 42, RULE_qualifiedNameList = 43, 
		RULE_formalParameters = 44, RULE_formalParameterList = 45, RULE_formalParameter = 46, 
		RULE_lastFormalParameter = 47, RULE_methodBody = 48, RULE_constructorBody = 49, 
		RULE_qualifiedName = 50, RULE_literal = 51, RULE_annotation = 52, RULE_annotationName = 53, 
		RULE_elementValuePairs = 54, RULE_elementValuePair = 55, RULE_elementValue = 56, 
		RULE_elementValueArrayInitializer = 57, RULE_annotationTypeDeclaration = 58, 
		RULE_annotationTypeBody = 59, RULE_annotationTypeElementDeclaration = 60, 
		RULE_annotationTypeElementRest = 61, RULE_annotationMethodOrConstantRest = 62, 
		RULE_annotationMethodRest = 63, RULE_annotationConstantRest = 64, RULE_defaultValue = 65, 
		RULE_block = 66, RULE_blockStatement = 67, RULE_localVariableDeclarationStatement = 68, 
		RULE_localVariableDeclaration = 69, RULE_statement = 70, RULE_scanStatement = 71, 
		RULE_printStatement = 72, RULE_catchClause = 73, RULE_catchType = 74, 
		RULE_finallyBlock = 75, RULE_resourceSpecification = 76, RULE_resources = 77, 
		RULE_resource = 78, RULE_switchBlockStatementGroup = 79, RULE_switchLabel = 80, 
		RULE_forControl = 81, RULE_forInit = 82, RULE_enhancedForControl = 83, 
		RULE_forUpdate = 84, RULE_parExpression = 85, RULE_expressionList = 86, 
		RULE_statementExpression = 87, RULE_constantExpression = 88, RULE_expression = 89, 
		RULE_primary = 90, RULE_creator = 91, RULE_createdName = 92, RULE_innerCreator = 93, 
		RULE_arrayCreatorRest = 94, RULE_classCreatorRest = 95, RULE_explicitGenericInvocation = 96, 
		RULE_nonWildcardTypeArguments = 97, RULE_typeArgumentsOrDiamond = 98, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 99, RULE_superSuffix = 100, RULE_explicitGenericInvocationSuffix = 101, 
		RULE_arguments = 102;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
		"genericConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
		"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
		"interfaceMethodDeclaration", "genericInterfaceMethodDeclaration", "variableDeclarators", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "arrayInitializer", 
		"enumConstantName", "typeType", "classOrInterfaceType", "primitiveType", 
		"typeArguments", "typeArgument", "qualifiedNameList", "formalParameters", 
		"formalParameterList", "formalParameter", "lastFormalParameter", "methodBody", 
		"constructorBody", "qualifiedName", "literal", "annotation", "annotationName", 
		"elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclaration", 
		"annotationTypeElementRest", "annotationMethodOrConstantRest", "annotationMethodRest", 
		"annotationConstantRest", "defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "scanStatement", "printStatement", 
		"catchClause", "catchType", "finallyBlock", "resourceSpecification", "resources", 
		"resource", "switchBlockStatementGroup", "switchLabel", "forControl", 
		"forInit", "enhancedForControl", "forUpdate", "parExpression", "expressionList", 
		"statementExpression", "constantExpression", "expression", "primary", 
		"creator", "createdName", "innerCreator", "arrayCreatorRest", "classCreatorRest", 
		"explicitGenericInvocation", "nonWildcardTypeArguments", "typeArgumentsOrDiamond", 
		"nonWildcardTypeArgumentsOrDiamond", "superSuffix", "explicitGenericInvocationSuffix", 
		"arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'assert'", "'bool'", "'break'", "'byte'", "'case'", 
		"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'decimal'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'scanInt'", 
		"'scanDecimal'", "'scanString'", "'print'", "'println'", "'end'", null, 
		null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'and'", "'or'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, 
		"'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOL", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "DECIMAL", "FOR", "IF", "GOTO", 
		"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
		"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "SCANINT", 
		"SCANDEC", "SCANSTR", "PRINT", "PRINTLN", "END", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", 
		"ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Baraco.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BaracoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<ConstDeclarationContext> constDeclaration() {
			return getRuleContexts(ConstDeclarationContext.class);
		}
		public ConstDeclarationContext constDeclaration(int i) {
			return getRuleContext(ConstDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					constDeclaration();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					methodDeclaration();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (COLON - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				{
				setState(218);
				statement();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(224);
				annotation();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(PACKAGE);
			setState(231);
			qualifiedName();
			setState(232);
			match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(IMPORT);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(235);
				match(STATIC);
				}
			}

			setState(238);
			qualifiedName();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(239);
				match(DOT);
				setState(240);
				match(MUL);
				}
			}

			setState(243);
			match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(245);
					classOrInterfaceModifier();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(252);
					classOrInterfaceModifier();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(259);
					classOrInterfaceModifier();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(266);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(271);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(272);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				match(SEMI);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				annotation();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(CLASS);
			setState(289);
			match(Identifier);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(290);
				typeParameters();
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(293);
				match(EXTENDS);
				setState(294);
				typeType();
				}
			}

			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(297);
				match(IMPLEMENTS);
				setState(298);
				typeList();
				}
			}

			setState(301);
			classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(LT);
			setState(304);
			typeParameter();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(305);
				match(COMMA);
				setState(306);
				typeParameter();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(Identifier);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(315);
				match(EXTENDS);
				setState(316);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			typeType();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(320);
				match(BITAND);
				setState(321);
				typeType();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(BaracoParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(ENUM);
			setState(328);
			match(Identifier);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(329);
				match(IMPLEMENTS);
				setState(330);
				typeList();
				}
			}

			setState(333);
			match(LBRACE);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(334);
				enumConstants();
				}
			}

			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(337);
				match(COMMA);
				}
			}

			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(340);
				enumBodyDeclarations();
				}
			}

			setState(343);
			match(RBRACE);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			enumConstant();
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346);
					match(COMMA);
					setState(347);
					enumConstant();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(353);
				annotation();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(Identifier);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(360);
				arguments();
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(363);
				classBody();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(SEMI);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << DECIMAL) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (LT - 69)) | (1L << (COLON - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				{
				setState(367);
				classBodyDeclaration();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(INTERFACE);
			setState(374);
			match(Identifier);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(375);
				typeParameters();
				}
			}

			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(378);
				match(EXTENDS);
				setState(379);
				typeList();
				}
			}

			setState(382);
			interfaceBody();
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			typeType();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(385);
				match(COMMA);
				setState(386);
				typeType();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(LBRACE);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << DECIMAL) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (LT - 69)) | (1L << (COLON - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				{
				setState(393);
				classBodyDeclaration();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			match(RBRACE);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(LBRACE);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << DECIMAL) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (LT - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				{
				setState(402);
				interfaceBodyDeclaration();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(411);
					match(STATIC);
					}
				}

				setState(414);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						modifier();
						}
						} 
					}
					setState(420);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(421);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclaration);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(430);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(431);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(432);
				enumDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case DECIMAL:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(435);
				typeType();
				}
				break;
			case VOID:
				{
				setState(436);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(439);
			match(Identifier);
			setState(440);
			formalParameters();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(441);
				match(LBRACK);
				setState(442);
				match(RBRACK);
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(448);
				match(THROWS);
				setState(449);
				qualifiedNameList();
				}
			}

			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				setState(452);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(453);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			typeParameters();
			setState(457);
			methodDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(Identifier);
			setState(460);
			formalParameters();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(461);
				match(THROWS);
				setState(462);
				qualifiedNameList();
				}
			}

			setState(465);
			constructorBody();
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

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			typeParameters();
			setState(468);
			constructorDeclaration();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			typeType();
			setState(471);
			variableDeclarators();
			setState(472);
			match(SEMI);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOL:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case DECIMAL:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(474);
						modifier();
						}
						} 
					}
					setState(479);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(480);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(SEMI);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceMemberDeclaration);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(489);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(490);
				enumDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			typeType();
			setState(494);
			constantDeclarator();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(495);
				match(COMMA);
				setState(496);
				constantDeclarator();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
			match(SEMI);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(Identifier);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(505);
				match(LBRACK);
				setState(506);
				match(RBRACK);
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
			match(ASSIGN);
			setState(513);
			variableInitializer();
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case DECIMAL:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(515);
				typeType();
				}
				break;
			case VOID:
				{
				setState(516);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(519);
			match(Identifier);
			setState(520);
			formalParameters();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(521);
				match(LBRACK);
				setState(522);
				match(RBRACK);
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(528);
				match(THROWS);
				setState(529);
				qualifiedNameList();
				}
			}

			setState(532);
			match(SEMI);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			typeParameters();
			setState(535);
			interfaceMethodDeclaration();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			variableDeclarator();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(538);
				match(COMMA);
				setState(539);
				variableDeclarator();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			variableDeclaratorId();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(546);
				match(ASSIGN);
				setState(547);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(Identifier);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(551);
				match(LBRACK);
				setState(552);
				match(RBRACK);
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableInitializer);
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				arrayInitializer();
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case DECIMAL:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(LBRACE);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(563);
				variableInitializer();
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(564);
						match(COMMA);
						setState(565);
						variableInitializer();
						}
						} 
					}
					setState(570);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(571);
					match(COMMA);
					}
				}

				}
			}

			setState(576);
			match(RBRACE);
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeType);
		try {
			int _alt;
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				classOrInterfaceType();
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(581);
						match(LBRACK);
						setState(582);
						match(RBRACK);
						}
						} 
					}
					setState(587);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case DECIMAL:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				primitiveType();
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(589);
						match(LBRACK);
						setState(590);
						match(RBRACK);
						}
						} 
					}
					setState(595);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(BaracoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BaracoParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(Identifier);
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(599);
				typeArguments();
				}
				break;
			}
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(602);
					match(DOT);
					setState(603);
					match(Identifier);
					setState(605);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(604);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(LT);
			setState(615);
			typeArgument();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(616);
				match(COMMA);
				setState(617);
				typeArgument();
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(623);
			match(GT);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeArgument);
		int _la;
		try {
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case DECIMAL:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				match(QUESTION);
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(627);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(628);
					typeType();
					}
				}

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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			qualifiedName();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(634);
				match(COMMA);
				setState(635);
				qualifiedName();
				}
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(LPAREN);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << DECIMAL) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(642);
				formalParameterList();
				}
			}

			setState(645);
			match(RPAREN);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				formalParameter();
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(648);
						match(COMMA);
						setState(649);
						formalParameter();
						}
						} 
					}
					setState(654);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(655);
					match(COMMA);
					setState(656);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(662);
				variableModifier();
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(668);
			typeType();
			setState(669);
			variableDeclaratorId();
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(671);
				variableModifier();
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677);
			typeType();
			setState(678);
			match(ELLIPSIS);
			setState(679);
			variableDeclaratorId();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			block();
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			block();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(BaracoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BaracoParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(Identifier);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(686);
					match(DOT);
					setState(687);
					match(Identifier);
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(BaracoParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(BaracoParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(BaracoParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(BaracoParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(BaracoParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(AT);
			setState(696);
			annotationName();
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(697);
				match(LPAREN);
				setState(700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(698);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(699);
					elementValue();
					}
					break;
				}
				setState(702);
				match(RPAREN);
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

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			qualifiedName();
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			elementValuePair();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(708);
				match(COMMA);
				setState(709);
				elementValuePair();
				}
				}
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(Identifier);
			setState(716);
			match(ASSIGN);
			setState(717);
			elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValue);
		try {
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case DECIMAL:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(721);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(LBRACE);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				setState(725);
				elementValue();
				setState(730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(726);
						match(COMMA);
						setState(727);
						elementValue();
						}
						} 
					}
					setState(732);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
			}

			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(735);
				match(COMMA);
				}
			}

			setState(738);
			match(RBRACE);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(AT);
			setState(741);
			match(INTERFACE);
			setState(742);
			match(Identifier);
			setState(743);
			annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(LBRACE);
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << DECIMAL) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				{
				setState(746);
				annotationTypeElementDeclaration();
				}
				}
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(752);
			match(RBRACE);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOL:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case DECIMAL:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(754);
						modifier();
						}
						} 
					}
					setState(759);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				setState(760);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				match(SEMI);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeElementRest);
		try {
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case DECIMAL:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				typeType();
				setState(765);
				annotationMethodOrConstantRest();
				setState(766);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				classDeclaration();
				setState(770);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(769);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				interfaceDeclaration();
				setState(774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(773);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(776);
				enumDeclaration();
				setState(778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(777);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(780);
				annotationTypeDeclaration();
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(781);
					match(SEMI);
					}
					break;
				}
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationMethodOrConstantRest);
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(Identifier);
			setState(791);
			match(LPAREN);
			setState(792);
			match(RPAREN);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(793);
				defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			variableDeclarators();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(DEFAULT);
			setState(799);
			elementValue();
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(COLON);
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << DECIMAL) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (COLON - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				{
				setState(802);
				blockStatement();
				}
				}
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(808);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_blockStatement);
		try {
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(812);
				typeDeclaration();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			localVariableDeclaration();
			setState(816);
			match(SEMI);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(818);
				variableModifier();
				}
				}
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(824);
			typeType();
			setState(825);
			variableDeclarators();
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(BaracoParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ScanStatementContext scanStatement() {
			return getRuleContext(ScanStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				match(ASSERT);
				setState(829);
				expression(0);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(830);
					match(COLON);
					setState(831);
					expression(0);
					}
				}

				setState(834);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				match(IF);
				setState(837);
				parExpression();
				setState(838);
				statement();
				setState(841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(839);
					match(ELSE);
					setState(840);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
				match(FOR);
				setState(844);
				match(LPAREN);
				setState(845);
				forControl();
				setState(846);
				match(RPAREN);
				setState(847);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(849);
				match(WHILE);
				setState(850);
				parExpression();
				setState(851);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(853);
				match(DO);
				setState(854);
				statement();
				setState(855);
				match(WHILE);
				setState(856);
				parExpression();
				setState(857);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(859);
				match(TRY);
				setState(860);
				block();
				setState(870);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(862); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(861);
						catchClause();
						}
						}
						setState(864); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(867);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(866);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(869);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(872);
				match(TRY);
				setState(873);
				resourceSpecification();
				setState(874);
				block();
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(875);
					catchClause();
					}
					}
					setState(880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(881);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(884);
				match(SWITCH);
				setState(885);
				parExpression();
				setState(886);
				match(LBRACE);
				setState(890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(887);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(892);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(893);
					switchLabel();
					}
					}
					setState(898);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(899);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(901);
				match(SYNCHRONIZED);
				setState(902);
				parExpression();
				setState(903);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(905);
				match(RETURN);
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (Identifier - 74)))) != 0)) {
					{
					setState(906);
					expression(0);
					}
				}

				setState(909);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(910);
				match(THROW);
				setState(911);
				expression(0);
				setState(912);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(914);
				match(BREAK);
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(915);
					match(Identifier);
					}
				}

				setState(918);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(919);
				match(CONTINUE);
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(920);
					match(Identifier);
					}
				}

				setState(923);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(924);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(925);
				statementExpression();
				setState(926);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(928);
				match(Identifier);
				setState(929);
				match(COLON);
				setState(930);
				statement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(931);
				scanStatement();
				setState(932);
				match(SEMI);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(934);
				printStatement();
				setState(935);
				match(SEMI);
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

	public static class ScanStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public ScanStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterScanStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitScanStatement(this);
		}
	}

	public final ScanStatementContext scanStatement() throws RecognitionException {
		ScanStatementContext _localctx = new ScanStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_scanStatement);
		try {
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				match(Identifier);
				setState(940);
				match(ASSIGN);
				setState(941);
				match(SCANINT);
				setState(942);
				match(LPAREN);
				setState(943);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				match(Identifier);
				setState(945);
				match(ASSIGN);
				setState(946);
				match(SCANDEC);
				setState(947);
				match(LPAREN);
				setState(948);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(949);
				match(Identifier);
				setState(950);
				match(ASSIGN);
				setState(951);
				match(SCANSTR);
				setState(952);
				match(LPAREN);
				setState(953);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(BaracoParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(BaracoParser.StringLiteral, i);
		}
		public List<TerminalNode> IntegerLiteral() { return getTokens(BaracoParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(BaracoParser.IntegerLiteral, i);
		}
		public List<TerminalNode> FloatingPointLiteral() { return getTokens(BaracoParser.FloatingPointLiteral); }
		public TerminalNode FloatingPointLiteral(int i) {
			return getToken(BaracoParser.FloatingPointLiteral, i);
		}
		public List<TerminalNode> BooleanLiteral() { return getTokens(BaracoParser.BooleanLiteral); }
		public TerminalNode BooleanLiteral(int i) {
			return getToken(BaracoParser.BooleanLiteral, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(BaracoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BaracoParser.Identifier, i);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_printStatement);
		int _la;
		try {
			setState(978);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				match(PRINT);
				setState(957);
				match(LPAREN);
				setState(958);
				_la = _input.LA(1);
				if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (IntegerLiteral - 57)) | (1L << (FloatingPointLiteral - 57)) | (1L << (BooleanLiteral - 57)) | (1L << (StringLiteral - 57)) | (1L << (Identifier - 57)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					setState(959);
					match(ADD);
					setState(960);
					_la = _input.LA(1);
					if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (IntegerLiteral - 57)) | (1L << (FloatingPointLiteral - 57)) | (1L << (BooleanLiteral - 57)) | (1L << (StringLiteral - 57)) | (1L << (Identifier - 57)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(966);
				match(RPAREN);
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				match(PRINTLN);
				setState(968);
				match(LPAREN);
				setState(969);
				_la = _input.LA(1);
				if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (IntegerLiteral - 57)) | (1L << (FloatingPointLiteral - 57)) | (1L << (BooleanLiteral - 57)) | (1L << (StringLiteral - 57)) | (1L << (Identifier - 57)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					setState(970);
					match(ADD);
					setState(971);
					_la = _input.LA(1);
					if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (IntegerLiteral - 57)) | (1L << (FloatingPointLiteral - 57)) | (1L << (BooleanLiteral - 57)) | (1L << (StringLiteral - 57)) | (1L << (Identifier - 57)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(976);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(977);
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

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			match(CATCH);
			setState(981);
			match(LPAREN);
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(982);
				variableModifier();
				}
				}
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(988);
			catchType();
			setState(989);
			match(Identifier);
			setState(990);
			match(RPAREN);
			setState(991);
			block();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			qualifiedName();
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(994);
				match(BITOR);
				setState(995);
				qualifiedName();
				}
				}
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(FINALLY);
			setState(1002);
			block();
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(LPAREN);
			setState(1005);
			resources();
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1006);
				match(SEMI);
				}
			}

			setState(1009);
			match(RPAREN);
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

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			resource();
			setState(1016);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1012);
					match(SEMI);
					setState(1013);
					resource();
					}
					} 
				}
				setState(1018);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1019);
				variableModifier();
				}
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1025);
			classOrInterfaceType();
			setState(1026);
			variableDeclaratorId();
			setState(1027);
			match(ASSIGN);
			setState(1028);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1030);
				switchLabel();
				}
				}
				setState(1033); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1036); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1035);
				blockStatement();
				}
				}
				setState(1038); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << DECIMAL) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (COLON - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_switchLabel);
		try {
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040);
				match(CASE);
				setState(1041);
				constantExpression();
				setState(1042);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				match(CASE);
				setState(1045);
				enumConstantName();
				setState(1046);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1048);
				match(DEFAULT);
				setState(1049);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_forControl);
		int _la;
		try {
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << DECIMAL) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (Identifier - 74)) | (1L << (AT - 74)))) != 0)) {
					{
					setState(1053);
					forInit();
					}
				}

				setState(1056);
				match(SEMI);
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (Identifier - 74)))) != 0)) {
					{
					setState(1057);
					expression(0);
					}
				}

				setState(1060);
				match(SEMI);
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (Identifier - 74)))) != 0)) {
					{
					setState(1061);
					forUpdate();
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_forInit);
		try {
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1070);
				variableModifier();
				}
				}
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1076);
			typeType();
			setState(1077);
			variableDeclaratorId();
			setState(1078);
			match(COLON);
			setState(1079);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			expressionList();
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			match(LPAREN);
			setState(1084);
			expression(0);
			setState(1085);
			match(RPAREN);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			expression(0);
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1088);
				match(COMMA);
				setState(1089);
				expression(0);
				}
				}
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
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

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitExpression(this);
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
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1100);
				primary();
				}
				break;
			case 2:
				{
				setState(1101);
				match(NEW);
				setState(1102);
				creator();
				}
				break;
			case 3:
				{
				setState(1103);
				match(LPAREN);
				setState(1104);
				typeType();
				setState(1105);
				match(RPAREN);
				setState(1106);
				expression(17);
				}
				break;
			case 4:
				{
				setState(1108);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (INC - 85)) | (1L << (DEC - 85)) | (1L << (ADD - 85)) | (1L << (SUB - 85)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1109);
				expression(15);
				}
				break;
			case 5:
				{
				setState(1110);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1111);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1114);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1115);
						_la = _input.LA(1);
						if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (MUL - 89)) | (1L << (DIV - 89)) | (1L << (MOD - 89)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1116);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1117);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1118);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1119);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1120);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1128);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
						case 1:
							{
							setState(1121);
							match(LT);
							setState(1122);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1123);
							match(GT);
							setState(1124);
							match(GT);
							setState(1125);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1126);
							match(GT);
							setState(1127);
							match(GT);
							}
							break;
						}
						setState(1130);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1131);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1132);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (GT - 73)) | (1L << (LT - 73)) | (1L << (LE - 73)) | (1L << (GE - 73)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1133);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1134);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1135);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1136);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1137);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1138);
						match(BITAND);
						setState(1139);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1140);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1141);
						match(CARET);
						setState(1142);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1143);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1144);
						match(BITOR);
						setState(1145);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1146);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1147);
						match(AND);
						setState(1148);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1149);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1150);
						match(OR);
						setState(1151);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1152);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1153);
						match(QUESTION);
						setState(1154);
						expression(0);
						setState(1155);
						match(COLON);
						setState(1156);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1158);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1159);
						_la = _input.LA(1);
						if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ASSIGN - 72)) | (1L << (ADD_ASSIGN - 72)) | (1L << (SUB_ASSIGN - 72)) | (1L << (MUL_ASSIGN - 72)) | (1L << (DIV_ASSIGN - 72)) | (1L << (AND_ASSIGN - 72)) | (1L << (OR_ASSIGN - 72)) | (1L << (XOR_ASSIGN - 72)) | (1L << (MOD_ASSIGN - 72)) | (1L << (LSHIFT_ASSIGN - 72)) | (1L << (RSHIFT_ASSIGN - 72)) | (1L << (URSHIFT_ASSIGN - 72)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1160);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1161);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1162);
						match(DOT);
						setState(1163);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1164);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1165);
						match(DOT);
						setState(1166);
						match(THIS);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1167);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1168);
						match(DOT);
						setState(1169);
						match(NEW);
						setState(1171);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1170);
							nonWildcardTypeArguments();
							}
						}

						setState(1173);
						innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1174);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1175);
						match(DOT);
						setState(1176);
						match(SUPER);
						setState(1177);
						superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1178);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1179);
						match(DOT);
						setState(1180);
						explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1182);
						match(LBRACK);
						setState(1183);
						expression(0);
						setState(1184);
						match(RBRACK);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1186);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1187);
						match(LPAREN);
						setState(1189);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (Identifier - 74)))) != 0)) {
							{
							setState(1188);
							expressionList();
							}
						}

						setState(1191);
						match(RPAREN);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1192);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1193);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1194);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1195);
						match(INSTANCEOF);
						setState(1196);
						typeType();
						}
						break;
					}
					} 
				}
				setState(1201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_primary);
		try {
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				match(LPAREN);
				setState(1203);
				expression(0);
				setState(1204);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1207);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1208);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1209);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1210);
				typeType();
				setState(1211);
				match(DOT);
				setState(1212);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1214);
				match(VOID);
				setState(1215);
				match(DOT);
				setState(1216);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1217);
				nonWildcardTypeArguments();
				setState(1221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1218);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1219);
					match(THIS);
					setState(1220);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_creator);
		try {
			setState(1234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				nonWildcardTypeArguments();
				setState(1226);
				createdName();
				setState(1227);
				classCreatorRest();
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case DECIMAL:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229);
				createdName();
				setState(1232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1230);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1231);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(BaracoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BaracoParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_createdName);
		int _la;
		try {
			setState(1251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1236);
				match(Identifier);
				setState(1238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1237);
					typeArgumentsOrDiamond();
					}
				}

				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1240);
					match(DOT);
					setState(1241);
					match(Identifier);
					setState(1243);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1242);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case DECIMAL:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1250);
				primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			match(Identifier);
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1254);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1257);
			classCreatorRest();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			match(LBRACK);
			setState(1287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1260);
				match(RBRACK);
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1261);
					match(LBRACK);
					setState(1262);
					match(RBRACK);
					}
					}
					setState(1267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1268);
				arrayInitializer();
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case DECIMAL:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1269);
				expression(0);
				setState(1270);
				match(RBRACK);
				setState(1277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1271);
						match(LBRACK);
						setState(1272);
						expression(0);
						setState(1273);
						match(RBRACK);
						}
						} 
					}
					setState(1279);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				}
				setState(1284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1280);
						match(LBRACK);
						setState(1281);
						match(RBRACK);
						}
						} 
					}
					setState(1286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			arguments();
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1290);
				classBody();
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			nonWildcardTypeArguments();
			setState(1294);
			explicitGenericInvocationSuffix();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(LT);
			setState(1297);
			typeList();
			setState(1298);
			match(GT);
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_typeArgumentsOrDiamond);
		try {
			setState(1303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				match(LT);
				setState(1301);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302);
				typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305);
				match(LT);
				setState(1306);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307);
				nonWildcardTypeArguments();
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_superSuffix);
		try {
			setState(1316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				match(DOT);
				setState(1312);
				match(Identifier);
				setState(1314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1313);
					arguments();
					}
					break;
				}
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318);
				match(SUPER);
				setState(1319);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				match(Identifier);
				setState(1321);
				arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			match(LPAREN);
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(1325);
				expressionList();
				}
			}

			setState(1328);
			match(RPAREN);
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
		case 89:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 23);
		case 15:
			return precpred(_ctx, 22);
		case 16:
			return precpred(_ctx, 21);
		case 17:
			return precpred(_ctx, 20);
		case 18:
			return precpred(_ctx, 19);
		case 19:
			return precpred(_ctx, 16);
		case 20:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3q\u0535\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\7\2\u00d2\n\2"+
		"\f\2\16\2\u00d5\13\2\3\2\7\2\u00d8\n\2\f\2\16\2\u00db\13\2\3\2\7\2\u00de"+
		"\n\2\f\2\16\2\u00e1\13\2\3\3\7\3\u00e4\n\3\f\3\16\3\u00e7\13\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\5\4\u00ef\n\4\3\4\3\4\3\4\5\4\u00f4\n\4\3\4\3\4\3\5\7"+
		"\5\u00f9\n\5\f\5\16\5\u00fc\13\5\3\5\3\5\7\5\u0100\n\5\f\5\16\5\u0103"+
		"\13\5\3\5\3\5\7\5\u0107\n\5\f\5\16\5\u010a\13\5\3\5\3\5\7\5\u010e\n\5"+
		"\f\5\16\5\u0111\13\5\3\5\3\5\5\5\u0115\n\5\3\6\3\6\5\6\u0119\n\6\3\7\3"+
		"\7\5\7\u011d\n\7\3\b\3\b\5\b\u0121\n\b\3\t\3\t\3\t\5\t\u0126\n\t\3\t\3"+
		"\t\5\t\u012a\n\t\3\t\3\t\5\t\u012e\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0136"+
		"\n\n\f\n\16\n\u0139\13\n\3\n\3\n\3\13\3\13\3\13\5\13\u0140\n\13\3\f\3"+
		"\f\3\f\7\f\u0145\n\f\f\f\16\f\u0148\13\f\3\r\3\r\3\r\3\r\5\r\u014e\n\r"+
		"\3\r\3\r\5\r\u0152\n\r\3\r\5\r\u0155\n\r\3\r\5\r\u0158\n\r\3\r\3\r\3\16"+
		"\3\16\3\16\7\16\u015f\n\16\f\16\16\16\u0162\13\16\3\17\7\17\u0165\n\17"+
		"\f\17\16\17\u0168\13\17\3\17\3\17\5\17\u016c\n\17\3\17\5\17\u016f\n\17"+
		"\3\20\3\20\7\20\u0173\n\20\f\20\16\20\u0176\13\20\3\21\3\21\3\21\5\21"+
		"\u017b\n\21\3\21\3\21\5\21\u017f\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u0186"+
		"\n\22\f\22\16\22\u0189\13\22\3\23\3\23\7\23\u018d\n\23\f\23\16\23\u0190"+
		"\13\23\3\23\3\23\3\24\3\24\7\24\u0196\n\24\f\24\16\24\u0199\13\24\3\24"+
		"\3\24\3\25\3\25\5\25\u019f\n\25\3\25\3\25\7\25\u01a3\n\25\f\25\16\25\u01a6"+
		"\13\25\3\25\5\25\u01a9\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u01b4\n\26\3\27\3\27\5\27\u01b8\n\27\3\27\3\27\3\27\3\27\7\27"+
		"\u01be\n\27\f\27\16\27\u01c1\13\27\3\27\3\27\5\27\u01c5\n\27\3\27\3\27"+
		"\5\27\u01c9\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u01d2\n\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\7\34\u01de\n\34\f\34"+
		"\16\34\u01e1\13\34\3\34\3\34\5\34\u01e5\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01ee\n\35\3\36\3\36\3\36\3\36\7\36\u01f4\n\36\f\36\16"+
		"\36\u01f7\13\36\3\36\3\36\3\37\3\37\3\37\7\37\u01fe\n\37\f\37\16\37\u0201"+
		"\13\37\3\37\3\37\3\37\3 \3 \5 \u0208\n \3 \3 \3 \3 \7 \u020e\n \f \16"+
		" \u0211\13 \3 \3 \5 \u0215\n \3 \3 \3!\3!\3!\3\"\3\"\3\"\7\"\u021f\n\""+
		"\f\"\16\"\u0222\13\"\3#\3#\3#\5#\u0227\n#\3$\3$\3$\7$\u022c\n$\f$\16$"+
		"\u022f\13$\3%\3%\5%\u0233\n%\3&\3&\3&\3&\7&\u0239\n&\f&\16&\u023c\13&"+
		"\3&\5&\u023f\n&\5&\u0241\n&\3&\3&\3\'\3\'\3(\3(\3(\7(\u024a\n(\f(\16("+
		"\u024d\13(\3(\3(\3(\7(\u0252\n(\f(\16(\u0255\13(\5(\u0257\n(\3)\3)\5)"+
		"\u025b\n)\3)\3)\3)\5)\u0260\n)\7)\u0262\n)\f)\16)\u0265\13)\3*\3*\3+\3"+
		"+\3+\3+\7+\u026d\n+\f+\16+\u0270\13+\3+\3+\3,\3,\3,\3,\5,\u0278\n,\5,"+
		"\u027a\n,\3-\3-\3-\7-\u027f\n-\f-\16-\u0282\13-\3.\3.\5.\u0286\n.\3.\3"+
		".\3/\3/\3/\7/\u028d\n/\f/\16/\u0290\13/\3/\3/\5/\u0294\n/\3/\5/\u0297"+
		"\n/\3\60\7\60\u029a\n\60\f\60\16\60\u029d\13\60\3\60\3\60\3\60\3\61\7"+
		"\61\u02a3\n\61\f\61\16\61\u02a6\13\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\64\7\64\u02b3\n\64\f\64\16\64\u02b6\13\64\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\5\66\u02bf\n\66\3\66\5\66\u02c2\n\66\3\67"+
		"\3\67\38\38\38\78\u02c9\n8\f8\168\u02cc\138\39\39\39\39\3:\3:\3:\5:\u02d5"+
		"\n:\3;\3;\3;\3;\7;\u02db\n;\f;\16;\u02de\13;\5;\u02e0\n;\3;\5;\u02e3\n"+
		";\3;\3;\3<\3<\3<\3<\3<\3=\3=\7=\u02ee\n=\f=\16=\u02f1\13=\3=\3=\3>\7>"+
		"\u02f6\n>\f>\16>\u02f9\13>\3>\3>\5>\u02fd\n>\3?\3?\3?\3?\3?\3?\5?\u0305"+
		"\n?\3?\3?\5?\u0309\n?\3?\3?\5?\u030d\n?\3?\3?\5?\u0311\n?\5?\u0313\n?"+
		"\3@\3@\5@\u0317\n@\3A\3A\3A\3A\5A\u031d\nA\3B\3B\3C\3C\3C\3D\3D\7D\u0326"+
		"\nD\fD\16D\u0329\13D\3D\3D\3E\3E\3E\5E\u0330\nE\3F\3F\3F\3G\7G\u0336\n"+
		"G\fG\16G\u0339\13G\3G\3G\3G\3H\3H\3H\3H\3H\5H\u0343\nH\3H\3H\3H\3H\3H"+
		"\3H\3H\5H\u034c\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\6H\u0361\nH\rH\16H\u0362\3H\5H\u0366\nH\3H\5H\u0369\nH\3H\3H\3"+
		"H\3H\7H\u036f\nH\fH\16H\u0372\13H\3H\5H\u0375\nH\3H\3H\3H\3H\7H\u037b"+
		"\nH\fH\16H\u037e\13H\3H\7H\u0381\nH\fH\16H\u0384\13H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\5H\u038e\nH\3H\3H\3H\3H\3H\3H\3H\5H\u0397\nH\3H\3H\3H\5H\u039c"+
		"\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u03ac\nH\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03bd\nI\3J\3J\3J\3J\3J\7J\u03c4"+
		"\nJ\fJ\16J\u03c7\13J\3J\3J\3J\3J\3J\3J\7J\u03cf\nJ\fJ\16J\u03d2\13J\3"+
		"J\5J\u03d5\nJ\3K\3K\3K\7K\u03da\nK\fK\16K\u03dd\13K\3K\3K\3K\3K\3K\3L"+
		"\3L\3L\7L\u03e7\nL\fL\16L\u03ea\13L\3M\3M\3M\3N\3N\3N\5N\u03f2\nN\3N\3"+
		"N\3O\3O\3O\7O\u03f9\nO\fO\16O\u03fc\13O\3P\7P\u03ff\nP\fP\16P\u0402\13"+
		"P\3P\3P\3P\3P\3P\3Q\6Q\u040a\nQ\rQ\16Q\u040b\3Q\6Q\u040f\nQ\rQ\16Q\u0410"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u041d\nR\3S\3S\5S\u0421\nS\3S\3S\5S"+
		"\u0425\nS\3S\3S\5S\u0429\nS\5S\u042b\nS\3T\3T\5T\u042f\nT\3U\7U\u0432"+
		"\nU\fU\16U\u0435\13U\3U\3U\3U\3U\3U\3V\3V\3W\3W\3W\3W\3X\3X\3X\7X\u0445"+
		"\nX\fX\16X\u0448\13X\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\5[\u045b\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u046b\n[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0496\n[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u04a8\n[\3[\3[\3[\3[\3"+
		"[\3[\7[\u04b0\n[\f[\16[\u04b3\13[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u04c8\n\\\5\\\u04ca\n\\\3"+
		"]\3]\3]\3]\3]\3]\3]\5]\u04d3\n]\5]\u04d5\n]\3^\3^\5^\u04d9\n^\3^\3^\3"+
		"^\5^\u04de\n^\7^\u04e0\n^\f^\16^\u04e3\13^\3^\5^\u04e6\n^\3_\3_\5_\u04ea"+
		"\n_\3_\3_\3`\3`\3`\3`\7`\u04f2\n`\f`\16`\u04f5\13`\3`\3`\3`\3`\3`\3`\3"+
		"`\7`\u04fe\n`\f`\16`\u0501\13`\3`\3`\7`\u0505\n`\f`\16`\u0508\13`\5`\u050a"+
		"\n`\3a\3a\5a\u050e\na\3b\3b\3b\3c\3c\3c\3c\3d\3d\3d\5d\u051a\nd\3e\3e"+
		"\3e\5e\u051f\ne\3f\3f\3f\3f\5f\u0525\nf\5f\u0527\nf\3g\3g\3g\3g\5g\u052d"+
		"\ng\3h\3h\5h\u0531\nh\3h\3h\3h\2\3\u00b4i\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\2\20\6\2  ,,\60\60\63\63\6\2\3\3\24\24#%()\n\2\5\5"+
		"\7\7\n\n\20\20\26\26\35\35\37\37\'\'\4\2\23\23**\3\2;@\5\2;=??ll\3\2W"+
		"Z\3\2MN\4\2[\\``\3\2YZ\4\2KLRS\4\2QQTT\4\2JJak\3\2WX\2\u05ac\2\u00d3\3"+
		"\2\2\2\4\u00e5\3\2\2\2\6\u00ec\3\2\2\2\b\u0114\3\2\2\2\n\u0118\3\2\2\2"+
		"\f\u011c\3\2\2\2\16\u0120\3\2\2\2\20\u0122\3\2\2\2\22\u0131\3\2\2\2\24"+
		"\u013c\3\2\2\2\26\u0141\3\2\2\2\30\u0149\3\2\2\2\32\u015b\3\2\2\2\34\u0166"+
		"\3\2\2\2\36\u0170\3\2\2\2 \u0177\3\2\2\2\"\u0182\3\2\2\2$\u018a\3\2\2"+
		"\2&\u0193\3\2\2\2(\u01a8\3\2\2\2*\u01b3\3\2\2\2,\u01b7\3\2\2\2.\u01ca"+
		"\3\2\2\2\60\u01cd\3\2\2\2\62\u01d5\3\2\2\2\64\u01d8\3\2\2\2\66\u01e4\3"+
		"\2\2\28\u01ed\3\2\2\2:\u01ef\3\2\2\2<\u01fa\3\2\2\2>\u0207\3\2\2\2@\u0218"+
		"\3\2\2\2B\u021b\3\2\2\2D\u0223\3\2\2\2F\u0228\3\2\2\2H\u0232\3\2\2\2J"+
		"\u0234\3\2\2\2L\u0244\3\2\2\2N\u0256\3\2\2\2P\u0258\3\2\2\2R\u0266\3\2"+
		"\2\2T\u0268\3\2\2\2V\u0279\3\2\2\2X\u027b\3\2\2\2Z\u0283\3\2\2\2\\\u0296"+
		"\3\2\2\2^\u029b\3\2\2\2`\u02a4\3\2\2\2b\u02ab\3\2\2\2d\u02ad\3\2\2\2f"+
		"\u02af\3\2\2\2h\u02b7\3\2\2\2j\u02b9\3\2\2\2l\u02c3\3\2\2\2n\u02c5\3\2"+
		"\2\2p\u02cd\3\2\2\2r\u02d4\3\2\2\2t\u02d6\3\2\2\2v\u02e6\3\2\2\2x\u02eb"+
		"\3\2\2\2z\u02fc\3\2\2\2|\u0312\3\2\2\2~\u0316\3\2\2\2\u0080\u0318\3\2"+
		"\2\2\u0082\u031e\3\2\2\2\u0084\u0320\3\2\2\2\u0086\u0323\3\2\2\2\u0088"+
		"\u032f\3\2\2\2\u008a\u0331\3\2\2\2\u008c\u0337\3\2\2\2\u008e\u03ab\3\2"+
		"\2\2\u0090\u03bc\3\2\2\2\u0092\u03d4\3\2\2\2\u0094\u03d6\3\2\2\2\u0096"+
		"\u03e3\3\2\2\2\u0098\u03eb\3\2\2\2\u009a\u03ee\3\2\2\2\u009c\u03f5\3\2"+
		"\2\2\u009e\u0400\3\2\2\2\u00a0\u0409\3\2\2\2\u00a2\u041c\3\2\2\2\u00a4"+
		"\u042a\3\2\2\2\u00a6\u042e\3\2\2\2\u00a8\u0433\3\2\2\2\u00aa\u043b\3\2"+
		"\2\2\u00ac\u043d\3\2\2\2\u00ae\u0441\3\2\2\2\u00b0\u0449\3\2\2\2\u00b2"+
		"\u044b\3\2\2\2\u00b4\u045a\3\2\2\2\u00b6\u04c9\3\2\2\2\u00b8\u04d4\3\2"+
		"\2\2\u00ba\u04e5\3\2\2\2\u00bc\u04e7\3\2\2\2\u00be\u04ed\3\2\2\2\u00c0"+
		"\u050b\3\2\2\2\u00c2\u050f\3\2\2\2\u00c4\u0512\3\2\2\2\u00c6\u0519\3\2"+
		"\2\2\u00c8\u051e\3\2\2\2\u00ca\u0526\3\2\2\2\u00cc\u052c\3\2\2\2\u00ce"+
		"\u052e\3\2\2\2\u00d0\u00d2\5:\36\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d9\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d8\5,\27\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00df\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00de\5\u008eH\2\u00dd\u00dc\3\2\2\2\u00de\u00e1"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e4\5j\66\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e9\7\"\2\2\u00e9\u00ea\5f\64\2\u00ea\u00eb\7G"+
		"\2\2\u00eb\5\3\2\2\2\u00ec\u00ee\7\33\2\2\u00ed\u00ef\7(\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\5f\64\2\u00f1"+
		"\u00f2\7I\2\2\u00f2\u00f4\7[\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2"+
		"\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7G\2\2\u00f6\7\3\2\2\2\u00f7\u00f9"+
		"\5\f\7\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0115\5\20"+
		"\t\2\u00fe\u0100\5\f\7\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u0115\5\30\r\2\u0105\u0107\5\f\7\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u0115\5 \21\2\u010c\u010e\5\f\7\2\u010d"+
		"\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0115\5v<\2\u0113\u0115"+
		"\7G\2\2\u0114\u00fa\3\2\2\2\u0114\u0101\3\2\2\2\u0114\u0108\3\2\2\2\u0114"+
		"\u010f\3\2\2\2\u0114\u0113\3\2\2\2\u0115\t\3\2\2\2\u0116\u0119\5\f\7\2"+
		"\u0117\u0119\t\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\13"+
		"\3\2\2\2\u011a\u011d\5j\66\2\u011b\u011d\t\3\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011b\3\2\2\2\u011d\r\3\2\2\2\u011e\u0121\7\24\2\2\u011f\u0121\5j\66"+
		"\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\17\3\2\2\2\u0122\u0123"+
		"\7\13\2\2\u0123\u0125\7l\2\2\u0124\u0126\5\22\n\2\u0125\u0124\3\2\2\2"+
		"\u0125\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0128\7\23\2\2\u0128\u012a"+
		"\5N(\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u012c\7\32\2\2\u012c\u012e\5\"\22\2\u012d\u012b\3\2\2\2\u012d\u012e\3"+
		"\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\5$\23\2\u0130\21\3\2\2\2\u0131"+
		"\u0132\7L\2\2\u0132\u0137\5\24\13\2\u0133\u0134\7H\2\2\u0134\u0136\5\24"+
		"\13\2\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7K"+
		"\2\2\u013b\23\3\2\2\2\u013c\u013f\7l\2\2\u013d\u013e\7\23\2\2\u013e\u0140"+
		"\5\26\f\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\25\3\2\2\2\u0141"+
		"\u0146\5N(\2\u0142\u0143\7]\2\2\u0143\u0145\5N(\2\u0144\u0142\3\2\2\2"+
		"\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\27"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7\22\2\2\u014a\u014d\7l\2\2\u014b"+
		"\u014c\7\32\2\2\u014c\u014e\5\"\22\2\u014d\u014b\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\7C\2\2\u0150\u0152\5\32\16\2\u0151"+
		"\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0155\7H"+
		"\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0158\5\36\20\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3"+
		"\2\2\2\u0159\u015a\7D\2\2\u015a\31\3\2\2\2\u015b\u0160\5\34\17\2\u015c"+
		"\u015d\7H\2\2\u015d\u015f\5\34\17\2\u015e\u015c\3\2\2\2\u015f\u0162\3"+
		"\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\33\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0165\5j\66\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016b\7l\2\2\u016a\u016c\5\u00ceh\2\u016b\u016a\3"+
		"\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016f\5$\23\2\u016e"+
		"\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\35\3\2\2\2\u0170\u0174\7G\2\2"+
		"\u0171\u0173\5(\25\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\37\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\7\36\2\2\u0178\u017a\7l\2\2\u0179\u017b\5\22\n\2\u017a\u0179\3"+
		"\2\2\2\u017a\u017b\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017d\7\23\2\2\u017d"+
		"\u017f\5\"\22\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3"+
		"\2\2\2\u0180\u0181\5&\24\2\u0181!\3\2\2\2\u0182\u0187\5N(\2\u0183\u0184"+
		"\7H\2\2\u0184\u0186\5N(\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188#\3\2\2\2\u0189\u0187\3\2\2\2"+
		"\u018a\u018e\7C\2\2\u018b\u018d\5(\25\2\u018c\u018b\3\2\2\2\u018d\u0190"+
		"\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0192\7D\2\2\u0192%\3\2\2\2\u0193\u0197\7C\2\2\u0194"+
		"\u0196\5\66\34\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3"+
		"\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\u019b\7D\2\2\u019b\'\3\2\2\2\u019c\u01a9\7G\2\2\u019d\u019f\7(\2\2\u019e"+
		"\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a9\5\u0086"+
		"D\2\u01a1\u01a3\5\n\6\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a7\u01a9\5*\26\2\u01a8\u019c\3\2\2\2\u01a8\u019e\3\2\2\2\u01a8"+
		"\u01a4\3\2\2\2\u01a9)\3\2\2\2\u01aa\u01b4\5,\27\2\u01ab\u01b4\5.\30\2"+
		"\u01ac\u01b4\5\64\33\2\u01ad\u01b4\5\60\31\2\u01ae\u01b4\5\62\32\2\u01af"+
		"\u01b4\5 \21\2\u01b0\u01b4\5v<\2\u01b1\u01b4\5\20\t\2\u01b2\u01b4\5\30"+
		"\r\2\u01b3\u01aa\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01ac\3\2\2\2\u01b3"+
		"\u01ad\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b0\3\2"+
		"\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4+\3\2\2\2\u01b5\u01b8"+
		"\5N(\2\u01b6\u01b8\7\62\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\7l\2\2\u01ba\u01bf\5Z.\2\u01bb\u01bc\7E\2\2"+
		"\u01bc\u01be\7F\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c4\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01c3\7/\2\2\u01c3\u01c5\5X-\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2"+
		"\2\u01c5\u01c8\3\2\2\2\u01c6\u01c9\5b\62\2\u01c7\u01c9\7G\2\2\u01c8\u01c6"+
		"\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9-\3\2\2\2\u01ca\u01cb\5\22\n\2\u01cb"+
		"\u01cc\5,\27\2\u01cc/\3\2\2\2\u01cd\u01ce\7l\2\2\u01ce\u01d1\5Z.\2\u01cf"+
		"\u01d0\7/\2\2\u01d0\u01d2\5X-\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2"+
		"\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\5d\63\2\u01d4\61\3\2\2\2\u01d5\u01d6"+
		"\5\22\n\2\u01d6\u01d7\5\60\31\2\u01d7\63\3\2\2\2\u01d8\u01d9\5N(\2\u01d9"+
		"\u01da\5B\"\2\u01da\u01db\7G\2\2\u01db\65\3\2\2\2\u01dc\u01de\5\n\6\2"+
		"\u01dd\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\58\35\2\u01e3"+
		"\u01e5\7G\2\2\u01e4\u01df\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\67\3\2\2\2"+
		"\u01e6\u01ee\5:\36\2\u01e7\u01ee\5> \2\u01e8\u01ee\5@!\2\u01e9\u01ee\5"+
		" \21\2\u01ea\u01ee\5v<\2\u01eb\u01ee\5\20\t\2\u01ec\u01ee\5\30\r\2\u01ed"+
		"\u01e6\3\2\2\2\u01ed\u01e7\3\2\2\2\u01ed\u01e8\3\2\2\2\u01ed\u01e9\3\2"+
		"\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee"+
		"9\3\2\2\2\u01ef\u01f0\5N(\2\u01f0\u01f5\5<\37\2\u01f1\u01f2\7H\2\2\u01f2"+
		"\u01f4\5<\37\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u01f9\7G\2\2\u01f9;\3\2\2\2\u01fa\u01ff\7l\2\2\u01fb\u01fc\7E\2\2\u01fc"+
		"\u01fe\7F\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2"+
		"\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202"+
		"\u0203\7J\2\2\u0203\u0204\5H%\2\u0204=\3\2\2\2\u0205\u0208\5N(\2\u0206"+
		"\u0208\7\62\2\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208\u0209\3"+
		"\2\2\2\u0209\u020a\7l\2\2\u020a\u020f\5Z.\2\u020b\u020c\7E\2\2\u020c\u020e"+
		"\7F\2\2\u020d\u020b\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0214\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0213\7/"+
		"\2\2\u0213\u0215\5X-\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216"+
		"\3\2\2\2\u0216\u0217\7G\2\2\u0217?\3\2\2\2\u0218\u0219\5\22\n\2\u0219"+
		"\u021a\5> \2\u021aA\3\2\2\2\u021b\u0220\5D#\2\u021c\u021d\7H\2\2\u021d"+
		"\u021f\5D#\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2"+
		"\2\u0220\u0221\3\2\2\2\u0221C\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0226"+
		"\5F$\2\u0224\u0225\7J\2\2\u0225\u0227\5H%\2\u0226\u0224\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227E\3\2\2\2\u0228\u022d\7l\2\2\u0229\u022a\7E\2\2\u022a"+
		"\u022c\7F\2\2\u022b\u0229\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022eG\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0233"+
		"\5J&\2\u0231\u0233\5\u00b4[\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2"+
		"\u0233I\3\2\2\2\u0234\u0240\7C\2\2\u0235\u023a\5H%\2\u0236\u0237\7H\2"+
		"\2\u0237\u0239\5H%\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023d"+
		"\u023f\7H\2\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2"+
		"\2\2\u0240\u0235\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\7D\2\2\u0243K\3\2\2\2\u0244\u0245\7l\2\2\u0245M\3\2\2\2\u0246\u024b"+
		"\5P)\2\u0247\u0248\7E\2\2\u0248\u024a\7F\2\2\u0249\u0247\3\2\2\2\u024a"+
		"\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u0257\3\2"+
		"\2\2\u024d\u024b\3\2\2\2\u024e\u0253\5R*\2\u024f\u0250\7E\2\2\u0250\u0252"+
		"\7F\2\2\u0251\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0246\3\2"+
		"\2\2\u0256\u024e\3\2\2\2\u0257O\3\2\2\2\u0258\u025a\7l\2\2\u0259\u025b"+
		"\5T+\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0263\3\2\2\2\u025c"+
		"\u025d\7I\2\2\u025d\u025f\7l\2\2\u025e\u0260\5T+\2\u025f\u025e\3\2\2\2"+
		"\u025f\u0260\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u025c\3\2\2\2\u0262\u0265"+
		"\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264Q\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0266\u0267\t\4\2\2\u0267S\3\2\2\2\u0268\u0269\7L\2\2\u0269"+
		"\u026e\5V,\2\u026a\u026b\7H\2\2\u026b\u026d\5V,\2\u026c\u026a\3\2\2\2"+
		"\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271"+
		"\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\7K\2\2\u0272U\3\2\2\2\u0273\u027a"+
		"\5N(\2\u0274\u0277\7O\2\2\u0275\u0276\t\5\2\2\u0276\u0278\5N(\2\u0277"+
		"\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u0273\3\2"+
		"\2\2\u0279\u0274\3\2\2\2\u027aW\3\2\2\2\u027b\u0280\5f\64\2\u027c\u027d"+
		"\7H\2\2\u027d\u027f\5f\64\2\u027e\u027c\3\2\2\2\u027f\u0282\3\2\2\2\u0280"+
		"\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281Y\3\2\2\2\u0282\u0280\3\2\2\2"+
		"\u0283\u0285\7A\2\2\u0284\u0286\5\\/\2\u0285\u0284\3\2\2\2\u0285\u0286"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\7B\2\2\u0288[\3\2\2\2\u0289\u028e"+
		"\5^\60\2\u028a\u028b\7H\2\2\u028b\u028d\5^\60\2\u028c\u028a\3\2\2\2\u028d"+
		"\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0293\3\2"+
		"\2\2\u0290\u028e\3\2\2\2\u0291\u0292\7H\2\2\u0292\u0294\5`\61\2\u0293"+
		"\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0297\5`"+
		"\61\2\u0296\u0289\3\2\2\2\u0296\u0295\3\2\2\2\u0297]\3\2\2\2\u0298\u029a"+
		"\5\16\b\2\u0299\u0298\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2"+
		"\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u029f"+
		"\5N(\2\u029f\u02a0\5F$\2\u02a0_\3\2\2\2\u02a1\u02a3\5\16\b\2\u02a2\u02a1"+
		"\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a7\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\5N(\2\u02a8\u02a9\7n\2"+
		"\2\u02a9\u02aa\5F$\2\u02aaa\3\2\2\2\u02ab\u02ac\5\u0086D\2\u02acc\3\2"+
		"\2\2\u02ad\u02ae\5\u0086D\2\u02aee\3\2\2\2\u02af\u02b4\7l\2\2\u02b0\u02b1"+
		"\7I\2\2\u02b1\u02b3\7l\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4"+
		"\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5g\3\2\2\2\u02b6\u02b4\3\2\2\2"+
		"\u02b7\u02b8\t\6\2\2\u02b8i\3\2\2\2\u02b9\u02ba\7m\2\2\u02ba\u02c1\5l"+
		"\67\2\u02bb\u02be\7A\2\2\u02bc\u02bf\5n8\2\u02bd\u02bf\5r:\2\u02be\u02bc"+
		"\3\2\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"\u02c2\7B\2\2\u02c1\u02bb\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2k\3\2\2\2\u02c3"+
		"\u02c4\5f\64\2\u02c4m\3\2\2\2\u02c5\u02ca\5p9\2\u02c6\u02c7\7H\2\2\u02c7"+
		"\u02c9\5p9\2\u02c8\u02c6\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2"+
		"\2\u02ca\u02cb\3\2\2\2\u02cbo\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02ce"+
		"\7l\2\2\u02ce\u02cf\7J\2\2\u02cf\u02d0\5r:\2\u02d0q\3\2\2\2\u02d1\u02d5"+
		"\5\u00b4[\2\u02d2\u02d5\5j\66\2\u02d3\u02d5\5t;\2\u02d4\u02d1\3\2\2\2"+
		"\u02d4\u02d2\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5s\3\2\2\2\u02d6\u02df\7"+
		"C\2\2\u02d7\u02dc\5r:\2\u02d8\u02d9\7H\2\2\u02d9\u02db\5r:\2\u02da\u02d8"+
		"\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02d7\3\2\2\2\u02df\u02e0\3\2"+
		"\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02e3\7H\2\2\u02e2\u02e1\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\7D\2\2\u02e5u\3\2\2\2\u02e6"+
		"\u02e7\7m\2\2\u02e7\u02e8\7\36\2\2\u02e8\u02e9\7l\2\2\u02e9\u02ea\5x="+
		"\2\u02eaw\3\2\2\2\u02eb\u02ef\7C\2\2\u02ec\u02ee\5z>\2\u02ed\u02ec\3\2"+
		"\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u02f2\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\7D\2\2\u02f3y\3\2\2\2\u02f4"+
		"\u02f6\5\n\6\2\u02f5\u02f4\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2"+
		"\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa"+
		"\u02fd\5|?\2\u02fb\u02fd\7G\2\2\u02fc\u02f7\3\2\2\2\u02fc\u02fb\3\2\2"+
		"\2\u02fd{\3\2\2\2\u02fe\u02ff\5N(\2\u02ff\u0300\5~@\2\u0300\u0301\7G\2"+
		"\2\u0301\u0313\3\2\2\2\u0302\u0304\5\20\t\2\u0303\u0305\7G\2\2\u0304\u0303"+
		"\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0313\3\2\2\2\u0306\u0308\5 \21\2\u0307"+
		"\u0309\7G\2\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0313\3\2"+
		"\2\2\u030a\u030c\5\30\r\2\u030b\u030d\7G\2\2\u030c\u030b\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u0313\3\2\2\2\u030e\u0310\5v<\2\u030f\u0311\7G\2"+
		"\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u02fe"+
		"\3\2\2\2\u0312\u0302\3\2\2\2\u0312\u0306\3\2\2\2\u0312\u030a\3\2\2\2\u0312"+
		"\u030e\3\2\2\2\u0313}\3\2\2\2\u0314\u0317\5\u0080A\2\u0315\u0317\5\u0082"+
		"B\2\u0316\u0314\3\2\2\2\u0316\u0315\3\2\2\2\u0317\177\3\2\2\2\u0318\u0319"+
		"\7l\2\2\u0319\u031a\7A\2\2\u031a\u031c\7B\2\2\u031b\u031d\5\u0084C\2\u031c"+
		"\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0081\3\2\2\2\u031e\u031f\5B"+
		"\"\2\u031f\u0083\3\2\2\2\u0320\u0321\7\16\2\2\u0321\u0322\5r:\2\u0322"+
		"\u0085\3\2\2\2\u0323\u0327\7P\2\2\u0324\u0326\5\u0088E\2\u0325\u0324\3"+
		"\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u032a\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032b\7:\2\2\u032b\u0087\3\2"+
		"\2\2\u032c\u0330\5\u008aF\2\u032d\u0330\5\u008eH\2\u032e\u0330\5\b\5\2"+
		"\u032f\u032c\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u032e\3\2\2\2\u0330\u0089"+
		"\3\2\2\2\u0331\u0332\5\u008cG\2\u0332\u0333\7G\2\2\u0333\u008b\3\2\2\2"+
		"\u0334\u0336\5\16\b\2\u0335\u0334\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335"+
		"\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033a\3\2\2\2\u0339\u0337\3\2\2\2\u033a"+
		"\u033b\5N(\2\u033b\u033c\5B\"\2\u033c\u008d\3\2\2\2\u033d\u03ac\5\u0086"+
		"D\2\u033e\u033f\7\4\2\2\u033f\u0342\5\u00b4[\2\u0340\u0341\7P\2\2\u0341"+
		"\u0343\5\u00b4[\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344"+
		"\3\2\2\2\u0344\u0345\7G\2\2\u0345\u03ac\3\2\2\2\u0346\u0347\7\30\2\2\u0347"+
		"\u0348\5\u00acW\2\u0348\u034b\5\u008eH\2\u0349\u034a\7\21\2\2\u034a\u034c"+
		"\5\u008eH\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u03ac\3\2\2"+
		"\2\u034d\u034e\7\27\2\2\u034e\u034f\7A\2\2\u034f\u0350\5\u00a4S\2\u0350"+
		"\u0351\7B\2\2\u0351\u0352\5\u008eH\2\u0352\u03ac\3\2\2\2\u0353\u0354\7"+
		"\64\2\2\u0354\u0355\5\u00acW\2\u0355\u0356\5\u008eH\2\u0356\u03ac\3\2"+
		"\2\2\u0357\u0358\7\17\2\2\u0358\u0359\5\u008eH\2\u0359\u035a\7\64\2\2"+
		"\u035a\u035b\5\u00acW\2\u035b\u035c\7G\2\2\u035c\u03ac\3\2\2\2\u035d\u035e"+
		"\7\61\2\2\u035e\u0368\5\u0086D\2\u035f\u0361\5\u0094K\2\u0360\u035f\3"+
		"\2\2\2\u0361\u0362\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363"+
		"\u0365\3\2\2\2\u0364\u0366\5\u0098M\2\u0365\u0364\3\2\2\2\u0365\u0366"+
		"\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0369\5\u0098M\2\u0368\u0360\3\2\2"+
		"\2\u0368\u0367\3\2\2\2\u0369\u03ac\3\2\2\2\u036a\u036b\7\61\2\2\u036b"+
		"\u036c\5\u009aN\2\u036c\u0370\5\u0086D\2\u036d\u036f\5\u0094K\2\u036e"+
		"\u036d\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2"+
		"\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0375\5\u0098M\2\u0374"+
		"\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u03ac\3\2\2\2\u0376\u0377\7+"+
		"\2\2\u0377\u0378\5\u00acW\2\u0378\u037c\7C\2\2\u0379\u037b\5\u00a0Q\2"+
		"\u037a\u0379\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037d"+
		"\3\2\2\2\u037d\u0382\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0381\5\u00a2R"+
		"\2\u0380\u037f\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383"+
		"\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u0382\3\2\2\2\u0385\u0386\7D\2\2\u0386"+
		"\u03ac\3\2\2\2\u0387\u0388\7,\2\2\u0388\u0389\5\u00acW\2\u0389\u038a\5"+
		"\u0086D\2\u038a\u03ac\3\2\2\2\u038b\u038d\7&\2\2\u038c\u038e\5\u00b4["+
		"\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u03ac"+
		"\7G\2\2\u0390\u0391\7.\2\2\u0391\u0392\5\u00b4[\2\u0392\u0393\7G\2\2\u0393"+
		"\u03ac\3\2\2\2\u0394\u0396\7\6\2\2\u0395\u0397\7l\2\2\u0396\u0395\3\2"+
		"\2\2\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u03ac\7G\2\2\u0399"+
		"\u039b\7\r\2\2\u039a\u039c\7l\2\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2"+
		"\2\2\u039c\u039d\3\2\2\2\u039d\u03ac\7G\2\2\u039e\u03ac\7G\2\2\u039f\u03a0"+
		"\5\u00b0Y\2\u03a0\u03a1\7G\2\2\u03a1\u03ac\3\2\2\2\u03a2\u03a3\7l\2\2"+
		"\u03a3\u03a4\7P\2\2\u03a4\u03ac\5\u008eH\2\u03a5\u03a6\5\u0090I\2\u03a6"+
		"\u03a7\7G\2\2\u03a7\u03ac\3\2\2\2\u03a8\u03a9\5\u0092J\2\u03a9\u03aa\7"+
		"G\2\2\u03aa\u03ac\3\2\2\2\u03ab\u033d\3\2\2\2\u03ab\u033e\3\2\2\2\u03ab"+
		"\u0346\3\2\2\2\u03ab\u034d\3\2\2\2\u03ab\u0353\3\2\2\2\u03ab\u0357\3\2"+
		"\2\2\u03ab\u035d\3\2\2\2\u03ab\u036a\3\2\2\2\u03ab\u0376\3\2\2\2\u03ab"+
		"\u0387\3\2\2\2\u03ab\u038b\3\2\2\2\u03ab\u0390\3\2\2\2\u03ab\u0394\3\2"+
		"\2\2\u03ab\u0399\3\2\2\2\u03ab\u039e\3\2\2\2\u03ab\u039f\3\2\2\2\u03ab"+
		"\u03a2\3\2\2\2\u03ab\u03a5\3\2\2\2\u03ab\u03a8\3\2\2\2\u03ac\u008f\3\2"+
		"\2\2\u03ad\u03ae\7l\2\2\u03ae\u03af\7J\2\2\u03af\u03b0\7\65\2\2\u03b0"+
		"\u03b1\7A\2\2\u03b1\u03bd\7B\2\2\u03b2\u03b3\7l\2\2\u03b3\u03b4\7J\2\2"+
		"\u03b4\u03b5\7\66\2\2\u03b5\u03b6\7A\2\2\u03b6\u03bd\7B\2\2\u03b7\u03b8"+
		"\7l\2\2\u03b8\u03b9\7J\2\2\u03b9\u03ba\7\67\2\2\u03ba\u03bb\7A\2\2\u03bb"+
		"\u03bd\7B\2\2\u03bc\u03ad\3\2\2\2\u03bc\u03b2\3\2\2\2\u03bc\u03b7\3\2"+
		"\2\2\u03bd\u0091\3\2\2\2\u03be\u03bf\78\2\2\u03bf\u03c0\7A\2\2\u03c0\u03c5"+
		"\t\7\2\2\u03c1\u03c2\7Y\2\2\u03c2\u03c4\t\7\2\2\u03c3\u03c1\3\2\2\2\u03c4"+
		"\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8\3\2"+
		"\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03d5\7B\2\2\u03c9\u03ca\79\2\2\u03ca\u03cb"+
		"\7A\2\2\u03cb\u03d0\t\7\2\2\u03cc\u03cd\7Y\2\2\u03cd\u03cf\t\7\2\2\u03ce"+
		"\u03cc\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2"+
		"\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d5\7B\2\2\u03d4"+
		"\u03be\3\2\2\2\u03d4\u03c9\3\2\2\2\u03d5\u0093\3\2\2\2\u03d6\u03d7\7\t"+
		"\2\2\u03d7\u03db\7A\2\2\u03d8\u03da\5\16\b\2\u03d9\u03d8\3\2\2\2\u03da"+
		"\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03de\3\2"+
		"\2\2\u03dd\u03db\3\2\2\2\u03de\u03df\5\u0096L\2\u03df\u03e0\7l\2\2\u03e0"+
		"\u03e1\7B\2\2\u03e1\u03e2\5\u0086D\2\u03e2\u0095\3\2\2\2\u03e3\u03e8\5"+
		"f\64\2\u03e4\u03e5\7^\2\2\u03e5\u03e7\5f\64\2\u03e6\u03e4\3\2\2\2\u03e7"+
		"\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u0097\3\2"+
		"\2\2\u03ea\u03e8\3\2\2\2\u03eb\u03ec\7\25\2\2\u03ec\u03ed\5\u0086D\2\u03ed"+
		"\u0099\3\2\2\2\u03ee\u03ef\7A\2\2\u03ef\u03f1\5\u009cO\2\u03f0\u03f2\7"+
		"G\2\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"\u03f4\7B\2\2\u03f4\u009b\3\2\2\2\u03f5\u03fa\5\u009eP\2\u03f6\u03f7\7"+
		"G\2\2\u03f7\u03f9\5\u009eP\2\u03f8\u03f6\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa"+
		"\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u009d\3\2\2\2\u03fc\u03fa\3\2"+
		"\2\2\u03fd\u03ff\5\16\b\2\u03fe\u03fd\3\2\2\2\u03ff\u0402\3\2\2\2\u0400"+
		"\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0403\3\2\2\2\u0402\u0400\3\2"+
		"\2\2\u0403\u0404\5P)\2\u0404\u0405\5F$\2\u0405\u0406\7J\2\2\u0406\u0407"+
		"\5\u00b4[\2\u0407\u009f\3\2\2\2\u0408\u040a\5\u00a2R\2\u0409\u0408\3\2"+
		"\2\2\u040a\u040b\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c"+
		"\u040e\3\2\2\2\u040d\u040f\5\u0088E\2\u040e\u040d\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u00a1\3\2\2\2\u0412"+
		"\u0413\7\b\2\2\u0413\u0414\5\u00b2Z\2\u0414\u0415\7P\2\2\u0415\u041d\3"+
		"\2\2\2\u0416\u0417\7\b\2\2\u0417\u0418\5L\'\2\u0418\u0419\7P\2\2\u0419"+
		"\u041d\3\2\2\2\u041a\u041b\7\16\2\2\u041b\u041d\7P\2\2\u041c\u0412\3\2"+
		"\2\2\u041c\u0416\3\2\2\2\u041c\u041a\3\2\2\2\u041d\u00a3\3\2\2\2\u041e"+
		"\u042b\5\u00a8U\2\u041f\u0421\5\u00a6T\2\u0420\u041f\3\2\2\2\u0420\u0421"+
		"\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0424\7G\2\2\u0423\u0425\5\u00b4[\2"+
		"\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428"+
		"\7G\2\2\u0427\u0429\5\u00aaV\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2"+
		"\u0429\u042b\3\2\2\2\u042a\u041e\3\2\2\2\u042a\u0420\3\2\2\2\u042b\u00a5"+
		"\3\2\2\2\u042c\u042f\5\u008cG\2\u042d\u042f\5\u00aeX\2\u042e\u042c\3\2"+
		"\2\2\u042e\u042d\3\2\2\2\u042f\u00a7\3\2\2\2\u0430\u0432\5\16\b\2\u0431"+
		"\u0430\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2"+
		"\2\2\u0434\u0436\3\2\2\2\u0435\u0433\3\2\2\2\u0436\u0437\5N(\2\u0437\u0438"+
		"\5F$\2\u0438\u0439\7P\2\2\u0439\u043a\5\u00b4[\2\u043a\u00a9\3\2\2\2\u043b"+
		"\u043c\5\u00aeX\2\u043c\u00ab\3\2\2\2\u043d\u043e\7A\2\2\u043e\u043f\5"+
		"\u00b4[\2\u043f\u0440\7B\2\2\u0440\u00ad\3\2\2\2\u0441\u0446\5\u00b4["+
		"\2\u0442\u0443\7H\2\2\u0443\u0445\5\u00b4[\2\u0444\u0442\3\2\2\2\u0445"+
		"\u0448\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u00af\3\2"+
		"\2\2\u0448\u0446\3\2\2\2\u0449\u044a\5\u00b4[\2\u044a\u00b1\3\2\2\2\u044b"+
		"\u044c\5\u00b4[\2\u044c\u00b3\3\2\2\2\u044d\u044e\b[\1\2\u044e\u045b\5"+
		"\u00b6\\\2\u044f\u0450\7!\2\2\u0450\u045b\5\u00b8]\2\u0451\u0452\7A\2"+
		"\2\u0452\u0453\5N(\2\u0453\u0454\7B\2\2\u0454\u0455\5\u00b4[\23\u0455"+
		"\u045b\3\2\2\2\u0456\u0457\t\b\2\2\u0457\u045b\5\u00b4[\21\u0458\u0459"+
		"\t\t\2\2\u0459\u045b\5\u00b4[\20\u045a\u044d\3\2\2\2\u045a\u044f\3\2\2"+
		"\2\u045a\u0451\3\2\2\2\u045a\u0456\3\2\2\2\u045a\u0458\3\2\2\2\u045b\u04b1"+
		"\3\2\2\2\u045c\u045d\f\17\2\2\u045d\u045e\t\n\2\2\u045e\u04b0\5\u00b4"+
		"[\20\u045f\u0460\f\16\2\2\u0460\u0461\t\13\2\2\u0461\u04b0\5\u00b4[\17"+
		"\u0462\u046a\f\r\2\2\u0463\u0464\7L\2\2\u0464\u046b\7L\2\2\u0465\u0466"+
		"\7K\2\2\u0466\u0467\7K\2\2\u0467\u046b\7K\2\2\u0468\u0469\7K\2\2\u0469"+
		"\u046b\7K\2\2\u046a\u0463\3\2\2\2\u046a\u0465\3\2\2\2\u046a\u0468\3\2"+
		"\2\2\u046b\u046c\3\2\2\2\u046c\u04b0\5\u00b4[\16\u046d\u046e\f\f\2\2\u046e"+
		"\u046f\t\f\2\2\u046f\u04b0\5\u00b4[\r\u0470\u0471\f\n\2\2\u0471\u0472"+
		"\t\r\2\2\u0472\u04b0\5\u00b4[\13\u0473\u0474\f\t\2\2\u0474\u0475\7]\2"+
		"\2\u0475\u04b0\5\u00b4[\n\u0476\u0477\f\b\2\2\u0477\u0478\7_\2\2\u0478"+
		"\u04b0\5\u00b4[\t\u0479\u047a\f\7\2\2\u047a\u047b\7^\2\2\u047b\u04b0\5"+
		"\u00b4[\b\u047c\u047d\f\6\2\2\u047d\u047e\7U\2\2\u047e\u04b0\5\u00b4["+
		"\7\u047f\u0480\f\5\2\2\u0480\u0481\7V\2\2\u0481\u04b0\5\u00b4[\6\u0482"+
		"\u0483\f\4\2\2\u0483\u0484\7O\2\2\u0484\u0485\5\u00b4[\2\u0485\u0486\7"+
		"P\2\2\u0486\u0487\5\u00b4[\5\u0487\u04b0\3\2\2\2\u0488\u0489\f\3\2\2\u0489"+
		"\u048a\t\16\2\2\u048a\u04b0\5\u00b4[\3\u048b\u048c\f\33\2\2\u048c\u048d"+
		"\7I\2\2\u048d\u04b0\7l\2\2\u048e\u048f\f\32\2\2\u048f\u0490\7I\2\2\u0490"+
		"\u04b0\7-\2\2\u0491\u0492\f\31\2\2\u0492\u0493\7I\2\2\u0493\u0495\7!\2"+
		"\2\u0494\u0496\5\u00c4c\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496"+
		"\u0497\3\2\2\2\u0497\u04b0\5\u00bc_\2\u0498\u0499\f\30\2\2\u0499\u049a"+
		"\7I\2\2\u049a\u049b\7*\2\2\u049b\u04b0\5\u00caf\2\u049c\u049d\f\27\2\2"+
		"\u049d\u049e\7I\2\2\u049e\u04b0\5\u00c2b\2\u049f\u04a0\f\26\2\2\u04a0"+
		"\u04a1\7E\2\2\u04a1\u04a2\5\u00b4[\2\u04a2\u04a3\7F\2\2\u04a3\u04b0\3"+
		"\2\2\2\u04a4\u04a5\f\25\2\2\u04a5\u04a7\7A\2\2\u04a6\u04a8\5\u00aeX\2"+
		"\u04a7\u04a6\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04b0"+
		"\7B\2\2\u04aa\u04ab\f\22\2\2\u04ab\u04b0\t\17\2\2\u04ac\u04ad\f\13\2\2"+
		"\u04ad\u04ae\7\34\2\2\u04ae\u04b0\5N(\2\u04af\u045c\3\2\2\2\u04af\u045f"+
		"\3\2\2\2\u04af\u0462\3\2\2\2\u04af\u046d\3\2\2\2\u04af\u0470\3\2\2\2\u04af"+
		"\u0473\3\2\2\2\u04af\u0476\3\2\2\2\u04af\u0479\3\2\2\2\u04af\u047c\3\2"+
		"\2\2\u04af\u047f\3\2\2\2\u04af\u0482\3\2\2\2\u04af\u0488\3\2\2\2\u04af"+
		"\u048b\3\2\2\2\u04af\u048e\3\2\2\2\u04af\u0491\3\2\2\2\u04af\u0498\3\2"+
		"\2\2\u04af\u049c\3\2\2\2\u04af\u049f\3\2\2\2\u04af\u04a4\3\2\2\2\u04af"+
		"\u04aa\3\2\2\2\u04af\u04ac\3\2\2\2\u04b0\u04b3\3\2\2\2\u04b1\u04af\3\2"+
		"\2\2\u04b1\u04b2\3\2\2\2\u04b2\u00b5\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b4"+
		"\u04b5\7A\2\2\u04b5\u04b6\5\u00b4[\2\u04b6\u04b7\7B\2\2\u04b7\u04ca\3"+
		"\2\2\2\u04b8\u04ca\7-\2\2\u04b9\u04ca\7*\2\2\u04ba\u04ca\5h\65\2\u04bb"+
		"\u04ca\7l\2\2\u04bc\u04bd\5N(\2\u04bd\u04be\7I\2\2\u04be\u04bf\7\13\2"+
		"\2\u04bf\u04ca\3\2\2\2\u04c0\u04c1\7\62\2\2\u04c1\u04c2\7I\2\2\u04c2\u04ca"+
		"\7\13\2\2\u04c3\u04c7\5\u00c4c\2\u04c4\u04c8\5\u00ccg\2\u04c5\u04c6\7"+
		"-\2\2\u04c6\u04c8\5\u00ceh\2\u04c7\u04c4\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8"+
		"\u04ca\3\2\2\2\u04c9\u04b4\3\2\2\2\u04c9\u04b8\3\2\2\2\u04c9\u04b9\3\2"+
		"\2\2\u04c9\u04ba\3\2\2\2\u04c9\u04bb\3\2\2\2\u04c9\u04bc\3\2\2\2\u04c9"+
		"\u04c0\3\2\2\2\u04c9\u04c3\3\2\2\2\u04ca\u00b7\3\2\2\2\u04cb\u04cc\5\u00c4"+
		"c\2\u04cc\u04cd\5\u00ba^\2\u04cd\u04ce\5\u00c0a\2\u04ce\u04d5\3\2\2\2"+
		"\u04cf\u04d2\5\u00ba^\2\u04d0\u04d3\5\u00be`\2\u04d1\u04d3\5\u00c0a\2"+
		"\u04d2\u04d0\3\2\2\2\u04d2\u04d1\3\2\2\2\u04d3\u04d5\3\2\2\2\u04d4\u04cb"+
		"\3\2\2\2\u04d4\u04cf\3\2\2\2\u04d5\u00b9\3\2\2\2\u04d6\u04d8\7l\2\2\u04d7"+
		"\u04d9\5\u00c6d\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04e1"+
		"\3\2\2\2\u04da\u04db\7I\2\2\u04db\u04dd\7l\2\2\u04dc\u04de\5\u00c6d\2"+
		"\u04dd\u04dc\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\3\2\2\2\u04df\u04da"+
		"\3\2\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
		"\u04e6\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04e6\5R*\2\u04e5\u04d6\3\2\2"+
		"\2\u04e5\u04e4\3\2\2\2\u04e6\u00bb\3\2\2\2\u04e7\u04e9\7l\2\2\u04e8\u04ea"+
		"\5\u00c8e\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3\2\2"+
		"\2\u04eb\u04ec\5\u00c0a\2\u04ec\u00bd\3\2\2\2\u04ed\u0509\7E\2\2\u04ee"+
		"\u04f3\7F\2\2\u04ef\u04f0\7E\2\2\u04f0\u04f2\7F\2\2\u04f1\u04ef\3\2\2"+
		"\2\u04f2\u04f5\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f6"+
		"\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f6\u050a\5J&\2\u04f7\u04f8\5\u00b4[\2"+
		"\u04f8\u04ff\7F\2\2\u04f9\u04fa\7E\2\2\u04fa\u04fb\5\u00b4[\2\u04fb\u04fc"+
		"\7F\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04f9\3\2\2\2\u04fe\u0501\3\2\2\2\u04ff"+
		"\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0506\3\2\2\2\u0501\u04ff\3\2"+
		"\2\2\u0502\u0503\7E\2\2\u0503\u0505\7F\2\2\u0504\u0502\3\2\2\2\u0505\u0508"+
		"\3\2\2\2\u0506\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u050a\3\2\2\2\u0508"+
		"\u0506\3\2\2\2\u0509\u04ee\3\2\2\2\u0509\u04f7\3\2\2\2\u050a\u00bf\3\2"+
		"\2\2\u050b\u050d\5\u00ceh\2\u050c\u050e\5$\23\2\u050d\u050c\3\2\2\2\u050d"+
		"\u050e\3\2\2\2\u050e\u00c1\3\2\2\2\u050f\u0510\5\u00c4c\2\u0510\u0511"+
		"\5\u00ccg\2\u0511\u00c3\3\2\2\2\u0512\u0513\7L\2\2\u0513\u0514\5\"\22"+
		"\2\u0514\u0515\7K\2\2\u0515\u00c5\3\2\2\2\u0516\u0517\7L\2\2\u0517\u051a"+
		"\7K\2\2\u0518\u051a\5T+\2\u0519\u0516\3\2\2\2\u0519\u0518\3\2\2\2\u051a"+
		"\u00c7\3\2\2\2\u051b\u051c\7L\2\2\u051c\u051f\7K\2\2\u051d\u051f\5\u00c4"+
		"c\2\u051e\u051b\3\2\2\2\u051e\u051d\3\2\2\2\u051f\u00c9\3\2\2\2\u0520"+
		"\u0527\5\u00ceh\2\u0521\u0522\7I\2\2\u0522\u0524\7l\2\2\u0523\u0525\5"+
		"\u00ceh\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0527\3\2\2\2"+
		"\u0526\u0520\3\2\2\2\u0526\u0521\3\2\2\2\u0527\u00cb\3\2\2\2\u0528\u0529"+
		"\7*\2\2\u0529\u052d\5\u00caf\2\u052a\u052b\7l\2\2\u052b\u052d\5\u00ce"+
		"h\2\u052c\u0528\3\2\2\2\u052c\u052a\3\2\2\2\u052d\u00cd\3\2\2\2\u052e"+
		"\u0530\7A\2\2\u052f\u0531\5\u00aeX\2\u0530\u052f\3\2\2\2\u0530\u0531\3"+
		"\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\7B\2\2\u0533\u00cf\3\2\2\2\u009b"+
		"\u00d3\u00d9\u00df\u00e5\u00ee\u00f3\u00fa\u0101\u0108\u010f\u0114\u0118"+
		"\u011c\u0120\u0125\u0129\u012d\u0137\u013f\u0146\u014d\u0151\u0154\u0157"+
		"\u0160\u0166\u016b\u016e\u0174\u017a\u017e\u0187\u018e\u0197\u019e\u01a4"+
		"\u01a8\u01b3\u01b7\u01bf\u01c4\u01c8\u01d1\u01df\u01e4\u01ed\u01f5\u01ff"+
		"\u0207\u020f\u0214\u0220\u0226\u022d\u0232\u023a\u023e\u0240\u024b\u0253"+
		"\u0256\u025a\u025f\u0263\u026e\u0277\u0279\u0280\u0285\u028e\u0293\u0296"+
		"\u029b\u02a4\u02b4\u02be\u02c1\u02ca\u02d4\u02dc\u02df\u02e2\u02ef\u02f7"+
		"\u02fc\u0304\u0308\u030c\u0310\u0312\u0316\u031c\u0327\u032f\u0337\u0342"+
		"\u034b\u0362\u0365\u0368\u0370\u0374\u037c\u0382\u038d\u0396\u039b\u03ab"+
		"\u03bc\u03c5\u03d0\u03d4\u03db\u03e8\u03f1\u03fa\u0400\u040b\u0410\u041c"+
		"\u0420\u0424\u0428\u042a\u042e\u0433\u0446\u045a\u046a\u0495\u04a7\u04af"+
		"\u04b1\u04c7\u04c9\u04d2\u04d4\u04d8\u04dd\u04e1\u04e5\u04e9\u04f3\u04ff"+
		"\u0506\u0509\u050d\u0519\u051e\u0524\u0526\u052c\u0530";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}