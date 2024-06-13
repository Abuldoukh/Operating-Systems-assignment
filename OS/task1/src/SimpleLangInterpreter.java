import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class SimpleLangInterpreter extends AbstractParseTreeVisitor<Integer> implements SimpleLangVisitor<Integer> {

    private final Map<String, SimpleLangParser.DecContext> global_funcs = new HashMap<>();
    private final Stack<Map<String, Integer>> frames = new Stack<>();

    public Integer visitProgram(SimpleLangParser.ProgContext ctx, String[] args)
    {

        for (int i = 0; i < ctx.dec().size(); ++i) {

            SimpleLangParser.DecContext dec = ctx.dec(i);
            SimpleLangParser.Typed_idfrContext typedIdfr = dec.typed_idfr(0);
            global_funcs.put(typedIdfr.Idfr().getText(), dec);

        }

        SimpleLangParser.DecContext main = global_funcs.get("main");

        Map<String, Integer> newFrame = new HashMap<>();
        for (int i = 0; i < args.length; ++i) {
            if (args[i].equals("true")) {
                newFrame.put(main.typed_idfr().get(i).Idfr().getText(), 1);
            } else if (args[i].equals("false")) {
                newFrame.put(main.typed_idfr().get(i).Idfr().getText(), 0);
            } else {
                newFrame.put(main.typed_idfr().get(i).Idfr().getText(), Integer.parseInt(args[i]));
            }
        }

        frames.push(newFrame);
        return visit(main);

    }

    @Override public Integer visitProg(SimpleLangParser.ProgContext ctx)
    {

        throw new RuntimeException("Should not be here!");

    }

    @Override public Integer visitDec(SimpleLangParser.DecContext ctx)
    {

        Integer returnValue = visit(ctx.body());
        frames.pop();
        return returnValue;

    }

    @Override public Integer visitTyped_idfr(SimpleLangParser.Typed_idfrContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

    @Override public Integer visitType(SimpleLangParser.TypeContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

    @Override public Integer visitBody(SimpleLangParser.BodyContext ctx) {

        Integer returnValue = null;
        for (int i = 0; i < ctx.ene.size(); ++i) {
            SimpleLangParser.ExpContext exp = ctx.ene.get(i);
            returnValue = visit(exp);
        }
        return returnValue;

    }

    @Override
    public Integer visitAppointVar(SimpleLangParser.AppointVarContext ctx) {
        String varName = ctx.typed_idfr().Idfr().getText();
        Integer value = visit(ctx.exp());
        frames.peek().put(varName, value);
        return value;
    }

    @Override public Integer visitBlock(SimpleLangParser.BlockContext ctx)
    {
        Integer returnValue = null;
        for (int i = 0; i < ctx.ene.size(); ++i) {
            SimpleLangParser.ExpContext exp = ctx.ene.get(i);
            returnValue = visit(exp);
        }
        return returnValue;
    }

    @Override public Integer visitAssignExpr(SimpleLangParser.AssignExprContext ctx)
    {

        String varName = ctx.Idfr().getText();
        Integer value = visit(ctx.exp());
        frames.peek().put(varName, value);
        return null;

    }

    @Override
    public Integer visitRepeatExpression(SimpleLangParser.RepeatExpressionContext ctx) {
        do {
            visit(ctx.block());
        } while (visit(ctx.exp()) == 0);
        return null;
    }

    @Override public Integer visitBinOpExpr(SimpleLangParser.BinOpExprContext ctx) {

        Integer operand1 = visit(ctx.exp(0));
        Integer operand2 = visit(ctx.exp(1));

        switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()) {
            case SimpleLangParser.Eq:
                return (Objects.equals(operand1, operand2)) ? 1 : 0;
            case SimpleLangParser.Less:
                return (operand1 < operand2) ? 1 : 0;
            case SimpleLangParser.LessEq:
                return (operand1 <= operand2) ? 1 : 0;
            case SimpleLangParser.Plus:
                return operand1 + operand2;
            case SimpleLangParser.Minus:
                return operand1 - operand2;
            case SimpleLangParser.Times:
                return operand1 * operand2;
            case SimpleLangParser.And:
                return (operand1 != 0 && operand2 != 0) ? 1 : 0;
            case SimpleLangParser.Or:
                return (operand1 != 0 || operand2 != 0) ? 1 : 0;
            case SimpleLangParser.Divide:
                if (operand2 == 0) return null;
                return operand1 / operand2;
            case SimpleLangParser.Greater:
                return (operand1 > operand2) ? 1 : 0;
            case SimpleLangParser.GreaterEq:
                return (operand1 >= operand2) ? 1 : 0;
            case SimpleLangParser.XOR:
                return (operand1 != 0 ^ operand2 != 0) ? 1 : 0;
            default:
                throw new RuntimeException("Unsupported binary operator.");
        }


    }
    @Override public Integer visitInvokeExpr(SimpleLangParser.InvokeExprContext ctx)
    {

        SimpleLangParser.DecContext dec = global_funcs.get(ctx.Idfr().getText());

        if (dec == null) {
            throw new RuntimeException("Function not defined.");
        }
        Map<String, Integer> newFrame = new HashMap<>();


        if (ctx.args != null && ctx.args.size() == dec.vardec.size()) {

            for (int i = 0; i < ctx.args.size(); i++) {
                SimpleLangParser.ExpContext arg = ctx.args.get(i);
                SimpleLangParser.Typed_idfrContext param = dec.vardec.get(i);

                newFrame.put(param.Idfr().getText(), visit(arg));
            }
        } else if (ctx.args != null) {
            throw new RuntimeException("Incorrect number of arguments for function");
        }


        frames.push(newFrame);
        Integer result = visit(dec.body());
        frames.pop();
        return result;

    }

    @Override
    public Integer visitSkipExpression(SimpleLangParser.SkipExpressionContext ctx) {
        return null;
    }

    @Override public Integer visitBlockExpr(SimpleLangParser.BlockExprContext ctx) {
        return visit(ctx.block());
    }

    @Override public Integer visitIfExpr(SimpleLangParser.IfExprContext ctx)
    {

        SimpleLangParser.ExpContext cond = ctx.exp();
        Integer condValue = visit(cond);
        if (condValue > 0) {

            SimpleLangParser.BlockContext thenBlock = ctx.block(0);
            return visit(thenBlock);

        } else {

            SimpleLangParser.BlockContext elseBlock = ctx.block(1);
            return visit(elseBlock);

        }

    }

    @Override
    public Integer visitParenExprParen(SimpleLangParser.ParenExprParenContext ctx) {
        return visit(ctx.exp());
    }

    @Override public Integer visitPrintExpr(SimpleLangParser.PrintExprContext ctx) {

        SimpleLangParser.ExpContext exp = ctx.exp();
        if (exp instanceof SimpleLangParser.SpaceExprContext) {
            System.out.print(" ");
        } else if (exp instanceof SimpleLangParser.ExprNewLineContext) {
            System.out.println();
        } else {
            System.out.print(visit(exp));
        }
        return null;

    }

    @Override public Integer visitSpaceExpr(SimpleLangParser.SpaceExprContext ctx) {
        System.out.print(" ");
        return null;
    }

    @Override
    public Integer visitNoParen(SimpleLangParser.NoParenContext ctx) {
        return null;
    }

    @Override public Integer visitIdExpr(SimpleLangParser.IdExprContext ctx)
    {
        return frames.peek().get(ctx.Idfr().getText());
    }

    @Override
    public Integer visitExprNewLine(SimpleLangParser.ExprNewLineContext ctx) {
        System.out.println();
        return null;
    }

    @Override
    public Integer visitBoollitExpr(SimpleLangParser.BoollitExprContext ctx) {
        return ctx.BoolLit().getText().equals("true") ? 1 : 0;
    }

    @Override
    public Integer visitWhileExpression(SimpleLangParser.WhileExpressionContext ctx) {
        return null;
    }

    @Override public Integer visitIntExpr(SimpleLangParser.IntExprContext ctx)
    {

        return Integer.parseInt(ctx.IntLit().getText());

    }
    @Override public Integer visitEqBinop(SimpleLangParser.EqBinopContext ctx) {
        throw new RuntimeException("Should not be here!");
    }
    @Override public Integer visitLessBinop(SimpleLangParser.LessBinopContext ctx) {
        throw new RuntimeException("Should not be here!");
    }
    @Override public Integer visitLessEqBinop(SimpleLangParser.LessEqBinopContext ctx) {
        throw new RuntimeException("Should not be here!");
    }
    @Override public Integer visitPlusBinop(SimpleLangParser.PlusBinopContext ctx) {
        throw new RuntimeException("Should not be here!");
    }
    @Override public Integer visitMinusBinop(SimpleLangParser.MinusBinopContext ctx) {
        throw new RuntimeException("Should not be here!");
    }
    @Override public Integer visitTimesBinop(SimpleLangParser.TimesBinopContext ctx) {
        throw new RuntimeException("Should not be here!");
    }

    @Override
    public Integer visitAndBinop(SimpleLangParser.AndBinopContext ctx) {
        return null;
    }

    @Override
    public Integer visitOrBinop(SimpleLangParser.OrBinopContext ctx) {
        return null;
    }

    @Override
    public Integer visitDivideBinop(SimpleLangParser.DivideBinopContext ctx) {
        return null;
    }

    @Override
    public Integer visitGreaterBinop(SimpleLangParser.GreaterBinopContext ctx) {
        return null;
    }

    @Override
    public Integer visitGreaterEqBinop(SimpleLangParser.GreaterEqBinopContext ctx) {
        return null;
    }

    @Override
    public Integer visitXORBinop(SimpleLangParser.XORBinopContext ctx) {
        return null;
    }

}