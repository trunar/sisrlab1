// Generated from H:/stud/4course/2semester/SISR/2/sisrlab2/src/main/java/com/example/sisrlab2/CPPParser.g4 by ANTLR 4.13.1
package com.example.sisrlab2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CPPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CPPParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CPPParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CPPParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CPPParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#multipleVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleVariableDeclaration(CPPParser.MultipleVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(CPPParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(CPPParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(CPPParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(CPPParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CPPParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CPPParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CPPParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CPPParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(CPPParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(CPPParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(CPPParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(CPPParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CPPParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CPPParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CPPParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CPPParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(CPPParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(CPPParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(CPPParser.JumpStatementContext ctx);
}