grammar Xpath;


TAGNAME : [a-zA-Z_]+;

ATTRIBNAME:  [a-zA-Z0-9_]+;

STRING: ["][ a-zA-Z0-9]*["];

TEXT : 'text()';

WS  : [ \t\r\n]+ -> skip;

doc : 'doc' '(''"' filename '"'')';

filename : FILE;

FILE : [a-zA-Z0-9_] + '.xml';

ap
    : doc '/' rp            #ap_children
    | doc '//' rp           #ap_all
    ;

rp
    : TAGNAME               #rp_tagName
    | '*'                   #rp_descendant
    | '.'                   #rp_sibling
    | '..'                  #rp_parent
    | TEXT                  #rp_txt
    | '@' ATTRIBNAME        #rp_attName
    | '(' rp ')'            #rp_self
    | rp '/' rp             #rp_children
    | rp '//' rp            #rp_all
    | rp '[' filter ']'     #rp_filter
    | rp ',' rp             #rp_merge
    ;

filter
    :   rp                  #filter_rp
    |   rp '=' rp           #filter_equal
    |   rp 'eq' rp          #filter_equal
    |   rp '==' rp          #filter_is
    |   rp 'is' rp          #filter_is
    |   '(' filter ')'      #filter_parent
    |   rp '=' STRING       #filter_txt
    |   filter 'and' filter #filter_and
    |   filter 'or' filter  #filter_or
    |   'not' filter        #filter_not
    ;
