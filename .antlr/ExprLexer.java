// Generated from c:/Users/nisto/PycharmProjects/Proiect TAC/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, BOOLEAN=2, STRING=3, IDENTIFIER=4, ESC=5, AND=6, OR=7, EQ=8, 
		NEQ=9, LT=10, LTE=11, GT=12, GTE=13, ADD=14, SUB=15, MUL=16, DIV=17, MOD=18, 
		NOT=19, LPAREN=20, RPAREN=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "BOOLEAN", "STRING", "IDENTIFIER", "ESC", "AND", "OR", "EQ", 
			"NEQ", "LT", "LTE", "GT", "GTE", "ADD", "SUB", "MUL", "DIV", "MOD", "NOT", 
			"LPAREN", "RPAREN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'&&'", "'||'", "'=='", "'!='", "'<'", 
			"'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "BOOLEAN", "STRING", "IDENTIFIER", "ESC", "AND", "OR", 
			"EQ", "NEQ", "LT", "LTE", "GT", "GTE", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"NOT", "LPAREN", "RPAREN", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4:
			ESC_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ESC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			4
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0004\u0000/\b\u0000\u000b\u0000"+
		"\f\u00000\u0001\u0000\u0001\u0000\u0004\u00005\b\u0000\u000b\u0000\f\u0000"+
		"6\u0003\u00009\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"D\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002"+
		"\f\u0002L\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005"+
		"\u0003R\b\u0003\n\u0003\f\u0003U\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u0085\b\u0015\u000b\u0015"+
		"\f\u0015\u0086\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0007\u0001\u0000"+
		"09\u0002\u0000\"\"\\\\\u0003\u0000AZ__az\u0004\u000009AZ__az\u0007\u0000"+
		"\"\"\\\\bbffnnrrtt\u0003\u000009AFaf\u0003\u0000\t\n\r\r  \u0092\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0001.\u0001\u0000\u0000\u0000\u0003C"+
		"\u0001\u0000\u0000\u0000\u0005E\u0001\u0000\u0000\u0000\u0007O\u0001\u0000"+
		"\u0000\u0000\tV\u0001\u0000\u0000\u0000\u000b]\u0001\u0000\u0000\u0000"+
		"\r`\u0001\u0000\u0000\u0000\u000fc\u0001\u0000\u0000\u0000\u0011f\u0001"+
		"\u0000\u0000\u0000\u0013i\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000"+
		"\u0000\u0017n\u0001\u0000\u0000\u0000\u0019p\u0001\u0000\u0000\u0000\u001b"+
		"s\u0001\u0000\u0000\u0000\u001du\u0001\u0000\u0000\u0000\u001fw\u0001"+
		"\u0000\u0000\u0000!y\u0001\u0000\u0000\u0000#{\u0001\u0000\u0000\u0000"+
		"%}\u0001\u0000\u0000\u0000\'\u007f\u0001\u0000\u0000\u0000)\u0081\u0001"+
		"\u0000\u0000\u0000+\u0084\u0001\u0000\u0000\u0000-/\u0007\u0000\u0000"+
		"\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u000018\u0001\u0000\u0000\u000024\u0005"+
		".\u0000\u000035\u0007\u0000\u0000\u000043\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"79\u0001\u0000\u0000\u000082\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009\u0002\u0001\u0000\u0000\u0000:;\u0005t\u0000\u0000;<\u0005r\u0000"+
		"\u0000<=\u0005u\u0000\u0000=D\u0005e\u0000\u0000>?\u0005f\u0000\u0000"+
		"?@\u0005a\u0000\u0000@A\u0005l\u0000\u0000AB\u0005s\u0000\u0000BD\u0005"+
		"e\u0000\u0000C:\u0001\u0000\u0000\u0000C>\u0001\u0000\u0000\u0000D\u0004"+
		"\u0001\u0000\u0000\u0000EJ\u0005\"\u0000\u0000FI\u0003\t\u0004\u0000G"+
		"I\b\u0001\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000"+
		"IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KM\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\"\u0000"+
		"\u0000N\u0006\u0001\u0000\u0000\u0000OS\u0007\u0002\u0000\u0000PR\u0007"+
		"\u0003\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\b\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000V[\u0005\\\u0000\u0000W\\\u0007\u0004"+
		"\u0000\u0000XY\u0005u\u0000\u0000YZ\u0007\u0005\u0000\u0000Z\\\u0006\u0004"+
		"\u0000\u0000[W\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000\\\n\u0001"+
		"\u0000\u0000\u0000]^\u0005&\u0000\u0000^_\u0005&\u0000\u0000_\f\u0001"+
		"\u0000\u0000\u0000`a\u0005|\u0000\u0000ab\u0005|\u0000\u0000b\u000e\u0001"+
		"\u0000\u0000\u0000cd\u0005=\u0000\u0000de\u0005=\u0000\u0000e\u0010\u0001"+
		"\u0000\u0000\u0000fg\u0005!\u0000\u0000gh\u0005=\u0000\u0000h\u0012\u0001"+
		"\u0000\u0000\u0000ij\u0005<\u0000\u0000j\u0014\u0001\u0000\u0000\u0000"+
		"kl\u0005<\u0000\u0000lm\u0005=\u0000\u0000m\u0016\u0001\u0000\u0000\u0000"+
		"no\u0005>\u0000\u0000o\u0018\u0001\u0000\u0000\u0000pq\u0005>\u0000\u0000"+
		"qr\u0005=\u0000\u0000r\u001a\u0001\u0000\u0000\u0000st\u0005+\u0000\u0000"+
		"t\u001c\u0001\u0000\u0000\u0000uv\u0005-\u0000\u0000v\u001e\u0001\u0000"+
		"\u0000\u0000wx\u0005*\u0000\u0000x \u0001\u0000\u0000\u0000yz\u0005/\u0000"+
		"\u0000z\"\u0001\u0000\u0000\u0000{|\u0005%\u0000\u0000|$\u0001\u0000\u0000"+
		"\u0000}~\u0005!\u0000\u0000~&\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"(\u0000\u0000\u0080(\u0001\u0000\u0000\u0000\u0081\u0082\u0005)\u0000"+
		"\u0000\u0082*\u0001\u0000\u0000\u0000\u0083\u0085\u0007\u0006\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0006\u0015\u0001\u0000"+
		"\u0089,\u0001\u0000\u0000\u0000\n\u0000068CHJS[\u0086\u0002\u0001\u0004"+
		"\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}