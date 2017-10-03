// Generated from Moka.G4 by ANTLR 4.7
package moka.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MokaParser}.
 */
public interface MokaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MokaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MokaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MokaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#funcdecl_list}.
	 * @param ctx the parse tree
	 */
	void enterFuncdecl_list(MokaParser.Funcdecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#funcdecl_list}.
	 * @param ctx the parse tree
	 */
	void exitFuncdecl_list(MokaParser.Funcdecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(MokaParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(MokaParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#function_return}.
	 * @param ctx the parse tree
	 */
	void enterFunction_return(MokaParser.Function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#function_return}.
	 * @param ctx the parse tree
	 */
	void exitFunction_return(MokaParser.Function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#function_noreturn}.
	 * @param ctx the parse tree
	 */
	void enterFunction_noreturn(MokaParser.Function_noreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#function_noreturn}.
	 * @param ctx the parse tree
	 */
	void exitFunction_noreturn(MokaParser.Function_noreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(MokaParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(MokaParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(MokaParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(MokaParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MokaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MokaParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#function_content}.
	 * @param ctx the parse tree
	 */
	void enterFunction_content(MokaParser.Function_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#function_content}.
	 * @param ctx the parse tree
	 */
	void exitFunction_content(MokaParser.Function_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#vardecl_list}.
	 * @param ctx the parse tree
	 */
	void enterVardecl_list(MokaParser.Vardecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#vardecl_list}.
	 * @param ctx the parse tree
	 */
	void exitVardecl_list(MokaParser.Vardecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(MokaParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(MokaParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(MokaParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(MokaParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(MokaParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(MokaParser.Identifier_listContext ctx);
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
	 * Enter a parse tree produced by {@link MokaParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(MokaParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(MokaParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#funccall_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunccall_statement(MokaParser.Funccall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#funccall_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunccall_statement(MokaParser.Funccall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterActual_parameter_list(MokaParser.Actual_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitActual_parameter_list(MokaParser.Actual_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#actual_params}.
	 * @param ctx the parse tree
	 */
	void enterActual_params(MokaParser.Actual_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#actual_params}.
	 * @param ctx the parse tree
	 */
	void exitActual_params(MokaParser.Actual_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void enterScan_statement(MokaParser.Scan_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void exitScan_statement(MokaParser.Scan_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(MokaParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(MokaParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(MokaParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(MokaParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MokaParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MokaParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(MokaParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(MokaParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(MokaParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(MokaParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(MokaParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(MokaParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(MokaParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(MokaParser.Statement_listContext ctx);
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
	 * Enter a parse tree produced by {@link MokaParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(MokaParser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(MokaParser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void enterNum_expression(MokaParser.Num_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void exitNum_expression(MokaParser.Num_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#num_term}.
	 * @param ctx the parse tree
	 */
	void enterNum_term(MokaParser.Num_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#num_term}.
	 * @param ctx the parse tree
	 */
	void exitNum_term(MokaParser.Num_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void enterNum_factor(MokaParser.Num_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void exitNum_factor(MokaParser.Num_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#num_identifier}.
	 * @param ctx the parse tree
	 */
	void enterNum_identifier(MokaParser.Num_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#num_identifier}.
	 * @param ctx the parse tree
	 */
	void exitNum_identifier(MokaParser.Num_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#string_identifier}.
	 * @param ctx the parse tree
	 */
	void enterString_identifier(MokaParser.String_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#string_identifier}.
	 * @param ctx the parse tree
	 */
	void exitString_identifier(MokaParser.String_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_expression(MokaParser.Bool_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_expression(MokaParser.Bool_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(MokaParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(MokaParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#bool_logical}.
	 * @param ctx the parse tree
	 */
	void enterBool_logical(MokaParser.Bool_logicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#bool_logical}.
	 * @param ctx the parse tree
	 */
	void exitBool_logical(MokaParser.Bool_logicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void enterBool_term(MokaParser.Bool_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void exitBool_term(MokaParser.Bool_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#bool_factor}.
	 * @param ctx the parse tree
	 */
	void enterBool_factor(MokaParser.Bool_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#bool_factor}.
	 * @param ctx the parse tree
	 */
	void exitBool_factor(MokaParser.Bool_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#bool_identifier}.
	 * @param ctx the parse tree
	 */
	void enterBool_identifier(MokaParser.Bool_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#bool_identifier}.
	 * @param ctx the parse tree
	 */
	void exitBool_identifier(MokaParser.Bool_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#constdecl_list}.
	 * @param ctx the parse tree
	 */
	void enterConstdecl_list(MokaParser.Constdecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#constdecl_list}.
	 * @param ctx the parse tree
	 */
	void exitConstdecl_list(MokaParser.Constdecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void enterConst_statement(MokaParser.Const_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void exitConst_statement(MokaParser.Const_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#const_identifier}.
	 * @param ctx the parse tree
	 */
	void enterConst_identifier(MokaParser.Const_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#const_identifier}.
	 * @param ctx the parse tree
	 */
	void exitConst_identifier(MokaParser.Const_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MokaParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MokaParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MokaParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MokaParser.ConstantContext ctx);
}