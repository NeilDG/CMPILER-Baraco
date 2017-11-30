package baraco.antlr.parser;

// Generated from /Users/patricktobias/Documents/[DLSU]/4th Year - 1st Term/CMPILER-Baraco/CMPILER-Baraco/grammar/Baraco.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BaracoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BaracoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BaracoParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(BaracoParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(BaracoParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(BaracoParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(BaracoParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(BaracoParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(BaracoParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(BaracoParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(BaracoParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(BaracoParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(BaracoParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(BaracoParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(BaracoParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(BaracoParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(BaracoParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(BaracoParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(BaracoParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(BaracoParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(BaracoParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(BaracoParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(BaracoParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(BaracoParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#mainDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDeclaration(BaracoParser.MainDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(BaracoParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(BaracoParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(BaracoParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(BaracoParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(BaracoParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(BaracoParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(BaracoParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(BaracoParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(BaracoParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(BaracoParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(BaracoParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(BaracoParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(BaracoParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(BaracoParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(BaracoParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(BaracoParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(BaracoParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(BaracoParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(BaracoParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(BaracoParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(BaracoParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(BaracoParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(BaracoParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(BaracoParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(BaracoParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(BaracoParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(BaracoParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(BaracoParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(BaracoParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(BaracoParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(BaracoParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(BaracoParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(BaracoParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(BaracoParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(BaracoParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(BaracoParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(BaracoParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(BaracoParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(BaracoParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(BaracoParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(BaracoParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(BaracoParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(BaracoParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(BaracoParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(BaracoParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BaracoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(BaracoParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(BaracoParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(BaracoParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BaracoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#scanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanStatement(BaracoParser.ScanStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(BaracoParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(BaracoParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(BaracoParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(BaracoParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(BaracoParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(BaracoParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(BaracoParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(BaracoParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(BaracoParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(BaracoParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(BaracoParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(BaracoParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(BaracoParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(BaracoParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(BaracoParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(BaracoParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(BaracoParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BaracoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(BaracoParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(BaracoParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(BaracoParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(BaracoParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(BaracoParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(BaracoParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(BaracoParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(BaracoParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(BaracoParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(BaracoParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(BaracoParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(BaracoParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaracoParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(BaracoParser.ArgumentsContext ctx);
}