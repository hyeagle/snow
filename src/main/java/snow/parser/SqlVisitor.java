package snow.parser;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import snow.entity.DataModel;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SqlVisitor extends SnowBaseVisitor<List<String>> {

    private final DataModel dataModel;

    public SqlVisitor(DataModel dataModel) {
        this.dataModel = dataModel;
    }

    @Override
    public List<String> visitColumnName(SnowParser.ColumnNameContext ctx) {
        return visitChildren(ctx).stream()
                .map(s -> dataModel.columnName(s, s))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> visitAllColumns(SnowParser.AllColumnsContext ctx) {
        if (ctx.parent instanceof SnowParser.FunctionCallContext)
            return visitChildren(ctx);
        String collect = String.join(",", dataModel.allColumns());
        return Collections.singletonList(collect);
    }

    @Override
    public List<String> visitFunctionCall(SnowParser.FunctionCallContext ctx) {
        List<String> result = visitChildren(ctx);
        String join = String.join("", result);
        return Collections.singletonList(join);
    }

    @Override
    public List<String> visit(ParseTree tree) {
        return tree.accept(this);
    }

    @Override
    public List<String> visitChildren(RuleNode node) {
        List<String> results = new LinkedList<>();
        for (int i = 0; i < node.getChildCount(); i++) {
            ParseTree c = node.getChild(i);
            List<String> result = c.accept(this);
            results.addAll(result);
        }
        return results;
    }

    @Override
    public List<String> visitTerminal(TerminalNode node) {
        return Collections.singletonList(node.getText());
    }

    @Override
    public List<String> visitErrorNode(ErrorNode node) {
        return Collections.singletonList(node.getText());
    }

    private String functionCallAlias(SnowParser.FunctionCallContext ctx) {
        StringBuilder sb = new StringBuilder().append('_');
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof TerminalNode
                    && (!child.getText().equals("(") && !child.getText().equals(")"))
                    || child instanceof SnowParser.ColumnNameContext) {
                sb.append('_').append(child.getText());
            }
        }
        return sb.toString();
    }
}
