// Generated from E:/IntelliJ IDEA 2020.3.1/projects/ms2/src\Xquery.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XqueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, VARNAME=35, Stringconstant=36, TAGNAME=37, 
		ATTRIBNAME=38, STRING=39, TEXT=40, WS=41, FILE=42;
	public static final int
		RULE_forClause = 0, RULE_letClause = 1, RULE_whereClause = 2, RULE_returnClause = 3, 
		RULE_var = 4, RULE_xq = 5, RULE_cond = 6, RULE_doc = 7, RULE_filename = 8, 
		RULE_ap = 9, RULE_rp = 10, RULE_filter = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"forClause", "letClause", "whereClause", "returnClause", "var", "xq", 
			"cond", "doc", "filename", "ap", "rp", "filter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'in'", "','", "'let'", "':='", "'where'", "'return'", 
			"'$'", "'('", "')'", "'/'", "'//'", "'<'", "'>'", "'{'", "'}'", "'='", 
			"'eq'", "'=='", "'is'", "'empty('", "'some'", "'satisfies'", "'and'", 
			"'or'", "'not'", "'doc'", "'\"'", "'*'", "'.'", "'..'", "'@'", "'['", 
			"']'", null, null, null, null, null, "'text()'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "VARNAME", 
			"Stringconstant", "TAGNAME", "ATTRIBNAME", "STRING", "TEXT", "WS", "FILE"
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

	@Override
	public String getGrammarFileName() { return "Xquery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XqueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			var();
			setState(26);
			match(T__1);
			setState(27);
			xq(0);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(28);
				match(T__2);
				setState(29);
				var();
				setState(30);
				match(T__1);
				setState(31);
				xq(0);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__3);
			setState(39);
			var();
			setState(40);
			match(T__4);
			setState(41);
			xq(0);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(42);
				match(T__2);
				setState(43);
				var();
				setState(44);
				match(T__4);
				setState(45);
				xq(0);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__5);
			setState(53);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__6);
			setState(56);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(XqueryParser.VARNAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__7);
			setState(59);
			match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Xq_flwerContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public Xq_flwerContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXq_flwer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXq_flwer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXq_flwer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_rpchildrenContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Xq_rpchildrenContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXq_rpchildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXq_rpchildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXq_rpchildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_StringconstantContext extends XqContext {
		public TerminalNode Stringconstant() { return getToken(XqueryParser.Stringconstant, 0); }
		public Xq_StringconstantContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXq_Stringconstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXq_Stringconstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXq_Stringconstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_rpallContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Xq_rpallContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXq_rpall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXq_rpall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXq_rpall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_variableContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Xq_variableContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXq_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXq_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXq_variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_apContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public Xq_apContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXq_ap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXq_ap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXq_ap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_mergeContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public Xq_mergeContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXq_merge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXq_merge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXq_merge(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_selfContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_selfContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXq_self(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXq_self(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXq_self(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_tagContext extends XqContext {
		public List<TerminalNode> VARNAME() { return getTokens(XqueryParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(XqueryParser.VARNAME, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_tagContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXq_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXq_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXq_tag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_letContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_letContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXq_let(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXq_let(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXq_let(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new Xq_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				var();
				}
				break;
			case Stringconstant:
				{
				_localctx = new Xq_StringconstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(Stringconstant);
				}
				break;
			case T__26:
				{
				_localctx = new Xq_apContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				ap();
				}
				break;
			case T__8:
				{
				_localctx = new Xq_selfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(T__8);
				setState(66);
				xq(0);
				setState(67);
				match(T__9);
				}
				break;
			case T__12:
				{
				_localctx = new Xq_tagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(T__12);
				setState(70);
				match(VARNAME);
				setState(71);
				match(T__13);
				setState(72);
				match(T__14);
				setState(73);
				xq(0);
				setState(74);
				match(T__15);
				setState(75);
				match(T__12);
				setState(76);
				match(T__10);
				setState(77);
				match(VARNAME);
				setState(78);
				match(T__13);
				}
				break;
			case T__0:
				{
				_localctx = new Xq_flwerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				forClause();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(81);
					letClause();
					}
				}

				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(84);
					whereClause();
					}
				}

				setState(87);
				returnClause();
				}
				break;
			case T__3:
				{
				_localctx = new Xq_letContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				letClause();
				setState(90);
				xq(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Xq_mergeContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(94);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(95);
						match(T__2);
						setState(96);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new Xq_rpchildrenContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(97);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(98);
						match(T__10);
						setState(99);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new Xq_rpallContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(100);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(101);
						match(T__11);
						setState(102);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Cond_andContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Cond_andContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCond_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCond_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCond_and(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_emptyContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Cond_emptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCond_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCond_empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCond_empty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_selfContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_selfContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCond_self(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCond_self(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCond_self(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_equalContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public Cond_equalContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCond_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCond_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCond_equal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_isContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public Cond_isContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCond_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCond_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCond_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_satisfyContext extends CondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_satisfyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCond_satisfy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCond_satisfy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCond_satisfy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_notContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_notContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCond_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCond_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCond_not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_orContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Cond_orContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCond_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCond_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCond_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new Cond_equalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(109);
				xq(0);
				setState(110);
				match(T__16);
				setState(111);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new Cond_equalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				xq(0);
				setState(114);
				match(T__17);
				setState(115);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new Cond_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				xq(0);
				setState(118);
				match(T__18);
				setState(119);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new Cond_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				xq(0);
				setState(122);
				match(T__19);
				setState(123);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new Cond_emptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(T__20);
				setState(126);
				xq(0);
				setState(127);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new Cond_satisfyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(T__21);
				setState(130);
				var();
				setState(131);
				match(T__1);
				setState(132);
				xq(0);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(133);
					match(T__2);
					setState(134);
					var();
					setState(135);
					match(T__1);
					setState(136);
					xq(0);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(T__22);
				setState(144);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new Cond_selfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(T__8);
				setState(147);
				cond(0);
				setState(148);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new Cond_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(T__25);
				setState(151);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Cond_andContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(154);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(155);
						match(T__23);
						setState(156);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new Cond_orContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(157);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(158);
						match(T__24);
						setState(159);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DocContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__26);
			setState(166);
			match(T__8);
			setState(167);
			match(T__27);
			setState(168);
			filename();
			setState(169);
			match(T__27);
			setState(170);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(XqueryParser.FILE, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(FILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ap_childrenContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Ap_childrenContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterAp_children(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitAp_children(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitAp_children(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ap_allContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Ap_allContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterAp_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitAp_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitAp_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ap);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Ap_childrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				doc();
				setState(175);
				match(T__10);
				setState(176);
				rp(0);
				}
				break;
			case 2:
				_localctx = new Ap_allContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				doc();
				setState(179);
				match(T__11);
				setState(180);
				rp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rp_txtContext extends RpContext {
		public TerminalNode TEXT() { return getToken(XqueryParser.TEXT, 0); }
		public Rp_txtContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRp_txt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRp_txt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRp_txt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_attNameContext extends RpContext {
		public TerminalNode ATTRIBNAME() { return getToken(XqueryParser.ATTRIBNAME, 0); }
		public Rp_attNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRp_attName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRp_attName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRp_attName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_parentContext extends RpContext {
		public Rp_parentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRp_parent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRp_parent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRp_parent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_siblingContext extends RpContext {
		public Rp_siblingContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRp_sibling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRp_sibling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRp_sibling(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_descendantContext extends RpContext {
		public Rp_descendantContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRp_descendant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRp_descendant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRp_descendant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_selfContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Rp_selfContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRp_self(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRp_self(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRp_self(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_childrenContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Rp_childrenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRp_children(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRp_children(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRp_children(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_tagNameContext extends RpContext {
		public TerminalNode TAGNAME() { return getToken(XqueryParser.TAGNAME, 0); }
		public Rp_tagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRp_tagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRp_tagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRp_tagName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_mergeContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Rp_mergeContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRp_merge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRp_merge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRp_merge(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_filterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Rp_filterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRp_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRp_filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRp_filter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_allContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Rp_allContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRp_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRp_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRp_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAGNAME:
				{
				_localctx = new Rp_tagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(185);
				match(TAGNAME);
				}
				break;
			case T__28:
				{
				_localctx = new Rp_descendantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(T__28);
				}
				break;
			case T__29:
				{
				_localctx = new Rp_siblingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(T__29);
				}
				break;
			case T__30:
				{
				_localctx = new Rp_parentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(T__30);
				}
				break;
			case TEXT:
				{
				_localctx = new Rp_txtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(TEXT);
				}
				break;
			case T__31:
				{
				_localctx = new Rp_attNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(T__31);
				setState(191);
				match(ATTRIBNAME);
				}
				break;
			case T__8:
				{
				_localctx = new Rp_selfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(T__8);
				setState(193);
				rp(0);
				setState(194);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Rp_childrenContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(198);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(199);
						match(T__10);
						setState(200);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new Rp_allContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(201);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(202);
						match(T__11);
						setState(203);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new Rp_mergeContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(204);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(205);
						match(T__2);
						setState(206);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new Rp_filterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(207);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(208);
						match(T__32);
						setState(209);
						filter(0);
						setState(210);
						match(T__33);
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Filter_rpContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Filter_rpContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFilter_rp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFilter_rp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFilter_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_andContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public Filter_andContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFilter_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFilter_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFilter_and(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_parentContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Filter_parentContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFilter_parent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFilter_parent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFilter_parent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_isContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Filter_isContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFilter_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFilter_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFilter_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_txtContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode STRING() { return getToken(XqueryParser.STRING, 0); }
		public Filter_txtContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFilter_txt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFilter_txt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFilter_txt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_equalContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Filter_equalContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFilter_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFilter_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFilter_equal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_orContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public Filter_orContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFilter_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFilter_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFilter_or(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_notContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Filter_notContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFilter_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFilter_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFilter_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		return filter(0);
	}

	private FilterContext filter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterContext _localctx = new FilterContext(_ctx, _parentState);
		FilterContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new Filter_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(218);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new Filter_equalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				rp(0);
				setState(220);
				match(T__16);
				setState(221);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new Filter_equalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				rp(0);
				setState(224);
				match(T__17);
				setState(225);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new Filter_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				rp(0);
				setState(228);
				match(T__18);
				setState(229);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new Filter_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				rp(0);
				setState(232);
				match(T__19);
				setState(233);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new Filter_parentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				match(T__8);
				setState(236);
				filter(0);
				setState(237);
				match(T__9);
				}
				break;
			case 7:
				{
				_localctx = new Filter_txtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				rp(0);
				setState(240);
				match(T__16);
				setState(241);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new Filter_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(T__25);
				setState(244);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(253);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Filter_andContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(247);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(248);
						match(T__23);
						setState(249);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new Filter_orContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(250);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(251);
						match(T__24);
						setState(252);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 6:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 10:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 11:
			return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0105\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2$\n\2\f\2\16"+
		"\2\'\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\62\n\3\f\3\16\3\65\13"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7U\n\7\3\7\5\7"+
		"X\n\7\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7j\n\7\f\7\16\7m\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u009b\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00b9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00c7\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00d7\n\f\f\f\16\f\u00da\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00f8\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0100\n\r\f\r\16"+
		"\r\u0103\13\r\3\r\2\6\f\16\26\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2"+
		"\2\u0123\2\32\3\2\2\2\4(\3\2\2\2\6\66\3\2\2\2\b9\3\2\2\2\n<\3\2\2\2\f"+
		"^\3\2\2\2\16\u009a\3\2\2\2\20\u00a7\3\2\2\2\22\u00ae\3\2\2\2\24\u00b8"+
		"\3\2\2\2\26\u00c6\3\2\2\2\30\u00f7\3\2\2\2\32\33\7\3\2\2\33\34\5\n\6\2"+
		"\34\35\7\4\2\2\35%\5\f\7\2\36\37\7\5\2\2\37 \5\n\6\2 !\7\4\2\2!\"\5\f"+
		"\7\2\"$\3\2\2\2#\36\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2"+
		"\'%\3\2\2\2()\7\6\2\2)*\5\n\6\2*+\7\7\2\2+\63\5\f\7\2,-\7\5\2\2-.\5\n"+
		"\6\2./\7\7\2\2/\60\5\f\7\2\60\62\3\2\2\2\61,\3\2\2\2\62\65\3\2\2\2\63"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\63\3\2\2\2\66\67\7\b\2\2\67"+
		"8\5\16\b\28\7\3\2\2\29:\7\t\2\2:;\5\f\7\2;\t\3\2\2\2<=\7\n\2\2=>\7%\2"+
		"\2>\13\3\2\2\2?@\b\7\1\2@_\5\n\6\2A_\7&\2\2B_\5\24\13\2CD\7\13\2\2DE\5"+
		"\f\7\2EF\7\f\2\2F_\3\2\2\2GH\7\17\2\2HI\7%\2\2IJ\7\20\2\2JK\7\21\2\2K"+
		"L\5\f\7\2LM\7\22\2\2MN\7\17\2\2NO\7\r\2\2OP\7%\2\2PQ\7\20\2\2Q_\3\2\2"+
		"\2RT\5\2\2\2SU\5\4\3\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VX\5\6\4\2WV\3\2\2"+
		"\2WX\3\2\2\2XY\3\2\2\2YZ\5\b\5\2Z_\3\2\2\2[\\\5\4\3\2\\]\5\f\7\3]_\3\2"+
		"\2\2^?\3\2\2\2^A\3\2\2\2^B\3\2\2\2^C\3\2\2\2^G\3\2\2\2^R\3\2\2\2^[\3\2"+
		"\2\2_k\3\2\2\2`a\f\b\2\2ab\7\5\2\2bj\5\f\7\tcd\f\7\2\2de\7\r\2\2ej\5\26"+
		"\f\2fg\f\6\2\2gh\7\16\2\2hj\5\26\f\2i`\3\2\2\2ic\3\2\2\2if\3\2\2\2jm\3"+
		"\2\2\2ki\3\2\2\2kl\3\2\2\2l\r\3\2\2\2mk\3\2\2\2no\b\b\1\2op\5\f\7\2pq"+
		"\7\23\2\2qr\5\f\7\2r\u009b\3\2\2\2st\5\f\7\2tu\7\24\2\2uv\5\f\7\2v\u009b"+
		"\3\2\2\2wx\5\f\7\2xy\7\25\2\2yz\5\f\7\2z\u009b\3\2\2\2{|\5\f\7\2|}\7\26"+
		"\2\2}~\5\f\7\2~\u009b\3\2\2\2\177\u0080\7\27\2\2\u0080\u0081\5\f\7\2\u0081"+
		"\u0082\7\f\2\2\u0082\u009b\3\2\2\2\u0083\u0084\7\30\2\2\u0084\u0085\5"+
		"\n\6\2\u0085\u0086\7\4\2\2\u0086\u008e\5\f\7\2\u0087\u0088\7\5\2\2\u0088"+
		"\u0089\5\n\6\2\u0089\u008a\7\4\2\2\u008a\u008b\5\f\7\2\u008b\u008d\3\2"+
		"\2\2\u008c\u0087\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\31"+
		"\2\2\u0092\u0093\5\16\b\7\u0093\u009b\3\2\2\2\u0094\u0095\7\13\2\2\u0095"+
		"\u0096\5\16\b\2\u0096\u0097\7\f\2\2\u0097\u009b\3\2\2\2\u0098\u0099\7"+
		"\34\2\2\u0099\u009b\5\16\b\3\u009an\3\2\2\2\u009as\3\2\2\2\u009aw\3\2"+
		"\2\2\u009a{\3\2\2\2\u009a\177\3\2\2\2\u009a\u0083\3\2\2\2\u009a\u0094"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u00a4\3\2\2\2\u009c\u009d\f\5\2\2\u009d"+
		"\u009e\7\32\2\2\u009e\u00a3\5\16\b\6\u009f\u00a0\f\4\2\2\u00a0\u00a1\7"+
		"\33\2\2\u00a1\u00a3\5\16\b\5\u00a2\u009c\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\17\3\2\2"+
		"\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\7\13\2\2\u00a9"+
		"\u00aa\7\36\2\2\u00aa\u00ab\5\22\n\2\u00ab\u00ac\7\36\2\2\u00ac\u00ad"+
		"\7\f\2\2\u00ad\21\3\2\2\2\u00ae\u00af\7,\2\2\u00af\23\3\2\2\2\u00b0\u00b1"+
		"\5\20\t\2\u00b1\u00b2\7\r\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b9\3\2\2\2"+
		"\u00b4\u00b5\5\20\t\2\u00b5\u00b6\7\16\2\2\u00b6\u00b7\5\26\f\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\25\3\2\2"+
		"\2\u00ba\u00bb\b\f\1\2\u00bb\u00c7\7\'\2\2\u00bc\u00c7\7\37\2\2\u00bd"+
		"\u00c7\7 \2\2\u00be\u00c7\7!\2\2\u00bf\u00c7\7*\2\2\u00c0\u00c1\7\"\2"+
		"\2\u00c1\u00c7\7(\2\2\u00c2\u00c3\7\13\2\2\u00c3\u00c4\5\26\f\2\u00c4"+
		"\u00c5\7\f\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00ba\3\2\2\2\u00c6\u00bc\3\2"+
		"\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6"+
		"\u00c0\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7\u00d8\3\2\2\2\u00c8\u00c9\f\6"+
		"\2\2\u00c9\u00ca\7\r\2\2\u00ca\u00d7\5\26\f\7\u00cb\u00cc\f\5\2\2\u00cc"+
		"\u00cd\7\16\2\2\u00cd\u00d7\5\26\f\6\u00ce\u00cf\f\3\2\2\u00cf\u00d0\7"+
		"\5\2\2\u00d0\u00d7\5\26\f\4\u00d1\u00d2\f\4\2\2\u00d2\u00d3\7#\2\2\u00d3"+
		"\u00d4\5\30\r\2\u00d4\u00d5\7$\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00c8\3\2"+
		"\2\2\u00d6\u00cb\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\27\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00db\u00dc\b\r\1\2\u00dc\u00f8\5\26\f\2\u00dd"+
		"\u00de\5\26\f\2\u00de\u00df\7\23\2\2\u00df\u00e0\5\26\f\2\u00e0\u00f8"+
		"\3\2\2\2\u00e1\u00e2\5\26\f\2\u00e2\u00e3\7\24\2\2\u00e3\u00e4\5\26\f"+
		"\2\u00e4\u00f8\3\2\2\2\u00e5\u00e6\5\26\f\2\u00e6\u00e7\7\25\2\2\u00e7"+
		"\u00e8\5\26\f\2\u00e8\u00f8\3\2\2\2\u00e9\u00ea\5\26\f\2\u00ea\u00eb\7"+
		"\26\2\2\u00eb\u00ec\5\26\f\2\u00ec\u00f8\3\2\2\2\u00ed\u00ee\7\13\2\2"+
		"\u00ee\u00ef\5\30\r\2\u00ef\u00f0\7\f\2\2\u00f0\u00f8\3\2\2\2\u00f1\u00f2"+
		"\5\26\f\2\u00f2\u00f3\7\23\2\2\u00f3\u00f4\7)\2\2\u00f4\u00f8\3\2\2\2"+
		"\u00f5\u00f6\7\34\2\2\u00f6\u00f8\5\30\r\3\u00f7\u00db\3\2\2\2\u00f7\u00dd"+
		"\3\2\2\2\u00f7\u00e1\3\2\2\2\u00f7\u00e5\3\2\2\2\u00f7\u00e9\3\2\2\2\u00f7"+
		"\u00ed\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u0101\3\2"+
		"\2\2\u00f9\u00fa\f\5\2\2\u00fa\u00fb\7\32\2\2\u00fb\u0100\5\30\r\6\u00fc"+
		"\u00fd\f\4\2\2\u00fd\u00fe\7\33\2\2\u00fe\u0100\5\30\r\5\u00ff\u00f9\3"+
		"\2\2\2\u00ff\u00fc\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\31\3\2\2\2\u0103\u0101\3\2\2\2\24%\63TW^ik\u008e"+
		"\u009a\u00a2\u00a4\u00b8\u00c6\u00d6\u00d8\u00f7\u00ff\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}