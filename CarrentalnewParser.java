// Generated from Carrentalnew.g4 by ANTLR 4.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CarrentalnewParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__45=1, T__44=2, T__43=3, T__42=4, T__41=5, T__40=6, T__39=7, T__38=8, 
		T__37=9, T__36=10, T__35=11, T__34=12, T__33=13, T__32=14, T__31=15, T__30=16, 
		T__29=17, T__28=18, T__27=19, T__26=20, T__25=21, T__24=22, T__23=23, 
		T__22=24, T__21=25, T__20=26, T__19=27, T__18=28, T__17=29, T__16=30, 
		T__15=31, T__14=32, T__13=33, T__12=34, T__11=35, T__10=36, T__9=37, T__8=38, 
		T__7=39, T__6=40, T__5=41, T__4=42, T__3=43, T__2=44, T__1=45, T__0=46, 
		INT=47, ID=48, WS=49, ARTICLE=50;
	public static final String[] tokenNames = {
		"<INVALID>", "'rental price'", "'price conversion'", "'of'", "'that'", 
		"'at least one'", "'some'", "'each'", "'provisionally charged to'", "'AND'", 
		"'it is impossible that'", "'exactly '", "'IF'", "'for'", "'if'", "'at least '", 
		"'THEN'", "'converted to'", "'more than one'", "'is'", "'it is prohibited that'", 
		"'has'", "'open rental'", "' and at most '", "'which'", "'Then'", "'operating company'", 
		"'responsible for'", "'exactly one'", "'it is obligatory that'", "'is not'", 
		"'estimated rental price'", "'If'", "'requests'", "'at most '", "'in the name of'", 
		"'insurer'", "'OR'", "'or'", "'who'", "'currency'", "'rental'", "'renter'", 
		"'credit card'", "'at most one'", "'and'", "'then'", "INT", "ID", "WS", 
		"ARTICLE"
	};
	public static final int
		RULE_sbvr = 0, RULE_pola = 1, RULE_obligasi = 2, RULE_kalimatifelse = 3, 
		RULE_modalobligasi = 4, RULE_statement = 5, RULE_numberedQuantification = 6, 
		RULE_identifier = 7, RULE_quantification = 8, RULE_iftoken = 9, RULE_thentoken = 10, 
		RULE_disjunction = 11, RULE_conjunction = 12, RULE_term = 13, RULE_dt = 14, 
		RULE_noun = 15, RULE_verb = 16, RULE_keyword = 17;
	public static final String[] ruleNames = {
		"sbvr", "pola", "obligasi", "kalimatifelse", "modalobligasi", "statement", 
		"numberedQuantification", "identifier", "quantification", "iftoken", "thentoken", 
		"disjunction", "conjunction", "term", "dt", "noun", "verb", "keyword"
	};

	@Override
	public String getGrammarFileName() { return "Carrentalnew.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CarrentalnewParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SbvrContext extends ParserRuleContext {
		public PolaContext pola() {
			return getRuleContext(PolaContext.class,0);
		}
		public SbvrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sbvr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterSbvr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitSbvr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitSbvr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SbvrContext sbvr() throws RecognitionException {
		SbvrContext _localctx = new SbvrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sbvr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); pola();
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

	public static class PolaContext extends ParserRuleContext {
		public ObligasiContext obligasi() {
			return getRuleContext(ObligasiContext.class,0);
		}
		public KalimatifelseContext kalimatifelse() {
			return getRuleContext(KalimatifelseContext.class,0);
		}
		public PolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pola; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterPola(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitPola(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitPola(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolaContext pola() throws RecognitionException {
		PolaContext _localctx = new PolaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pola);
		try {
			setState(40);
			switch (_input.LA(1)) {
			case T__45:
			case T__44:
			case T__42:
			case T__41:
			case T__40:
			case T__39:
			case T__36:
			case T__28:
			case T__26:
			case T__24:
			case T__22:
			case T__20:
			case T__18:
			case T__17:
			case T__15:
			case T__10:
			case T__7:
			case T__6:
			case T__5:
			case T__4:
			case T__3:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); obligasi();
				}
				break;
			case T__34:
			case T__32:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); kalimatifelse();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ObligasiContext extends ParserRuleContext {
		public ObligasiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obligasi; }
	 
		public ObligasiContext() { }
		public void copyFrom(ObligasiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Obligasi_4Context extends ObligasiContext {
		public ModalobligasiContext modalobligasi() {
			return getRuleContext(ModalobligasiContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Obligasi_4Context(ObligasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterObligasi_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitObligasi_4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitObligasi_4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Obligasi_2Context extends ObligasiContext {
		public IftokenContext iftoken() {
			return getRuleContext(IftokenContext.class,0);
		}
		public ModalobligasiContext modalobligasi() {
			return getRuleContext(ModalobligasiContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Obligasi_2Context(ObligasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterObligasi_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitObligasi_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitObligasi_2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Obligasi_1Context extends ObligasiContext {
		public ModalobligasiContext modalobligasi() {
			return getRuleContext(ModalobligasiContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Obligasi_1Context(ObligasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterObligasi_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitObligasi_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitObligasi_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObligasiContext obligasi() throws RecognitionException {
		ObligasiContext _localctx = new ObligasiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_obligasi);
		try {
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Obligasi_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42); modalobligasi();
				setState(43); statement();
				}
				break;

			case 2:
				_localctx = new Obligasi_2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45); modalobligasi();
				setState(46); statement();
				setState(47); iftoken();
				setState(48); statement();
				}
				break;

			case 3:
				_localctx = new Obligasi_4Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50); statement();
				setState(51); modalobligasi();
				setState(52); statement();
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

	public static class KalimatifelseContext extends ParserRuleContext {
		public KalimatifelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kalimatifelse; }
	 
		public KalimatifelseContext() { }
		public void copyFrom(KalimatifelseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ifthenelse_1Context extends KalimatifelseContext {
		public IftokenContext iftoken() {
			return getRuleContext(IftokenContext.class,0);
		}
		public ThentokenContext thentoken() {
			return getRuleContext(ThentokenContext.class,0);
		}
		public ObligasiContext obligasi() {
			return getRuleContext(ObligasiContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Ifthenelse_1Context(KalimatifelseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterIfthenelse_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitIfthenelse_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitIfthenelse_1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ifthenelse_2Context extends KalimatifelseContext {
		public IftokenContext iftoken() {
			return getRuleContext(IftokenContext.class,0);
		}
		public ThentokenContext thentoken() {
			return getRuleContext(ThentokenContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Ifthenelse_2Context(KalimatifelseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterIfthenelse_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitIfthenelse_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitIfthenelse_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KalimatifelseContext kalimatifelse() throws RecognitionException {
		KalimatifelseContext _localctx = new KalimatifelseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_kalimatifelse);
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Ifthenelse_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56); iftoken();
				setState(57); statement();
				setState(58); thentoken();
				setState(59); obligasi();
				}
				break;

			case 2:
				_localctx = new Ifthenelse_2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61); iftoken();
				setState(62); statement();
				setState(63); thentoken();
				setState(64); statement();
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

	public static class ModalobligasiContext extends ParserRuleContext {
		public Token obligationoperator;
		public ModalobligasiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modalobligasi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterModalobligasi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitModalobligasi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitModalobligasi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModalobligasiContext modalobligasi() throws RecognitionException {
		ModalobligasiContext _localctx = new ModalobligasiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modalobligasi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((ModalobligasiContext)_localctx).obligationoperator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__26) | (1L << T__17))) != 0)) ) {
				((ModalobligasiContext)_localctx).obligationoperator = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Pola_statement_4Context extends StatementContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public Pola_statement_4Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterPola_statement_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitPola_statement_4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitPola_statement_4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pola_statement_3Context extends StatementContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public VerbContext verb(int i) {
			return getRuleContext(VerbContext.class,i);
		}
		public List<VerbContext> verb() {
			return getRuleContexts(VerbContext.class);
		}
		public Pola_statement_3Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterPola_statement_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitPola_statement_3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitPola_statement_3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pola_statement_5Context extends StatementContext {
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public Pola_statement_5Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterPola_statement_5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitPola_statement_5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitPola_statement_5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pola_statement_2Context extends StatementContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public Pola_statement_2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterPola_statement_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitPola_statement_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitPola_statement_2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pola_statement_1Context extends StatementContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public List<QuantificationContext> quantification() {
			return getRuleContexts(QuantificationContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public QuantificationContext quantification(int i) {
			return getRuleContext(QuantificationContext.class,i);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public Pola_statement_1Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterPola_statement_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitPola_statement_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitPola_statement_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Pola_statement_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70); quantification();
				setState(71); term();
				setState(72); verb();
				setState(73); quantification();
				setState(74); term();
				}
				break;

			case 2:
				_localctx = new Pola_statement_2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76); term();
				setState(77); identifier();
				setState(78); verb();
				setState(79); term();
				}
				break;

			case 3:
				_localctx = new Pola_statement_3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81); term();
				setState(82); verb();
				setState(83); term();
				setState(84); verb();
				setState(85); term();
				}
				break;

			case 4:
				_localctx = new Pola_statement_4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(87); term();
				setState(88); verb();
				setState(89); term();
				}
				break;

			case 5:
				_localctx = new Pola_statement_5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(91); term();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__9) | (1L << T__8) | (1L << T__1))) != 0)) {
					{
					{
					setState(94);
					switch (_input.LA(1)) {
					case T__9:
					case T__8:
						{
						setState(92); disjunction();
						}
						break;
					case T__37:
					case T__1:
						{
						setState(93); conjunction();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(96); term();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class NumberedQuantificationContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(CarrentalnewParser.INT, i);
		}
		public List<TerminalNode> INT() { return getTokens(CarrentalnewParser.INT); }
		public NumberedQuantificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberedQuantification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterNumberedQuantification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitNumberedQuantification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitNumberedQuantification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberedQuantificationContext numberedQuantification() throws RecognitionException {
		NumberedQuantificationContext _localctx = new NumberedQuantificationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numberedQuantification);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); match(T__31);
				setState(106); match(INT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); match(T__12);
				setState(108); match(INT);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109); match(T__35);
				setState(110); match(INT);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111); match(T__31);
				setState(112); match(INT);
				setState(113); match(T__23);
				setState(114); match(INT);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Token identifierType;
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((IdentifierContext)_localctx).identifierType = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__16) ) {
				((IdentifierContext)_localctx).identifierType = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class QuantificationContext extends ParserRuleContext {
		public Token keywordQuantification;
		public QuantificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterQuantification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitQuantification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitQuantification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantificationContext quantification() throws RecognitionException {
		QuantificationContext _localctx = new QuantificationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quantification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((QuantificationContext)_localctx).keywordQuantification = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__28) | (1L << T__18) | (1L << T__2))) != 0)) ) {
				((QuantificationContext)_localctx).keywordQuantification = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class IftokenContext extends ParserRuleContext {
		public IftokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iftoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterIftoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitIftoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitIftoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IftokenContext iftoken() throws RecognitionException {
		IftokenContext _localctx = new IftokenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_iftoken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__32) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ThentokenContext extends ParserRuleContext {
		public ThentokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thentoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterThentoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitThentoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitThentoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThentokenContext thentoken() throws RecognitionException {
		ThentokenContext _localctx = new ThentokenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_thentoken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__21) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class DisjunctionContext extends ParserRuleContext {
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ConjunctionContext extends ParserRuleContext {
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Term_type3Context extends TermContext {
		public DtContext dt() {
			return getRuleContext(DtContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public Term_type3Context(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterTerm_type3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitTerm_type3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitTerm_type3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_type2Context extends TermContext {
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public Term_type2Context(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterTerm_type2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitTerm_type2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitTerm_type2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_type1Context extends TermContext {
		public DtContext dt() {
			return getRuleContext(DtContext.class,0);
		}
		public Term_type1Context(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterTerm_type1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitTerm_type1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitTerm_type1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Term_type1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129); dt();
				}
				break;

			case 2:
				_localctx = new Term_type2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130); noun();
				}
				break;

			case 3:
				_localctx = new Term_type3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(131); dt();
				setState(132); keyword();
				setState(133); identifier();
				setState(134); verb();
				setState(135); term();
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

	public static class DtContext extends ParserRuleContext {
		public DtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dt; }
	 
		public DtContext() { }
		public void copyFrom(DtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Pola_DT_1Context extends DtContext {
		public List<NounContext> noun() {
			return getRuleContexts(NounContext.class);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public NounContext noun(int i) {
			return getRuleContext(NounContext.class,i);
		}
		public Pola_DT_1Context(DtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterPola_DT_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitPola_DT_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitPola_DT_1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pola_DT_3Context extends DtContext {
		public List<NounContext> noun() {
			return getRuleContexts(NounContext.class);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public NounContext noun(int i) {
			return getRuleContext(NounContext.class,i);
		}
		public Pola_DT_3Context(DtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterPola_DT_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitPola_DT_3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitPola_DT_3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pola_DT_2Context extends DtContext {
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public Pola_DT_2Context(DtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterPola_DT_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitPola_DT_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitPola_DT_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtContext dt() throws RecognitionException {
		DtContext _localctx = new DtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dt);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Pola_DT_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139); noun();
				setState(140); verb();
				setState(141); noun();
				}
				break;

			case 2:
				_localctx = new Pola_DT_2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143); keyword();
				setState(144); identifier();
				setState(145); verb();
				setState(146); noun();
				}
				break;

			case 3:
				_localctx = new Pola_DT_3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148); noun();
				setState(149); keyword();
				setState(150); identifier();
				setState(151); verb();
				setState(152); noun();
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

	public static class NounContext extends ParserRuleContext {
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterNoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitNoun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitNoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_noun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__44) | (1L << T__24) | (1L << T__20) | (1L << T__15) | (1L << T__10) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VerbContext extends ParserRuleContext {
		public Token posessiveVerb;
		public Token verbConcept;
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitVerb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_verb);
		int _la;
		try {
			setState(160);
			switch (_input.LA(1)) {
			case T__43:
			case T__33:
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				((VerbContext)_localctx).posessiveVerb = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__33) | (1L << T__25))) != 0)) ) {
					((VerbContext)_localctx).posessiveVerb = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case T__38:
			case T__29:
			case T__19:
			case T__13:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				((VerbContext)_localctx).verbConcept = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__29) | (1L << T__19) | (1L << T__13) | (1L << T__11))) != 0)) ) {
					((VerbContext)_localctx).verbConcept = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarrentalnewListener ) ((CarrentalnewListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarrentalnewVisitor ) return ((CarrentalnewVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__22) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u00a7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5E\n"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\7\3\7\7\7e\n\7\f\7\16"+
		"\7h\13\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bv\n\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u008c\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009d\n\20\3\21\3\21\3\22"+
		"\3\22\5\22\u00a3\n\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\r\5\2\f\f\26\26\37\37\4\2\25\25  \6\2\7\t\24\24\36"+
		"\36..\5\2\16\16\20\20\"\"\5\2\22\22\33\33\60\60\3\2\'(\4\2\13\13//\b\2"+
		"\3\4\30\30\34\34!!&&*-\5\2\5\5\17\17\27\27\7\2\n\n\23\23\35\35##%%\5\2"+
		"\6\6\32\32))\u00a6\2&\3\2\2\2\4*\3\2\2\2\68\3\2\2\2\bD\3\2\2\2\nF\3\2"+
		"\2\2\fi\3\2\2\2\16u\3\2\2\2\20w\3\2\2\2\22y\3\2\2\2\24{\3\2\2\2\26}\3"+
		"\2\2\2\30\177\3\2\2\2\32\u0081\3\2\2\2\34\u008b\3\2\2\2\36\u009c\3\2\2"+
		"\2 \u009e\3\2\2\2\"\u00a2\3\2\2\2$\u00a4\3\2\2\2&\'\5\4\3\2\'\3\3\2\2"+
		"\2(+\5\6\4\2)+\5\b\5\2*(\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\5\n\6\2-.\5\f"+
		"\7\2.9\3\2\2\2/\60\5\n\6\2\60\61\5\f\7\2\61\62\5\24\13\2\62\63\5\f\7\2"+
		"\639\3\2\2\2\64\65\5\f\7\2\65\66\5\n\6\2\66\67\5\f\7\2\679\3\2\2\28,\3"+
		"\2\2\28/\3\2\2\28\64\3\2\2\29\7\3\2\2\2:;\5\24\13\2;<\5\f\7\2<=\5\26\f"+
		"\2=>\5\6\4\2>E\3\2\2\2?@\5\24\13\2@A\5\f\7\2AB\5\26\f\2BC\5\f\7\2CE\3"+
		"\2\2\2D:\3\2\2\2D?\3\2\2\2E\t\3\2\2\2FG\t\2\2\2G\13\3\2\2\2HI\5\22\n\2"+
		"IJ\5\34\17\2JK\5\"\22\2KL\5\22\n\2LM\5\34\17\2Mj\3\2\2\2NO\5\34\17\2O"+
		"P\5\20\t\2PQ\5\"\22\2QR\5\34\17\2Rj\3\2\2\2ST\5\34\17\2TU\5\"\22\2UV\5"+
		"\34\17\2VW\5\"\22\2WX\5\34\17\2Xj\3\2\2\2YZ\5\34\17\2Z[\5\"\22\2[\\\5"+
		"\34\17\2\\j\3\2\2\2]f\5\34\17\2^a\5\30\r\2_a\5\32\16\2`^\3\2\2\2`_\3\2"+
		"\2\2ab\3\2\2\2bc\5\34\17\2ce\3\2\2\2d`\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3"+
		"\2\2\2gj\3\2\2\2hf\3\2\2\2iH\3\2\2\2iN\3\2\2\2iS\3\2\2\2iY\3\2\2\2i]\3"+
		"\2\2\2j\r\3\2\2\2kl\7\21\2\2lv\7\61\2\2mn\7$\2\2nv\7\61\2\2op\7\r\2\2"+
		"pv\7\61\2\2qr\7\21\2\2rs\7\61\2\2st\7\31\2\2tv\7\61\2\2uk\3\2\2\2um\3"+
		"\2\2\2uo\3\2\2\2uq\3\2\2\2v\17\3\2\2\2wx\t\3\2\2x\21\3\2\2\2yz\t\4\2\2"+
		"z\23\3\2\2\2{|\t\5\2\2|\25\3\2\2\2}~\t\6\2\2~\27\3\2\2\2\177\u0080\t\7"+
		"\2\2\u0080\31\3\2\2\2\u0081\u0082\t\b\2\2\u0082\33\3\2\2\2\u0083\u008c"+
		"\5\36\20\2\u0084\u008c\5 \21\2\u0085\u0086\5\36\20\2\u0086\u0087\5$\23"+
		"\2\u0087\u0088\5\20\t\2\u0088\u0089\5\"\22\2\u0089\u008a\5\34\17\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0085\3\2"+
		"\2\2\u008c\35\3\2\2\2\u008d\u008e\5 \21\2\u008e\u008f\5\"\22\2\u008f\u0090"+
		"\5 \21\2\u0090\u009d\3\2\2\2\u0091\u0092\5$\23\2\u0092\u0093\5\20\t\2"+
		"\u0093\u0094\5\"\22\2\u0094\u0095\5 \21\2\u0095\u009d\3\2\2\2\u0096\u0097"+
		"\5 \21\2\u0097\u0098\5$\23\2\u0098\u0099\5\20\t\2\u0099\u009a\5\"\22\2"+
		"\u009a\u009b\5 \21\2\u009b\u009d\3\2\2\2\u009c\u008d\3\2\2\2\u009c\u0091"+
		"\3\2\2\2\u009c\u0096\3\2\2\2\u009d\37\3\2\2\2\u009e\u009f\t\t\2\2\u009f"+
		"!\3\2\2\2\u00a0\u00a3\t\n\2\2\u00a1\u00a3\t\13\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3#\3\2\2\2\u00a4\u00a5\t\f\2\2\u00a5%\3\2\2\2"+
		"\f*8D`fiu\u008b\u009c\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}