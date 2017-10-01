grammar Moka;

//start point of program
program 
    :   constdecl_list funcdecl_list statement_list
    ;

//function declarations

funcdecl_list
    :   function_declaration funcdecl_list?
    ;

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
    :   letterplus
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
    :   var_decl statement_end vardecl_list
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
    :   identifier ',' identifier_list
    |   identifier
    ;

identifier
    :   Letter letter_or_digitplus subscript*
    ;

subscript
    :   '[' integer ']'?
    ;

//statements

statement
    :   assignment_statement statement_end
    |   funccall_statement statement_end
    |   if_statement statement_end
    |   while_statement statement_end
    |   do_while_statement statement_end
    |   for_statement statement_end
    |   return_statement statement_end
    |   print_statement statement_end
    |   scan_statement statement_end
    |   'break' statement_end
    |   'continue' statement_end
    ;

statement_end
    :   '\n'
    ;

assignment_statement
    :   identifier '=' expression
    ;

funccall_statement
    :   function_name '(' actual_parameter_list ')' statement_end
    ;

actual_parameter_list
    :   actual_params?
    ;

actual_params
    :   identifier ',' actual_params
    |   identifier
    ;

scan_statement
    :   identifier '=' 'scanInt' '(' integer ')'
    |   identifier '=' 'scanDecimal' '(' floating_point ')'
    |   identifier '=' 'scanString' '(' string ')'
    ;

print_statement
    :   'print' '(' string_expression ')'
    |   'println' '(' string_expression ')'
    ;

return_statement
    :   'return' expression statement_end
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
    :   statement statement_end statement_list?
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
    |   string '+' string_expression
    |   string_identifier
    |   string
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
    |   character
    |   integer
    |   floating_point
    |   num_identifier
    ;

num_identifier
    :   identifier
    ;

string_identifier
    :   identifier
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
    :   identifier
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
    :   Letter letter_or_digitplus
    ;

constant
    :   integer
    |   floating_point
    |   character
    |   string
    ;

integer
    :   sign digitsplus
    ;

sign
    :   '+'?
    |   '-'?
    ;

floating_point
    :   floating
    ;

floating
    :   digitsplus '.'
    |   '.' digitsplus
    |   digitsplus '.' digitsplus
    ;

character
    :   '\'' character '\''
    ;

string
    :   '"' ascii_charplus '"'
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

// Others

characters        
    :   ascii_char
    |   '\n'
    |   '\\'
    |   '\''
    |   '"'
    ;

ascii_charplus
    :   ascii_char ascii_charplus
    |   ascii_char
    ;

ascii_char
    :   Letter
    |   Digit
    ;

Letter
    :    [a-zA-Z$_]
    ;

Digit
    :   [0-9$_]
    ;

digitsplus
    :   Digit digitsplus
    |   Digit
    ;

letterplus
    :   Letter letterplus
    |   Letter
    ;

letter_or_digitplus
    :   Letter letter_or_digitplus
    |   Digit letter_or_digitplus
    ;