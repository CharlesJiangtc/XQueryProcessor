// Generated from E:/IntelliJ IDEA 2020.3.1/projects/ms1/XQP\Xpath.g4 by ANTLR 4.9.1
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
		T__17=18, T__18=19, T__19=20, TAGNAME=21, ATTRIBNAME=22, STRING=23, TEXT=24, 
		WS=25, FILE=26;
	public static final int
		RULE_doc = 0, RULE_filename = 1, RULE_ap = 2, RULE_rp = 3, RULE_filter = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"doc", "filename", "ap", "rp", "filter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc'", "'('", "'\"'", "')'", "'/'", "'//'", "'*'", "'.'", "'..'", 
			"'@'", "'['", "']'", "','", "'='", "'eq'", "'=='", "'is'", "'and'", "'or'", 
			"'not'", null, null, null, "'text()'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "TAGNAME", "ATTRIBNAME", 
			"STRING", "TEXT", "WS", "FILE"
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
		enterRule(_localctx, 0, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			match(T__1);
			setState(12);
			match(T__2);
			setState(13);
			filename();
			setState(14);
			match(T__2);
			setState(15);
			match(T__3);
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
		enterRule(_localctx, 2, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
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
		enterRule(_localctx, 4, RULE_ap);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new Ap_childrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				doc();
				setState(20);
				match(T__4);
				setState(21);
				rp(0);
				}
				break;
			case 2:
				_localctx = new Ap_allContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				doc();
				setState(24);
				match(T__5);
				setState(25);
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
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAGNAME:
				{
				_localctx = new Rp_tagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(30);
				match(TAGNAME);
				}
				break;
			case T__6:
				{
				_localctx = new Rp_descendantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new Rp_siblingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new Rp_parentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(T__8);
				}
				break;
			case TEXT:
				{
				_localctx = new Rp_txtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(TEXT);
				}
				break;
			case T__9:
				{
				_localctx = new Rp_attNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(T__9);
				setState(36);
				match(ATTRIBNAME);
				}
				break;
			case T__1:
				{
				_localctx = new Rp_selfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(T__1);
				setState(38);
				rp(0);
				setState(39);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(57);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new Rp_childrenContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(43);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(44);
						match(T__4);
						setState(45);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new Rp_allContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(46);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(47);
						match(T__5);
						setState(48);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new Rp_mergeContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(49);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(50);
						match(T__12);
						setState(51);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new Rp_filterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(52);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(53);
						match(T__10);
						setState(54);
						filter(0);
						setState(55);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(61);
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
		public TerminalNode STRING() { return getToken(XpathParser.STRING, 0); }
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
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new Filter_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(63);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new Filter_equalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				rp(0);
				setState(65);
				match(T__13);
				setState(66);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new Filter_equalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				rp(0);
				setState(69);
				match(T__14);
				setState(70);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new Filter_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				rp(0);
				setState(73);
				match(T__15);
				setState(74);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new Filter_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				rp(0);
				setState(77);
				match(T__16);
				setState(78);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new Filter_parentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(T__1);
				setState(81);
				filter(0);
				setState(82);
				match(T__3);
				}
				break;
			case 7:
				{
				_localctx = new Filter_txtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				rp(0);
				setState(85);
				match(T__13);
				setState(86);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new Filter_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(T__19);
				setState(89);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Filter_andContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(92);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(93);
						match(T__17);
						setState(94);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new Filter_orContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(95);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(96);
						match(T__18);
						setState(97);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(102);
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
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\36\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5,\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6]\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6e\n\6\f\6\16\6h\13\6\3\6\2"+
		"\4\b\n\7\2\4\6\b\n\2\2\2x\2\f\3\2\2\2\4\23\3\2\2\2\6\35\3\2\2\2\b+\3\2"+
		"\2\2\n\\\3\2\2\2\f\r\7\3\2\2\r\16\7\4\2\2\16\17\7\5\2\2\17\20\5\4\3\2"+
		"\20\21\7\5\2\2\21\22\7\6\2\2\22\3\3\2\2\2\23\24\7\34\2\2\24\5\3\2\2\2"+
		"\25\26\5\2\2\2\26\27\7\7\2\2\27\30\5\b\5\2\30\36\3\2\2\2\31\32\5\2\2\2"+
		"\32\33\7\b\2\2\33\34\5\b\5\2\34\36\3\2\2\2\35\25\3\2\2\2\35\31\3\2\2\2"+
		"\36\7\3\2\2\2\37 \b\5\1\2 ,\7\27\2\2!,\7\t\2\2\",\7\n\2\2#,\7\13\2\2$"+
		",\7\32\2\2%&\7\f\2\2&,\7\30\2\2\'(\7\4\2\2()\5\b\5\2)*\7\6\2\2*,\3\2\2"+
		"\2+\37\3\2\2\2+!\3\2\2\2+\"\3\2\2\2+#\3\2\2\2+$\3\2\2\2+%\3\2\2\2+\'\3"+
		"\2\2\2,=\3\2\2\2-.\f\6\2\2./\7\7\2\2/<\5\b\5\7\60\61\f\5\2\2\61\62\7\b"+
		"\2\2\62<\5\b\5\6\63\64\f\3\2\2\64\65\7\17\2\2\65<\5\b\5\4\66\67\f\4\2"+
		"\2\678\7\r\2\289\5\n\6\29:\7\16\2\2:<\3\2\2\2;-\3\2\2\2;\60\3\2\2\2;\63"+
		"\3\2\2\2;\66\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\t\3\2\2\2?=\3\2\2"+
		"\2@A\b\6\1\2A]\5\b\5\2BC\5\b\5\2CD\7\20\2\2DE\5\b\5\2E]\3\2\2\2FG\5\b"+
		"\5\2GH\7\21\2\2HI\5\b\5\2I]\3\2\2\2JK\5\b\5\2KL\7\22\2\2LM\5\b\5\2M]\3"+
		"\2\2\2NO\5\b\5\2OP\7\23\2\2PQ\5\b\5\2Q]\3\2\2\2RS\7\4\2\2ST\5\n\6\2TU"+
		"\7\6\2\2U]\3\2\2\2VW\5\b\5\2WX\7\20\2\2XY\7\31\2\2Y]\3\2\2\2Z[\7\26\2"+
		"\2[]\5\n\6\3\\@\3\2\2\2\\B\3\2\2\2\\F\3\2\2\2\\J\3\2\2\2\\N\3\2\2\2\\"+
		"R\3\2\2\2\\V\3\2\2\2\\Z\3\2\2\2]f\3\2\2\2^_\f\5\2\2_`\7\24\2\2`e\5\n\6"+
		"\6ab\f\4\2\2bc\7\25\2\2ce\5\n\6\5d^\3\2\2\2da\3\2\2\2eh\3\2\2\2fd\3\2"+
		"\2\2fg\3\2\2\2g\13\3\2\2\2hf\3\2\2\2\t\35+;=\\df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}