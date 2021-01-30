// Generated from C:/Users/charl/Desktop/XQueryProcessor\Xpath.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XpathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, WS=21, FILE=22, TEXT=23, TAGNAME=24, ATTRIBNAME=25, 
		STRING=26;
	public static final int
		RULE_ap = 0, RULE_doc = 1, RULE_filename = 2, RULE_rp = 3, RULE_filter = 4, 
		RULE_txt = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"ap", "doc", "filename", "rp", "filter", "txt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'//'", "'doc'", "'('", "'\"'", "')'", "'*'", "'.'", "'..'", 
			"'@'", "'['", "']'", "','", "'='", "'eq'", "'=='", "'is'", "'and'", "'or'", 
			"'not'", null, null, "'text()'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WS", "FILE", "TEXT", 
			"TAGNAME", "ATTRIBNAME", "STRING"
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
	public String getGrammarFileName() { return "Xpath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XpathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterAp_children(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitAp_children(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitAp_children(this);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterAp_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitAp_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitAp_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new Ap_childrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				doc();
				setState(13);
				match(T__0);
				setState(14);
				rp(0);
				}
				break;
			case 2:
				_localctx = new Ap_allContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				doc();
				setState(17);
				match(T__1);
				setState(18);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__2);
			setState(23);
			match(T__3);
			setState(24);
			match(T__4);
			setState(25);
			filename();
			setState(26);
			match(T__4);
			setState(27);
			match(T__5);
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
		public TerminalNode FILE() { return getToken(XpathParser.FILE, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
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
		public TerminalNode TEXT() { return getToken(XpathParser.TEXT, 0); }
		public Rp_txtContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterRp_txt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitRp_txt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitRp_txt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_attNameContext extends RpContext {
		public TerminalNode ATTRIBNAME() { return getToken(XpathParser.ATTRIBNAME, 0); }
		public Rp_attNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterRp_attName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitRp_attName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitRp_attName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_parentContext extends RpContext {
		public Rp_parentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterRp_parent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitRp_parent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitRp_parent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_siblingContext extends RpContext {
		public Rp_siblingContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterRp_sibling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitRp_sibling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitRp_sibling(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_descendantContext extends RpContext {
		public Rp_descendantContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterRp_descendant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitRp_descendant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitRp_descendant(this);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterRp_self(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitRp_self(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitRp_self(this);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterRp_children(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitRp_children(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitRp_children(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_tagNameContext extends RpContext {
		public TerminalNode TAGNAME() { return getToken(XpathParser.TAGNAME, 0); }
		public Rp_tagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterRp_tagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitRp_tagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitRp_tagName(this);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterRp_merge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitRp_merge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitRp_merge(this);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterRp_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitRp_filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitRp_filter(this);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterRp_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitRp_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitRp_all(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAGNAME:
				{
				_localctx = new Rp_tagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(32);
				match(TAGNAME);
				}
				break;
			case T__6:
				{
				_localctx = new Rp_descendantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new Rp_siblingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new Rp_parentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(T__8);
				}
				break;
			case TEXT:
				{
				_localctx = new Rp_txtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(TEXT);
				}
				break;
			case T__9:
				{
				_localctx = new Rp_attNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(T__9);
				setState(38);
				match(ATTRIBNAME);
				}
				break;
			case T__3:
				{
				_localctx = new Rp_selfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(T__3);
				setState(40);
				rp(0);
				setState(41);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new Rp_childrenContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(45);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(46);
						match(T__0);
						setState(47);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new Rp_allContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(48);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(49);
						match(T__1);
						setState(50);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new Rp_mergeContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(51);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(52);
						match(T__12);
						setState(53);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new Rp_filterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(54);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(55);
						match(T__10);
						setState(56);
						filter(0);
						setState(57);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterFilter_rp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitFilter_rp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitFilter_rp(this);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterFilter_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitFilter_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitFilter_and(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_bracketContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Filter_bracketContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterFilter_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitFilter_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitFilter_bracket(this);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterFilter_parent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitFilter_parent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitFilter_parent(this);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterFilter_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitFilter_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitFilter_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_txtContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public Filter_txtContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterFilter_txt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitFilter_txt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitFilter_txt(this);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterFilter_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitFilter_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitFilter_equal(this);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterFilter_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitFilter_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitFilter_or(this);
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
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterFilter_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitFilter_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitFilter_not(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new Filter_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new Filter_equalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				rp(0);
				setState(67);
				match(T__13);
				setState(68);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new Filter_equalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				rp(0);
				setState(71);
				match(T__14);
				setState(72);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new Filter_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				rp(0);
				setState(75);
				match(T__15);
				setState(76);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new Filter_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				rp(0);
				setState(79);
				match(T__16);
				setState(80);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new Filter_parentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(T__3);
				setState(83);
				filter(0);
				setState(84);
				match(T__5);
				}
				break;
			case 7:
				{
				_localctx = new Filter_txtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				rp(0);
				setState(87);
				match(T__13);
				setState(88);
				txt();
				}
				break;
			case 8:
				{
				_localctx = new Filter_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(T__19);
				setState(91);
				filter(2);
				}
				break;
			case 9:
				{
				_localctx = new Filter_bracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(T__10);
				setState(93);
				filter(0);
				setState(94);
				match(T__11);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(104);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Filter_andContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(98);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(99);
						match(T__17);
						setState(100);
						filter(5);
						}
						break;
					case 2:
						{
						_localctx = new Filter_orContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(101);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(102);
						match(T__18);
						setState(103);
						filter(4);
						}
						break;
					}
					} 
				}
				setState(108);
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

	public static class TxtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(XpathParser.STRING, 0); }
		public TxtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).enterTxt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener ) ((XpathListener)listener).exitTxt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor ) return ((XpathVisitor<? extends T>)visitor).visitTxt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TxtContext txt() throws RecognitionException {
		TxtContext _localctx = new TxtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(STRING);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 4:
			return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"\27\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5.\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6k\n"+
		"\6\f\6\16\6n\13\6\3\7\3\7\3\7\2\4\b\n\b\2\4\6\b\n\f\2\2\2\u0080\2\26\3"+
		"\2\2\2\4\30\3\2\2\2\6\37\3\2\2\2\b-\3\2\2\2\nb\3\2\2\2\fo\3\2\2\2\16\17"+
		"\5\4\3\2\17\20\7\3\2\2\20\21\5\b\5\2\21\27\3\2\2\2\22\23\5\4\3\2\23\24"+
		"\7\4\2\2\24\25\5\b\5\2\25\27\3\2\2\2\26\16\3\2\2\2\26\22\3\2\2\2\27\3"+
		"\3\2\2\2\30\31\7\5\2\2\31\32\7\6\2\2\32\33\7\7\2\2\33\34\5\6\4\2\34\35"+
		"\7\7\2\2\35\36\7\b\2\2\36\5\3\2\2\2\37 \7\30\2\2 \7\3\2\2\2!\"\b\5\1\2"+
		"\".\7\32\2\2#.\7\t\2\2$.\7\n\2\2%.\7\13\2\2&.\7\31\2\2\'(\7\f\2\2(.\7"+
		"\33\2\2)*\7\6\2\2*+\5\b\5\2+,\7\b\2\2,.\3\2\2\2-!\3\2\2\2-#\3\2\2\2-$"+
		"\3\2\2\2-%\3\2\2\2-&\3\2\2\2-\'\3\2\2\2-)\3\2\2\2.?\3\2\2\2/\60\f\6\2"+
		"\2\60\61\7\3\2\2\61>\5\b\5\7\62\63\f\5\2\2\63\64\7\4\2\2\64>\5\b\5\6\65"+
		"\66\f\3\2\2\66\67\7\17\2\2\67>\5\b\5\489\f\4\2\29:\7\r\2\2:;\5\n\6\2;"+
		"<\7\16\2\2<>\3\2\2\2=/\3\2\2\2=\62\3\2\2\2=\65\3\2\2\2=8\3\2\2\2>A\3\2"+
		"\2\2?=\3\2\2\2?@\3\2\2\2@\t\3\2\2\2A?\3\2\2\2BC\b\6\1\2Cc\5\b\5\2DE\5"+
		"\b\5\2EF\7\20\2\2FG\5\b\5\2Gc\3\2\2\2HI\5\b\5\2IJ\7\21\2\2JK\5\b\5\2K"+
		"c\3\2\2\2LM\5\b\5\2MN\7\22\2\2NO\5\b\5\2Oc\3\2\2\2PQ\5\b\5\2QR\7\23\2"+
		"\2RS\5\b\5\2Sc\3\2\2\2TU\7\6\2\2UV\5\n\6\2VW\7\b\2\2Wc\3\2\2\2XY\5\b\5"+
		"\2YZ\7\20\2\2Z[\5\f\7\2[c\3\2\2\2\\]\7\26\2\2]c\5\n\6\4^_\7\r\2\2_`\5"+
		"\n\6\2`a\7\16\2\2ac\3\2\2\2bB\3\2\2\2bD\3\2\2\2bH\3\2\2\2bL\3\2\2\2bP"+
		"\3\2\2\2bT\3\2\2\2bX\3\2\2\2b\\\3\2\2\2b^\3\2\2\2cl\3\2\2\2de\f\6\2\2"+
		"ef\7\24\2\2fk\5\n\6\7gh\f\5\2\2hi\7\25\2\2ik\5\n\6\6jd\3\2\2\2jg\3\2\2"+
		"\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\13\3\2\2\2nl\3\2\2\2op\7\34\2\2p\r\3"+
		"\2\2\2\t\26-=?bjl";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}