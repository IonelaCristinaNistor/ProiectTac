from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser

token_names = {
    1: 'NUMBER',
    4: 'IDENTIFIER',
    14: 'ADD',
    15: 'SUB',
    16: 'MUL',
    17: 'DIV',
    20: 'LPAREN',
    21: 'RPAREN',
    14: 'PLUS',
    13: 'MINUS',
    8: 'ASSIGN'
}


class SimpleVisitor(ParseTreeVisitor):
    def visitTerminal(self, node):
        token = node.getSymbol()
        token_type = token.type
        token_name = token_names.get(token_type, f"Unknown ({token_type})")
        print(f"Token: {token.text} (Tip: {token_name})")

    def visit(self, tree):
        return super().visit(tree)

def evaluate_expr(expression):
    lexer = ExprLexer(InputStream(expression))
    stream = CommonTokenStream(lexer)
    parser = ExprParser(stream)
    tree = parser.expr()
    visitor = SimpleVisitor()
    visitor.visit(tree)


exprs = [
    "1 + 2 * 3",
    "a - b / 4",
    "5 * (6 + 7)",
    "(10 + 20) / 5",
    "1 + 2 == 3"
]

for expr in exprs:
    print(f"Evaluând expresia: {expr}")
    evaluate_expr(expr)
    print("=" * 40)
