// Generated from D:/code/snow/src/main/java/snow/antlr\Snow.g4 by ANTLR 4.12.0

package snow.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SnowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, AS=13, AND=14, AVG=15, BETWEEN=16, BY=17, 
		COUNT=18, FROM=19, GROUP=20, HAVING=21, IN=22, IS=23, LIKE=24, LIMIT=25, 
		MAX=26, MIN=27, NOT=28, NULL=29, OFFSET=30, OR=31, ORDER=32, SELECT=33, 
		SUM=34, WHERE=35, XOR=36, ID_LITERAL=37, DEC_DIGIT=38, STRING_LITERAL=39, 
		DQUOTA_STRING=40, SQUOTA_STRING=41, BQUOTA_STRING=42, SPACE=43, COMMENT_INPUT=44, 
		LINE_COMMENT=45;
	public static final int
		RULE_querySpecification = 0, RULE_selectElements = 1, RULE_selectElement = 2, 
		RULE_functionCall = 3, RULE_fromClause = 4, RULE_groupByClause = 5, RULE_orderByClause = 6, 
		RULE_limitClause = 7, RULE_expression = 8, RULE_predicate = 9, RULE_uid = 10, 
		RULE_tableName = 11, RULE_columnName = 12, RULE_columnAlias = 13, RULE_allColumns = 14, 
		RULE_value = 15, RULE_limit = 16, RULE_offset = 17, RULE_comparisonOperator = 18, 
		RULE_keywordsCanBeId = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"querySpecification", "selectElements", "selectElement", "functionCall", 
			"fromClause", "groupByClause", "orderByClause", "limitClause", "expression", 
			"predicate", "uid", "tableName", "columnName", "columnAlias", "allColumns", 
			"value", "limit", "offset", "comparisonOperator", "keywordsCanBeId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'!'", "'*'", "'='", "'>'", "'<'", "'<='", 
			"'>='", "'<>'", "'!='", "'AS'", "'AND'", "'AVG'", "'BETWEEN'", "'BY'", 
			"'COUNT'", "'FROM'", "'GROUP'", "'HAVING'", "'IN'", "'IS'", "'LIKE'", 
			"'LIMIT'", "'MAX'", "'MIN'", "'NOT'", "'NULL'", "'OFFSET'", "'OR'", "'ORDER'", 
			"'SELECT'", "'SUM'", "'WHERE'", "'XOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "AS", "AND", "AVG", "BETWEEN", "BY", "COUNT", "FROM", "GROUP", 
			"HAVING", "IN", "IS", "LIKE", "LIMIT", "MAX", "MIN", "NOT", "NULL", "OFFSET", 
			"OR", "ORDER", "SELECT", "SUM", "WHERE", "XOR", "ID_LITERAL", "DEC_DIGIT", 
			"STRING_LITERAL", "DQUOTA_STRING", "SQUOTA_STRING", "BQUOTA_STRING", 
			"SPACE", "COMMENT_INPUT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Snow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SnowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuerySpecificationContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SnowParser.SELECT, 0); }
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_querySpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(SELECT);
			setState(41);
			selectElements();
			setState(42);
			fromClause();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(43);
				groupByClause();
				}
			}

			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(46);
				orderByClause();
				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(49);
				limitClause();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectElementsContext extends ParserRuleContext {
		public AllColumnsContext allColumns() {
			return getRuleContext(AllColumnsContext.class,0);
		}
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterSelectElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitSelectElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitSelectElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(52);
				allColumns();
				}
				break;
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
			case ID_LITERAL:
				{
				setState(53);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(56);
				match(T__0);
				setState(57);
				selectElement();
				}
				}
				setState(62);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectElementContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnAliasContext columnAlias() {
			return getRuleContext(ColumnAliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SnowParser.AS, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterSelectElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitSelectElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitSelectElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectElement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				columnName();
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(64);
						match(AS);
						}
						break;
					}
					setState(67);
					columnAlias();
					}
					break;
				}
				}
				break;
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				functionCall();
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(71);
						match(AS);
						}
						break;
					}
					setState(74);
					columnAlias();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AVG() { return getToken(SnowParser.AVG, 0); }
		public TerminalNode MAX() { return getToken(SnowParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SnowParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(SnowParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SnowParser.COUNT, 0); }
		public AllColumnsContext allColumns() {
			return getRuleContext(AllColumnsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCall);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17381228544L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(80);
				match(T__1);
				setState(81);
				columnName();
				setState(82);
				match(T__2);
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(COUNT);
				setState(85);
				match(T__1);
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(86);
					allColumns();
					}
					break;
				case ID_LITERAL:
					{
					setState(87);
					columnName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SnowParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SnowParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(94);
				match(FROM);
				setState(95);
				tableName();
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(98);
				match(WHERE);
				setState(99);
				expression(0);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SnowParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SnowParser.BY, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(GROUP);
			setState(103);
			match(BY);
			setState(104);
			columnName();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(105);
				match(T__0);
				setState(106);
				columnName();
				}
				}
				setState(111);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SnowParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SnowParser.BY, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ORDER);
			setState(113);
			match(BY);
			setState(114);
			columnName();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(115);
				match(T__0);
				setState(116);
				columnName();
				}
				}
				setState(121);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SnowParser.LIMIT, 0); }
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public TerminalNode OFFSET() { return getToken(SnowParser.OFFSET, 0); }
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LIMIT);
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(123);
					offset();
					setState(124);
					match(T__0);
					}
					break;
				}
				setState(128);
				limit();
				}
				break;
			case 2:
				{
				setState(129);
				limit();
				setState(130);
				match(OFFSET);
				setState(131);
				offset();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SnowParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SnowParser.AND, 0); }
		public TerminalNode XOR() { return getToken(SnowParser.XOR, 0); }
		public TerminalNode OR() { return getToken(SnowParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==NOT) {
				{
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(139);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(141);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(142);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70866976768L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(143);
					expression(2);
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode IS() { return getToken(SnowParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SnowParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SnowParser.NOT, 0); }
		public TerminalNode IN() { return getToken(SnowParser.IN, 0); }
		public TerminalNode BETWEEN() { return getToken(SnowParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SnowParser.AND, 0); }
		public TerminalNode LIKE() { return getToken(SnowParser.LIKE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predicate);
		int _la;
		try {
			int _alt;
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				columnName();
				setState(150);
				comparisonOperator();
				setState(151);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				columnName();
				setState(154);
				match(IS);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(155);
					match(NOT);
					}
				}

				setState(158);
				match(NULL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				columnName();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(161);
					match(NOT);
					}
				}

				setState(164);
				match(IN);
				setState(165);
				match(T__1);
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(166);
						value();
						setState(167);
						match(T__0);
						}
						} 
					}
					setState(173);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(174);
				value();
				setState(175);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				columnName();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(178);
					match(NOT);
					}
				}

				setState(181);
				match(BETWEEN);
				setState(182);
				value();
				setState(183);
				match(AND);
				setState(184);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				columnName();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(187);
					match(NOT);
					}
				}

				setState(190);
				match(LIKE);
				setState(191);
				value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UidContext extends ParserRuleContext {
		public TerminalNode ID_LITERAL() { return getToken(SnowParser.ID_LITERAL, 0); }
		public UidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterUid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitUid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitUid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UidContext uid() throws RecognitionException {
		UidContext _localctx = new UidContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_uid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode ID_LITERAL() { return getToken(SnowParser.ID_LITERAL, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ID_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode ID_LITERAL() { return getToken(SnowParser.ID_LITERAL, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ID_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnAliasContext extends ParserRuleContext {
		public TerminalNode ID_LITERAL() { return getToken(SnowParser.ID_LITERAL, 0); }
		public KeywordsCanBeIdContext keywordsCanBeId() {
			return getRuleContext(KeywordsCanBeIdContext.class,0);
		}
		public ColumnAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterColumnAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitColumnAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitColumnAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasContext columnAlias() throws RecognitionException {
		ColumnAliasContext _localctx = new ColumnAliasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columnAlias);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(ID_LITERAL);
				}
				break;
			case AS:
			case AND:
			case AVG:
			case BETWEEN:
			case BY:
			case COUNT:
			case FROM:
			case GROUP:
			case HAVING:
			case IN:
			case IS:
			case LIKE:
			case LIMIT:
			case MAX:
			case MIN:
			case NOT:
			case NULL:
			case OFFSET:
			case OR:
			case ORDER:
			case SELECT:
			case SUM:
			case WHERE:
			case XOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				keywordsCanBeId();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AllColumnsContext extends ParserRuleContext {
		public AllColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterAllColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitAllColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitAllColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllColumnsContext allColumns() throws RecognitionException {
		AllColumnsContext _localctx = new AllColumnsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_allColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SnowParser.STRING_LITERAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LimitContext extends ParserRuleContext {
		public TerminalNode DEC_DIGIT() { return getToken(SnowParser.DEC_DIGIT, 0); }
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(DEC_DIGIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode DEC_DIGIT() { return getToken(SnowParser.DEC_DIGIT, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(DEC_DIGIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordsCanBeIdContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SnowParser.AS, 0); }
		public TerminalNode AND() { return getToken(SnowParser.AND, 0); }
		public TerminalNode AVG() { return getToken(SnowParser.AVG, 0); }
		public TerminalNode BETWEEN() { return getToken(SnowParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(SnowParser.BY, 0); }
		public TerminalNode COUNT() { return getToken(SnowParser.COUNT, 0); }
		public TerminalNode FROM() { return getToken(SnowParser.FROM, 0); }
		public TerminalNode GROUP() { return getToken(SnowParser.GROUP, 0); }
		public TerminalNode HAVING() { return getToken(SnowParser.HAVING, 0); }
		public TerminalNode IN() { return getToken(SnowParser.IN, 0); }
		public TerminalNode IS() { return getToken(SnowParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(SnowParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SnowParser.LIMIT, 0); }
		public TerminalNode MAX() { return getToken(SnowParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SnowParser.MIN, 0); }
		public TerminalNode NOT() { return getToken(SnowParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SnowParser.NULL, 0); }
		public TerminalNode OFFSET() { return getToken(SnowParser.OFFSET, 0); }
		public TerminalNode OR() { return getToken(SnowParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SnowParser.ORDER, 0); }
		public TerminalNode SELECT() { return getToken(SnowParser.SELECT, 0); }
		public TerminalNode SUM() { return getToken(SnowParser.SUM, 0); }
		public TerminalNode WHERE() { return getToken(SnowParser.WHERE, 0); }
		public TerminalNode XOR() { return getToken(SnowParser.XOR, 0); }
		public KeywordsCanBeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordsCanBeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).enterKeywordsCanBeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnowListener ) ((SnowListener)listener).exitKeywordsCanBeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnowVisitor ) return ((SnowVisitor<? extends T>)visitor).visitKeywordsCanBeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordsCanBeIdContext keywordsCanBeId() throws RecognitionException {
		KeywordsCanBeIdContext _localctx = new KeywordsCanBeIdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_keywordsCanBeId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438945280L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000-\b\u0000\u0001\u0000\u0003\u00000\b\u0000\u0001\u0000\u0003"+
		"\u00003\b\u0000\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001;\b\u0001\n\u0001\f\u0001>\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0003\u0002E\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0002\u0003\u0002L\b\u0002"+
		"\u0003\u0002N\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"Y\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003]\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u0004a\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004e\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"l\b\u0005\n\u0005\f\u0005o\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006v\b\u0006\n\u0006\f\u0006y\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u007f\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0086\b\u0007\u0001\b\u0001\b\u0003\b\u008a\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0091\b\b\n\b\f\b\u0094\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u009d\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00a3\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00aa\b\t\n\t\f\t\u00ad\t\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u00b4\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00bd\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c2\b\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0003\r\u00cc\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0000\u0001\u0010\u0014\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&\u0000\u0005\u0003\u0000\u000f\u000f\u001a\u001b\"\"\u0002\u0000\u0004"+
		"\u0004\u001c\u001c\u0003\u0000\u000e\u000e\u001f\u001f$$\u0001\u0000\u0006"+
		"\f\u0001\u0000\r$\u00e3\u0000(\u0001\u0000\u0000\u0000\u00026\u0001\u0000"+
		"\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000"+
		"\u0000\b`\u0001\u0000\u0000\u0000\nf\u0001\u0000\u0000\u0000\fp\u0001"+
		"\u0000\u0000\u0000\u000ez\u0001\u0000\u0000\u0000\u0010\u0087\u0001\u0000"+
		"\u0000\u0000\u0012\u00c1\u0001\u0000\u0000\u0000\u0014\u00c3\u0001\u0000"+
		"\u0000\u0000\u0016\u00c5\u0001\u0000\u0000\u0000\u0018\u00c7\u0001\u0000"+
		"\u0000\u0000\u001a\u00cb\u0001\u0000\u0000\u0000\u001c\u00cd\u0001\u0000"+
		"\u0000\u0000\u001e\u00cf\u0001\u0000\u0000\u0000 \u00d1\u0001\u0000\u0000"+
		"\u0000\"\u00d3\u0001\u0000\u0000\u0000$\u00d5\u0001\u0000\u0000\u0000"+
		"&\u00d7\u0001\u0000\u0000\u0000()\u0005!\u0000\u0000)*\u0003\u0002\u0001"+
		"\u0000*,\u0003\b\u0004\u0000+-\u0003\n\u0005\u0000,+\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.0\u0003\f\u0006"+
		"\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000"+
		"\u0000\u000013\u0003\u000e\u0007\u000021\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u00003\u0001\u0001\u0000\u0000\u000047\u0003\u001c\u000e"+
		"\u000057\u0003\u0004\u0002\u000064\u0001\u0000\u0000\u000065\u0001\u0000"+
		"\u0000\u00007<\u0001\u0000\u0000\u000089\u0005\u0001\u0000\u00009;\u0003"+
		"\u0004\u0002\u0000:8\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0003\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000?D\u0003\u0018\f\u0000@B\u0005\r"+
		"\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CE\u0003\u001a\r\u0000DA\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EN\u0001\u0000\u0000\u0000FK\u0003\u0006\u0003\u0000"+
		"GI\u0005\r\u0000\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JL\u0003\u001a\r\u0000KH\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000M?\u0001\u0000\u0000"+
		"\u0000MF\u0001\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OP\u0007"+
		"\u0000\u0000\u0000PQ\u0005\u0002\u0000\u0000QR\u0003\u0018\f\u0000RS\u0005"+
		"\u0003\u0000\u0000S]\u0001\u0000\u0000\u0000TU\u0005\u0012\u0000\u0000"+
		"UX\u0005\u0002\u0000\u0000VY\u0003\u001c\u000e\u0000WY\u0003\u0018\f\u0000"+
		"XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u0003\u0000\u0000[]\u0001\u0000\u0000\u0000\\O\u0001\u0000"+
		"\u0000\u0000\\T\u0001\u0000\u0000\u0000]\u0007\u0001\u0000\u0000\u0000"+
		"^_\u0005\u0013\u0000\u0000_a\u0003\u0016\u000b\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000bc\u0005#\u0000"+
		"\u0000ce\u0003\u0010\b\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000e\t\u0001\u0000\u0000\u0000fg\u0005\u0014\u0000\u0000gh\u0005\u0011"+
		"\u0000\u0000hm\u0003\u0018\f\u0000ij\u0005\u0001\u0000\u0000jl\u0003\u0018"+
		"\f\u0000ki\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000n\u000b\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pq\u0005 \u0000\u0000qr\u0005\u0011\u0000\u0000"+
		"rw\u0003\u0018\f\u0000st\u0005\u0001\u0000\u0000tv\u0003\u0018\f\u0000"+
		"us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\r\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000z\u0085\u0005\u0019\u0000\u0000{|\u0003\"\u0011\u0000|}\u0005"+
		"\u0001\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~{\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0086\u0003 \u0010\u0000\u0081\u0082\u0003 \u0010\u0000\u0082\u0083"+
		"\u0005\u001e\u0000\u0000\u0083\u0084\u0003\"\u0011\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085~\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000"+
		"\u0000\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u0089\u0006\b\uffff"+
		"\uffff\u0000\u0088\u008a\u0007\u0001\u0000\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0003\u0012\t\u0000\u008c\u0092\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\n\u0001\u0000\u0000\u008e\u008f\u0007\u0002\u0000\u0000"+
		"\u008f\u0091\u0003\u0010\b\u0002\u0090\u008d\u0001\u0000\u0000\u0000\u0091"+
		"\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0011\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u0018\f\u0000\u0096\u0097"+
		"\u0003$\u0012\u0000\u0097\u0098\u0003\u001e\u000f\u0000\u0098\u00c2\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0003\u0018\f\u0000\u009a\u009c\u0005\u0017"+
		"\u0000\u0000\u009b\u009d\u0005\u001c\u0000\u0000\u009c\u009b\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u001d\u0000\u0000\u009f\u00c2\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a2\u0003\u0018\f\u0000\u00a1\u00a3\u0005\u001c\u0000"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0016\u0000"+
		"\u0000\u00a5\u00ab\u0005\u0002\u0000\u0000\u00a6\u00a7\u0003\u001e\u000f"+
		"\u0000\u00a7\u00a8\u0005\u0001\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0003\u001e\u000f\u0000\u00af\u00b0\u0005\u0003\u0000"+
		"\u0000\u00b0\u00c2\u0001\u0000\u0000\u0000\u00b1\u00b3\u0003\u0018\f\u0000"+
		"\u00b2\u00b4\u0005\u001c\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005\u0010\u0000\u0000\u00b6\u00b7\u0003\u001e\u000f\u0000"+
		"\u00b7\u00b8\u0005\u000e\u0000\u0000\u00b8\u00b9\u0003\u001e\u000f\u0000"+
		"\u00b9\u00c2\u0001\u0000\u0000\u0000\u00ba\u00bc\u0003\u0018\f\u0000\u00bb"+
		"\u00bd\u0005\u001c\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005\u0018\u0000\u0000\u00bf\u00c0\u0003\u001e\u000f\u0000\u00c0"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c1\u0095\u0001\u0000\u0000\u0000\u00c1"+
		"\u0099\u0001\u0000\u0000\u0000\u00c1\u00a0\u0001\u0000\u0000\u0000\u00c1"+
		"\u00b1\u0001\u0000\u0000\u0000\u00c1\u00ba\u0001\u0000\u0000\u0000\u00c2"+
		"\u0013\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005%\u0000\u0000\u00c4\u0015"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005%\u0000\u0000\u00c6\u0017\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005%\u0000\u0000\u00c8\u0019\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cc\u0005%\u0000\u0000\u00ca\u00cc\u0003&\u0013\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u001b\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0005\u0000\u0000"+
		"\u00ce\u001d\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\'\u0000\u0000\u00d0"+
		"\u001f\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005&\u0000\u0000\u00d2!\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005&\u0000\u0000\u00d4#\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0007\u0003\u0000\u0000\u00d6%\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0007\u0004\u0000\u0000\u00d8\'\u0001\u0000\u0000\u0000\u001b"+
		",/26<ADHKMX\\`dmw~\u0085\u0089\u0092\u009c\u00a2\u00ab\u00b3\u00bc\u00c1"+
		"\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}