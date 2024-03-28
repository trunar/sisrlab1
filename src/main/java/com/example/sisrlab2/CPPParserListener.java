// Generated from H:/stud/4course/2semester/SISR/2/sisrlab2/src/main/java/com/example/sisrlab2/CPPParser.g4 by ANTLR 4.13.1
package com.example.sisrlab2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPPParser}.
 */
public interface CPPParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CPPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CPPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CPPParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CPPParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(CPPParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(CPPParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#multipleVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMultipleVariableDeclaration(CPPParser.MultipleVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#multipleVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMultipleVariableDeclaration(CPPParser.MultipleVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(CPPParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(CPPParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(CPPParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(CPPParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(CPPParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(CPPParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CPPParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CPPParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CPPParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CPPParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CPPParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CPPParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CPPParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CPPParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CPPParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CPPParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(CPPParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(CPPParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(CPPParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(CPPParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(CPPParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(CPPParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CPPParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CPPParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CPPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CPPParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CPPParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CPPParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CPPParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CPPParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(CPPParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(CPPParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(CPPParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(CPPParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(CPPParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(CPPParser.JumpStatementContext ctx);
}