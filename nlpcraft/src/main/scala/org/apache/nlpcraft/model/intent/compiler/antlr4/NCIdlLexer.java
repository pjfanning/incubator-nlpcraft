// Generated from C:/Users/Nikita Ivanov/Documents/GitHub/incubator-nlpcraft/nlpcraft/src/main/scala/org/apache/nlpcraft/model/intent/compiler/antlr4\NCIdl.g4 by ANTLR 4.9.1
package org.apache.nlpcraft.model.intent.compiler.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NCIdlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FUN_NAME=7, FRAG=8, SQSTRING=9, 
		DQSTRING=10, BOOL=11, NULL=12, EQ=13, NEQ=14, GTEQ=15, LTEQ=16, GT=17, 
		LT=18, AND=19, OR=20, VERT=21, NOT=22, LPAR=23, RPAR=24, LBRACE=25, RBRACE=26, 
		SQUOTE=27, DQUOTE=28, TILDA=29, LBR=30, RBR=31, POUND=32, COMMA=33, COLON=34, 
		MINUS=35, DOT=36, UNDERSCORE=37, ASSIGN=38, PLUS=39, QUESTION=40, MULT=41, 
		DIV=42, MOD=43, AT=44, DOLLAR=45, INT=46, REAL=47, EXP=48, ID=49, COMMENT=50, 
		WS=51, ErrorChar=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "FUN_NAME", "FRAG", "SQSTRING", 
			"DQSTRING", "BOOL", "NULL", "EQ", "NEQ", "GTEQ", "LTEQ", "GT", "LT", 
			"AND", "OR", "VERT", "NOT", "LPAR", "RPAR", "LBRACE", "RBRACE", "SQUOTE", 
			"DQUOTE", "TILDA", "LBR", "RBR", "POUND", "COMMA", "COLON", "MINUS", 
			"DOT", "UNDERSCORE", "ASSIGN", "PLUS", "QUESTION", "MULT", "DIV", "MOD", 
			"AT", "DOLLAR", "INT", "REAL", "EXP", "UNI_CHAR", "LETTER", "ID", "COMMENT", 
			"WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'intent'", "'ordered'", "'flow'", "'meta'", "'term'", 
			null, "'fragment'", null, null, null, "'null'", "'=='", "'!='", "'>='", 
			"'<='", "'>'", "'<'", "'&&'", "'||'", "'|'", "'!'", "'('", "')'", "'{'", 
			"'}'", "'''", "'\"'", "'~'", "'['", "']'", "'#'", "','", "':'", "'-'", 
			"'.'", "'_'", "'='", "'+'", "'?'", "'*'", "'/'", "'%'", "'@'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "FUN_NAME", "FRAG", "SQSTRING", 
			"DQSTRING", "BOOL", "NULL", "EQ", "NEQ", "GTEQ", "LTEQ", "GT", "LT", 
			"AND", "OR", "VERT", "NOT", "LPAR", "RPAR", "LBRACE", "RBRACE", "SQUOTE", 
			"DQUOTE", "TILDA", "LBR", "RBR", "POUND", "COMMA", "COLON", "MINUS", 
			"DOT", "UNDERSCORE", "ASSIGN", "PLUS", "QUESTION", "MULT", "DIV", "MOD", 
			"AT", "DOLLAR", "INT", "REAL", "EXP", "ID", "COMMENT", "WS", "ErrorChar"
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


	public NCIdlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NCIdl.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u049a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u03cd\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u03dc\n\n\f\n\16\n"+
		"\u03df\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u03e7\n\13\f\13\16\13\u03ea"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u03f7\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\7/\u0449\n/\f/\16/\u044c"+
		"\13/\5/\u044e\n/\3\60\3\60\6\60\u0452\n\60\r\60\16\60\u0453\3\61\3\61"+
		"\5\61\u0458\n\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\6\64"+
		"\u0464\n\64\r\64\16\64\u0465\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u046f"+
		"\n\64\f\64\16\64\u0472\13\64\3\65\3\65\3\65\3\65\7\65\u0478\n\65\f\65"+
		"\16\65\u047b\13\65\3\65\5\65\u047e\n\65\3\65\5\65\u0481\n\65\3\65\3\65"+
		"\3\65\3\65\7\65\u0487\n\65\f\65\16\65\u048a\13\65\3\65\3\65\5\65\u048e"+
		"\n\65\3\65\3\65\3\66\6\66\u0493\n\66\r\66\16\66\u0494\3\66\3\66\3\67\3"+
		"\67\3\u0488\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\2g\63"+
		"i\64k\65m\66\3\2\16\3\2))\3\2$$\3\2\63;\4\2\62;aa\3\2\62;\4\2GGgg\4\2"+
		"--//\17\2\u00a2\u0251\u025b\u0294\u02b2\u0371\u0402\u0501\u1e04\u1ef5"+
		"\u1f03\u2001\u200e\u200f\u2041\u2042\u2072\u2191\u2c02\u2ff1\u3003\ud801"+
		"\uf902\ufdd1\ufdf2\uffff\4\2C\\c|\4\2\f\f\17\17\3\3\f\f\5\2\13\f\16\17"+
		"\"\"\2\u0525\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2"+
		"\2\5v\3\2\2\2\7}\3\2\2\2\t\u0085\3\2\2\2\13\u008a\3\2\2\2\r\u008f\3\2"+
		"\2\2\17\u03cc\3\2\2\2\21\u03ce\3\2\2\2\23\u03d7\3\2\2\2\25\u03e2\3\2\2"+
		"\2\27\u03f6\3\2\2\2\31\u03f8\3\2\2\2\33\u03fd\3\2\2\2\35\u0400\3\2\2\2"+
		"\37\u0403\3\2\2\2!\u0406\3\2\2\2#\u0409\3\2\2\2%\u040b\3\2\2\2\'\u040d"+
		"\3\2\2\2)\u0410\3\2\2\2+\u0413\3\2\2\2-\u0415\3\2\2\2/\u0417\3\2\2\2\61"+
		"\u0419\3\2\2\2\63\u041b\3\2\2\2\65\u041d\3\2\2\2\67\u041f\3\2\2\29\u0421"+
		"\3\2\2\2;\u0423\3\2\2\2=\u0425\3\2\2\2?\u0427\3\2\2\2A\u0429\3\2\2\2C"+
		"\u042b\3\2\2\2E\u042d\3\2\2\2G\u042f\3\2\2\2I\u0431\3\2\2\2K\u0433\3\2"+
		"\2\2M\u0435\3\2\2\2O\u0437\3\2\2\2Q\u0439\3\2\2\2S\u043b\3\2\2\2U\u043d"+
		"\3\2\2\2W\u043f\3\2\2\2Y\u0441\3\2\2\2[\u0443\3\2\2\2]\u044d\3\2\2\2_"+
		"\u044f\3\2\2\2a\u0455\3\2\2\2c\u045b\3\2\2\2e\u045d\3\2\2\2g\u0463\3\2"+
		"\2\2i\u048d\3\2\2\2k\u0492\3\2\2\2m\u0498\3\2\2\2op\7k\2\2pq\7o\2\2qr"+
		"\7r\2\2rs\7q\2\2st\7t\2\2tu\7v\2\2u\4\3\2\2\2vw\7k\2\2wx\7p\2\2xy\7v\2"+
		"\2yz\7g\2\2z{\7p\2\2{|\7v\2\2|\6\3\2\2\2}~\7q\2\2~\177\7t\2\2\177\u0080"+
		"\7f\2\2\u0080\u0081\7g\2\2\u0081\u0082\7t\2\2\u0082\u0083\7g\2\2\u0083"+
		"\u0084\7f\2\2\u0084\b\3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087\7n\2\2\u0087"+
		"\u0088\7q\2\2\u0088\u0089\7y\2\2\u0089\n\3\2\2\2\u008a\u008b\7o\2\2\u008b"+
		"\u008c\7g\2\2\u008c\u008d\7v\2\2\u008d\u008e\7c\2\2\u008e\f\3\2\2\2\u008f"+
		"\u0090\7v\2\2\u0090\u0091\7g\2\2\u0091\u0092\7t\2\2\u0092\u0093\7o\2\2"+
		"\u0093\16\3\2\2\2\u0094\u0095\7o\2\2\u0095\u0096\7g\2\2\u0096\u0097\7"+
		"v\2\2\u0097\u0098\7c\2\2\u0098\u0099\7a\2\2\u0099\u009a\7v\2\2\u009a\u009b"+
		"\7q\2\2\u009b\u009c\7m\2\2\u009c\u009d\7g\2\2\u009d\u03cd\7p\2\2\u009e"+
		"\u009f\7o\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7c\2\2"+
		"\u00a2\u00a3\7a\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6"+
		"\7t\2\2\u00a6\u03cd\7v\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\u00aa\7v\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7a\2\2\u00ac\u00ad\7o\2\2"+
		"\u00ad\u00ae\7q\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7g\2\2\u00b0\u03cd"+
		"\7n\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7v\2\2\u00b4"+
		"\u00b5\7c\2\2\u00b5\u00b6\7a\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2"+
		"\u00b8\u00b9\7v\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7p\2\2\u00bb\u03cd"+
		"\7v\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\u00c0\7c\2\2\u00c0\u00c1\7a\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7g\2\2"+
		"\u00c3\u03cd\7s\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7"+
		"\7v\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7a\2\2\u00c9\u00ca\7w\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc\u03cd\7t\2\2\u00cd\u00ce\7o\2\2"+
		"\u00ce\u00cf\7g\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2"+
		"\7a\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7o\2\2\u00d5"+
		"\u00d6\7r\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7p\2\2\u00d8\u03cd\7{\2\2"+
		"\u00d9\u00da\7o\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd"+
		"\7c\2\2\u00dd\u00de\7a\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7{\2\2\u00e0"+
		"\u03cd\7u\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7v\2\2"+
		"\u00e4\u00e5\7c\2\2\u00e5\u00e6\7a\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8"+
		"\7q\2\2\u00e8\u00e9\7p\2\2\u00e9\u03cd\7x\2\2\u00ea\u00eb\7o\2\2\u00eb"+
		"\u00ec\7g\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7a\2\2"+
		"\u00ef\u00f0\7h\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7c\2\2\u00f2\u03cd"+
		"\7i\2\2\u00f3\u00f4\7l\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7q\2\2\u00f6"+
		"\u03cd\7p\2\2\u00f7\u00f8\7k\2\2\u00f8\u03cd\7h\2\2\u00f9\u00fa\7k\2\2"+
		"\u00fa\u03cd\7f\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe"+
		"\7m\2\2\u00fe\u00ff\7g\2\2\u00ff\u03cd\7p\2\2\u0100\u0101\7h\2\2\u0101"+
		"\u0102\7k\2\2\u0102\u0103\7p\2\2\u0103\u0104\7f\2\2\u0104\u0105\7a\2\2"+
		"\u0105\u0106\7r\2\2\u0106\u0107\7c\2\2\u0107\u0108\7t\2\2\u0108\u03cd"+
		"\7v\2\2\u0109\u010a\7h\2\2\u010a\u010b\7k\2\2\u010b\u010c\7p\2\2\u010c"+
		"\u010d\7f\2\2\u010d\u010e\7a\2\2\u010e\u010f\7r\2\2\u010f\u0110\7c\2\2"+
		"\u0110\u0111\7t\2\2\u0111\u0112\7v\2\2\u0112\u03cd\7u\2\2\u0113\u0114"+
		"\7c\2\2\u0114\u0115\7p\2\2\u0115\u0116\7e\2\2\u0116\u0117\7g\2\2\u0117"+
		"\u0118\7u\2\2\u0118\u0119\7v\2\2\u0119\u011a\7q\2\2\u011a\u011b\7t\2\2"+
		"\u011b\u03cd\7u\2\2\u011c\u011d\7r\2\2\u011d\u011e\7c\2\2\u011e\u011f"+
		"\7t\2\2\u011f\u0120\7g\2\2\u0120\u0121\7p\2\2\u0121\u03cd\7v\2\2\u0122"+
		"\u0123\7i\2\2\u0123\u0124\7t\2\2\u0124\u0125\7q\2\2\u0125\u0126\7w\2\2"+
		"\u0126\u0127\7r\2\2\u0127\u03cd\7u\2\2\u0128\u0129\7x\2\2\u0129\u012a"+
		"\7c\2\2\u012a\u012b\7n\2\2\u012b\u012c\7w\2\2\u012c\u03cd\7g\2\2\u012d"+
		"\u012e\7c\2\2\u012e\u012f\7n\2\2\u012f\u0130\7k\2\2\u0130\u0131\7c\2\2"+
		"\u0131\u0132\7u\2\2\u0132\u0133\7g\2\2\u0133\u03cd\7u\2\2\u0134\u0135"+
		"\7u\2\2\u0135\u0136\7v\2\2\u0136\u0137\7c\2\2\u0137\u0138\7t\2\2\u0138"+
		"\u0139\7v\2\2\u0139\u013a\7a\2\2\u013a\u013b\7k\2\2\u013b\u013c\7f\2\2"+
		"\u013c\u03cd\7z\2\2\u013d\u013e\7g\2\2\u013e\u013f\7p\2\2\u013f\u0140"+
		"\7f\2\2\u0140\u0141\7a\2\2\u0141\u0142\7k\2\2\u0142\u0143\7f\2\2\u0143"+
		"\u03cd\7z\2\2\u0144\u0145\7t\2\2\u0145\u0146\7g\2\2\u0146\u0147\7s\2\2"+
		"\u0147\u0148\7a\2\2\u0148\u0149\7k\2\2\u0149\u03cd\7f\2\2\u014a\u014b"+
		"\7t\2\2\u014b\u014c\7g\2\2\u014c\u014d\7s\2\2\u014d\u014e\7a\2\2\u014e"+
		"\u014f\7p\2\2\u014f\u0150\7q\2\2\u0150\u0151\7t\2\2\u0151\u0152\7o\2\2"+
		"\u0152\u0153\7v\2\2\u0153\u0154\7g\2\2\u0154\u0155\7z\2\2\u0155\u03cd"+
		"\7v\2\2\u0156\u0157\7t\2\2\u0157\u0158\7g\2\2\u0158\u0159\7s\2\2\u0159"+
		"\u015a\7a\2\2\u015a\u015b\7v\2\2\u015b\u015c\7u\2\2\u015c\u015d\7v\2\2"+
		"\u015d\u015e\7c\2\2\u015e\u015f\7o\2\2\u015f\u03cd\7r\2\2\u0160\u0161"+
		"\7t\2\2\u0161\u0162\7g\2\2\u0162\u0163\7s\2\2\u0163\u0164\7a\2\2\u0164"+
		"\u0165\7c\2\2\u0165\u0166\7f\2\2\u0166\u0167\7f\2\2\u0167\u03cd\7t\2\2"+
		"\u0168\u0169\7t\2\2\u0169\u016a\7g\2\2\u016a\u016b\7s\2\2\u016b\u016c"+
		"\7a\2\2\u016c\u016d\7c\2\2\u016d\u016e\7i\2\2\u016e\u016f\7g\2\2\u016f"+
		"\u0170\7p\2\2\u0170\u03cd\7v\2\2\u0171\u0172\7w\2\2\u0172\u0173\7u\2\2"+
		"\u0173\u0174\7g\2\2\u0174\u0175\7t\2\2\u0175\u0176\7a\2\2\u0176\u0177"+
		"\7k\2\2\u0177\u03cd\7f\2\2\u0178\u0179\7w\2\2\u0179\u017a\7u\2\2\u017a"+
		"\u017b\7g\2\2\u017b\u017c\7t\2\2\u017c\u017d\7a\2\2\u017d\u017e\7h\2\2"+
		"\u017e\u017f\7p\2\2\u017f\u0180\7c\2\2\u0180\u0181\7o\2\2\u0181\u03cd"+
		"\7g\2\2\u0182\u0183\7w\2\2\u0183\u0184\7u\2\2\u0184\u0185\7g\2\2\u0185"+
		"\u0186\7t\2\2\u0186\u0187\7a\2\2\u0187\u0188\7n\2\2\u0188\u0189\7p\2\2"+
		"\u0189\u018a\7c\2\2\u018a\u018b\7o\2\2\u018b\u03cd\7g\2\2\u018c\u018d"+
		"\7w\2\2\u018d\u018e\7u\2\2\u018e\u018f\7g\2\2\u018f\u0190\7t\2\2\u0190"+
		"\u0191\7a\2\2\u0191\u0192\7g\2\2\u0192\u0193\7o\2\2\u0193\u0194\7c\2\2"+
		"\u0194\u0195\7k\2\2\u0195\u03cd\7n\2\2\u0196\u0197\7w\2\2\u0197\u0198"+
		"\7u\2\2\u0198\u0199\7g\2\2\u0199\u019a\7t\2\2\u019a\u019b\7a\2\2\u019b"+
		"\u019c\7c\2\2\u019c\u019d\7f\2\2\u019d\u019e\7o\2\2\u019e\u019f\7k\2\2"+
		"\u019f\u03cd\7p\2\2\u01a0\u01a1\7w\2\2\u01a1\u01a2\7u\2\2\u01a2\u01a3"+
		"\7g\2\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7a\2\2\u01a5\u01a6\7u\2\2\u01a6"+
		"\u01a7\7k\2\2\u01a7\u01a8\7i\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa\7w\2\2"+
		"\u01aa\u01ab\7r\2\2\u01ab\u01ac\7a\2\2\u01ac\u01ad\7v\2\2\u01ad\u01ae"+
		"\7u\2\2\u01ae\u01af\7v\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1\7o\2\2\u01b1"+
		"\u03cd\7r\2\2\u01b2\u01b3\7e\2\2\u01b3\u01b4\7q\2\2\u01b4\u01b5\7o\2\2"+
		"\u01b5\u01b6\7r\2\2\u01b6\u01b7\7a\2\2\u01b7\u01b8\7k\2\2\u01b8\u03cd"+
		"\7f\2\2\u01b9\u01ba\7e\2\2\u01ba\u01bb\7q\2\2\u01bb\u01bc\7o\2\2\u01bc"+
		"\u01bd\7r\2\2\u01bd\u01be\7a\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0\7c\2\2"+
		"\u01c0\u01c1\7o\2\2\u01c1\u03cd\7g\2\2\u01c2\u01c3\7e\2\2\u01c3\u01c4"+
		"\7q\2\2\u01c4\u01c5\7o\2\2\u01c5\u01c6\7r\2\2\u01c6\u01c7\7a\2\2\u01c7"+
		"\u01c8\7y\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca\7d\2\2\u01ca\u01cb\7u\2\2"+
		"\u01cb\u01cc\7k\2\2\u01cc\u01cd\7v\2\2\u01cd\u03cd\7g\2\2\u01ce\u01cf"+
		"\7e\2\2\u01cf\u01d0\7q\2\2\u01d0\u01d1\7o\2\2\u01d1\u01d2\7r\2\2\u01d2"+
		"\u01d3\7a\2\2\u01d3\u01d4\7e\2\2\u01d4\u01d5\7q\2\2\u01d5\u01d6\7w\2\2"+
		"\u01d6\u01d7\7p\2\2\u01d7\u01d8\7v\2\2\u01d8\u01d9\7t\2\2\u01d9\u03cd"+
		"\7{\2\2\u01da\u01db\7e\2\2\u01db\u01dc\7q\2\2\u01dc\u01dd\7o\2\2\u01dd"+
		"\u01de\7r\2\2\u01de\u01df\7a\2\2\u01df\u01e0\7t\2\2\u01e0\u01e1\7g\2\2"+
		"\u01e1\u01e2\7i\2\2\u01e2\u01e3\7k\2\2\u01e3\u01e4\7q\2\2\u01e4\u03cd"+
		"\7p\2\2\u01e5\u01e6\7e\2\2\u01e6\u01e7\7q\2\2\u01e7\u01e8\7o\2\2\u01e8"+
		"\u01e9\7r\2\2\u01e9\u01ea\7a\2\2\u01ea\u01eb\7e\2\2\u01eb\u01ec\7k\2\2"+
		"\u01ec\u01ed\7v\2\2\u01ed\u03cd\7{\2\2\u01ee\u01ef\7e\2\2\u01ef\u01f0"+
		"\7q\2\2\u01f0\u01f1\7o\2\2\u01f1\u01f2\7r\2\2\u01f2\u01f3\7a\2\2\u01f3"+
		"\u01f4\7c\2\2\u01f4\u01f5\7f\2\2\u01f5\u01f6\7f\2\2\u01f6\u03cd\7t\2\2"+
		"\u01f7\u01f8\7e\2\2\u01f8\u01f9\7q\2\2\u01f9\u01fa\7o\2\2\u01fa\u01fb"+
		"\7r\2\2\u01fb\u01fc\7a\2\2\u01fc\u01fd\7r\2\2\u01fd\u01fe\7q\2\2\u01fe"+
		"\u01ff\7u\2\2\u01ff\u0200\7v\2\2\u0200\u0201\7e\2\2\u0201\u0202\7q\2\2"+
		"\u0202\u0203\7f\2\2\u0203\u03cd\7g\2\2\u0204\u0205\7v\2\2\u0205\u0206"+
		"\7t\2\2\u0206\u0207\7k\2\2\u0207\u03cd\7o\2\2\u0208\u0209\7u\2\2\u0209"+
		"\u020a\7v\2\2\u020a\u020b\7t\2\2\u020b\u020c\7k\2\2\u020c\u03cd\7r\2\2"+
		"\u020d\u020e\7w\2\2\u020e\u020f\7r\2\2\u020f\u0210\7r\2\2\u0210\u0211"+
		"\7g\2\2\u0211\u0212\7t\2\2\u0212\u0213\7e\2\2\u0213\u0214\7c\2\2\u0214"+
		"\u0215\7u\2\2\u0215\u03cd\7g\2\2\u0216\u0217\7n\2\2\u0217\u0218\7q\2\2"+
		"\u0218\u0219\7y\2\2\u0219\u021a\7g\2\2\u021a\u021b\7t\2\2\u021b\u021c"+
		"\7e\2\2\u021c\u021d\7c\2\2\u021d\u021e\7u\2\2\u021e\u03cd\7g\2\2\u021f"+
		"\u0220\7k\2\2\u0220\u0221\7u\2\2\u0221\u0222\7a\2\2\u0222\u0223\7c\2\2"+
		"\u0223\u0224\7n\2\2\u0224\u0225\7r\2\2\u0225\u0226\7j\2\2\u0226\u03cd"+
		"\7c\2\2\u0227\u0228\7k\2\2\u0228\u0229\7u\2\2\u0229\u022a\7a\2\2\u022a"+
		"\u022b\7c\2\2\u022b\u022c\7n\2\2\u022c\u022d\7r\2\2\u022d\u022e\7j\2\2"+
		"\u022e\u022f\7c\2\2\u022f\u0230\7p\2\2\u0230\u0231\7w\2\2\u0231\u03cd"+
		"\7o\2\2\u0232\u0233\7k\2\2\u0233\u0234\7u\2\2\u0234\u0235\7a\2\2\u0235"+
		"\u0236\7y\2\2\u0236\u0237\7j\2\2\u0237\u0238\7k\2\2\u0238\u0239\7v\2\2"+
		"\u0239\u023a\7g\2\2\u023a\u023b\7u\2\2\u023b\u023c\7r\2\2\u023c\u023d"+
		"\7c\2\2\u023d\u023e\7e\2\2\u023e\u03cd\7g\2\2\u023f\u0240\7k\2\2\u0240"+
		"\u0241\7u\2\2\u0241\u0242\7a\2\2\u0242\u0243\7p\2\2\u0243\u0244\7w\2\2"+
		"\u0244\u03cd\7o\2\2\u0245\u0246\7k\2\2\u0246\u0247\7u\2\2\u0247\u0248"+
		"\7a\2\2\u0248\u0249\7p\2\2\u0249\u024a\7w\2\2\u024a\u024b\7o\2\2\u024b"+
		"\u024c\7u\2\2\u024c\u024d\7r\2\2\u024d\u024e\7c\2\2\u024e\u024f\7e\2\2"+
		"\u024f\u03cd\7g\2\2\u0250\u0251\7k\2\2\u0251\u0252\7u\2\2\u0252\u0253"+
		"\7a\2\2\u0253\u0254\7c\2\2\u0254\u0255\7n\2\2\u0255\u0256\7r\2\2\u0256"+
		"\u0257\7j\2\2\u0257\u0258\7c\2\2\u0258\u0259\7u\2\2\u0259\u025a\7r\2\2"+
		"\u025a\u025b\7c\2\2\u025b\u025c\7e\2\2\u025c\u03cd\7g\2\2\u025d\u025e"+
		"\7k\2\2\u025e\u025f\7u\2\2\u025f\u0260\7a\2\2\u0260\u0261\7c\2\2\u0261"+
		"\u0262\7n\2\2\u0262\u0263\7r\2\2\u0263\u0264\7j\2\2\u0264\u0265\7c\2\2"+
		"\u0265\u0266\7p\2\2\u0266\u0267\7w\2\2\u0267\u0268\7o\2\2\u0268\u0269"+
		"\7u\2\2\u0269\u026a\7r\2\2\u026a\u026b\7c\2\2\u026b\u026c\7e\2\2\u026c"+
		"\u03cd\7g\2\2\u026d\u026e\7u\2\2\u026e\u026f\7r\2\2\u026f\u0270\7n\2\2"+
		"\u0270\u0271\7k\2\2\u0271\u03cd\7v\2\2\u0272\u0273\7u\2\2\u0273\u0274"+
		"\7r\2\2\u0274\u0275\7n\2\2\u0275\u0276\7k\2\2\u0276\u0277\7v\2\2\u0277"+
		"\u0278\7a\2\2\u0278\u0279\7v\2\2\u0279\u027a\7t\2\2\u027a\u027b\7k\2\2"+
		"\u027b\u03cd\7o\2\2\u027c\u027d\7c\2\2\u027d\u027e\7d\2\2\u027e\u03cd"+
		"\7u\2\2\u027f\u0280\7e\2\2\u0280\u0281\7g\2\2\u0281\u0282\7k\2\2\u0282"+
		"\u03cd\7n\2\2\u0283\u0284\7h\2\2\u0284\u0285\7n\2\2\u0285\u0286\7q\2\2"+
		"\u0286\u0287\7q\2\2\u0287\u03cd\7t\2\2\u0288\u0289\7t\2\2\u0289\u028a"+
		"\7k\2\2\u028a\u028b\7p\2\2\u028b\u03cd\7v\2\2\u028c\u028d\7t\2\2\u028d"+
		"\u028e\7q\2\2\u028e\u028f\7w\2\2\u028f\u0290\7p\2\2\u0290\u03cd\7f\2\2"+
		"\u0291\u0292\7u\2\2\u0292\u0293\7k\2\2\u0293\u0294\7i\2\2\u0294\u0295"+
		"\7p\2\2\u0295\u0296\7w\2\2\u0296\u03cd\7o\2\2\u0297\u0298\7u\2\2\u0298"+
		"\u0299\7s\2\2\u0299\u029a\7t\2\2\u029a\u03cd\7v\2\2\u029b\u029c\7e\2\2"+
		"\u029c\u029d\7d\2\2\u029d\u029e\7t\2\2\u029e\u03cd\7v\2\2\u029f\u02a0"+
		"\7r\2\2\u02a0\u03cd\7k\2\2\u02a1\u02a2\7v\2\2\u02a2\u02a3\7q\2\2\u02a3"+
		"\u02a4\7a\2\2\u02a4\u02a5\7f\2\2\u02a5\u02a6\7q\2\2\u02a6\u02a7\7w\2\2"+
		"\u02a7\u02a8\7d\2\2\u02a8\u02a9\7n\2\2\u02a9\u03cd\7g\2\2\u02aa\u02ab"+
		"\7g\2\2\u02ab\u02ac\7w\2\2\u02ac\u02ad\7n\2\2\u02ad\u02ae\7g\2\2\u02ae"+
		"\u03cd\7t\2\2\u02af\u02b0\7c\2\2\u02b0\u02b1\7e\2\2\u02b1\u02b2\7q\2\2"+
		"\u02b2\u03cd\7u\2\2\u02b3\u02b4\7c\2\2\u02b4\u02b5\7u\2\2\u02b5\u02b6"+
		"\7k\2\2\u02b6\u03cd\7p\2\2\u02b7\u02b8\7c\2\2\u02b8\u02b9\7v\2\2\u02b9"+
		"\u02ba\7c\2\2\u02ba\u03cd\7p\2\2\u02bb\u02bc\7e\2\2\u02bc\u02bd\7q\2\2"+
		"\u02bd\u03cd\7u\2\2\u02be\u02bf\7u\2\2\u02bf\u02c0\7k\2\2\u02c0\u03cd"+
		"\7p\2\2\u02c1\u02c2\7v\2\2\u02c2\u02c3\7c\2\2\u02c3\u03cd\7p\2\2\u02c4"+
		"\u02c5\7e\2\2\u02c5\u02c6\7q\2\2\u02c6\u02c7\7u\2\2\u02c7\u03cd\7j\2\2"+
		"\u02c8\u02c9\7u\2\2\u02c9\u02ca\7k\2\2\u02ca\u02cb\7p\2\2\u02cb\u03cd"+
		"\7j\2\2\u02cc\u02cd\7v\2\2\u02cd\u02ce\7c\2\2\u02ce\u02cf\7p\2\2\u02cf"+
		"\u03cd\7j\2\2\u02d0\u02d1\7c\2\2\u02d1\u02d2\7v\2\2\u02d2\u02d3\7p\2\2"+
		"\u02d3\u03cd\7\64\2\2\u02d4\u02d5\7f\2\2\u02d5\u02d6\7g\2\2\u02d6\u02d7"+
		"\7i\2\2\u02d7\u02d8\7t\2\2\u02d8\u02d9\7g\2\2\u02d9\u02da\7g\2\2\u02da"+
		"\u03cd\7u\2\2\u02db\u02dc\7t\2\2\u02dc\u02dd\7c\2\2\u02dd\u02de\7f\2\2"+
		"\u02de\u02df\7k\2\2\u02df\u02e0\7c\2\2\u02e0\u02e1\7p\2\2\u02e1\u03cd"+
		"\7u\2\2\u02e2\u02e3\7g\2\2\u02e3\u02e4\7z\2\2\u02e4\u03cd\7r\2\2\u02e5"+
		"\u02e6\7g\2\2\u02e6\u02e7\7z\2\2\u02e7\u02e8\7r\2\2\u02e8\u02e9\7o\2\2"+
		"\u02e9\u03cd\7\63\2\2\u02ea\u02eb\7j\2\2\u02eb\u02ec\7{\2\2\u02ec\u02ed"+
		"\7r\2\2\u02ed\u02ee\7q\2\2\u02ee\u03cd\7v\2\2\u02ef\u02f0\7n\2\2\u02f0"+
		"\u02f1\7q\2\2\u02f1\u03cd\7i\2\2\u02f2\u02f3\7n\2\2\u02f3\u02f4\7q\2\2"+
		"\u02f4\u02f5\7i\2\2\u02f5\u02f6\7\63\2\2\u02f6\u03cd\7\62\2\2\u02f7\u02f8"+
		"\7n\2\2\u02f8\u02f9\7q\2\2\u02f9\u02fa\7i\2\2\u02fa\u02fb\7\63\2\2\u02fb"+
		"\u03cd\7r\2\2\u02fc\u02fd\7r\2\2\u02fd\u02fe\7q\2\2\u02fe\u03cd\7y\2\2"+
		"\u02ff\u0300\7t\2\2\u0300\u0301\7c\2\2\u0301\u0302\7p\2\2\u0302\u03cd"+
		"\7f\2\2\u0303\u0304\7u\2\2\u0304\u0305\7s\2\2\u0305\u0306\7w\2\2\u0306"+
		"\u0307\7c\2\2\u0307\u0308\7t\2\2\u0308\u03cd\7g\2\2\u0309\u030a\7n\2\2"+
		"\u030a\u030b\7k\2\2\u030b\u030c\7u\2\2\u030c\u03cd\7v\2\2\u030d\u030e"+
		"\7i\2\2\u030e\u030f\7g\2\2\u030f\u03cd\7v\2\2\u0310\u0311\7j\2\2\u0311"+
		"\u0312\7c\2\2\u0312\u03cd\7u\2\2\u0313\u0314\7j\2\2\u0314\u0315\7c\2\2"+
		"\u0315\u0316\7u\2\2\u0316\u0317\7a\2\2\u0317\u0318\7c\2\2\u0318\u0319"+
		"\7p\2\2\u0319\u03cd\7{\2\2\u031a\u031b\7j\2\2\u031b\u031c\7c\2\2\u031c"+
		"\u031d\7u\2\2\u031d\u031e\7a\2\2\u031e\u031f\7c\2\2\u031f\u0320\7n\2\2"+
		"\u0320\u03cd\7n\2\2\u0321\u0322\7h\2\2\u0322\u0323\7k\2\2\u0323\u0324"+
		"\7t\2\2\u0324\u0325\7u\2\2\u0325\u03cd\7v\2\2\u0326\u0327\7n\2\2\u0327"+
		"\u0328\7c\2\2\u0328\u0329\7u\2\2\u0329\u03cd\7v\2\2\u032a\u032b\7m\2\2"+
		"\u032b\u032c\7g\2\2\u032c\u032d\7{\2\2\u032d\u03cd\7u\2\2\u032e\u032f"+
		"\7x\2\2\u032f\u0330\7c\2\2\u0330\u0331\7n\2\2\u0331\u0332\7w\2\2\u0332"+
		"\u0333\7g\2\2\u0333\u03cd\7u\2\2\u0334\u0335\7n\2\2\u0335\u0336\7g\2\2"+
		"\u0336\u0337\7p\2\2\u0337\u0338\7i\2\2\u0338\u0339\7v\2\2\u0339\u03cd"+
		"\7j\2\2\u033a\u033b\7e\2\2\u033b\u033c\7q\2\2\u033c\u033d\7w\2\2\u033d"+
		"\u033e\7p\2\2\u033e\u03cd\7v\2\2\u033f\u0340\7u\2\2\u0340\u0341\7k\2\2"+
		"\u0341\u0342\7|\2\2\u0342\u03cd\7g\2\2\u0343\u0344\7u\2\2\u0344\u0345"+
		"\7q\2\2\u0345\u0346\7t\2\2\u0346\u03cd\7v\2\2\u0347\u0348\7t\2\2\u0348"+
		"\u0349\7g\2\2\u0349\u034a\7x\2\2\u034a\u034b\7g\2\2\u034b\u034c\7t\2\2"+
		"\u034c\u034d\7u\2\2\u034d\u03cd\7g\2\2\u034e\u034f\7k\2\2\u034f\u0350"+
		"\7u\2\2\u0350\u0351\7a\2\2\u0351\u0352\7g\2\2\u0352\u0353\7o\2\2\u0353"+
		"\u0354\7r\2\2\u0354\u0355\7v\2\2\u0355\u03cd\7{\2\2\u0356\u0357\7p\2\2"+
		"\u0357\u0358\7q\2\2\u0358\u0359\7p\2\2\u0359\u035a\7a\2\2\u035a\u035b"+
		"\7g\2\2\u035b\u035c\7o\2\2\u035c\u035d\7r\2\2\u035d\u035e\7v\2\2\u035e"+
		"\u03cd\7{\2\2\u035f\u0360\7v\2\2\u0360\u0361\7q\2\2\u0361\u0362\7a\2\2"+
		"\u0362\u0363\7u\2\2\u0363\u0364\7v\2\2\u0364\u0365\7t\2\2\u0365\u0366"+
		"\7k\2\2\u0366\u0367\7p\2\2\u0367\u03cd\7i\2\2\u0368\u0369\7o\2\2\u0369"+
		"\u036a\7c\2\2\u036a\u03cd\7z\2\2\u036b\u036c\7o\2\2\u036c\u036d\7k\2\2"+
		"\u036d\u03cd\7p\2\2\u036e\u036f\7{\2\2\u036f\u0370\7g\2\2\u0370\u0371"+
		"\7c\2\2\u0371\u03cd\7t\2\2\u0372\u0373\7o\2\2\u0373\u0374\7q\2\2\u0374"+
		"\u0375\7p\2\2\u0375\u0376\7v\2\2\u0376\u03cd\7j\2\2\u0377\u0378\7f\2\2"+
		"\u0378\u0379\7c\2\2\u0379\u037a\7{\2\2\u037a\u037b\7a\2\2\u037b\u037c"+
		"\7q\2\2\u037c\u037d\7h\2\2\u037d\u037e\7a\2\2\u037e\u037f\7o\2\2\u037f"+
		"\u0380\7q\2\2\u0380\u0381\7p\2\2\u0381\u0382\7v\2\2\u0382\u03cd\7j\2\2"+
		"\u0383\u0384\7f\2\2\u0384\u0385\7c\2\2\u0385\u0386\7{\2\2\u0386\u0387"+
		"\7a\2\2\u0387\u0388\7q\2\2\u0388\u0389\7h\2\2\u0389\u038a\7a\2\2\u038a"+
		"\u038b\7y\2\2\u038b\u038c\7g\2\2\u038c\u038d\7g\2\2\u038d\u03cd\7m\2\2"+
		"\u038e\u038f\7f\2\2\u038f\u0390\7c\2\2\u0390\u0391\7{\2\2\u0391\u0392"+
		"\7a\2\2\u0392\u0393\7q\2\2\u0393\u0394\7h\2\2\u0394\u0395\7a\2\2\u0395"+
		"\u0396\7{\2\2\u0396\u0397\7g\2\2\u0397\u0398\7c\2\2\u0398\u03cd\7t\2\2"+
		"\u0399\u039a\7j\2\2\u039a\u039b\7q\2\2\u039b\u039c\7w\2\2\u039c\u03cd"+
		"\7t\2\2\u039d\u039e\7o\2\2\u039e\u039f\7k\2\2\u039f\u03a0\7p\2\2\u03a0"+
		"\u03a1\7w\2\2\u03a1\u03a2\7v\2\2\u03a2\u03cd\7g\2\2\u03a3\u03a4\7u\2\2"+
		"\u03a4\u03a5\7g\2\2\u03a5\u03a6\7e\2\2\u03a6\u03a7\7q\2\2\u03a7\u03a8"+
		"\7p\2\2\u03a8\u03cd\7f\2\2\u03a9\u03aa\7y\2\2\u03aa\u03ab\7g\2\2\u03ab"+
		"\u03ac\7g\2\2\u03ac\u03ad\7m\2\2\u03ad\u03ae\7a\2\2\u03ae\u03af\7q\2\2"+
		"\u03af\u03b0\7h\2\2\u03b0\u03b1\7a\2\2\u03b1\u03b2\7o\2\2\u03b2\u03b3"+
		"\7q\2\2\u03b3\u03b4\7p\2\2\u03b4\u03b5\7v\2\2\u03b5\u03cd\7j\2\2\u03b6"+
		"\u03b7\7y\2\2\u03b7\u03b8\7g\2\2\u03b8\u03b9\7g\2\2\u03b9\u03ba\7m\2\2"+
		"\u03ba\u03bb\7a\2\2\u03bb\u03bc\7q\2\2\u03bc\u03bd\7h\2\2\u03bd\u03be"+
		"\7a\2\2\u03be\u03bf\7{\2\2\u03bf\u03c0\7g\2\2\u03c0\u03c1\7c\2\2\u03c1"+
		"\u03cd\7t\2\2\u03c2\u03c3\7s\2\2\u03c3\u03c4\7w\2\2\u03c4\u03c5\7c\2\2"+
		"\u03c5\u03c6\7t\2\2\u03c6\u03c7\7v\2\2\u03c7\u03c8\7g\2\2\u03c8\u03cd"+
		"\7t\2\2\u03c9\u03ca\7p\2\2\u03ca\u03cb\7q\2\2\u03cb\u03cd\7y\2\2\u03cc"+
		"\u0094\3\2\2\2\u03cc\u009e\3\2\2\2\u03cc\u00a7\3\2\2\2\u03cc\u00b1\3\2"+
		"\2\2\u03cc\u00bc\3\2\2\2\u03cc\u00c4\3\2\2\2\u03cc\u00cd\3\2\2\2\u03cc"+
		"\u00d9\3\2\2\2\u03cc\u00e1\3\2\2\2\u03cc\u00ea\3\2\2\2\u03cc\u00f3\3\2"+
		"\2\2\u03cc\u00f7\3\2\2\2\u03cc\u00f9\3\2\2\2\u03cc\u00fb\3\2\2\2\u03cc"+
		"\u0100\3\2\2\2\u03cc\u0109\3\2\2\2\u03cc\u0113\3\2\2\2\u03cc\u011c\3\2"+
		"\2\2\u03cc\u0122\3\2\2\2\u03cc\u0128\3\2\2\2\u03cc\u012d\3\2\2\2\u03cc"+
		"\u0134\3\2\2\2\u03cc\u013d\3\2\2\2\u03cc\u0144\3\2\2\2\u03cc\u014a\3\2"+
		"\2\2\u03cc\u0156\3\2\2\2\u03cc\u0160\3\2\2\2\u03cc\u0168\3\2\2\2\u03cc"+
		"\u0171\3\2\2\2\u03cc\u0178\3\2\2\2\u03cc\u0182\3\2\2\2\u03cc\u018c\3\2"+
		"\2\2\u03cc\u0196\3\2\2\2\u03cc\u01a0\3\2\2\2\u03cc\u01b2\3\2\2\2\u03cc"+
		"\u01b9\3\2\2\2\u03cc\u01c2\3\2\2\2\u03cc\u01ce\3\2\2\2\u03cc\u01da\3\2"+
		"\2\2\u03cc\u01e5\3\2\2\2\u03cc\u01ee\3\2\2\2\u03cc\u01f7\3\2\2\2\u03cc"+
		"\u0204\3\2\2\2\u03cc\u0208\3\2\2\2\u03cc\u020d\3\2\2\2\u03cc\u0216\3\2"+
		"\2\2\u03cc\u021f\3\2\2\2\u03cc\u0227\3\2\2\2\u03cc\u0232\3\2\2\2\u03cc"+
		"\u023f\3\2\2\2\u03cc\u0245\3\2\2\2\u03cc\u0250\3\2\2\2\u03cc\u025d\3\2"+
		"\2\2\u03cc\u026d\3\2\2\2\u03cc\u0272\3\2\2\2\u03cc\u027c\3\2\2\2\u03cc"+
		"\u027f\3\2\2\2\u03cc\u0283\3\2\2\2\u03cc\u0288\3\2\2\2\u03cc\u028c\3\2"+
		"\2\2\u03cc\u0291\3\2\2\2\u03cc\u0297\3\2\2\2\u03cc\u029b\3\2\2\2\u03cc"+
		"\u029f\3\2\2\2\u03cc\u02a1\3\2\2\2\u03cc\u02aa\3\2\2\2\u03cc\u02af\3\2"+
		"\2\2\u03cc\u02b3\3\2\2\2\u03cc\u02b7\3\2\2\2\u03cc\u02bb\3\2\2\2\u03cc"+
		"\u02be\3\2\2\2\u03cc\u02c1\3\2\2\2\u03cc\u02c4\3\2\2\2\u03cc\u02c8\3\2"+
		"\2\2\u03cc\u02cc\3\2\2\2\u03cc\u02d0\3\2\2\2\u03cc\u02d4\3\2\2\2\u03cc"+
		"\u02db\3\2\2\2\u03cc\u02e2\3\2\2\2\u03cc\u02e5\3\2\2\2\u03cc\u02ea\3\2"+
		"\2\2\u03cc\u02ef\3\2\2\2\u03cc\u02f2\3\2\2\2\u03cc\u02f7\3\2\2\2\u03cc"+
		"\u02fc\3\2\2\2\u03cc\u02ff\3\2\2\2\u03cc\u0303\3\2\2\2\u03cc\u0309\3\2"+
		"\2\2\u03cc\u030d\3\2\2\2\u03cc\u0310\3\2\2\2\u03cc\u0313\3\2\2\2\u03cc"+
		"\u031a\3\2\2\2\u03cc\u0321\3\2\2\2\u03cc\u0326\3\2\2\2\u03cc\u032a\3\2"+
		"\2\2\u03cc\u032e\3\2\2\2\u03cc\u0334\3\2\2\2\u03cc\u033a\3\2\2\2\u03cc"+
		"\u033f\3\2\2\2\u03cc\u0343\3\2\2\2\u03cc\u0347\3\2\2\2\u03cc\u034e\3\2"+
		"\2\2\u03cc\u0356\3\2\2\2\u03cc\u035f\3\2\2\2\u03cc\u0368\3\2\2\2\u03cc"+
		"\u036b\3\2\2\2\u03cc\u036e\3\2\2\2\u03cc\u0372\3\2\2\2\u03cc\u0377\3\2"+
		"\2\2\u03cc\u0383\3\2\2\2\u03cc\u038e\3\2\2\2\u03cc\u0399\3\2\2\2\u03cc"+
		"\u039d\3\2\2\2\u03cc\u03a3\3\2\2\2\u03cc\u03a9\3\2\2\2\u03cc\u03b6\3\2"+
		"\2\2\u03cc\u03c2\3\2\2\2\u03cc\u03c9\3\2\2\2\u03cd\20\3\2\2\2\u03ce\u03cf"+
		"\7h\2\2\u03cf\u03d0\7t\2\2\u03d0\u03d1\7c\2\2\u03d1\u03d2\7i\2\2\u03d2"+
		"\u03d3\7o\2\2\u03d3\u03d4\7g\2\2\u03d4\u03d5\7p\2\2\u03d5\u03d6\7v\2\2"+
		"\u03d6\22\3\2\2\2\u03d7\u03dd\5\67\34\2\u03d8\u03dc\n\2\2\2\u03d9\u03da"+
		"\7^\2\2\u03da\u03dc\7)\2\2\u03db\u03d8\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc"+
		"\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0\3\2"+
		"\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e1\5\67\34\2\u03e1\24\3\2\2\2\u03e2"+
		"\u03e8\59\35\2\u03e3\u03e7\n\3\2\2\u03e4\u03e5\7^\2\2\u03e5\u03e7\7$\2"+
		"\2\u03e6\u03e3\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6"+
		"\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03eb\3\2\2\2\u03ea\u03e8\3\2\2\2\u03eb"+
		"\u03ec\59\35\2\u03ec\26\3\2\2\2\u03ed\u03ee\7v\2\2\u03ee\u03ef\7t\2\2"+
		"\u03ef\u03f0\7w\2\2\u03f0\u03f7\7g\2\2\u03f1\u03f2\7h\2\2\u03f2\u03f3"+
		"\7c\2\2\u03f3\u03f4\7n\2\2\u03f4\u03f5\7u\2\2\u03f5\u03f7\7g\2\2\u03f6"+
		"\u03ed\3\2\2\2\u03f6\u03f1\3\2\2\2\u03f7\30\3\2\2\2\u03f8\u03f9\7p\2\2"+
		"\u03f9\u03fa\7w\2\2\u03fa\u03fb\7n\2\2\u03fb\u03fc\7n\2\2\u03fc\32\3\2"+
		"\2\2\u03fd\u03fe\7?\2\2\u03fe\u03ff\7?\2\2\u03ff\34\3\2\2\2\u0400\u0401"+
		"\7#\2\2\u0401\u0402\7?\2\2\u0402\36\3\2\2\2\u0403\u0404\7@\2\2\u0404\u0405"+
		"\7?\2\2\u0405 \3\2\2\2\u0406\u0407\7>\2\2\u0407\u0408\7?\2\2\u0408\"\3"+
		"\2\2\2\u0409\u040a\7@\2\2\u040a$\3\2\2\2\u040b\u040c\7>\2\2\u040c&\3\2"+
		"\2\2\u040d\u040e\7(\2\2\u040e\u040f\7(\2\2\u040f(\3\2\2\2\u0410\u0411"+
		"\7~\2\2\u0411\u0412\7~\2\2\u0412*\3\2\2\2\u0413\u0414\7~\2\2\u0414,\3"+
		"\2\2\2\u0415\u0416\7#\2\2\u0416.\3\2\2\2\u0417\u0418\7*\2\2\u0418\60\3"+
		"\2\2\2\u0419\u041a\7+\2\2\u041a\62\3\2\2\2\u041b\u041c\7}\2\2\u041c\64"+
		"\3\2\2\2\u041d\u041e\7\177\2\2\u041e\66\3\2\2\2\u041f\u0420\7)\2\2\u0420"+
		"8\3\2\2\2\u0421\u0422\7$\2\2\u0422:\3\2\2\2\u0423\u0424\7\u0080\2\2\u0424"+
		"<\3\2\2\2\u0425\u0426\7]\2\2\u0426>\3\2\2\2\u0427\u0428\7_\2\2\u0428@"+
		"\3\2\2\2\u0429\u042a\7%\2\2\u042aB\3\2\2\2\u042b\u042c\7.\2\2\u042cD\3"+
		"\2\2\2\u042d\u042e\7<\2\2\u042eF\3\2\2\2\u042f\u0430\7/\2\2\u0430H\3\2"+
		"\2\2\u0431\u0432\7\60\2\2\u0432J\3\2\2\2\u0433\u0434\7a\2\2\u0434L\3\2"+
		"\2\2\u0435\u0436\7?\2\2\u0436N\3\2\2\2\u0437\u0438\7-\2\2\u0438P\3\2\2"+
		"\2\u0439\u043a\7A\2\2\u043aR\3\2\2\2\u043b\u043c\7,\2\2\u043cT\3\2\2\2"+
		"\u043d\u043e\7\61\2\2\u043eV\3\2\2\2\u043f\u0440\7\'\2\2\u0440X\3\2\2"+
		"\2\u0441\u0442\7B\2\2\u0442Z\3\2\2\2\u0443\u0444\7&\2\2\u0444\\\3\2\2"+
		"\2\u0445\u044e\7\62\2\2\u0446\u044a\t\4\2\2\u0447\u0449\t\5\2\2\u0448"+
		"\u0447\3\2\2\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2"+
		"\2\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2\2\2\u044d\u0445\3\2\2\2\u044d"+
		"\u0446\3\2\2\2\u044e^\3\2\2\2\u044f\u0451\5I%\2\u0450\u0452\t\6\2\2\u0451"+
		"\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0451\3\2\2\2\u0453\u0454\3\2"+
		"\2\2\u0454`\3\2\2\2\u0455\u0457\t\7\2\2\u0456\u0458\t\b\2\2\u0457\u0456"+
		"\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\5]/\2\u045a"+
		"b\3\2\2\2\u045b\u045c\t\t\2\2\u045cd\3\2\2\2\u045d\u045e\t\n\2\2\u045e"+
		"f\3\2\2\2\u045f\u0464\5c\62\2\u0460\u0464\5K&\2\u0461\u0464\5e\63\2\u0462"+
		"\u0464\5[.\2\u0463\u045f\3\2\2\2\u0463\u0460\3\2\2\2\u0463\u0461\3\2\2"+
		"\2\u0463\u0462\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0463\3\2\2\2\u0465\u0466"+
		"\3\2\2\2\u0466\u0470\3\2\2\2\u0467\u046f\5c\62\2\u0468\u046f\5[.\2\u0469"+
		"\u046f\5e\63\2\u046a\u046f\t\6\2\2\u046b\u046f\5E#\2\u046c\u046f\5G$\2"+
		"\u046d\u046f\5K&\2\u046e\u0467\3\2\2\2\u046e\u0468\3\2\2\2\u046e\u0469"+
		"\3\2\2\2\u046e\u046a\3\2\2\2\u046e\u046b\3\2\2\2\u046e\u046c\3\2\2\2\u046e"+
		"\u046d\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u0471\3\2"+
		"\2\2\u0471h\3\2\2\2\u0472\u0470\3\2\2\2\u0473\u0474\7\61\2\2\u0474\u0475"+
		"\7\61\2\2\u0475\u0479\3\2\2\2\u0476\u0478\n\13\2\2\u0477\u0476\3\2\2\2"+
		"\u0478\u047b\3\2\2\2\u0479\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047d"+
		"\3\2\2\2\u047b\u0479\3\2\2\2\u047c\u047e\7\17\2\2\u047d\u047c\3\2\2\2"+
		"\u047d\u047e\3\2\2\2\u047e\u0480\3\2\2\2\u047f\u0481\t\f\2\2\u0480\u047f"+
		"\3\2\2\2\u0481\u048e\3\2\2\2\u0482\u0483\7\61\2\2\u0483\u0484\7,\2\2\u0484"+
		"\u0488\3\2\2\2\u0485\u0487\13\2\2\2\u0486\u0485\3\2\2\2\u0487\u048a\3"+
		"\2\2\2\u0488\u0489\3\2\2\2\u0488\u0486\3\2\2\2\u0489\u048b\3\2\2\2\u048a"+
		"\u0488\3\2\2\2\u048b\u048c\7,\2\2\u048c\u048e\7\61\2\2\u048d\u0473\3\2"+
		"\2\2\u048d\u0482\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\b\65\2\2\u0490"+
		"j\3\2\2\2\u0491\u0493\t\r\2\2\u0492\u0491\3\2\2\2\u0493\u0494\3\2\2\2"+
		"\u0494\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497"+
		"\b\66\2\2\u0497l\3\2\2\2\u0498\u0499\13\2\2\2\u0499n\3\2\2\2\27\2\u03cc"+
		"\u03db\u03dd\u03e6\u03e8\u03f6\u044a\u044d\u0453\u0457\u0463\u0465\u046e"+
		"\u0470\u0479\u047d\u0480\u0488\u048d\u0494\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}