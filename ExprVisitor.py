# Generated from Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete generic visitor for a parse tree produced by ExprParser.

class ExprVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ExprParser#start_.
    def visitStart_(self, ctx:ExprParser.Start_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#expr.
    def visitExpr(self, ctx:ExprParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#logicalExpr.
    def visitLogicalExpr(self, ctx:ExprParser.LogicalExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#relationalExpr.
    def visitRelationalExpr(self, ctx:ExprParser.RelationalExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#additiveExpr.
    def visitAdditiveExpr(self, ctx:ExprParser.AdditiveExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#multiplicativeExpr.
    def visitMultiplicativeExpr(self, ctx:ExprParser.MultiplicativeExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#unaryExpr.
    def visitUnaryExpr(self, ctx:ExprParser.UnaryExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#primaryExpr.
    def visitPrimaryExpr(self, ctx:ExprParser.PrimaryExprContext):
        return self.visitChildren(ctx)



del ExprParser