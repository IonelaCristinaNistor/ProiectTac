# Generated from Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#start_.
    def enterStart_(self, ctx:ExprParser.Start_Context):
        pass

    # Exit a parse tree produced by ExprParser#start_.
    def exitStart_(self, ctx:ExprParser.Start_Context):
        pass


    # Enter a parse tree produced by ExprParser#expr.
    def enterExpr(self, ctx:ExprParser.ExprContext):
        pass

    # Exit a parse tree produced by ExprParser#expr.
    def exitExpr(self, ctx:ExprParser.ExprContext):
        pass


    # Enter a parse tree produced by ExprParser#logicalExpr.
    def enterLogicalExpr(self, ctx:ExprParser.LogicalExprContext):
        pass

    # Exit a parse tree produced by ExprParser#logicalExpr.
    def exitLogicalExpr(self, ctx:ExprParser.LogicalExprContext):
        pass


    # Enter a parse tree produced by ExprParser#relationalExpr.
    def enterRelationalExpr(self, ctx:ExprParser.RelationalExprContext):
        pass

    # Exit a parse tree produced by ExprParser#relationalExpr.
    def exitRelationalExpr(self, ctx:ExprParser.RelationalExprContext):
        pass


    # Enter a parse tree produced by ExprParser#additiveExpr.
    def enterAdditiveExpr(self, ctx:ExprParser.AdditiveExprContext):
        pass

    # Exit a parse tree produced by ExprParser#additiveExpr.
    def exitAdditiveExpr(self, ctx:ExprParser.AdditiveExprContext):
        pass


    # Enter a parse tree produced by ExprParser#multiplicativeExpr.
    def enterMultiplicativeExpr(self, ctx:ExprParser.MultiplicativeExprContext):
        pass

    # Exit a parse tree produced by ExprParser#multiplicativeExpr.
    def exitMultiplicativeExpr(self, ctx:ExprParser.MultiplicativeExprContext):
        pass


    # Enter a parse tree produced by ExprParser#unaryExpr.
    def enterUnaryExpr(self, ctx:ExprParser.UnaryExprContext):
        pass

    # Exit a parse tree produced by ExprParser#unaryExpr.
    def exitUnaryExpr(self, ctx:ExprParser.UnaryExprContext):
        pass


    # Enter a parse tree produced by ExprParser#primaryExpr.
    def enterPrimaryExpr(self, ctx:ExprParser.PrimaryExprContext):
        pass

    # Exit a parse tree produced by ExprParser#primaryExpr.
    def exitPrimaryExpr(self, ctx:ExprParser.PrimaryExprContext):
        pass



del ExprParser