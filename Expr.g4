grammar Expr;

start_ : expr EOF;

expr : logicalExpr;

logicalExpr 
    : relationalExpr 
    | logicalExpr ('&&' | '||') relationalExpr
    ;

relationalExpr 
    : additiveExpr 
    | relationalExpr ('==' | '!=' | '<' | '<=' | '>' | '>=') additiveExpr
    ;

additiveExpr 
    : multiplicativeExpr 
    | additiveExpr ('+' | '-') multiplicativeExpr
    ;

multiplicativeExpr 
    : unaryExpr 
    | multiplicativeExpr ('*' | '/' | '%') unaryExpr
    ;

unaryExpr 
    : primaryExpr 
    | ('+' | '-' | '!') primaryExpr
    ;

primaryExpr 
    : NUMBER 
    | BOOLEAN 
    | STRING 
    | IDENTIFIER 
    | '(' expr ')'
    ;

NUMBER : [0-9]+ ('.' [0-9]+)?;    // Match whole or decimal numbers
BOOLEAN : 'true' | 'false';        // Boolean literals
STRING : '"' (ESC | ~["\\])* '"';  // String literals
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*; // Variable names or function identifiers

ESC : '\\' ('"' | '\\' | 'n' | 'r' | 't' | 'b' | 'f' | 'u' [0-9a-fA-F]{4});  // Handle escape sequences for strings

// Token definitions
AND : '&&';        // Logical AND operator
OR  : '||';        // Logical OR operator
EQ  : '==';        // Equality comparison
NEQ : '!=';        // Not equal comparison
LT  : '<';         // Less than comparison
LTE : '<=';        // Less than or equal comparison
GT  : '>';         // Greater than comparison
GTE : '>=';        // Greater than or equal comparison
ADD : '+';         // Addition operator
SUB : '-';         // Subtraction operator
MUL : '*';         // Multiplication operator
DIV : '/';         // Division operator
MOD : '%';         // Modulo operator
NOT : '!';         // NOT logical operator
LPAREN : '(';      // Left parenthesis
RPAREN : ')';      // Right parenthesis

WS : [ \t\r\n]+ -> skip;  // Ignore whitespaces
