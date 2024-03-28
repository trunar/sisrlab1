parser grammar CPPParser;

options {
  tokenVocab=CPPLexer;
}

program : declaration*;

declaration : variableDeclaration | constantDeclaration | arrayDeclaration | multipleVariableDeclaration;

variableDeclaration : (CONST | TYPES) variableDeclarator SEMI;

multipleVariableDeclaration : (CONST | TYPES) variableDeclarator (COMMA variableDeclarator)* SEMI;

variableDeclarator : IDENTIFIER (ASSIGN expression)?;

constantDeclaration : CONST TYPES IDENTIFIER (ASSIGN expression)? SEMI;

arrayDeclaration : TYPES IDENTIFIER LBRACK expression? RBRACK (ASSIGN arrayInitializer)? SEMI;

expression : additiveExpression;

additiveExpression : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*;

multiplicativeExpression : primaryExpression ((MULTIPLY | DIVIDE) primaryExpression)*;

primaryExpression : IDENTIFIER
                  | INTEGER_LITERAL
                  | FLOAT_LITERAL
                  | CHARACTER_LITERAL
                  | stringLiteral
                  | arrayAccess
                  | assignmentExpression
                  | LPAREN expression RPAREN;

assignmentExpression : IDENTIFIER ASSIGN expression;

stringLiteral : STRING_LITERAL;

arrayAccess : IDENTIFIER LBRACK expression RBRACK;

arrayInitializer : LBRACE expressionList? RBRACE;

expressionList : expression (COMMA expression)*;

statement : compoundStatement
          | expressionStatement
          | selectionStatement
          | iterationStatement
          | jumpStatement;

compoundStatement : LBRACE declaration* statement* RBRACE;

expressionStatement : expression? SEMI;

selectionStatement : IF LPAREN expression RPAREN statement (ELSE statement)?;

iterationStatement : WHILE LPAREN expression RPAREN statement
                  | FOR LPAREN expressionStatement expressionStatement expression? RPAREN statement;

jumpStatement : RETURN expression? SEMI;
