// Generated from Baraco.g4 by ANTLR 4.7
package moka.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BaracoParser}.
 */
public interface BaracoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BaracoParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(BaracoParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(BaracoParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(BaracoParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(BaracoParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(BaracoParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(BaracoParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(BaracoParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(BaracoParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(BaracoParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(BaracoParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(BaracoParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(BaracoParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(BaracoParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(BaracoParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(BaracoParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(BaracoParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(BaracoParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(BaracoParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(BaracoParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(BaracoParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(BaracoParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(BaracoParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(BaracoParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(BaracoParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(BaracoParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(BaracoParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(BaracoParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(BaracoParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(BaracoParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(BaracoParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(BaracoParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(BaracoParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(BaracoParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(BaracoParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(BaracoParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(BaracoParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(BaracoParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(BaracoParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(BaracoParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(BaracoParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(BaracoParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(BaracoParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(BaracoParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(BaracoParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(BaracoParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(BaracoParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(BaracoParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(BaracoParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(BaracoParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(BaracoParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(BaracoParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(BaracoParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(BaracoParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(BaracoParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(BaracoParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(BaracoParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(BaracoParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(BaracoParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(BaracoParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(BaracoParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(BaracoParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(BaracoParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(BaracoParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(BaracoParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(BaracoParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(BaracoParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(BaracoParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(BaracoParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(BaracoParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(BaracoParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(BaracoParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(BaracoParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(BaracoParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(BaracoParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(BaracoParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(BaracoParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(BaracoParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(BaracoParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(BaracoParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(BaracoParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(BaracoParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(BaracoParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(BaracoParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(BaracoParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(BaracoParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(BaracoParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(BaracoParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(BaracoParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(BaracoParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(BaracoParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(BaracoParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(BaracoParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(BaracoParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(BaracoParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(BaracoParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(BaracoParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(BaracoParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(BaracoParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(BaracoParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(BaracoParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(BaracoParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(BaracoParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(BaracoParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(BaracoParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(BaracoParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(BaracoParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(BaracoParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(BaracoParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(BaracoParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(BaracoParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(BaracoParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(BaracoParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(BaracoParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(BaracoParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(BaracoParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(BaracoParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(BaracoParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(BaracoParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(BaracoParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(BaracoParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(BaracoParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(BaracoParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(BaracoParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(BaracoParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(BaracoParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(BaracoParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(BaracoParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(BaracoParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(BaracoParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(BaracoParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(BaracoParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(BaracoParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BaracoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BaracoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(BaracoParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(BaracoParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(BaracoParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(BaracoParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(BaracoParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(BaracoParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BaracoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BaracoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void enterScanStatement(BaracoParser.ScanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void exitScanStatement(BaracoParser.ScanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(BaracoParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(BaracoParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(BaracoParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(BaracoParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(BaracoParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(BaracoParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(BaracoParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(BaracoParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(BaracoParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(BaracoParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(BaracoParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(BaracoParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(BaracoParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(BaracoParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(BaracoParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(BaracoParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(BaracoParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(BaracoParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(BaracoParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(BaracoParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(BaracoParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(BaracoParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(BaracoParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(BaracoParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(BaracoParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(BaracoParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(BaracoParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(BaracoParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(BaracoParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(BaracoParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(BaracoParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(BaracoParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(BaracoParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(BaracoParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BaracoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BaracoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(BaracoParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(BaracoParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(BaracoParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(BaracoParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(BaracoParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(BaracoParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(BaracoParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(BaracoParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(BaracoParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(BaracoParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(BaracoParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(BaracoParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(BaracoParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(BaracoParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(BaracoParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(BaracoParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(BaracoParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(BaracoParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(BaracoParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(BaracoParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(BaracoParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(BaracoParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(BaracoParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(BaracoParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaracoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(BaracoParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaracoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(BaracoParser.ArgumentsContext ctx);
}