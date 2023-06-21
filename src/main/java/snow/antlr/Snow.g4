grammar Snow;

options { caseInsensitive = true; }

@header {
package snow.parser;
}

querySpecification
    : SELECT selectElements
      fromClause groupByClause? orderByClause? limitClause?
    ;

selectElements
    : (allColumns | selectElement ) (',' selectElement)*
    ;

selectElement
    : columnName (AS? columnAlias)?
    | functionCall (AS? columnAlias)?
    ;

functionCall
    : (AVG | MAX | MIN | SUM) '('  columnName ')'
    | COUNT '(' (allColumns | columnName) ')'
    ;

fromClause: (FROM tableName)? (WHERE expression)? ;

groupByClause: GROUP BY columnName (',' columnName)* ;

orderByClause: ORDER BY columnName (',' columnName)* ;

limitClause
    : LIMIT ((offset ',')? limit | limit OFFSET offset) ;

expression
    : (NOT | '!')? predicate
    | expression ( AND | XOR | OR ) expression
    ;

predicate
    : columnName comparisonOperator value
    | columnName IS NOT? NULL
    | columnName NOT? IN '(' (value ',')* value ')'
    | columnName NOT? BETWEEN value AND value
    | columnName NOT? LIKE value
    ;


uid:                    ID_LITERAL ;
tableName:              ID_LITERAL ;
columnName:             ID_LITERAL ;
columnAlias
    : ID_LITERAL
    | keywordsCanBeId
    ;
allColumns:             '*' ;
value:                  STRING_LITERAL ;
limit:                  DEC_DIGIT ;
offset:                 DEC_DIGIT ;
comparisonOperator:     '=' | '>' | '<' | '<=' | '>=' | '<>' | '!=' ;

keywordsCanBeId
    : AS | AND | AVG | BETWEEN | BY | COUNT | FROM | GROUP | HAVING | IN | IS
    | LIKE | LIMIT | MAX | MIN | NOT | NULL | OFFSET | OR | ORDER | SELECT | SUM
    | WHERE | XOR
    ;

// keyword
AS:                     'AS' ;
AND:                    'AND' ;
AVG:                    'AVG' ;
BETWEEN:                'BETWEEN' ;
BY:                     'BY' ;
COUNT:                  'COUNT' ;
FROM:                   'FROM' ;
GROUP:                  'GROUP' ;
HAVING:                 'HAVING' ;
IN:                     'IN' ;
IS:                     'IS' ;
LIKE:                   'LIKE' ;
LIMIT:                  'LIMIT' ;
MAX:                    'MAX' ;
MIN:                    'MIN' ;
NOT:                    'NOT' ;
NULL:                   'NULL' ;
OFFSET:                 'OFFSET' ;
OR:                     'OR' ;
ORDER:                  'ORDER' ;
SELECT:                 'SELECT' ;
SUM:                    'SUM' ;
WHERE:                  'WHERE' ;
XOR:                    'XOR' ;

// regex
ID_LITERAL:             [A-Z_$0-9\u0080-\uFFFF]*?[A-Z_$\u0080-\uFFFF]+?[A-Z_$0-9\u0080-\uFFFF]* ;
DEC_DIGIT:              [0-9]+ ;
STRING_LITERAL:         DQUOTA_STRING | SQUOTA_STRING | BQUOTA_STRING ;
DQUOTA_STRING:          '"' ( '\\'. | '""' | ~('"'| '\\') )* '"' ;
SQUOTA_STRING:          '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'' ;
BQUOTA_STRING:          '`' ( '\\'. | '``' | ~('`'|'\\'))* '`' ;

// skip
SPACE:                  [ \t\r\n]+    -> channel(HIDDEN);
COMMENT_INPUT:          '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT:           (
                          ('--' [ \t]* | '#') ~[\r\n]* ('\r'? '\n' | EOF)
                          | '--' ('\r'? '\n' | EOF)
                        ) -> channel(HIDDEN);
