grammar SimpleLang;

prog : dec+ EOF;

dec
    : typed_idfr LParen (vardec+=typed_idfr(Comma vardec+=typed_idfr)*)? RParen body

;



typed_idfr
    : type Idfr
;

type
    : IntType | BoolType | UnitType
;

body
    : LBrace (appointVar Semicolon)* ene+=exp (Semicolon ene+=exp)* RBrace
;



appointVar
    :typed_idfr Assign exp
;

block
    : LBrace ene+=exp (Semicolon ene+=exp)* RBrace
;

exp
    : Idfr Assign exp                                       #AssignExpr
    | LParen exp binop exp RParen                           #BinOpExpr
    | Idfr LParen (args+=exp (Comma args+=exp)*)? RParen    #InvokeExpr
    | block                                                 #BlockExpr
    | Skip                                                  #SkipExpression
    | If exp Then block Else block                          #IfExpr
    | Repeat block Until exp                                #RepeatExpression
    | Print exp                                             #PrintExpr
    | While exp Do block                                    #WhileExpression
    | exp binop exp                                         #NoParen
    | LParen exp RParen                                     #ParenExprParen
    | Space                                                 #SpaceExpr
    | Idfr                                                  #IdExpr
    | NewLine                                               #ExprNewLine
    | IntLit                                                #IntExpr
    | BoolLit                                               #BoollitExpr
;

binop
    : Eq              #EqBinop
    | Less            #LessBinop
    | LessEq          #LessEqBinop
    | Plus            #PlusBinop
    | Minus           #MinusBinop
    | Times           #TimesBinop
    | And             #AndBinop
    | Or              #OrBinop
    | Divide          #DivideBinop
    | Greater         #GreaterBinop
    | GreaterEq       #GreaterEqBinop
    | XOR             #XORBinop

;

LParen : '(' ;
Comma : ',' ;
RParen : ')' ;
LBrace : '{' ;
Semicolon : ';' ;
RBrace : '}' ;

Eq : '==' ;
Less : '<' ;
LessEq : '<=' ;

Plus : '+' ;
Times : '*' ;
Minus : '-' ;

Assign : ':=' ;
While:'while';
Do: 'do';
And:'&';
Or:'||';
Divide:'/';
Greater:'>';
GreaterEq:'>=';
XOR: '^';


Print : 'print' ;
Space : 'space' ;
NewLine : 'newline' ;
If : 'if' ;
Then : 'then' ;
Else : 'else' ;
Skip: 'skip';
Repeat:'repeat';
Until: 'until';

IntType : 'int' ;
BoolType : 'bool' ;
UnitType : 'unit' ;

BoolLit : 'true' | 'false' ;
IntLit : '0' | ('-'? [1-9][0-9]*) ;
Idfr : [a-z][A-Za-z0-9_]* ;
WS : [ \n\r\t]+ -> skip ;
