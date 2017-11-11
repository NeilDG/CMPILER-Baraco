// Generated from Baraco.g4 by ANTLR 4.7
package baraco.antlr.parser;
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
		ABSTRACT=1, ARRAY=2, ASSERT=3, BOOL=4, BREAK=5, BYTE=6, CASE=7, CATCH=8, 
		CHAR=9, CLASS=10, CONST=11, CONTINUE=12, DECIMAL=13, DEFAULT=14, DO=15, 
		DOUBLE=16, ELSE=17, ENUM=18, EXTENDS=19, FINAL=20, FINALLY=21, FOR=22, 
		IF=23, GOTO=24, IMPLEMENTS=25, IMPORT=26, INSTANCEOF=27, INT=28, INTERFACE=29, 
		LONG=30, MAIN=31, NATIVE=32, NEW=33, PACKAGE=34, PRIVATE=35, PROTECTED=36, 
		PUBLIC=37, RETURN=38, SHORT=39, STATIC=40, STRICTFP=41, STRING=42, SUPER=43, 
		SWITCH=44, SYNCHRONIZED=45, THIS=46, THROW=47, THROWS=48, TRANSIENT=49, 
		TRY=50, VOID=51, VOLATILE=52, WHILE=53, SCANINT=54, SCANDEC=55, SCANSTR=56, 
		PRINT=57, PRINTLN=58, END=59, IntegerLiteral=60, FloatingPointLiteral=61, 
		BooleanLiteral=62, CharacterLiteral=63, StringLiteral=64, NullLiteral=65, 
		LPAREN=66, RPAREN=67, LBRACE=68, RBRACE=69, LBRACK=70, RBRACK=71, SEMI=72, 
		COMMA=73, DOT=74, ASSIGN=75, GT=76, LT=77, BANG=78, TILDE=79, QUESTION=80, 
		COLON=81, EQUAL=82, LE=83, GE=84, NOTEQUAL=85, AND=86, OR=87, INC=88, 
		DEC=89, ADD=90, SUB=91, MUL=92, DIV=93, BITAND=94, BITOR=95, CARET=96, 
		MOD=97, ADD_ASSIGN=98, SUB_ASSIGN=99, MUL_ASSIGN=100, DIV_ASSIGN=101, 
		AND_ASSIGN=102, OR_ASSIGN=103, XOR_ASSIGN=104, MOD_ASSIGN=105, LSHIFT_ASSIGN=106, 
		RSHIFT_ASSIGN=107, URSHIFT_ASSIGN=108, Identifier=109, AT=110, ELLIPSIS=111, 
		WS=112, COMMENT=113, LINE_COMMENT=114;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_typeList = 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_mainDeclaration = 21, RULE_methodDeclaration = 22, RULE_genericMethodDeclaration = 23, 
		RULE_constructorDeclaration = 24, RULE_genericConstructorDeclaration = 25, 
		RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28, 
		RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceMethodDeclaration = 31, 
		RULE_genericInterfaceMethodDeclaration = 32, RULE_variableDeclarators = 33, 
		RULE_variableDeclarator = 34, RULE_variableDeclaratorId = 35, RULE_variableInitializer = 36, 
		RULE_arrayInitializer = 37, RULE_enumConstantName = 38, RULE_typeType = 39, 
		RULE_classOrInterfaceType = 40, RULE_primitiveType = 41, RULE_typeArguments = 42, 
		RULE_typeArgument = 43, RULE_qualifiedNameList = 44, RULE_formalParameters = 45, 
		RULE_formalParameterList = 46, RULE_formalParameter = 47, RULE_lastFormalParameter = 48, 
		RULE_methodBody = 49, RULE_constructorBody = 50, RULE_qualifiedName = 51, 
		RULE_literal = 52, RULE_annotation = 53, RULE_annotationName = 54, RULE_elementValuePairs = 55, 
		RULE_elementValuePair = 56, RULE_elementValue = 57, RULE_elementValueArrayInitializer = 58, 
		RULE_annotationTypeDeclaration = 59, RULE_annotationTypeBody = 60, RULE_annotationTypeElementDeclaration = 61, 
		RULE_annotationTypeElementRest = 62, RULE_annotationMethodOrConstantRest = 63, 
		RULE_annotationMethodRest = 64, RULE_annotationConstantRest = 65, RULE_defaultValue = 66, 
		RULE_block = 67, RULE_blockStatement = 68, RULE_localVariableDeclarationStatement = 69, 
		RULE_localVariableDeclaration = 70, RULE_statement = 71, RULE_scanStatement = 72, 
		RULE_printStatement = 73, RULE_catchClause = 74, RULE_catchType = 75, 
		RULE_finallyBlock = 76, RULE_resourceSpecification = 77, RULE_resources = 78, 
		RULE_resource = 79, RULE_switchBlockStatementGroup = 80, RULE_switchLabel = 81, 
		RULE_forControl = 82, RULE_forInit = 83, RULE_enhancedForControl = 84, 
		RULE_forUpdate = 85, RULE_parExpression = 86, RULE_expressionList = 87, 
		RULE_statementExpression = 88, RULE_constantExpression = 89, RULE_expression = 90, 
		RULE_primary = 91, RULE_creator = 92, RULE_createdName = 93, RULE_innerCreator = 94, 
		RULE_arrayCreatorRest = 95, RULE_classCreatorRest = 96, RULE_explicitGenericInvocation = 97, 
		RULE_nonWildcardTypeArguments = 98, RULE_typeArgumentsOrDiamond = 99, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 100, RULE_superSuffix = 101, 
		RULE_explicitGenericInvocationSuffix = 102, RULE_arguments = 103;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"mainDeclaration", "methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
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
		null, "'abstract'", "'array'", "'assert'", "'bool'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'decimal'", 
		"'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", 
		"'finally'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'main'", "'native'", "'new'", "'package'", 
		"'private'", "'protected'", "'public'", "'return'", "'short'", "'static'", 
		"'strictfp'", "'string'", "'super'", "'switch'", "'synchronized'", "'this'", 
		"'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
		"'while'", "'scanInt'", "'scanDecimal'", "'scanString'", "'print'", "'println'", 
		"'end'", null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'and'", "'or'", 
		"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
		"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
		"'>>='", "'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ARRAY", "ASSERT", "BOOL", "BREAK", "BYTE", "CASE", 
		"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DECIMAL", "DEFAULT", "DO", 
		"DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FOR", "IF", 
		"GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", 
		"MAIN", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
		"RETURN", "SHORT", "STATIC", "STRICTFP", "STRING", "SUPER", "SWITCH", 
		"SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", 
		"VOLATILE", "WHILE", "SCANINT", "SCANDEC", "SCANSTR", "PRINT", "PRINTLN", 
		"END", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
		"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					constDeclaration();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					methodDeclaration();
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (COLON - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(220);
				statement();
				}
				}
				setState(225);
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
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(226);
				annotation();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(PACKAGE);
			setState(233);
			qualifiedName();
			setState(234);
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
			setState(236);
			match(IMPORT);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(237);
				match(STATIC);
				}
			}

			setState(240);
			qualifiedName();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(241);
				match(DOT);
				setState(242);
				match(MUL);
				}
			}

			setState(245);
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
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(247);
					classOrInterfaceModifier();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(254);
					classOrInterfaceModifier();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(261);
					classOrInterfaceModifier();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(268);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(274);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
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
			setState(280);
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
				setState(278);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
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
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
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
				setState(283);
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
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
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
			setState(290);
			match(CLASS);
			setState(291);
			match(Identifier);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(292);
				typeParameters();
				}
			}

			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(295);
				match(EXTENDS);
				setState(296);
				typeType();
				}
			}

			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(299);
				match(IMPLEMENTS);
				setState(300);
				typeList();
				}
			}

			setState(303);
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
			setState(305);
			match(LT);
			setState(306);
			typeParameter();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(307);
				match(COMMA);
				setState(308);
				typeParameter();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
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
			setState(316);
			match(Identifier);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(317);
				match(EXTENDS);
				setState(318);
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
			setState(321);
			typeType();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(322);
				match(BITAND);
				setState(323);
				typeType();
				}
				}
				setState(328);
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
			setState(329);
			match(ENUM);
			setState(330);
			match(Identifier);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(331);
				match(IMPLEMENTS);
				setState(332);
				typeList();
				}
			}

			setState(335);
			match(LBRACE);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(336);
				enumConstants();
				}
			}

			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(339);
				match(COMMA);
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(342);
				enumBodyDeclarations();
				}
			}

			setState(345);
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
			setState(347);
			enumConstant();
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					match(COMMA);
					setState(349);
					enumConstant();
					}
					} 
				}
				setState(354);
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
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(355);
				annotation();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(Identifier);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(362);
				arguments();
				}
			}

			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(365);
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
			setState(368);
			match(SEMI);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << CLASS) | (1L << DECIMAL) | (1L << ENUM) | (1L << FINAL) | (1L << INT) | (1L << INTERFACE) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (COLON - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(369);
				classBodyDeclaration();
				}
				}
				setState(374);
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
			setState(375);
			match(INTERFACE);
			setState(376);
			match(Identifier);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(377);
				typeParameters();
				}
			}

			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(380);
				match(EXTENDS);
				setState(381);
				typeList();
				}
			}

			setState(384);
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
			setState(386);
			typeType();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(387);
				match(COMMA);
				setState(388);
				typeType();
				}
				}
				setState(393);
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
			setState(394);
			match(COLON);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << CLASS) | (1L << DECIMAL) | (1L << ENUM) | (1L << FINAL) | (1L << INT) | (1L << INTERFACE) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (COLON - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(395);
				classBodyDeclaration();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
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
			setState(403);
			match(COLON);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << CLASS) | (1L << DECIMAL) | (1L << ENUM) | (1L << FINAL) | (1L << INT) | (1L << INTERFACE) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(404);
				interfaceBodyDeclaration();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
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
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(413);
					match(STATIC);
					}
				}

				setState(416);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(417);
						modifier();
						}
						} 
					}
					setState(422);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(423);
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
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(430);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(431);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(432);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(433);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(434);
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

	public static class MainDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaracoListener ) ((BaracoListener)listener).exitMainDeclaration(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mainDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(VOID);
			setState(438);
			match(MAIN);
			setState(439);
			match(LPAREN);
			setState(440);
			match(RPAREN);
			setState(441);
			methodBody();
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
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
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
		enterRule(_localctx, 44, RULE_methodDeclaration);
		int _la;
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(445);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ARRAY:
				case BOOL:
				case CHAR:
				case DECIMAL:
				case INT:
				case STRING:
				case Identifier:
					{
					setState(443);
					typeType();
					}
					break;
				case VOID:
					{
					setState(444);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(447);
				match(Identifier);
				setState(448);
				formalParameters();
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(449);
					match(LBRACK);
					setState(450);
					match(RBRACK);
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(456);
					match(THROWS);
					setState(457);
					qualifiedNameList();
					}
				}

				setState(462);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON:
					{
					setState(460);
					methodBody();
					}
					break;
				case SEMI:
					{
					setState(461);
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				mainDeclaration();
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
		enterRule(_localctx, 46, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			typeParameters();
			setState(468);
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
		enterRule(_localctx, 48, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(Identifier);
			setState(471);
			formalParameters();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(472);
				match(THROWS);
				setState(473);
				qualifiedNameList();
				}
			}

			setState(476);
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
		enterRule(_localctx, 50, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			typeParameters();
			setState(479);
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
		enterRule(_localctx, 52, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			typeType();
			setState(482);
			variableDeclarators();
			setState(483);
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
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case ARRAY:
			case BOOL:
			case CHAR:
			case CLASS:
			case DECIMAL:
			case ENUM:
			case FINAL:
			case INT:
			case INTERFACE:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case STRING:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(485);
						modifier();
						}
						} 
					}
					setState(490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(491);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
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
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(499);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(500);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(501);
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
		enterRule(_localctx, 58, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			typeType();
			setState(505);
			constantDeclarator();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(506);
				match(COMMA);
				setState(507);
				constantDeclarator();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
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
		enterRule(_localctx, 60, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(Identifier);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(516);
				match(LBRACK);
				setState(517);
				match(RBRACK);
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
			match(ASSIGN);
			setState(524);
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
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
			case Identifier:
				{
				setState(526);
				typeType();
				}
				break;
			case VOID:
				{
				setState(527);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(530);
			match(Identifier);
			setState(531);
			formalParameters();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(532);
				match(LBRACK);
				setState(533);
				match(RBRACK);
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(539);
				match(THROWS);
				setState(540);
				qualifiedNameList();
				}
			}

			setState(543);
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
		enterRule(_localctx, 64, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			typeParameters();
			setState(546);
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
		enterRule(_localctx, 66, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			variableDeclarator();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(549);
				match(COMMA);
				setState(550);
				variableDeclarator();
				}
				}
				setState(555);
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
		enterRule(_localctx, 68, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			variableDeclaratorId();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(557);
				match(ASSIGN);
				setState(558);
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
		enterRule(_localctx, 70, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(Identifier);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(562);
				match(LBRACK);
				setState(563);
				match(RBRACK);
				}
				}
				setState(568);
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
		enterRule(_localctx, 72, RULE_variableInitializer);
		try {
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				arrayInitializer();
				}
				break;
			case NEW:
			case SUPER:
			case THIS:
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
				setState(570);
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
		enterRule(_localctx, 74, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(LBRACE);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(574);
				variableInitializer();
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(575);
						match(COMMA);
						setState(576);
						variableInitializer();
						}
						} 
					}
					setState(581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(582);
					match(COMMA);
					}
				}

				}
			}

			setState(587);
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
		enterRule(_localctx, 76, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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
		enterRule(_localctx, 78, RULE_typeType);
		try {
			int _alt;
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				classOrInterfaceType();
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(592);
						match(LBRACK);
						setState(593);
						match(RBRACK);
						}
						} 
					}
					setState(598);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				primitiveType();
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(600);
						match(LBRACK);
						setState(601);
						match(RBRACK);
						}
						} 
					}
					setState(606);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
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
		enterRule(_localctx, 80, RULE_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(Identifier);
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(610);
				typeArguments();
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
		enterRule(_localctx, 82, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << DECIMAL) | (1L << INT) | (1L << STRING))) != 0)) ) {
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
		enterRule(_localctx, 84, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(LT);
			setState(616);
			typeArgument();
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(617);
				match(COMMA);
				setState(618);
				typeArgument();
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(624);
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
		enterRule(_localctx, 86, RULE_typeArgument);
		int _la;
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				match(QUESTION);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(628);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(629);
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
		enterRule(_localctx, 88, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			qualifiedName();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(635);
				match(COMMA);
				setState(636);
				qualifiedName();
				}
				}
				setState(641);
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
		enterRule(_localctx, 90, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(LPAREN);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << DECIMAL) | (1L << FINAL) | (1L << INT) | (1L << STRING))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(643);
				formalParameterList();
				}
			}

			setState(646);
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
		enterRule(_localctx, 92, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				formalParameter();
				setState(653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(649);
						match(COMMA);
						setState(650);
						formalParameter();
						}
						} 
					}
					setState(655);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(656);
					match(COMMA);
					setState(657);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
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
		enterRule(_localctx, 94, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(663);
				variableModifier();
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(669);
			typeType();
			setState(670);
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
		enterRule(_localctx, 96, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(672);
				variableModifier();
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
			typeType();
			setState(679);
			match(ELLIPSIS);
			setState(680);
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
		enterRule(_localctx, 98, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
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
		enterRule(_localctx, 100, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
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
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
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
		enterRule(_localctx, 102, RULE_qualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
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
		enterRule(_localctx, 104, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (IntegerLiteral - 60)) | (1L << (FloatingPointLiteral - 60)) | (1L << (BooleanLiteral - 60)) | (1L << (CharacterLiteral - 60)) | (1L << (StringLiteral - 60)) | (1L << (NullLiteral - 60)))) != 0)) ) {
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
		enterRule(_localctx, 106, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(AT);
			setState(691);
			annotationName();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(692);
				match(LPAREN);
				setState(695);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(693);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(694);
					elementValue();
					}
					break;
				}
				setState(697);
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
		enterRule(_localctx, 108, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
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
		enterRule(_localctx, 110, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			elementValuePair();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(703);
				match(COMMA);
				setState(704);
				elementValuePair();
				}
				}
				setState(709);
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
		enterRule(_localctx, 112, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(Identifier);
			setState(711);
			match(ASSIGN);
			setState(712);
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
		enterRule(_localctx, 114, RULE_elementValue);
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
			case SUPER:
			case THIS:
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
				setState(714);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(716);
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
		enterRule(_localctx, 116, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(LBRACE);
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(720);
				elementValue();
				setState(725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(721);
						match(COMMA);
						setState(722);
						elementValue();
						}
						} 
					}
					setState(727);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				}
			}

			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(730);
				match(COMMA);
				}
			}

			setState(733);
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
		enterRule(_localctx, 118, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(AT);
			setState(736);
			match(INTERFACE);
			setState(737);
			match(Identifier);
			setState(738);
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
		enterRule(_localctx, 120, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(LBRACE);
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << CLASS) | (1L << DECIMAL) | (1L << ENUM) | (1L << FINAL) | (1L << INT) | (1L << INTERFACE) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(741);
				annotationTypeElementDeclaration();
				}
				}
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(747);
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
		enterRule(_localctx, 122, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case ARRAY:
			case BOOL:
			case CHAR:
			case CLASS:
			case DECIMAL:
			case ENUM:
			case FINAL:
			case INT:
			case INTERFACE:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case STRING:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(749);
						modifier();
						}
						} 
					}
					setState(754);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				setState(755);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
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
		enterRule(_localctx, 124, RULE_annotationTypeElementRest);
		try {
			setState(779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				typeType();
				setState(760);
				annotationMethodOrConstantRest();
				setState(761);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				classDeclaration();
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(764);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(767);
				interfaceDeclaration();
				setState(769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(768);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(771);
				enumDeclaration();
				setState(773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(772);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(775);
				annotationTypeDeclaration();
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(776);
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
		enterRule(_localctx, 126, RULE_annotationMethodOrConstantRest);
		try {
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
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
		enterRule(_localctx, 128, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(Identifier);
			setState(786);
			match(LPAREN);
			setState(787);
			match(RPAREN);
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(788);
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
		enterRule(_localctx, 130, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
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
		enterRule(_localctx, 132, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(DEFAULT);
			setState(794);
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
		enterRule(_localctx, 134, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(COLON);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ARRAY) | (1L << ASSERT) | (1L << BOOL) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DO) | (1L << ENUM) | (1L << FINAL) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (COLON - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(797);
				blockStatement();
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(803);
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
		enterRule(_localctx, 136, RULE_blockStatement);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(807);
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
		enterRule(_localctx, 138, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			localVariableDeclaration();
			setState(811);
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
		enterRule(_localctx, 140, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(813);
				variableModifier();
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(819);
			typeType();
			setState(820);
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
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(ASSERT);
				setState(824);
				expression(0);
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(825);
					match(COLON);
					setState(826);
					expression(0);
					}
				}

				setState(829);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(831);
				match(IF);
				setState(832);
				parExpression();
				setState(833);
				statement();
				setState(836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(834);
					match(ELSE);
					setState(835);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(838);
				match(FOR);
				setState(839);
				match(LPAREN);
				setState(840);
				forControl();
				setState(841);
				match(RPAREN);
				setState(842);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(844);
				match(WHILE);
				setState(845);
				parExpression();
				setState(846);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(848);
				match(DO);
				setState(849);
				statement();
				setState(850);
				match(WHILE);
				setState(851);
				parExpression();
				setState(852);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(854);
				match(TRY);
				setState(855);
				block();
				setState(865);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(857); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(856);
						catchClause();
						}
						}
						setState(859); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(862);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(861);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(864);
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
				setState(867);
				match(TRY);
				setState(868);
				resourceSpecification();
				setState(869);
				block();
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(870);
					catchClause();
					}
					}
					setState(875);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(876);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(879);
				match(SWITCH);
				setState(880);
				parExpression();
				setState(881);
				match(LBRACE);
				setState(885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(882);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(887);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(888);
					switchLabel();
					}
					}
					setState(893);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(894);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(896);
				match(SYNCHRONIZED);
				setState(897);
				parExpression();
				setState(898);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(900);
				match(RETURN);
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(901);
					expression(0);
					}
				}

				setState(904);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(905);
				match(THROW);
				setState(906);
				expression(0);
				setState(907);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(909);
				match(BREAK);
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(910);
					match(Identifier);
					}
				}

				setState(913);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(914);
				match(CONTINUE);
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(919);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(920);
				statementExpression();
				setState(921);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(923);
				match(Identifier);
				setState(924);
				match(COLON);
				setState(925);
				statement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(926);
				scanStatement();
				setState(927);
				match(SEMI);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(929);
				printStatement();
				setState(930);
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
		enterRule(_localctx, 144, RULE_scanStatement);
		try {
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				match(Identifier);
				setState(935);
				match(ASSIGN);
				setState(936);
				match(SCANINT);
				setState(937);
				match(LPAREN);
				setState(938);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				match(Identifier);
				setState(940);
				match(ASSIGN);
				setState(941);
				match(SCANDEC);
				setState(942);
				match(LPAREN);
				setState(943);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(944);
				match(Identifier);
				setState(945);
				match(ASSIGN);
				setState(946);
				match(SCANSTR);
				setState(947);
				match(LPAREN);
				setState(948);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 146, RULE_printStatement);
		try {
			setState(961);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				match(PRINT);
				setState(952);
				match(LPAREN);
				setState(953);
				expression(0);
				setState(954);
				match(RPAREN);
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(PRINTLN);
				setState(957);
				match(LPAREN);
				setState(958);
				expression(0);
				setState(959);
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
		enterRule(_localctx, 148, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(CATCH);
			setState(964);
			match(LPAREN);
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(965);
				variableModifier();
				}
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(971);
			catchType();
			setState(972);
			match(Identifier);
			setState(973);
			match(RPAREN);
			setState(974);
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
		enterRule(_localctx, 150, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			qualifiedName();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(977);
				match(BITOR);
				setState(978);
				qualifiedName();
				}
				}
				setState(983);
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
		enterRule(_localctx, 152, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			match(FINALLY);
			setState(985);
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
		enterRule(_localctx, 154, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(LPAREN);
			setState(988);
			resources();
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(989);
				match(SEMI);
				}
			}

			setState(992);
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
		enterRule(_localctx, 156, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			resource();
			setState(999);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(995);
					match(SEMI);
					setState(996);
					resource();
					}
					} 
				}
				setState(1001);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
		enterRule(_localctx, 158, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1002);
				variableModifier();
				}
				}
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1008);
			classOrInterfaceType();
			setState(1009);
			variableDeclaratorId();
			setState(1010);
			match(ASSIGN);
			setState(1011);
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
		enterRule(_localctx, 160, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1013);
				switchLabel();
				}
				}
				setState(1016); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1019); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1018);
				blockStatement();
				}
				}
				setState(1021); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ARRAY) | (1L << ASSERT) | (1L << BOOL) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DO) | (1L << ENUM) | (1L << FINAL) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (COLON - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0) );
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
		enterRule(_localctx, 162, RULE_switchLabel);
		try {
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				match(CASE);
				setState(1024);
				constantExpression();
				setState(1025);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
				match(CASE);
				setState(1028);
				enumConstantName();
				setState(1029);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				match(DEFAULT);
				setState(1032);
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
		enterRule(_localctx, 164, RULE_forControl);
		int _la;
		try {
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1035);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << DECIMAL) | (1L << FINAL) | (1L << INT) | (1L << NEW) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1036);
					forInit();
					}
				}

				setState(1039);
				match(SEMI);
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1040);
					expression(0);
					}
				}

				setState(1043);
				match(SEMI);
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1044);
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
		enterRule(_localctx, 166, RULE_forInit);
		try {
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050);
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
		enterRule(_localctx, 168, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1053);
				variableModifier();
				}
				}
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1059);
			typeType();
			setState(1060);
			variableDeclaratorId();
			setState(1061);
			match(COLON);
			setState(1062);
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
		enterRule(_localctx, 170, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
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
		enterRule(_localctx, 172, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(LPAREN);
			setState(1067);
			expression(0);
			setState(1068);
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
		enterRule(_localctx, 174, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			expression(0);
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1071);
				match(COMMA);
				setState(1072);
				expression(0);
				}
				}
				setState(1077);
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
		enterRule(_localctx, 176, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
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
		enterRule(_localctx, 178, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
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
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1083);
				primary();
				}
				break;
			case 2:
				{
				setState(1084);
				match(NEW);
				setState(1085);
				creator();
				}
				break;
			case 3:
				{
				setState(1086);
				match(LPAREN);
				setState(1087);
				typeType();
				setState(1088);
				match(RPAREN);
				setState(1089);
				expression(17);
				}
				break;
			case 4:
				{
				setState(1091);
				_la = _input.LA(1);
				if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (INC - 88)) | (1L << (DEC - 88)) | (1L << (ADD - 88)) | (1L << (SUB - 88)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1092);
				expression(15);
				}
				break;
			case 5:
				{
				setState(1093);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1094);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1097);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1098);
						_la = _input.LA(1);
						if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (MUL - 92)) | (1L << (DIV - 92)) | (1L << (MOD - 92)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1099);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1100);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1101);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1102);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1103);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1111);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
						case 1:
							{
							setState(1104);
							match(LT);
							setState(1105);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1106);
							match(GT);
							setState(1107);
							match(GT);
							setState(1108);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1109);
							match(GT);
							setState(1110);
							match(GT);
							}
							break;
						}
						setState(1113);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1114);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1115);
						_la = _input.LA(1);
						if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (GT - 76)) | (1L << (LT - 76)) | (1L << (LE - 76)) | (1L << (GE - 76)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1116);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1117);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1118);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1119);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1120);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1121);
						match(BITAND);
						setState(1122);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1123);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1124);
						match(CARET);
						setState(1125);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1126);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1127);
						match(BITOR);
						setState(1128);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1129);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1130);
						match(AND);
						setState(1131);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1132);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1133);
						match(OR);
						setState(1134);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1135);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1136);
						match(QUESTION);
						setState(1137);
						expression(0);
						setState(1138);
						match(COLON);
						setState(1139);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1141);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1142);
						_la = _input.LA(1);
						if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (ASSIGN - 75)) | (1L << (ADD_ASSIGN - 75)) | (1L << (SUB_ASSIGN - 75)) | (1L << (MUL_ASSIGN - 75)) | (1L << (DIV_ASSIGN - 75)) | (1L << (AND_ASSIGN - 75)) | (1L << (OR_ASSIGN - 75)) | (1L << (XOR_ASSIGN - 75)) | (1L << (MOD_ASSIGN - 75)) | (1L << (LSHIFT_ASSIGN - 75)) | (1L << (RSHIFT_ASSIGN - 75)) | (1L << (URSHIFT_ASSIGN - 75)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1143);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1145);
						match(LBRACK);
						setState(1146);
						expression(0);
						setState(1147);
						match(RBRACK);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1149);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1150);
						match(LPAREN);
						setState(1152);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
							{
							setState(1151);
							expressionList();
							}
						}

						setState(1154);
						match(RPAREN);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1155);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1156);
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
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1157);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1158);
						match(INSTANCEOF);
						setState(1159);
						typeType();
						}
						break;
					}
					} 
				}
				setState(1164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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
		enterRule(_localctx, 182, RULE_primary);
		try {
			setState(1179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165);
				match(LPAREN);
				setState(1166);
				expression(0);
				setState(1167);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1169);
				match(THIS);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1170);
				match(SUPER);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1171);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(1172);
				match(Identifier);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1173);
				nonWildcardTypeArguments();
				setState(1177);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1174);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1175);
					match(THIS);
					setState(1176);
					arguments();
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
		enterRule(_localctx, 184, RULE_creator);
		try {
			setState(1190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				nonWildcardTypeArguments();
				setState(1182);
				createdName();
				setState(1183);
				classCreatorRest();
				}
				break;
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
				createdName();
				setState(1188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1186);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1187);
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
		public TerminalNode Identifier() { return getToken(BaracoParser.Identifier, 0); }
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
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
		enterRule(_localctx, 186, RULE_createdName);
		int _la;
		try {
			setState(1197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1192);
				match(Identifier);
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1193);
					typeArgumentsOrDiamond();
					}
				}

				}
				break;
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
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
		enterRule(_localctx, 188, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(Identifier);
			setState(1201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1200);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1203);
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
		enterRule(_localctx, 190, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			match(LBRACK);
			setState(1233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1206);
				match(RBRACK);
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1207);
					match(LBRACK);
					setState(1208);
					match(RBRACK);
					}
					}
					setState(1213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1214);
				arrayInitializer();
				}
				break;
			case NEW:
			case SUPER:
			case THIS:
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
				setState(1215);
				expression(0);
				setState(1216);
				match(RBRACK);
				setState(1223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1217);
						match(LBRACK);
						setState(1218);
						expression(0);
						setState(1219);
						match(RBRACK);
						}
						} 
					}
					setState(1225);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				}
				setState(1230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1226);
						match(LBRACK);
						setState(1227);
						match(RBRACK);
						}
						} 
					}
					setState(1232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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
		enterRule(_localctx, 192, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			arguments();
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1236);
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
		enterRule(_localctx, 194, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			nonWildcardTypeArguments();
			setState(1240);
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
		enterRule(_localctx, 196, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			match(LT);
			setState(1243);
			typeList();
			setState(1244);
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
		enterRule(_localctx, 198, RULE_typeArgumentsOrDiamond);
		try {
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				match(LT);
				setState(1247);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
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
		enterRule(_localctx, 200, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1251);
				match(LT);
				setState(1252);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
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
		enterRule(_localctx, 202, RULE_superSuffix);
		try {
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				match(DOT);
				setState(1258);
				match(Identifier);
				setState(1260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1259);
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
		enterRule(_localctx, 204, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				match(SUPER);
				setState(1265);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266);
				match(Identifier);
				setState(1267);
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
		enterRule(_localctx, 206, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(LPAREN);
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1271);
				expressionList();
				}
			}

			setState(1274);
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
		case 90:
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
			return precpred(_ctx, 20);
		case 13:
			return precpred(_ctx, 19);
		case 14:
			return precpred(_ctx, 16);
		case 15:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3t\u04ff\4\2\t\2\4"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\3\2\7\2\u00d4"+
		"\n\2\f\2\16\2\u00d7\13\2\3\2\7\2\u00da\n\2\f\2\16\2\u00dd\13\2\3\2\7\2"+
		"\u00e0\n\2\f\2\16\2\u00e3\13\2\3\3\7\3\u00e6\n\3\f\3\16\3\u00e9\13\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\5\4\u00f1\n\4\3\4\3\4\3\4\5\4\u00f6\n\4\3\4\3\4"+
		"\3\5\7\5\u00fb\n\5\f\5\16\5\u00fe\13\5\3\5\3\5\7\5\u0102\n\5\f\5\16\5"+
		"\u0105\13\5\3\5\3\5\7\5\u0109\n\5\f\5\16\5\u010c\13\5\3\5\3\5\7\5\u0110"+
		"\n\5\f\5\16\5\u0113\13\5\3\5\3\5\5\5\u0117\n\5\3\6\3\6\5\6\u011b\n\6\3"+
		"\7\3\7\5\7\u011f\n\7\3\b\3\b\5\b\u0123\n\b\3\t\3\t\3\t\5\t\u0128\n\t\3"+
		"\t\3\t\5\t\u012c\n\t\3\t\3\t\5\t\u0130\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n"+
		"\u0138\n\n\f\n\16\n\u013b\13\n\3\n\3\n\3\13\3\13\3\13\5\13\u0142\n\13"+
		"\3\f\3\f\3\f\7\f\u0147\n\f\f\f\16\f\u014a\13\f\3\r\3\r\3\r\3\r\5\r\u0150"+
		"\n\r\3\r\3\r\5\r\u0154\n\r\3\r\5\r\u0157\n\r\3\r\5\r\u015a\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\7\16\u0161\n\16\f\16\16\16\u0164\13\16\3\17\7\17\u0167"+
		"\n\17\f\17\16\17\u016a\13\17\3\17\3\17\5\17\u016e\n\17\3\17\5\17\u0171"+
		"\n\17\3\20\3\20\7\20\u0175\n\20\f\20\16\20\u0178\13\20\3\21\3\21\3\21"+
		"\5\21\u017d\n\21\3\21\3\21\5\21\u0181\n\21\3\21\3\21\3\22\3\22\3\22\7"+
		"\22\u0188\n\22\f\22\16\22\u018b\13\22\3\23\3\23\7\23\u018f\n\23\f\23\16"+
		"\23\u0192\13\23\3\23\3\23\3\24\3\24\7\24\u0198\n\24\f\24\16\24\u019b\13"+
		"\24\3\24\3\24\3\25\3\25\5\25\u01a1\n\25\3\25\3\25\7\25\u01a5\n\25\f\25"+
		"\16\25\u01a8\13\25\3\25\5\25\u01ab\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u01b6\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\5\30\u01c0\n\30\3\30\3\30\3\30\3\30\7\30\u01c6\n\30\f\30\16\30\u01c9"+
		"\13\30\3\30\3\30\5\30\u01cd\n\30\3\30\3\30\5\30\u01d1\n\30\3\30\5\30\u01d4"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01dd\n\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\7\35\u01e9\n\35\f\35\16\35\u01ec\13"+
		"\35\3\35\3\35\5\35\u01f0\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u01f9\n\36\3\37\3\37\3\37\3\37\7\37\u01ff\n\37\f\37\16\37\u0202\13\37"+
		"\3\37\3\37\3 \3 \3 \7 \u0209\n \f \16 \u020c\13 \3 \3 \3 \3!\3!\5!\u0213"+
		"\n!\3!\3!\3!\3!\7!\u0219\n!\f!\16!\u021c\13!\3!\3!\5!\u0220\n!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\7#\u022a\n#\f#\16#\u022d\13#\3$\3$\3$\5$\u0232\n$"+
		"\3%\3%\3%\7%\u0237\n%\f%\16%\u023a\13%\3&\3&\5&\u023e\n&\3\'\3\'\3\'\3"+
		"\'\7\'\u0244\n\'\f\'\16\'\u0247\13\'\3\'\5\'\u024a\n\'\5\'\u024c\n\'\3"+
		"\'\3\'\3(\3(\3)\3)\3)\7)\u0255\n)\f)\16)\u0258\13)\3)\3)\3)\7)\u025d\n"+
		")\f)\16)\u0260\13)\5)\u0262\n)\3*\3*\5*\u0266\n*\3+\3+\3,\3,\3,\3,\7,"+
		"\u026e\n,\f,\16,\u0271\13,\3,\3,\3-\3-\3-\3-\5-\u0279\n-\5-\u027b\n-\3"+
		".\3.\3.\7.\u0280\n.\f.\16.\u0283\13.\3/\3/\5/\u0287\n/\3/\3/\3\60\3\60"+
		"\3\60\7\60\u028e\n\60\f\60\16\60\u0291\13\60\3\60\3\60\5\60\u0295\n\60"+
		"\3\60\5\60\u0298\n\60\3\61\7\61\u029b\n\61\f\61\16\61\u029e\13\61\3\61"+
		"\3\61\3\61\3\62\7\62\u02a4\n\62\f\62\16\62\u02a7\13\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u02ba\n\67\3\67\5\67\u02bd\n\67\38\38\39\39\39\79\u02c4\n9\f9\16"+
		"9\u02c7\139\3:\3:\3:\3:\3;\3;\3;\5;\u02d0\n;\3<\3<\3<\3<\7<\u02d6\n<\f"+
		"<\16<\u02d9\13<\5<\u02db\n<\3<\5<\u02de\n<\3<\3<\3=\3=\3=\3=\3=\3>\3>"+
		"\7>\u02e9\n>\f>\16>\u02ec\13>\3>\3>\3?\7?\u02f1\n?\f?\16?\u02f4\13?\3"+
		"?\3?\5?\u02f8\n?\3@\3@\3@\3@\3@\3@\5@\u0300\n@\3@\3@\5@\u0304\n@\3@\3"+
		"@\5@\u0308\n@\3@\3@\5@\u030c\n@\5@\u030e\n@\3A\3A\5A\u0312\nA\3B\3B\3"+
		"B\3B\5B\u0318\nB\3C\3C\3D\3D\3D\3E\3E\7E\u0321\nE\fE\16E\u0324\13E\3E"+
		"\3E\3F\3F\3F\5F\u032b\nF\3G\3G\3G\3H\7H\u0331\nH\fH\16H\u0334\13H\3H\3"+
		"H\3H\3I\3I\3I\3I\3I\5I\u033e\nI\3I\3I\3I\3I\3I\3I\3I\5I\u0347\nI\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\6I\u035c\nI\rI\16"+
		"I\u035d\3I\5I\u0361\nI\3I\5I\u0364\nI\3I\3I\3I\3I\7I\u036a\nI\fI\16I\u036d"+
		"\13I\3I\5I\u0370\nI\3I\3I\3I\3I\7I\u0376\nI\fI\16I\u0379\13I\3I\7I\u037c"+
		"\nI\fI\16I\u037f\13I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0389\nI\3I\3I\3I\3I\3"+
		"I\3I\3I\5I\u0392\nI\3I\3I\3I\5I\u0397\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\5I\u03a7\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\5J\u03b8\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u03c4\nK\3L\3L\3L\7L\u03c9"+
		"\nL\fL\16L\u03cc\13L\3L\3L\3L\3L\3L\3M\3M\3M\7M\u03d6\nM\fM\16M\u03d9"+
		"\13M\3N\3N\3N\3O\3O\3O\5O\u03e1\nO\3O\3O\3P\3P\3P\7P\u03e8\nP\fP\16P\u03eb"+
		"\13P\3Q\7Q\u03ee\nQ\fQ\16Q\u03f1\13Q\3Q\3Q\3Q\3Q\3Q\3R\6R\u03f9\nR\rR"+
		"\16R\u03fa\3R\6R\u03fe\nR\rR\16R\u03ff\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5"+
		"S\u040c\nS\3T\3T\5T\u0410\nT\3T\3T\5T\u0414\nT\3T\3T\5T\u0418\nT\5T\u041a"+
		"\nT\3U\3U\5U\u041e\nU\3V\7V\u0421\nV\fV\16V\u0424\13V\3V\3V\3V\3V\3V\3"+
		"W\3W\3X\3X\3X\3X\3Y\3Y\3Y\7Y\u0434\nY\fY\16Y\u0437\13Y\3Z\3Z\3[\3[\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u044a\n\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u045a\n\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\5\\\u0483\n\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u048b\n\\\f\\\16\\"+
		"\u048e\13\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u049c\n]\5]\u049e\n"+
		"]\3^\3^\3^\3^\3^\3^\3^\5^\u04a7\n^\5^\u04a9\n^\3_\3_\5_\u04ad\n_\3_\5"+
		"_\u04b0\n_\3`\3`\5`\u04b4\n`\3`\3`\3a\3a\3a\3a\7a\u04bc\na\fa\16a\u04bf"+
		"\13a\3a\3a\3a\3a\3a\3a\3a\7a\u04c8\na\fa\16a\u04cb\13a\3a\3a\7a\u04cf"+
		"\na\fa\16a\u04d2\13a\5a\u04d4\na\3b\3b\5b\u04d8\nb\3c\3c\3c\3d\3d\3d\3"+
		"d\3e\3e\3e\5e\u04e4\ne\3f\3f\3f\5f\u04e9\nf\3g\3g\3g\3g\5g\u04ef\ng\5"+
		"g\u04f1\ng\3h\3h\3h\3h\5h\u04f7\nh\3i\3i\5i\u04fb\ni\3i\3i\3i\2\3\u00b6"+
		"j\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\2\17\6\2"+
		"\"\"//\63\63\66\66\6\2\3\3\26\26%\'*+\b\2\4\4\6\6\13\13\17\17\36\36,,"+
		"\4\2\25\25--\3\2>C\3\2Z]\3\2PQ\4\2^_cc\3\2\\]\4\2NOUV\4\2TTWW\4\2MMdn"+
		"\3\2Z[\2\u0567\2\u00d5\3\2\2\2\4\u00e7\3\2\2\2\6\u00ee\3\2\2\2\b\u0116"+
		"\3\2\2\2\n\u011a\3\2\2\2\f\u011e\3\2\2\2\16\u0122\3\2\2\2\20\u0124\3\2"+
		"\2\2\22\u0133\3\2\2\2\24\u013e\3\2\2\2\26\u0143\3\2\2\2\30\u014b\3\2\2"+
		"\2\32\u015d\3\2\2\2\34\u0168\3\2\2\2\36\u0172\3\2\2\2 \u0179\3\2\2\2\""+
		"\u0184\3\2\2\2$\u018c\3\2\2\2&\u0195\3\2\2\2(\u01aa\3\2\2\2*\u01b5\3\2"+
		"\2\2,\u01b7\3\2\2\2.\u01d3\3\2\2\2\60\u01d5\3\2\2\2\62\u01d8\3\2\2\2\64"+
		"\u01e0\3\2\2\2\66\u01e3\3\2\2\28\u01ef\3\2\2\2:\u01f8\3\2\2\2<\u01fa\3"+
		"\2\2\2>\u0205\3\2\2\2@\u0212\3\2\2\2B\u0223\3\2\2\2D\u0226\3\2\2\2F\u022e"+
		"\3\2\2\2H\u0233\3\2\2\2J\u023d\3\2\2\2L\u023f\3\2\2\2N\u024f\3\2\2\2P"+
		"\u0261\3\2\2\2R\u0263\3\2\2\2T\u0267\3\2\2\2V\u0269\3\2\2\2X\u027a\3\2"+
		"\2\2Z\u027c\3\2\2\2\\\u0284\3\2\2\2^\u0297\3\2\2\2`\u029c\3\2\2\2b\u02a5"+
		"\3\2\2\2d\u02ac\3\2\2\2f\u02ae\3\2\2\2h\u02b0\3\2\2\2j\u02b2\3\2\2\2l"+
		"\u02b4\3\2\2\2n\u02be\3\2\2\2p\u02c0\3\2\2\2r\u02c8\3\2\2\2t\u02cf\3\2"+
		"\2\2v\u02d1\3\2\2\2x\u02e1\3\2\2\2z\u02e6\3\2\2\2|\u02f7\3\2\2\2~\u030d"+
		"\3\2\2\2\u0080\u0311\3\2\2\2\u0082\u0313\3\2\2\2\u0084\u0319\3\2\2\2\u0086"+
		"\u031b\3\2\2\2\u0088\u031e\3\2\2\2\u008a\u032a\3\2\2\2\u008c\u032c\3\2"+
		"\2\2\u008e\u0332\3\2\2\2\u0090\u03a6\3\2\2\2\u0092\u03b7\3\2\2\2\u0094"+
		"\u03c3\3\2\2\2\u0096\u03c5\3\2\2\2\u0098\u03d2\3\2\2\2\u009a\u03da\3\2"+
		"\2\2\u009c\u03dd\3\2\2\2\u009e\u03e4\3\2\2\2\u00a0\u03ef\3\2\2\2\u00a2"+
		"\u03f8\3\2\2\2\u00a4\u040b\3\2\2\2\u00a6\u0419\3\2\2\2\u00a8\u041d\3\2"+
		"\2\2\u00aa\u0422\3\2\2\2\u00ac\u042a\3\2\2\2\u00ae\u042c\3\2\2\2\u00b0"+
		"\u0430\3\2\2\2\u00b2\u0438\3\2\2\2\u00b4\u043a\3\2\2\2\u00b6\u0449\3\2"+
		"\2\2\u00b8\u049d\3\2\2\2\u00ba\u04a8\3\2\2\2\u00bc\u04af\3\2\2\2\u00be"+
		"\u04b1\3\2\2\2\u00c0\u04b7\3\2\2\2\u00c2\u04d5\3\2\2\2\u00c4\u04d9\3\2"+
		"\2\2\u00c6\u04dc\3\2\2\2\u00c8\u04e3\3\2\2\2\u00ca\u04e8\3\2\2\2\u00cc"+
		"\u04f0\3\2\2\2\u00ce\u04f6\3\2\2\2\u00d0\u04f8\3\2\2\2\u00d2\u00d4\5<"+
		"\37\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00db\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\5."+
		"\30\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00e1\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\5\u0090"+
		"I\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\5l\67\2"+
		"\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7$\2\2\u00eb"+
		"\u00ec\5h\65\2\u00ec\u00ed\7J\2\2\u00ed\5\3\2\2\2\u00ee\u00f0\7\34\2\2"+
		"\u00ef\u00f1\7*\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f5\5h\65\2\u00f3\u00f4\7L\2\2\u00f4\u00f6\7^\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7J"+
		"\2\2\u00f8\7\3\2\2\2\u00f9\u00fb\5\f\7\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0117\5\20\t\2\u0100\u0102\5\f\7\2\u0101\u0100\3"+
		"\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0117\5\30\r\2\u0107\u0109\5"+
		"\f\7\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0117\5 "+
		"\21\2\u010e\u0110\5\f\7\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0117\5x=\2\u0115\u0117\7J\2\2\u0116\u00fc\3\2\2\2\u0116\u0103"+
		"\3\2\2\2\u0116\u010a\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\t\3\2\2\2\u0118\u011b\5\f\7\2\u0119\u011b\t\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011a\u0119\3\2\2\2\u011b\13\3\2\2\2\u011c\u011f\5l\67\2\u011d\u011f"+
		"\t\3\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\r\3\2\2\2\u0120"+
		"\u0123\7\26\2\2\u0121\u0123\5l\67\2\u0122\u0120\3\2\2\2\u0122\u0121\3"+
		"\2\2\2\u0123\17\3\2\2\2\u0124\u0125\7\f\2\2\u0125\u0127\7o\2\2\u0126\u0128"+
		"\5\22\n\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2\2\2"+
		"\u0129\u012a\7\25\2\2\u012a\u012c\5P)\2\u012b\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012e\7\33\2\2\u012e\u0130\5\"\22\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132"+
		"\5$\23\2\u0132\21\3\2\2\2\u0133\u0134\7O\2\2\u0134\u0139\5\24\13\2\u0135"+
		"\u0136\7K\2\2\u0136\u0138\5\24\13\2\u0137\u0135\3\2\2\2\u0138\u013b\3"+
		"\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u013d\7N\2\2\u013d\23\3\2\2\2\u013e\u0141\7o\2\2"+
		"\u013f\u0140\7\25\2\2\u0140\u0142\5\26\f\2\u0141\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\25\3\2\2\2\u0143\u0148\5P)\2\u0144\u0145\7`\2\2\u0145\u0147"+
		"\5P)\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\27\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7\24\2"+
		"\2\u014c\u014f\7o\2\2\u014d\u014e\7\33\2\2\u014e\u0150\5\"\22\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\7F"+
		"\2\2\u0152\u0154\5\32\16\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0157\7K\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0159\3\2\2\2\u0158\u015a\5\36\20\2\u0159\u0158\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7G\2\2\u015c\31\3\2\2\2"+
		"\u015d\u0162\5\34\17\2\u015e\u015f\7K\2\2\u015f\u0161\5\34\17\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\33\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\5l\67\2\u0166\u0165"+
		"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d\7o\2\2\u016c\u016e\5\u00d0"+
		"i\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u0171\5$\23\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\35\3\2\2"+
		"\2\u0172\u0176\7J\2\2\u0173\u0175\5(\25\2\u0174\u0173\3\2\2\2\u0175\u0178"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\37\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u017a\7\37\2\2\u017a\u017c\7o\2\2\u017b\u017d\5\22"+
		"\n\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017f\7\25\2\2\u017f\u0181\5\"\22\2\u0180\u017e\3\2\2\2\u0180\u0181\3"+
		"\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\5&\24\2\u0183!\3\2\2\2\u0184\u0189"+
		"\5P)\2\u0185\u0186\7K\2\2\u0186\u0188\5P)\2\u0187\u0185\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a#\3\2\2\2"+
		"\u018b\u0189\3\2\2\2\u018c\u0190\7S\2\2\u018d\u018f\5(\25\2\u018e\u018d"+
		"\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7=\2\2\u0194%\3\2\2\2\u0195"+
		"\u0199\7S\2\2\u0196\u0198\58\35\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019d\7=\2\2\u019d\'\3\2\2\2\u019e\u01ab\7J\2\2\u019f"+
		"\u01a1\7*\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01ab\5\u0088E\2\u01a3\u01a5\5\n\6\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ab\5*\26\2\u01aa\u019e\3\2\2\2\u01aa"+
		"\u01a0\3\2\2\2\u01aa\u01a6\3\2\2\2\u01ab)\3\2\2\2\u01ac\u01b6\5.\30\2"+
		"\u01ad\u01b6\5\60\31\2\u01ae\u01b6\5\66\34\2\u01af\u01b6\5\62\32\2\u01b0"+
		"\u01b6\5\64\33\2\u01b1\u01b6\5 \21\2\u01b2\u01b6\5x=\2\u01b3\u01b6\5\20"+
		"\t\2\u01b4\u01b6\5\30\r\2\u01b5\u01ac\3\2\2\2\u01b5\u01ad\3\2\2\2\u01b5"+
		"\u01ae\3\2\2\2\u01b5\u01af\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b1\3\2"+
		"\2\2\u01b5\u01b2\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"+\3\2\2\2\u01b7\u01b8\7\65\2\2\u01b8\u01b9\7!\2\2\u01b9\u01ba\7D\2\2\u01ba"+
		"\u01bb\7E\2\2\u01bb\u01bc\5d\63\2\u01bc-\3\2\2\2\u01bd\u01c0\5P)\2\u01be"+
		"\u01c0\7\65\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3"+
		"\2\2\2\u01c1\u01c2\7o\2\2\u01c2\u01c7\5\\/\2\u01c3\u01c4\7H\2\2\u01c4"+
		"\u01c6\7I\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cc\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca"+
		"\u01cb\7\62\2\2\u01cb\u01cd\5Z.\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01d1\5d\63\2\u01cf\u01d1\7J\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d4\5,"+
		"\27\2\u01d3\u01bf\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4/\3\2\2\2\u01d5\u01d6"+
		"\5\22\n\2\u01d6\u01d7\5.\30\2\u01d7\61\3\2\2\2\u01d8\u01d9\7o\2\2\u01d9"+
		"\u01dc\5\\/\2\u01da\u01db\7\62\2\2\u01db\u01dd\5Z.\2\u01dc\u01da\3\2\2"+
		"\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\5f\64\2\u01df\63"+
		"\3\2\2\2\u01e0\u01e1\5\22\n\2\u01e1\u01e2\5\62\32\2\u01e2\65\3\2\2\2\u01e3"+
		"\u01e4\5P)\2\u01e4\u01e5\5D#\2\u01e5\u01e6\7J\2\2\u01e6\67\3\2\2\2\u01e7"+
		"\u01e9\5\n\6\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed"+
		"\u01f0\5:\36\2\u01ee\u01f0\7J\2\2\u01ef\u01ea\3\2\2\2\u01ef\u01ee\3\2"+
		"\2\2\u01f09\3\2\2\2\u01f1\u01f9\5<\37\2\u01f2\u01f9\5@!\2\u01f3\u01f9"+
		"\5B\"\2\u01f4\u01f9\5 \21\2\u01f5\u01f9\5x=\2\u01f6\u01f9\5\20\t\2\u01f7"+
		"\u01f9\5\30\r\2\u01f8\u01f1\3\2\2\2\u01f8\u01f2\3\2\2\2\u01f8\u01f3\3"+
		"\2\2\2\u01f8\u01f4\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f9;\3\2\2\2\u01fa\u01fb\5P)\2\u01fb\u0200\5> \2\u01fc"+
		"\u01fd\7K\2\2\u01fd\u01ff\5> \2\u01fe\u01fc\3\2\2\2\u01ff\u0202\3\2\2"+
		"\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200"+
		"\3\2\2\2\u0203\u0204\7J\2\2\u0204=\3\2\2\2\u0205\u020a\7o\2\2\u0206\u0207"+
		"\7H\2\2\u0207\u0209\7I\2\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020d\u020e\7M\2\2\u020e\u020f\5J&\2\u020f?\3\2\2\2\u0210\u0213\5"+
		"P)\2\u0211\u0213\7\65\2\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\7o\2\2\u0215\u021a\5\\/\2\u0216\u0217\7H\2"+
		"\2\u0217\u0219\7I\2\2\u0218\u0216\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021f\3\2\2\2\u021c\u021a\3\2\2\2\u021d"+
		"\u021e\7\62\2\2\u021e\u0220\5Z.\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0222\7J\2\2\u0222A\3\2\2\2\u0223\u0224"+
		"\5\22\n\2\u0224\u0225\5@!\2\u0225C\3\2\2\2\u0226\u022b\5F$\2\u0227\u0228"+
		"\7K\2\2\u0228\u022a\5F$\2\u0229\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022cE\3\2\2\2\u022d\u022b\3\2\2\2"+
		"\u022e\u0231\5H%\2\u022f\u0230\7M\2\2\u0230\u0232\5J&\2\u0231\u022f\3"+
		"\2\2\2\u0231\u0232\3\2\2\2\u0232G\3\2\2\2\u0233\u0238\7o\2\2\u0234\u0235"+
		"\7H\2\2\u0235\u0237\7I\2\2\u0236\u0234\3\2\2\2\u0237\u023a\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239I\3\2\2\2\u023a\u0238\3\2\2\2"+
		"\u023b\u023e\5L\'\2\u023c\u023e\5\u00b6\\\2\u023d\u023b\3\2\2\2\u023d"+
		"\u023c\3\2\2\2\u023eK\3\2\2\2\u023f\u024b\7F\2\2\u0240\u0245\5J&\2\u0241"+
		"\u0242\7K\2\2\u0242\u0244\5J&\2\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2"+
		"\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245"+
		"\3\2\2\2\u0248\u024a\7K\2\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024c\3\2\2\2\u024b\u0240\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u024e\7G\2\2\u024eM\3\2\2\2\u024f\u0250\7o\2\2\u0250O\3\2\2"+
		"\2\u0251\u0256\5R*\2\u0252\u0253\7H\2\2\u0253\u0255\7I\2\2\u0254\u0252"+
		"\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u0262\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025e\5T+\2\u025a\u025b\7H\2"+
		"\2\u025b\u025d\7I\2\2\u025c\u025a\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c"+
		"\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0261"+
		"\u0251\3\2\2\2\u0261\u0259\3\2\2\2\u0262Q\3\2\2\2\u0263\u0265\7o\2\2\u0264"+
		"\u0266\5V,\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266S\3\2\2\2\u0267"+
		"\u0268\t\4\2\2\u0268U\3\2\2\2\u0269\u026a\7O\2\2\u026a\u026f\5X-\2\u026b"+
		"\u026c\7K\2\2\u026c\u026e\5X-\2\u026d\u026b\3\2\2\2\u026e\u0271\3\2\2"+
		"\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u026f"+
		"\3\2\2\2\u0272\u0273\7N\2\2\u0273W\3\2\2\2\u0274\u027b\5P)\2\u0275\u0278"+
		"\7R\2\2\u0276\u0277\t\5\2\2\u0277\u0279\5P)\2\u0278\u0276\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u0274\3\2\2\2\u027a\u0275\3\2"+
		"\2\2\u027bY\3\2\2\2\u027c\u0281\5h\65\2\u027d\u027e\7K\2\2\u027e\u0280"+
		"\5h\65\2\u027f\u027d\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282[\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0286\7D\2\2\u0285"+
		"\u0287\5^\60\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288\u0289\7E\2\2\u0289]\3\2\2\2\u028a\u028f\5`\61\2\u028b\u028c"+
		"\7K\2\2\u028c\u028e\5`\61\2\u028d\u028b\3\2\2\2\u028e\u0291\3\2\2\2\u028f"+
		"\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0294\3\2\2\2\u0291\u028f\3\2"+
		"\2\2\u0292\u0293\7K\2\2\u0293\u0295\5b\62\2\u0294\u0292\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0298\5b\62\2\u0297\u028a\3\2"+
		"\2\2\u0297\u0296\3\2\2\2\u0298_\3\2\2\2\u0299\u029b\5\16\b\2\u029a\u0299"+
		"\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u029f\3\2\2\2\u029e\u029c\3\2\2\2\u029f\u02a0\5P)\2\u02a0\u02a1\5H%\2"+
		"\u02a1a\3\2\2\2\u02a2\u02a4\5\16\b\2\u02a3\u02a2\3\2\2\2\u02a4\u02a7\3"+
		"\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\3\2\2\2\u02a7"+
		"\u02a5\3\2\2\2\u02a8\u02a9\5P)\2\u02a9\u02aa\7q\2\2\u02aa\u02ab\5H%\2"+
		"\u02abc\3\2\2\2\u02ac\u02ad\5\u0088E\2\u02ade\3\2\2\2\u02ae\u02af\5\u0088"+
		"E\2\u02afg\3\2\2\2\u02b0\u02b1\7o\2\2\u02b1i\3\2\2\2\u02b2\u02b3\t\6\2"+
		"\2\u02b3k\3\2\2\2\u02b4\u02b5\7p\2\2\u02b5\u02bc\5n8\2\u02b6\u02b9\7D"+
		"\2\2\u02b7\u02ba\5p9\2\u02b8\u02ba\5t;\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8"+
		"\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\7E\2\2\u02bc"+
		"\u02b6\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bdm\3\2\2\2\u02be\u02bf\5h\65\2"+
		"\u02bfo\3\2\2\2\u02c0\u02c5\5r:\2\u02c1\u02c2\7K\2\2\u02c2\u02c4\5r:\2"+
		"\u02c3\u02c1\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6"+
		"\3\2\2\2\u02c6q\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\7o\2\2\u02c9\u02ca"+
		"\7M\2\2\u02ca\u02cb\5t;\2\u02cbs\3\2\2\2\u02cc\u02d0\5\u00b6\\\2\u02cd"+
		"\u02d0\5l\67\2\u02ce\u02d0\5v<\2\u02cf\u02cc\3\2\2\2\u02cf\u02cd\3\2\2"+
		"\2\u02cf\u02ce\3\2\2\2\u02d0u\3\2\2\2\u02d1\u02da\7F\2\2\u02d2\u02d7\5"+
		"t;\2\u02d3\u02d4\7K\2\2\u02d4\u02d6\5t;\2\u02d5\u02d3\3\2\2\2\u02d6\u02d9"+
		"\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9"+
		"\u02d7\3\2\2\2\u02da\u02d2\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2"+
		"\2\2\u02dc\u02de\7K\2\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e0\7G\2\2\u02e0w\3\2\2\2\u02e1\u02e2\7p\2\2\u02e2"+
		"\u02e3\7\37\2\2\u02e3\u02e4\7o\2\2\u02e4\u02e5\5z>\2\u02e5y\3\2\2\2\u02e6"+
		"\u02ea\7F\2\2\u02e7\u02e9\5|?\2\u02e8\u02e7\3\2\2\2\u02e9\u02ec\3\2\2"+
		"\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ea"+
		"\3\2\2\2\u02ed\u02ee\7G\2\2\u02ee{\3\2\2\2\u02ef\u02f1\5\n\6\2\u02f0\u02ef"+
		"\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3"+
		"\u02f5\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f8\5~@\2\u02f6\u02f8\7J\2"+
		"\2\u02f7\u02f2\3\2\2\2\u02f7\u02f6\3\2\2\2\u02f8}\3\2\2\2\u02f9\u02fa"+
		"\5P)\2\u02fa\u02fb\5\u0080A\2\u02fb\u02fc\7J\2\2\u02fc\u030e\3\2\2\2\u02fd"+
		"\u02ff\5\20\t\2\u02fe\u0300\7J\2\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2"+
		"\2\2\u0300\u030e\3\2\2\2\u0301\u0303\5 \21\2\u0302\u0304\7J\2\2\u0303"+
		"\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u030e\3\2\2\2\u0305\u0307\5\30"+
		"\r\2\u0306\u0308\7J\2\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u030e\3\2\2\2\u0309\u030b\5x=\2\u030a\u030c\7J\2\2\u030b\u030a\3\2\2"+
		"\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u02f9\3\2\2\2\u030d\u02fd"+
		"\3\2\2\2\u030d\u0301\3\2\2\2\u030d\u0305\3\2\2\2\u030d\u0309\3\2\2\2\u030e"+
		"\177\3\2\2\2\u030f\u0312\5\u0082B\2\u0310\u0312\5\u0084C\2\u0311\u030f"+
		"\3\2\2\2\u0311\u0310\3\2\2\2\u0312\u0081\3\2\2\2\u0313\u0314\7o\2\2\u0314"+
		"\u0315\7D\2\2\u0315\u0317\7E\2\2\u0316\u0318\5\u0086D\2\u0317\u0316\3"+
		"\2\2\2\u0317\u0318\3\2\2\2\u0318\u0083\3\2\2\2\u0319\u031a\5D#\2\u031a"+
		"\u0085\3\2\2\2\u031b\u031c\7\20\2\2\u031c\u031d\5t;\2\u031d\u0087\3\2"+
		"\2\2\u031e\u0322\7S\2\2\u031f\u0321\5\u008aF\2\u0320\u031f\3\2\2\2\u0321"+
		"\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\3\2"+
		"\2\2\u0324\u0322\3\2\2\2\u0325\u0326\7=\2\2\u0326\u0089\3\2\2\2\u0327"+
		"\u032b\5\u008cG\2\u0328\u032b\5\u0090I\2\u0329\u032b\5\b\5\2\u032a\u0327"+
		"\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u0329\3\2\2\2\u032b\u008b\3\2\2\2\u032c"+
		"\u032d\5\u008eH\2\u032d\u032e\7J\2\2\u032e\u008d\3\2\2\2\u032f\u0331\5"+
		"\16\b\2\u0330\u032f\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0336\5P"+
		")\2\u0336\u0337\5D#\2\u0337\u008f\3\2\2\2\u0338\u03a7\5\u0088E\2\u0339"+
		"\u033a\7\5\2\2\u033a\u033d\5\u00b6\\\2\u033b\u033c\7S\2\2\u033c\u033e"+
		"\5\u00b6\\\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\3\2\2"+
		"\2\u033f\u0340\7J\2\2\u0340\u03a7\3\2\2\2\u0341\u0342\7\31\2\2\u0342\u0343"+
		"\5\u00aeX\2\u0343\u0346\5\u0090I\2\u0344\u0345\7\23\2\2\u0345\u0347\5"+
		"\u0090I\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u03a7\3\2\2\2"+
		"\u0348\u0349\7\30\2\2\u0349\u034a\7D\2\2\u034a\u034b\5\u00a6T\2\u034b"+
		"\u034c\7E\2\2\u034c\u034d\5\u0090I\2\u034d\u03a7\3\2\2\2\u034e\u034f\7"+
		"\67\2\2\u034f\u0350\5\u00aeX\2\u0350\u0351\5\u0090I\2\u0351\u03a7\3\2"+
		"\2\2\u0352\u0353\7\21\2\2\u0353\u0354\5\u0090I\2\u0354\u0355\7\67\2\2"+
		"\u0355\u0356\5\u00aeX\2\u0356\u0357\7J\2\2\u0357\u03a7\3\2\2\2\u0358\u0359"+
		"\7\64\2\2\u0359\u0363\5\u0088E\2\u035a\u035c\5\u0096L\2\u035b\u035a\3"+
		"\2\2\2\u035c\u035d\3\2\2\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e"+
		"\u0360\3\2\2\2\u035f\u0361\5\u009aN\2\u0360\u035f\3\2\2\2\u0360\u0361"+
		"\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0364\5\u009aN\2\u0363\u035b\3\2\2"+
		"\2\u0363\u0362\3\2\2\2\u0364\u03a7\3\2\2\2\u0365\u0366\7\64\2\2\u0366"+
		"\u0367\5\u009cO\2\u0367\u036b\5\u0088E\2\u0368\u036a\5\u0096L\2\u0369"+
		"\u0368\3\2\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2"+
		"\2\2\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u0370\5\u009aN\2\u036f"+
		"\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u03a7\3\2\2\2\u0371\u0372\7."+
		"\2\2\u0372\u0373\5\u00aeX\2\u0373\u0377\7F\2\2\u0374\u0376\5\u00a2R\2"+
		"\u0375\u0374\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378"+
		"\3\2\2\2\u0378\u037d\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u037c\5\u00a4S"+
		"\2\u037b\u037a\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e"+
		"\3\2\2\2\u037e\u0380\3\2\2\2\u037f\u037d\3\2\2\2\u0380\u0381\7G\2\2\u0381"+
		"\u03a7\3\2\2\2\u0382\u0383\7/\2\2\u0383\u0384\5\u00aeX\2\u0384\u0385\5"+
		"\u0088E\2\u0385\u03a7\3\2\2\2\u0386\u0388\7(\2\2\u0387\u0389\5\u00b6\\"+
		"\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u03a7"+
		"\7J\2\2\u038b\u038c\7\61\2\2\u038c\u038d\5\u00b6\\\2\u038d\u038e\7J\2"+
		"\2\u038e\u03a7\3\2\2\2\u038f\u0391\7\7\2\2\u0390\u0392\7o\2\2\u0391\u0390"+
		"\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u03a7\7J\2\2\u0394"+
		"\u0396\7\16\2\2\u0395\u0397\7o\2\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2"+
		"\2\2\u0397\u0398\3\2\2\2\u0398\u03a7\7J\2\2\u0399\u03a7\7J\2\2\u039a\u039b"+
		"\5\u00b2Z\2\u039b\u039c\7J\2\2\u039c\u03a7\3\2\2\2\u039d\u039e\7o\2\2"+
		"\u039e\u039f\7S\2\2\u039f\u03a7\5\u0090I\2\u03a0\u03a1\5\u0092J\2\u03a1"+
		"\u03a2\7J\2\2\u03a2\u03a7\3\2\2\2\u03a3\u03a4\5\u0094K\2\u03a4\u03a5\7"+
		"J\2\2\u03a5\u03a7\3\2\2\2\u03a6\u0338\3\2\2\2\u03a6\u0339\3\2\2\2\u03a6"+
		"\u0341\3\2\2\2\u03a6\u0348\3\2\2\2\u03a6\u034e\3\2\2\2\u03a6\u0352\3\2"+
		"\2\2\u03a6\u0358\3\2\2\2\u03a6\u0365\3\2\2\2\u03a6\u0371\3\2\2\2\u03a6"+
		"\u0382\3\2\2\2\u03a6\u0386\3\2\2\2\u03a6\u038b\3\2\2\2\u03a6\u038f\3\2"+
		"\2\2\u03a6\u0394\3\2\2\2\u03a6\u0399\3\2\2\2\u03a6\u039a\3\2\2\2\u03a6"+
		"\u039d\3\2\2\2\u03a6\u03a0\3\2\2\2\u03a6\u03a3\3\2\2\2\u03a7\u0091\3\2"+
		"\2\2\u03a8\u03a9\7o\2\2\u03a9\u03aa\7M\2\2\u03aa\u03ab\78\2\2\u03ab\u03ac"+
		"\7D\2\2\u03ac\u03b8\7E\2\2\u03ad\u03ae\7o\2\2\u03ae\u03af\7M\2\2\u03af"+
		"\u03b0\79\2\2\u03b0\u03b1\7D\2\2\u03b1\u03b8\7E\2\2\u03b2\u03b3\7o\2\2"+
		"\u03b3\u03b4\7M\2\2\u03b4\u03b5\7:\2\2\u03b5\u03b6\7D\2\2\u03b6\u03b8"+
		"\7E\2\2\u03b7\u03a8\3\2\2\2\u03b7\u03ad\3\2\2\2\u03b7\u03b2\3\2\2\2\u03b8"+
		"\u0093\3\2\2\2\u03b9\u03ba\7;\2\2\u03ba\u03bb\7D\2\2\u03bb\u03bc\5\u00b6"+
		"\\\2\u03bc\u03bd\7E\2\2\u03bd\u03c4\3\2\2\2\u03be\u03bf\7<\2\2\u03bf\u03c0"+
		"\7D\2\2\u03c0\u03c1\5\u00b6\\\2\u03c1\u03c2\7E\2\2\u03c2\u03c4\3\2\2\2"+
		"\u03c3\u03b9\3\2\2\2\u03c3\u03be\3\2\2\2\u03c4\u0095\3\2\2\2\u03c5\u03c6"+
		"\7\n\2\2\u03c6\u03ca\7D\2\2\u03c7\u03c9\5\16\b\2\u03c8\u03c7\3\2\2\2\u03c9"+
		"\u03cc\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2"+
		"\2\2\u03cc\u03ca\3\2\2\2\u03cd\u03ce\5\u0098M\2\u03ce\u03cf\7o\2\2\u03cf"+
		"\u03d0\7E\2\2\u03d0\u03d1\5\u0088E\2\u03d1\u0097\3\2\2\2\u03d2\u03d7\5"+
		"h\65\2\u03d3\u03d4\7a\2\2\u03d4\u03d6\5h\65\2\u03d5\u03d3\3\2\2\2\u03d6"+
		"\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u0099\3\2"+
		"\2\2\u03d9\u03d7\3\2\2\2\u03da\u03db\7\27\2\2\u03db\u03dc\5\u0088E\2\u03dc"+
		"\u009b\3\2\2\2\u03dd\u03de\7D\2\2\u03de\u03e0\5\u009eP\2\u03df\u03e1\7"+
		"J\2\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u03e3\7E\2\2\u03e3\u009d\3\2\2\2\u03e4\u03e9\5\u00a0Q\2\u03e5\u03e6\7"+
		"J\2\2\u03e6\u03e8\5\u00a0Q\2\u03e7\u03e5\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9"+
		"\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u009f\3\2\2\2\u03eb\u03e9\3\2"+
		"\2\2\u03ec\u03ee\5\16\b\2\u03ed\u03ec\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef"+
		"\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03ef\3\2"+
		"\2\2\u03f2\u03f3\5R*\2\u03f3\u03f4\5H%\2\u03f4\u03f5\7M\2\2\u03f5\u03f6"+
		"\5\u00b6\\\2\u03f6\u00a1\3\2\2\2\u03f7\u03f9\5\u00a4S\2\u03f8\u03f7\3"+
		"\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb"+
		"\u03fd\3\2\2\2\u03fc\u03fe\5\u008aF\2\u03fd\u03fc\3\2\2\2\u03fe\u03ff"+
		"\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u00a3\3\2\2\2\u0401"+
		"\u0402\7\t\2\2\u0402\u0403\5\u00b4[\2\u0403\u0404\7S\2\2\u0404\u040c\3"+
		"\2\2\2\u0405\u0406\7\t\2\2\u0406\u0407\5N(\2\u0407\u0408\7S\2\2\u0408"+
		"\u040c\3\2\2\2\u0409\u040a\7\20\2\2\u040a\u040c\7S\2\2\u040b\u0401\3\2"+
		"\2\2\u040b\u0405\3\2\2\2\u040b\u0409\3\2\2\2\u040c\u00a5\3\2\2\2\u040d"+
		"\u041a\5\u00aaV\2\u040e\u0410\5\u00a8U\2\u040f\u040e\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\7J\2\2\u0412\u0414\5\u00b6\\"+
		"\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417"+
		"\7J\2\2\u0416\u0418\5\u00acW\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2"+
		"\u0418\u041a\3\2\2\2\u0419\u040d\3\2\2\2\u0419\u040f\3\2\2\2\u041a\u00a7"+
		"\3\2\2\2\u041b\u041e\5\u008eH\2\u041c\u041e\5\u00b0Y\2\u041d\u041b\3\2"+
		"\2\2\u041d\u041c\3\2\2\2\u041e\u00a9\3\2\2\2\u041f\u0421\5\16\b\2\u0420"+
		"\u041f\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2"+
		"\2\2\u0423\u0425\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u0426\5P)\2\u0426\u0427"+
		"\5H%\2\u0427\u0428\7S\2\2\u0428\u0429\5\u00b6\\\2\u0429\u00ab\3\2\2\2"+
		"\u042a\u042b\5\u00b0Y\2\u042b\u00ad\3\2\2\2\u042c\u042d\7D\2\2\u042d\u042e"+
		"\5\u00b6\\\2\u042e\u042f\7E\2\2\u042f\u00af\3\2\2\2\u0430\u0435\5\u00b6"+
		"\\\2\u0431\u0432\7K\2\2\u0432\u0434\5\u00b6\\\2\u0433\u0431\3\2\2\2\u0434"+
		"\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u00b1\3\2"+
		"\2\2\u0437\u0435\3\2\2\2\u0438\u0439\5\u00b6\\\2\u0439\u00b3\3\2\2\2\u043a"+
		"\u043b\5\u00b6\\\2\u043b\u00b5\3\2\2\2\u043c\u043d\b\\\1\2\u043d\u044a"+
		"\5\u00b8]\2\u043e\u043f\7#\2\2\u043f\u044a\5\u00ba^\2\u0440\u0441\7D\2"+
		"\2\u0441\u0442\5P)\2\u0442\u0443\7E\2\2\u0443\u0444\5\u00b6\\\23\u0444"+
		"\u044a\3\2\2\2\u0445\u0446\t\7\2\2\u0446\u044a\5\u00b6\\\21\u0447\u0448"+
		"\t\b\2\2\u0448\u044a\5\u00b6\\\20\u0449\u043c\3\2\2\2\u0449\u043e\3\2"+
		"\2\2\u0449\u0440\3\2\2\2\u0449\u0445\3\2\2\2\u0449\u0447\3\2\2\2\u044a"+
		"\u048c\3\2\2\2\u044b\u044c\f\17\2\2\u044c\u044d\t\t\2\2\u044d\u048b\5"+
		"\u00b6\\\20\u044e\u044f\f\16\2\2\u044f\u0450\t\n\2\2\u0450\u048b\5\u00b6"+
		"\\\17\u0451\u0459\f\r\2\2\u0452\u0453\7O\2\2\u0453\u045a\7O\2\2\u0454"+
		"\u0455\7N\2\2\u0455\u0456\7N\2\2\u0456\u045a\7N\2\2\u0457\u0458\7N\2\2"+
		"\u0458\u045a\7N\2\2\u0459\u0452\3\2\2\2\u0459\u0454\3\2\2\2\u0459\u0457"+
		"\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u048b\5\u00b6\\\16\u045c\u045d\f\f"+
		"\2\2\u045d\u045e\t\13\2\2\u045e\u048b\5\u00b6\\\r\u045f\u0460\f\n\2\2"+
		"\u0460\u0461\t\f\2\2\u0461\u048b\5\u00b6\\\13\u0462\u0463\f\t\2\2\u0463"+
		"\u0464\7`\2\2\u0464\u048b\5\u00b6\\\n\u0465\u0466\f\b\2\2\u0466\u0467"+
		"\7b\2\2\u0467\u048b\5\u00b6\\\t\u0468\u0469\f\7\2\2\u0469\u046a\7a\2\2"+
		"\u046a\u048b\5\u00b6\\\b\u046b\u046c\f\6\2\2\u046c\u046d\7X\2\2\u046d"+
		"\u048b\5\u00b6\\\7\u046e\u046f\f\5\2\2\u046f\u0470\7Y\2\2\u0470\u048b"+
		"\5\u00b6\\\6\u0471\u0472\f\4\2\2\u0472\u0473\7R\2\2\u0473\u0474\5\u00b6"+
		"\\\2\u0474\u0475\7S\2\2\u0475\u0476\5\u00b6\\\5\u0476\u048b\3\2\2\2\u0477"+
		"\u0478\f\3\2\2\u0478\u0479\t\r\2\2\u0479\u048b\5\u00b6\\\3\u047a\u047b"+
		"\f\26\2\2\u047b\u047c\7H\2\2\u047c\u047d\5\u00b6\\\2\u047d\u047e\7I\2"+
		"\2\u047e\u048b\3\2\2\2\u047f\u0480\f\25\2\2\u0480\u0482\7D\2\2\u0481\u0483"+
		"\5\u00b0Y\2\u0482\u0481\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0484\3\2\2"+
		"\2\u0484\u048b\7E\2\2\u0485\u0486\f\22\2\2\u0486\u048b\t\16\2\2\u0487"+
		"\u0488\f\13\2\2\u0488\u0489\7\35\2\2\u0489\u048b\5P)\2\u048a\u044b\3\2"+
		"\2\2\u048a\u044e\3\2\2\2\u048a\u0451\3\2\2\2\u048a\u045c\3\2\2\2\u048a"+
		"\u045f\3\2\2\2\u048a\u0462\3\2\2\2\u048a\u0465\3\2\2\2\u048a\u0468\3\2"+
		"\2\2\u048a\u046b\3\2\2\2\u048a\u046e\3\2\2\2\u048a\u0471\3\2\2\2\u048a"+
		"\u0477\3\2\2\2\u048a\u047a\3\2\2\2\u048a\u047f\3\2\2\2\u048a\u0485\3\2"+
		"\2\2\u048a\u0487\3\2\2\2\u048b\u048e\3\2\2\2\u048c\u048a\3\2\2\2\u048c"+
		"\u048d\3\2\2\2\u048d\u00b7\3\2\2\2\u048e\u048c\3\2\2\2\u048f\u0490\7D"+
		"\2\2\u0490\u0491\5\u00b6\\\2\u0491\u0492\7E\2\2\u0492\u049e\3\2\2\2\u0493"+
		"\u049e\7\60\2\2\u0494\u049e\7-\2\2\u0495\u049e\5j\66\2\u0496\u049e\7o"+
		"\2\2\u0497\u049b\5\u00c6d\2\u0498\u049c\5\u00ceh\2\u0499\u049a\7\60\2"+
		"\2\u049a\u049c\5\u00d0i\2\u049b\u0498\3\2\2\2\u049b\u0499\3\2\2\2\u049c"+
		"\u049e\3\2\2\2\u049d\u048f\3\2\2\2\u049d\u0493\3\2\2\2\u049d\u0494\3\2"+
		"\2\2\u049d\u0495\3\2\2\2\u049d\u0496\3\2\2\2\u049d\u0497\3\2\2\2\u049e"+
		"\u00b9\3\2\2\2\u049f\u04a0\5\u00c6d\2\u04a0\u04a1\5\u00bc_\2\u04a1\u04a2"+
		"\5\u00c2b\2\u04a2\u04a9\3\2\2\2\u04a3\u04a6\5\u00bc_\2\u04a4\u04a7\5\u00c0"+
		"a\2\u04a5\u04a7\5\u00c2b\2\u04a6\u04a4\3\2\2\2\u04a6\u04a5\3\2\2\2\u04a7"+
		"\u04a9\3\2\2\2\u04a8\u049f\3\2\2\2\u04a8\u04a3\3\2\2\2\u04a9\u00bb\3\2"+
		"\2\2\u04aa\u04ac\7o\2\2\u04ab\u04ad\5\u00c8e\2\u04ac\u04ab\3\2\2\2\u04ac"+
		"\u04ad\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04b0\5T+\2\u04af\u04aa\3\2\2"+
		"\2\u04af\u04ae\3\2\2\2\u04b0\u00bd\3\2\2\2\u04b1\u04b3\7o\2\2\u04b2\u04b4"+
		"\5\u00caf\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\3\2\2"+
		"\2\u04b5\u04b6\5\u00c2b\2\u04b6\u00bf\3\2\2\2\u04b7\u04d3\7H\2\2\u04b8"+
		"\u04bd\7I\2\2\u04b9\u04ba\7H\2\2\u04ba\u04bc\7I\2\2\u04bb\u04b9\3\2\2"+
		"\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0"+
		"\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04d4\5L\'\2\u04c1\u04c2\5\u00b6\\"+
		"\2\u04c2\u04c9\7I\2\2\u04c3\u04c4\7H\2\2\u04c4\u04c5\5\u00b6\\\2\u04c5"+
		"\u04c6\7I\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c3\3\2\2\2\u04c8\u04cb\3\2"+
		"\2\2\u04c9\u04c7\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04d0\3\2\2\2\u04cb"+
		"\u04c9\3\2\2\2\u04cc\u04cd\7H\2\2\u04cd\u04cf\7I\2\2\u04ce\u04cc\3\2\2"+
		"\2\u04cf\u04d2\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d4"+
		"\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d3\u04b8\3\2\2\2\u04d3\u04c1\3\2\2\2\u04d4"+
		"\u00c1\3\2\2\2\u04d5\u04d7\5\u00d0i\2\u04d6\u04d8\5$\23\2\u04d7\u04d6"+
		"\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u00c3\3\2\2\2\u04d9\u04da\5\u00c6d"+
		"\2\u04da\u04db\5\u00ceh\2\u04db\u00c5\3\2\2\2\u04dc\u04dd\7O\2\2\u04dd"+
		"\u04de\5\"\22\2\u04de\u04df\7N\2\2\u04df\u00c7\3\2\2\2\u04e0\u04e1\7O"+
		"\2\2\u04e1\u04e4\7N\2\2\u04e2\u04e4\5V,\2\u04e3\u04e0\3\2\2\2\u04e3\u04e2"+
		"\3\2\2\2\u04e4\u00c9\3\2\2\2\u04e5\u04e6\7O\2\2\u04e6\u04e9\7N\2\2\u04e7"+
		"\u04e9\5\u00c6d\2\u04e8\u04e5\3\2\2\2\u04e8\u04e7\3\2\2\2\u04e9\u00cb"+
		"\3\2\2\2\u04ea\u04f1\5\u00d0i\2\u04eb\u04ec\7L\2\2\u04ec\u04ee\7o\2\2"+
		"\u04ed\u04ef\5\u00d0i\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u04f1\3\2\2\2\u04f0\u04ea\3\2\2\2\u04f0\u04eb\3\2\2\2\u04f1\u00cd\3\2"+
		"\2\2\u04f2\u04f3\7-\2\2\u04f3\u04f7\5\u00ccg\2\u04f4\u04f5\7o\2\2\u04f5"+
		"\u04f7\5\u00d0i\2\u04f6\u04f2\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f7\u00cf"+
		"\3\2\2\2\u04f8\u04fa\7D\2\2\u04f9\u04fb\5\u00b0Y\2\u04fa\u04f9\3\2\2\2"+
		"\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\7E\2\2\u04fd\u00d1"+
		"\3\2\2\2\u0094\u00d5\u00db\u00e1\u00e7\u00f0\u00f5\u00fc\u0103\u010a\u0111"+
		"\u0116\u011a\u011e\u0122\u0127\u012b\u012f\u0139\u0141\u0148\u014f\u0153"+
		"\u0156\u0159\u0162\u0168\u016d\u0170\u0176\u017c\u0180\u0189\u0190\u0199"+
		"\u01a0\u01a6\u01aa\u01b5\u01bf\u01c7\u01cc\u01d0\u01d3\u01dc\u01ea\u01ef"+
		"\u01f8\u0200\u020a\u0212\u021a\u021f\u022b\u0231\u0238\u023d\u0245\u0249"+
		"\u024b\u0256\u025e\u0261\u0265\u026f\u0278\u027a\u0281\u0286\u028f\u0294"+
		"\u0297\u029c\u02a5\u02b9\u02bc\u02c5\u02cf\u02d7\u02da\u02dd\u02ea\u02f2"+
		"\u02f7\u02ff\u0303\u0307\u030b\u030d\u0311\u0317\u0322\u032a\u0332\u033d"+
		"\u0346\u035d\u0360\u0363\u036b\u036f\u0377\u037d\u0388\u0391\u0396\u03a6"+
		"\u03b7\u03c3\u03ca\u03d7\u03e0\u03e9\u03ef\u03fa\u03ff\u040b\u040f\u0413"+
		"\u0417\u0419\u041d\u0422\u0435\u0449\u0459\u0482\u048a\u048c\u049b\u049d"+
		"\u04a6\u04a8\u04ac\u04af\u04b3\u04bd\u04c9\u04d0\u04d3\u04d7\u04e3\u04e8"+
		"\u04ee\u04f0\u04f6\u04fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}