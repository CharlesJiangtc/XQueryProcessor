grammar Xpath;

ap
    : doc '/' rp            #ap_children
    | doc '//' rp           #ap_all
    ;

doc : 'doc' '(“' filename '”)';

filename : FILE;

FILE : [a-zA-Z0-9,.!?; _'"-] + '.xml';

rp
    : NAME                  #rp_tagName
    | '*'                   #rp_descendant
    | '.'                   #rp_sibling
    | '..'                  #rp_parent
    | TEXT                  #rp_txt
    | '@' NAME              #rp_attName
    | '(' rp ')'            #rp_self
    | rp '/' rp             #rp_children
    | rp '//' rp            #rp_all
    | rp '[' filter ']'     #rp_filter
    | rp ',' rp             #rp_merge
    ;

NAME : [a-zA-Z0-9]+;

TEXT : 'text()';

filter
    :   rp                  #filter_rp
    |   rp '=' rp           #filter_equal
    |   rp 'eq' rp          #filter_equal
    |   rp '==' rp          #filter_is
    |   rp 'is' rp          #filter_is
    |   '(' filter ')'      #filter_parent
    |   filter 'and' filter #filter_and
    |   filter 'or' filter  #filter_or
    |   'not' filter        #filter_not
    ;

SK  : [ \t\r\n]+ -> skip;