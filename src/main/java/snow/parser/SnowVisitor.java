// Generated from D:/code/snow/src/main/java/snow/antlr\Snow.g4 by ANTLR 4.12.0

package snow.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SnowParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SnowVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SnowParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(SnowParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(SnowParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElement(SnowParser.SelectElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SnowParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SnowParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(SnowParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SnowParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(SnowParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SnowParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SnowParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(SnowParser.UidContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SnowParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(SnowParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#columnAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAlias(SnowParser.ColumnAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#allColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllColumns(SnowParser.AllColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SnowParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit(SnowParser.LimitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(SnowParser.OffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SnowParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordsCanBeId(SnowParser.KeywordsCanBeIdContext ctx);
}