import sys
from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from ExprVisitor import ExprVisitor

# Custom visitor for evaluating expressions
class EvalVisitor(ExprVisitor):
    def visitExpr(self, ctx):
        # Process the logical expression
        return self.visit(ctx.logicalExpr())

    def visitLogicalExpr(self, ctx):
        if ctx.getChildCount() == 1:
            return self.visit(ctx.relationalExpr())
        # Convert the children to a list
        left = self.visit(ctx.relationalExpr())
        children = list(ctx.getChildren())  # Convert generator to a list
        for i in range(1, len(children) // 2 + 1):
            op = children[2 * i - 1].getText()
            right = self.visit(ctx.relationalExpr())
            if op == '&&':
                left = left and right
            elif op == '||':
                left = left or right
        return left

    def visitRelationalExpr(self, ctx):
        if ctx.getChildCount() == 1:
            return self.visit(ctx.additiveExpr())
        left = self.visit(ctx.additiveExpr())
        children = list(ctx.getChildren())  # Convert generator to a list
        for i in range(1, len(children) // 2 + 1):
            op = children[2 * i - 1].getText()
            right = self.visit(ctx.additiveExpr())
            if op == '==':
                left = left == right
            elif op == '!=':
                left = left != right
            elif op == '<':
                left = left < right
            elif op == '<=':
                left = left <= right
            elif op == '>':
                left = left > right
            elif op == '>=':
                left = left >= right
        return left

    def visitAdditiveExpr(self, ctx):
        print(f"Visiting AdditiveExpr: {ctx.getText()}")
        if ctx.getChildCount() == 1:
            result = self.visit(ctx.multiplicativeExpr())
            print(f"Result: {result}")
            return result
        left = self.visit(ctx.multiplicativeExpr(0))
        for i in range(1, len(ctx.multiplicativeExpr())):
            right = self.visit(ctx.multiplicativeExpr(i))
            op = ctx.getChild(2 * i - 1).getText()
            print(f"Left: {left}, Right: {right}, Operator: {op}")
            if op == '+':
                left = left + right
            elif op == '-':
                left = left - right
        print(f"Final Result: {left}")
        return left

    def visitMultiplicativeExpr(self, ctx):
        if ctx.getChildCount() == 1:
            return self.visit(ctx.unaryExpr())
        left = self.visit(ctx.unaryExpr())
        children = list(ctx.getChildren())  # Convert generator to a list
        for i in range(1, len(children) // 2 + 1):
            op = children[2 * i - 1].getText()
            right = self.visit(ctx.unaryExpr())
            if op == '*':
                left = left * right
            elif op == '/':
                left = left / right
            elif op == '%':
                left = left % right
        return left

    def visitUnaryExpr(self, ctx):
        if ctx.getChildCount() == 1:
            return self.visit(ctx.primaryExpr())
        op = ctx.getChild(0).getText()
        value = self.visit(ctx.primaryExpr())
        if op == '-':
            return -value
        elif op == '+':
            return value
        elif op == '!':
            return not value

    def visitPrimaryExpr(self, ctx):
        if ctx.NUMBER():
            return float(ctx.NUMBER().getText())
        elif ctx.BOOLEAN():
            return ctx.BOOLEAN().getText() == 'true'
        elif ctx.STRING():
            return ctx.STRING().getText()
        elif ctx.expr():
            return self.visit(ctx.expr())

# Function to evaluate an expression
def evaluate_expr(expression):
    lexer = ExprLexer(InputStream(expression))
    tokens = CommonTokenStream(lexer)
    parser = ExprParser(tokens)
    tree = parser.start_()  # Parse the start rule
    visitor = EvalVisitor()
    return visitor.visit(tree)

# Test expressions
exprs = [
    "1 + 2 * (3 - 4) && true",
    "5 + 3 * 2 || false",
    "10 == 10 && false",
    "3 * (2 + 2) == 12",
    "1 + 2 * (3 - 4) || true",
    "3 > 2 && 5 <= 6",
    "3 < 2 || 5 == 5",
    "false && 5 == 5"
]

# Evaluate each expression
for expr in exprs:
    result = evaluate_expr(expr)
    print(f"expr: {expr} => {result}")
