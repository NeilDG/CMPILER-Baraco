// Generated from Moka.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MokaParser}.
 */
public interface MokaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MokaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(MokaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(MokaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(MokaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(MokaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(MokaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(MokaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(MokaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(MokaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(MokaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(MokaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(MokaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(MokaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(MokaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(MokaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MokaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MokaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(MokaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(MokaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(MokaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(MokaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(MokaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(MokaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(MokaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(MokaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(MokaParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(MokaParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(MokaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(MokaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(MokaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(MokaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(MokaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(MokaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(MokaParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(MokaParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(MokaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(MokaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(MokaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(MokaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(MokaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(MokaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(MokaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(MokaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MokaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MokaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(MokaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(MokaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(MokaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(MokaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(MokaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(MokaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(MokaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(MokaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(MokaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(MokaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(MokaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(MokaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(MokaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(MokaParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(MokaParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(MokaParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(MokaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(MokaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(MokaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(MokaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(MokaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(MokaParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(MokaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(MokaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(MokaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(MokaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(MokaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(MokaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(MokaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(MokaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(MokaParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(MokaParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(MokaParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(MokaParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(MokaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(MokaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(MokaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(MokaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(MokaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(MokaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(MokaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(MokaParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(MokaParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(MokaParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(MokaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(MokaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(MokaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(MokaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(MokaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(MokaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(MokaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(MokaParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(MokaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(MokaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(MokaParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(MokaParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(MokaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(MokaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MokaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MokaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(MokaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(MokaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(MokaParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(MokaParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(MokaParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(MokaParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(MokaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(MokaParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(MokaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(MokaParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(MokaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(MokaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(MokaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(MokaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(MokaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(MokaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(MokaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(MokaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(MokaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(MokaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(MokaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(MokaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(MokaParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(MokaParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(MokaParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(MokaParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(MokaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(MokaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MokaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MokaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MokaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MokaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(MokaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(MokaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(MokaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(MokaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MokaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MokaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void enterScanStatement(MokaParser.ScanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void exitScanStatement(MokaParser.ScanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MokaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MokaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(MokaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(MokaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(MokaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(MokaParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(MokaParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(MokaParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(MokaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(MokaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(MokaParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(MokaParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(MokaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(MokaParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(MokaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(MokaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(MokaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(MokaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(MokaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(MokaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(MokaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(MokaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(MokaParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(MokaParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(MokaParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(MokaParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(MokaParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(MokaParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(MokaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(MokaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(MokaParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(MokaParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(MokaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(MokaParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MokaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MokaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(MokaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(MokaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(MokaParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(MokaParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(MokaParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(MokaParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(MokaParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(MokaParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(MokaParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(MokaParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(MokaParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(MokaParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(MokaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(MokaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(MokaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(MokaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(MokaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(MokaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(MokaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(MokaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(MokaParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(MokaParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(MokaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(MokaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(MokaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(MokaParser.ArgumentsContext ctx);
}