package snow.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.Getter;
import lombok.Setter;
import snow.serializer.TransferDeserializer;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Setter
@Getter
public class DataModel {

    private static final String arrayReplace = "?2[indexOf(?1, '?3')] AS ?4";

    private String table;
    private List<Column> columns;
    private Map<String, String> columnNameMap;

    @Setter
    @Getter
    public static class Column {
        @JsonProperty("name")
        private String field;
        private String column;
        @JsonProperty("nested_col_key")
        private String nestColKey;
        @JsonProperty("nested_col_value")
        private String nestColValue;
        @JsonDeserialize(using = TransferDeserializer.class)
        private Function<Object, Object> transfer;
        private String type;
        @JsonProperty("is_array")
        private boolean array;
    }

    public static DataModel fromYaml(String path) throws Exception {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        DataModel dataModel = mapper.readValue(new File(path), DataModel.class);
        dataModel.columnNameMap = dataModel.columns.stream()
                .collect(Collectors.toMap(e -> e.column,
                        e -> {
                            if (e.nestColKey != null) {
                                return arrayReplace.replace("?1", e.nestColKey).replace("?2", e.nestColValue).replace("?3", e.column).replace("?4", e.column);
                            } else {
                                return e.column;
                            }
                        },
                        (e1, e2) -> e1));
        return dataModel;
    }

    public String columnName(String column) {
        return columnNameMap.get(column);
    }

    public String columnName(String column, String defaultName) {
        String name = columnName(column);
        return name != null ? name : defaultName;
    }

    public Collection<String> allColumns() {
        return columnNameMap.values();
    }
}
