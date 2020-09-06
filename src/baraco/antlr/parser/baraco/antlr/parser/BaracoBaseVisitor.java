/**
 * 
 */
package baraco.antlr.parser;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import baraco.antlr.parser.BaracoParser.*;
import baraco.semantics.analyzers.BasicMethodAnalyzer;
import baraco.semantics.analyzers.ClassAnalyzer;
import baraco.semantics.analyzers.MainAnalyzer;
import baraco.semantics.analyzers.OOPMethodAnalyzer;

/**
 * @author delgallegon
 *
 */
public class BaracoBaseVisitor<Void> extends AbstractParseTreeVisitor<Void> implements BaracoVisitor<Void> {

	@Override
	public Void visitCompilationUnit(CompilationUnitContext ctx) {
		// TODO Auto-generated method stub
		this.visit(ctx.typeDeclaration(0));
		return null;
	}

	@Override
	public Void visitPackageDeclaration(PackageDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitImportDeclaration(ImportDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitTypeDeclaration(TypeDeclarationContext ctx) {
		this.visit(ctx.classDeclaration());
		return null;
	}

	@Override
	public Void visitModifier(ModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitClassOrInterfaceModifier(ClassOrInterfaceModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitVariableModifier(VariableModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitClassDeclaration(ClassDeclarationContext ctx) {
		// TODO Auto-generated method stub
		ClassAnalyzer classAnalyzer = new ClassAnalyzer();
		classAnalyzer.analyze(ctx);
		
		this.visit(ctx.classBody());
		return null;
	}

	@Override
	public Void visitTypeParameters(TypeParametersContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitTypeParameter(TypeParameterContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitTypeBound(TypeBoundContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitEnumDeclaration(EnumDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitEnumConstants(EnumConstantsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitEnumConstant(EnumConstantContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitEnumBodyDeclarations(EnumBodyDeclarationsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitTypeList(TypeListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitClassBody(ClassBodyContext ctx) {
		// TODO Auto-generated method stub
		ArrayList<ClassBodyDeclarationContext> ctxList = (ArrayList<ClassBodyDeclarationContext>) ctx.classBodyDeclaration();
		for(int i = 0; i < ctxList.size(); i++) {
			this.visit(ctxList.get(i));
		}
		return null;
	}

	@Override
	public Void visitInterfaceBody(InterfaceBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
		// TODO Auto-generated method stub
		if(ctx.memberDeclaration() != null) {
			this.visit(ctx.memberDeclaration());
		}
		return null;
	}

	@Override
	public Void visitMemberDeclaration(MemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		if(ctx.methodDeclaration() != null) {
			this.visit(ctx.methodDeclaration());
		}
		if(ctx.mainDeclaration() != null) {
			this.visit(ctx.mainDeclaration());
		}
		
		return null;
	}

	@Override
	public Void visitMainDeclaration(MainDeclarationContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Visited main declaration.");
		MainAnalyzer mainAnalyzer = new MainAnalyzer();
		mainAnalyzer.analyze(ctx);
		return null;
	}

	@Override
	public Void visitMethodDeclaration(MethodDeclarationContext ctx) {
		System.out.println("Visited method declaration " + ctx.Identifier().getText());
		BasicMethodAnalyzer methodAnalyzer = new BasicMethodAnalyzer();
        methodAnalyzer.analyze(ctx);
		return null;
	}

	@Override
	public Void visitGenericMethodDeclaration(GenericMethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitConstructorDeclaration(ConstructorDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitGenericConstructorDeclaration(GenericConstructorDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitFieldDeclaration(FieldDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitInterfaceBodyDeclaration(InterfaceBodyDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitConstDeclaration(ConstDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitConstantDeclarator(ConstantDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitGenericInterfaceMethodDeclaration(GenericInterfaceMethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitVariableDeclarators(VariableDeclaratorsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitVariableDeclarator(VariableDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitVariableInitializer(VariableInitializerContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitArrayInitializer(ArrayInitializerContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitEnumConstantName(EnumConstantNameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitTypeType(TypeTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitPrimitiveType(PrimitiveTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitTypeArguments(TypeArgumentsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitTypeArgument(TypeArgumentContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitQualifiedNameList(QualifiedNameListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitFormalParameters(FormalParametersContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitFormalParameterList(FormalParameterListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitFormalParameter(FormalParameterContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitLastFormalParameter(LastFormalParameterContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitMethodBody(MethodBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitConstructorBody(ConstructorBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitQualifiedName(QualifiedNameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitLiteral(LiteralContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitAnnotation(AnnotationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitAnnotationName(AnnotationNameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitElementValuePairs(ElementValuePairsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitElementValuePair(ElementValuePairContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitElementValue(ElementValueContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitAnnotationTypeBody(AnnotationTypeBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitAnnotationTypeElementDeclaration(AnnotationTypeElementDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitAnnotationTypeElementRest(AnnotationTypeElementRestContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitAnnotationMethodOrConstantRest(AnnotationMethodOrConstantRestContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitAnnotationMethodRest(AnnotationMethodRestContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitAnnotationConstantRest(AnnotationConstantRestContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitDefaultValue(DefaultValueContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitBlockStatement(BlockStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitScanStatement(ScanStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitPrintStatement(PrintStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitCatchClause(CatchClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitCatchType(CatchTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitFinallyBlock(FinallyBlockContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitResourceSpecification(ResourceSpecificationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitResources(ResourcesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitResource(ResourceContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitSwitchLabel(SwitchLabelContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitForControl(ForControlContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitForInit(ForInitContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitEnhancedForControl(EnhancedForControlContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitForUpdate(ForUpdateContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitParExpression(ParExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitExpressionList(ExpressionListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitStatementExpression(StatementExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitConstantExpression(ConstantExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitExpression(ExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitPrimary(PrimaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitCreator(CreatorContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitCreatedName(CreatedNameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitInnerCreator(InnerCreatorContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitArrayCreatorRest(ArrayCreatorRestContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitClassCreatorRest(ClassCreatorRestContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitExplicitGenericInvocation(ExplicitGenericInvocationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitNonWildcardTypeArguments(NonWildcardTypeArgumentsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitNonWildcardTypeArgumentsOrDiamond(NonWildcardTypeArgumentsOrDiamondContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitSuperSuffix(SuperSuffixContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitExplicitGenericInvocationSuffix(ExplicitGenericInvocationSuffixContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitArguments(ArgumentsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
