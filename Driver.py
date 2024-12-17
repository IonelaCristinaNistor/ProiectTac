from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from ExprVisitor import ExprVisitor

class EvalVisitor(ExprVisitor):
    def visitExpr(self, ctx):
        return self.visit(ctx.logicalExpr())

    def visitLogicalExpr(self, ctx):
        if ctx.getChildCount() == 1:
            return self.visit(ctx.relationalExpr())
        left = self.visit(ctx.relationalExpr())
        children = list(ctx.getChildren())
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
        children = list(ctx.getChildren())
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
        print(f"Visit AdditiveExpr: {ctx.getText()}")
        if ctx.getChildCount() == 1:
            result = self.visit(ctx.multiplicativeExpr())
            print(f"Rezultatul: {result}")
            return result
        left = self.visit(ctx.multiplicativeExpr(0))
        for i in range(1, len(ctx.multiplicativeExpr())):
            right = self.visit(ctx.multiplicativeExpr(i))
            op = ctx.getChild(2 * i - 1).getText()
            print(f"Stânga: {left}, Dreapta: {right}, Operator: {op}")
            if op == '+':
                left = left + right
            elif op == '-':
                left = left - right
        print(f"Rezultatul final: {left}")
        return left

    def visitMultiplicativeExpr(self, ctx):
        if ctx.getChildCount() == 1:
            return self.visit(ctx.unaryExpr())
        left = self.visit(ctx.unaryExpr())
        children = list(ctx.getChildren())
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
            result = float(ctx.NUMBER().getText())
            print(f"PrimaryExpr NUMĂR: {ctx.getText()} => {result}")
            return result
        elif ctx.BOOLEAN():
            result = ctx.BOOLEAN().getText() == 'true'
            print(f"PrimaryExpr BOOLEAN: {ctx.getText()} => {result}")
            return result
        elif ctx.expr():
            result = self.visit(ctx.expr())
            print(f"PrimaryExpr expresie imbricată: {ctx.getText()} => {result}")
            return result
        else:
            print(f"PrimaryExpr neprocesat: {ctx.getText()}")
            return None


# Funcție pentru evaluarea unei expresii
def evaluate_expr(expression):
    lexer = ExprLexer(InputStream(expression))
    tokens = CommonTokenStream(lexer)
    parser = ExprParser(tokens)
    tree = parser.start_()  # Parsează regula de start
    visitor = EvalVisitor()
    return visitor.visit(tree)

# Expresii de test
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

for expr in exprs:
    result_expr = evaluate_expr(expr)
    print(f"expr: {expr} => {bool(result_expr)}")
