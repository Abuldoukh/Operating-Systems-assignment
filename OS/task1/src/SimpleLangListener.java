// Generated from C:/Users/Ahmad/Desktop/compliers coursework/123456 (1)/123456/task1/src/SimpleLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLangParser}.
 */
public interface SimpleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(SimpleLangParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(SimpleLangParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#typed_idfr}.
	 * @param ctx the parse tree
	 */
	void enterTyped_idfr(SimpleLangParser.Typed_idfrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#typed_idfr}.
	 * @param ctx the parse tree
	 */
	void exitTyped_idfr(SimpleLangParser.Typed_idfrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SimpleLangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SimpleLangParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#appointVar}.
	 * @param ctx the parse tree
	 */
	void enterAppointVar(SimpleLangParser.AppointVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#appointVar}.
	 * @param ctx the parse tree
	 */
	void exitAppointVar(SimpleLangParser.AppointVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(SimpleLangParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(SimpleLangParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExprParen}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenExprParen(SimpleLangParser.ParenExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExprParen}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenExprParen(SimpleLangParser.ParenExprParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(SimpleLangParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(SimpleLangParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNewLine}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExprNewLine(SimpleLangParser.ExprNewLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNewLine}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExprNewLine(SimpleLangParser.ExprNewLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoollitExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBoollitExpr(SimpleLangParser.BoollitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoollitExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBoollitExpr(SimpleLangParser.BoollitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileExpression}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpression(SimpleLangParser.WhileExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileExpression}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpression(SimpleLangParser.WhileExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpaceExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSpaceExpr(SimpleLangParser.SpaceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpaceExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSpaceExpr(SimpleLangParser.SpaceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoParen}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNoParen(SimpleLangParser.NoParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoParen}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNoParen(SimpleLangParser.NoParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(SimpleLangParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(SimpleLangParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr(SimpleLangParser.BlockExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr(SimpleLangParser.BlockExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(SimpleLangParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(SimpleLangParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatExpression}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRepeatExpression(SimpleLangParser.RepeatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatExpression}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRepeatExpression(SimpleLangParser.RepeatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvokeExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInvokeExpr(SimpleLangParser.InvokeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvokeExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInvokeExpr(SimpleLangParser.InvokeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SkipExpression}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSkipExpression(SimpleLangParser.SkipExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SkipExpression}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSkipExpression(SimpleLangParser.SkipExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinOpExpr(SimpleLangParser.BinOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinOpExpr(SimpleLangParser.BinOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(SimpleLangParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(SimpleLangParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterEqBinop(SimpleLangParser.EqBinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitEqBinop(SimpleLangParser.EqBinopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterLessBinop(SimpleLangParser.LessBinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitLessBinop(SimpleLangParser.LessBinopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessEqBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterLessEqBinop(SimpleLangParser.LessEqBinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEqBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitLessEqBinop(SimpleLangParser.LessEqBinopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterPlusBinop(SimpleLangParser.PlusBinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitPlusBinop(SimpleLangParser.PlusBinopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterMinusBinop(SimpleLangParser.MinusBinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitMinusBinop(SimpleLangParser.MinusBinopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimesBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterTimesBinop(SimpleLangParser.TimesBinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimesBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitTimesBinop(SimpleLangParser.TimesBinopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterAndBinop(SimpleLangParser.AndBinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitAndBinop(SimpleLangParser.AndBinopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterOrBinop(SimpleLangParser.OrBinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitOrBinop(SimpleLangParser.OrBinopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterDivideBinop(SimpleLangParser.DivideBinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitDivideBinop(SimpleLangParser.DivideBinopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterGreaterBinop(SimpleLangParser.GreaterBinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitGreaterBinop(SimpleLangParser.GreaterBinopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEqBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqBinop(SimpleLangParser.GreaterEqBinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEqBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqBinop(SimpleLangParser.GreaterEqBinopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XORBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterXORBinop(SimpleLangParser.XORBinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XORBinop}
	 * labeled alternative in {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitXORBinop(SimpleLangParser.XORBinopContext ctx);
}