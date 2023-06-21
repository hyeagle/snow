// Generated from D:/code/snow/src/main/java/snow/antlr\Snow.g4 by ANTLR 4.12.0

package snow.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SnowParser}.
 */
public interface SnowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SnowParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(SnowParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(SnowParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(SnowParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(SnowParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(SnowParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(SnowParser.SelectElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SnowParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SnowParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SnowParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SnowParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SnowParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SnowParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SnowParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SnowParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SnowParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SnowParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SnowParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SnowParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SnowParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SnowParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(SnowParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(SnowParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SnowParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SnowParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(SnowParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(SnowParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#columnAlias}.
	 * @param ctx the parse tree
	 */
	void enterColumnAlias(SnowParser.ColumnAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#columnAlias}.
	 * @param ctx the parse tree
	 */
	void exitColumnAlias(SnowParser.ColumnAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#allColumns}.
	 * @param ctx the parse tree
	 */
	void enterAllColumns(SnowParser.AllColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#allColumns}.
	 * @param ctx the parse tree
	 */
	void exitAllColumns(SnowParser.AllColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SnowParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SnowParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#limit}.
	 * @param ctx the parse tree
	 */
	void enterLimit(SnowParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#limit}.
	 * @param ctx the parse tree
	 */
	void exitLimit(SnowParser.LimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(SnowParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(SnowParser.OffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SnowParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SnowParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void enterKeywordsCanBeId(SnowParser.KeywordsCanBeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void exitKeywordsCanBeId(SnowParser.KeywordsCanBeIdContext ctx);
}