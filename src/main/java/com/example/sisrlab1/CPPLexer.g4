lexer grammar CPPLexer;

// ідентифікатори
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;

// типи даних
INT : 'int';
FLOAT : 'float';
CHAR : 'char';
BOOL : 'bool';
DOUBLE : 'double';
CONST : 'const';
TYPES : INT | FLOAT | CHAR | BOOL | DOUBLE;

// виконання арифметичних операцій
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
MODULO : '%';
ASSIGN : '=';

// використання циклів і умовних операторів
IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';

// функції
VOID : 'void';
RETURN : 'return';

// розділові знаки
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
HASH : '#';
LESSTHAN : '<';
MORETHAN : '>';
EXCLAMATION: '!';
QUOTE: '"';

// пропуск пробілів і табуляцій
SPACETAB : [ \t\n]+ -> skip;

// коментарі
LINE_COMMENT : '//' .*? '\n' -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;

// літерали
INTEGER_LITERAL : [0-9]+;
FLOAT_LITERAL : [0-9]+'.'[0-9]+;
CHARACTER_LITERAL : '\'' . '\'';

// оголошення
VARIABLEDECL : TYPES IDENTIFIER (ASSIGN EXPRESSION)? SEMI;
CONSTANTDECL : CONST TYPES IDENTIFIER ASSIGN EXPRESSION SEMI;

// вирази
EXPRESSION : ADDITIVE_EXPRESSION;
ADDITIVE_EXPRESSION : MULTIPLICATIVE_EXPRESSION ((PLUS | MINUS) MULTIPLICATIVE_EXPRESSION);
MULTIPLICATIVE_EXPRESSION : PRIMARY_EXPRESSION ((MULTIPLY | DIVIDE) PRIMARY_EXPRESSION);
PRIMARY_EXPRESSION : IDENTIFIER | INTEGER_LITERAL | FLOAT_LITERAL | CHARACTER_LITERAL | LPAREN EXPRESSION RPAREN;