// Generated from c:/Users/nisto/PycharmProjects/Proiect TAC/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#start_}.
	 * @param ctx the parse tree
	 */
	void enterStart_(ExprParser.Start_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#start_}.
	 * @param ctx the parse tree
	 */
	void exitStart_(ExprParser.Start_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(ExprParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(ExprParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(ExprParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(ExprParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(ExprParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(ExprParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(ExprParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(ExprParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(ExprParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(ExprParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(ExprParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(ExprParser.PrimaryExprContext ctx);
}