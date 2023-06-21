package snow.core;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import snow.entity.DataModel;
import snow.parser.SnowLexer;
import snow.parser.SnowParser;
import snow.parser.SqlVisitor;

import java.util.List;
import java.util.Objects;

public class SqlParser {

    private final SqlVisitor visitor;

    public SqlParser(String configPath) throws Exception {
        String path = Objects.requireNonNull(SqlParser.class.getClassLoader().getResource(configPath)).getPath();
        visitor = new SqlVisitor(DataModel.fromYaml(path));
    }

    public String transferSql(String originSql) {
        SnowLexer lexer = new SnowLexer(CharStreams.fromString(originSql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SnowParser parser = new SnowParser(tokens);
        ParseTree parseTree = parser.querySpecification();
        List<String> s = visitor.visit(parseTree);
        return String.join(" ", s);
    }
}
