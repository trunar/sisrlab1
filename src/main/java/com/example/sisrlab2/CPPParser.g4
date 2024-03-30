parser grammar CPPParser;

options {
  tokenVocab=CPPLexer;
}

program : declaration* statement*;

declaration : variableDeclaration
            | constantDeclaration
            | arrayDeclaration
            | multipleVariableDeclaration;

multipleVariableDeclaration : (CONST | TYPES) variableDeclarator (COMMA variableDeclarator)* SEMI;

variableDeclaration : (CONST | TYPES) variableDeclarator SEMI;

variableDeclarator : IDENTIFIER (ASSIGN expression)?;

constantDeclaration : CONST TYPES IDENTIFIER (ASSIGN expression)? SEMI;

arrayDeclaration : TYPES IDENTIFIER LBRACK expression? RBRACK (ASSIGN arrayInitializer)? SEMI;

expression : assignmentExpression;

assignmentExpression : additiveExpression | multiplicativeExpression | primaryExpression ASSIGN expression;

additiveExpression : primaryExpression ((PLUS | MINUS) primaryExpression)*;

multiplicativeExpression : primaryExpression ((MULTIPLY | DIVIDE) primaryExpression)*;

primaryExpression : IDENTIFIER
                  | INTEGER_LITERAL
                  | FLOAT_LITERAL
                  | CHARACTER_LITERAL
                  | stringLiteral
                  | arrayAccess
                  | LPAREN expression RPAREN;

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
