package com.example.sisrlab2;

import java.util.List;

public class CPPToAssemblyListener extends CPPParserBaseListener {

    private StringBuilder assemblyCode = new StringBuilder();

    private StringBuilder dataSection = new StringBuilder();

    public String getAssemblyCode() {
        StringBuilder result = new StringBuilder();

        if (dataSection.length() > 0) {
            result.append("section .data\n").append(dataSection.toString()).append("\n");
        }

        return result.append("section .text\n\tglobal _start\n\n_start:\n").append(assemblyCode.toString()).toString();
    }

    @Override
    public void enterMultipleVariableDeclaration(CPPParser.MultipleVariableDeclarationContext ctx) {
        String type = "dd";

        List<CPPParser.VariableDeclaratorContext> declarators = ctx.variableDeclarator();
        for (CPPParser.VariableDeclaratorContext declarator : declarators) {
            String identifier = declarator.IDENTIFIER().getText();

            if (declarator.expression() != null) {
                String value = declarator.expression().getText();
                dataSection.append("\t").append(identifier).append(": ").append(type).append(" 0\n");
            } else {}
        }
    }


    @Override
    public void enterVariableDeclaration(CPPParser.VariableDeclarationContext ctx) {
        String type = "dd";
        String identifier = ctx.variableDeclarator().IDENTIFIER().getText();

        if (ctx.variableDeclarator().expression() != null) {
            String value = ctx.variableDeclarator().expression().getText();
            dataSection.append("\t").append(identifier).append(": ").append(type).append(" 0\n");
        } else {
            dataSection.append("\t").append(identifier).append(" ").append(type).append(" 0\n");
        }
    }

    @Override
    public void enterAdditiveExpression(CPPParser.AdditiveExpressionContext ctx) {
        String targetOperand = "eax";
        assemblyCode.append("\t").append("mov ").append(targetOperand).append(", ").append(getOperandText(ctx.primaryExpression(0))).append("\n");

        for (int i = 1; i < ctx.primaryExpression().size(); i++) {
            String currentOperand = getOperandText(ctx.primaryExpression(i));

            if (ctx.PLUS(i - 1) != null) {
                assemblyCode.append("\t").append("add ").append(targetOperand).append(", ").append(currentOperand).append("\n");
            } else if (ctx.MINUS(i - 1) != null) {
                assemblyCode.append("\t").append("sub ").append(targetOperand).append(", ").append(currentOperand).append("\n");
            }
        }
        String variableName = ctx.primaryExpression(0).parent.parent.parent.parent.getChild(0).getText();
        assemblyCode.append("\t").append("mov [").append(variableName).append("], ").append(targetOperand).append("\n");
    }

    private String getOperandText(CPPParser.PrimaryExpressionContext ctx) {
        if (ctx.INTEGER_LITERAL() != null) {
            return ctx.INTEGER_LITERAL().getText();
        } else if (ctx.IDENTIFIER() != null) {
            return ctx.IDENTIFIER().getText();
        }
        return "";
    }

    @Override
    public void enterMultiplicativeExpression(CPPParser.MultiplicativeExpressionContext ctx) {
        String targetOperand = "eax";
        assemblyCode.append("\t").append("mov ").append(targetOperand).append(", ").append(getOperandText(ctx.primaryExpression(0))).append("\n");

        for (int i = 1; i < ctx.primaryExpression().size(); i++) {
            String currentOperand = getOperandText(ctx.primaryExpression(i));

            if (ctx.MULTIPLY(i - 1) != null) {
                assemblyCode.append("\t").append("imul ").append(targetOperand).append(", ").append(currentOperand).append("\n");
            } else if (ctx.DIVIDE(i - 1) != null) {
                assemblyCode.append("\t").append("mov ").append("ebx").append(", ").append(currentOperand).append("\n");
                assemblyCode.append("\t").append("idiv ").append("ebx").append("\n");
            }
        }

        String variableName = ctx.primaryExpression(0).parent.parent.parent.parent.getChild(0).getText();
        assemblyCode.append("\t").append("mov [").append(variableName).append("], ").append(targetOperand).append("\n");
    }
}
