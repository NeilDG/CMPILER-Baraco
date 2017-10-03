grammar Moka;

//start point of program
program
    :   constdecl_list funcdecl_list statement_list
    ;

//function declarations

funcdecl_list
    :   function_declaration funcdecl_list?;

function_declaration
    :   function_return
    |   function_noreturn
    ;

function_return
    :   data_type function_name '(' parameter_list ')' function_content
    ;

function_noreturn
    :   'void' function_name '(' parameter_list ')' function_content
    ;

function_name
    :   Identifier
    ;

parameter_list
    :   parameters?
    ;

parameters
    :   var_decl ',' parameters
    |   var_decl
    ;

function_content
    :   vardecl_list statement_list 'end'
    ;

//variable declarations

vardecl_list
    :   var_decl STMTEND vardecl_list
    |   var_decl
    ;

var_decl
    :   data_type identifier_list
    ;

data_type
    :   'int'
    |   'decimal'
    |   'string'
    ;

identifier_list
    :   Identifier ',' identifier_list
    |   Identifier
    ;

//statements

statement
    :   assignment_statement STMTEND
    |   funccall_statement STMTEND
    |   if_statement STMTEND
    |   while_statement STMTEND
    |   do_while_statement STMTEND
    |   for_statement STMTEND
    |   return_statement STMTEND
    |   print_statement STMTEND
    |   scan_statement STMTEND
    |   'break' STMTEND
    |   'continue' STMTEND
    ;

STMTEND : NEWLINE+;

fragment NEWLINE   : '\r' '\n' | '\n' | '\r';

assignment_statement
    :   Identifier '=' expression
    ;

funccall_statement
    :   function_name '(' actual_parameter_list ')' STMTEND
    ;

actual_parameter_list
    :   actual_params?
    ;

actual_params
    :   Identifier ',' actual_params
    |   Identifier
    ;

scan_statement
    :   Identifier '=' 'scanInt' '(' IntegerLiteral ')'
    |   Identifier '=' 'scanDecimal' '(' FloatingPointLiteral ')'
    |   Identifier '=' 'scanString' '(' StringLiteral ')'
    ;

print_statement
    :   'print' '(' string_expression ')'
    |   'println' '(' string_expression ')'
    ;

return_statement
    :   'return' expression STMTEND
    ;

if_statement
    :   'if' '(' bool_expression ')' statement 'end' 'else' statement 'end'
    |   'if' '(' bool_expression ')' statement 'end'
    ;

while_statement
    :   'while' '(' bool_expression ')' statement 'end'
    ;

do_while_statement
    :   'do' 'while' '(' bool_expression ')' statement 'end'
    ;

for_statement
    :   'for' '(' assignment_statement ';' bool_expression ';' assignment_statement ')' statement 'end'
    ;

statement_list
    :   statement STMTEND statement_list?
    ;

// Expressions

expression
    :   string_expression
    |   num_expression
    |   bool_expression
    |   expression '(' actual_parameter_list ')'
    ;

string_expression
    :   string_identifier '+' string_expression
    |   StringLiteral '+' string_expression
    |   string_identifier
    |   StringLiteral
    ;

num_expression
    :   num_term '+' num_expression
    |   num_term '-' num_expression
    |   num_term
    ;

num_term
    :   num_factor '*' num_term
    |   num_factor '/' num_term
    |   num_factor '%' num_term
    |   num_factor
    ;

num_factor
    :   '(' num_expression ')'
    |   CharacterLiteral
    |   IntegerLiteral
    |   FloatingPointLiteral
    |   num_identifier
    ;

num_identifier
    :   Identifier
    ;

string_identifier
    :   Identifier
    ;

bool_expression
    :   num_expression rel_op num_expression
    |   string_expression '==' string_expression
    |   string_expression '!=' string_expression
    |   bool_logical '==' bool_expression
    |   bool_logical '!=' bool_expression
    |   bool_logical
    ;

rel_op
    :   '=='
    |   '!='
    |   '<='
    |   '>='
    |   '<'
    |   '>'
    ;

bool_logical
    :   bool_term 'or' bool_logical
    |   bool_term
    ;

bool_term
    :   bool_factor 'and' bool_term
    |   bool_factor
    ;

bool_factor
    :   '(' bool_logical ')'
    |   '!' bool_logical
    |   bool_identifier
    ;

bool_identifier
    :   Identifier
    ;

// Lexer

//Constants

constdecl_list
    :   const_statement constdecl_list?
    ;

const_statement
    :   'const' const_identifier '=' constant
    ;

const_identifier
    :   Identifier
    ;

constant
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    ;

// Keywords

VOID            : 'void';
SCANINT         : 'scanInt';
SCANDEC         : 'scanDecimal';
SCANSTR         : 'scanString';
PRINT           : 'print';
PRINTLN         : 'println';
RETURN          : 'return';
IF              : 'if';
ELSE            : 'else';
WHILE           : 'while';
DO              : 'do';
FOR             : 'for';
CONST           : 'const';
NULL            : 'null';

// Separators

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
END             : 'end';
COMMA           : ',';
DOT             : '.';

// ?3.12 Operators

ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : 'or';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
XOR_ASSIGN      : '^=';
MOD_ASSIGN      : '%=';
LSHIFT_ASSIGN   : '<<=';
RSHIFT_ASSIGN   : '>>=';
URSHIFT_ASSIGN  : '>>>=';

// Integer Literals

IntegerLiteral
    :   DecimalIntegerLiteral
    |   HexIntegerLiteral
    |   OctalIntegerLiteral
    |   BinaryIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;

fragment
OctalDigits
    :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;

// Boolean Literals

BooleanLiteral
    :   'true'
    |   'false'
    ;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator
    :   [pP]
    ;

// Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\\r]
    ;


// String Literals
StringLiteral
    :   '"' StringCharacters? '"'
    ;
fragment
StringCharacters
    :   StringCharacter+
    ;
fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;

// Escape Sequences for Character and String Literals
fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;

// Identifiers

Identifier
    :   Letter LetterOrDigit*
    ;

fragment
Letter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

fragment
LetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

//
// Whitespace and comments
//

WS  :  [ \t\r\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r]* -> channel(HIDDEN)
    ;
