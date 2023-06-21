package snow.serializer;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import snow.function.TimestampToSecondFunc;

import java.io.IOException;
import java.util.function.Function;

public class TransferDeserializer extends JsonDeserializer<Function<Object, Object>> {

    @Override
    public Function<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        String value = jsonParser.getText();
        if (value == null || value.trim().length() == 0) {
            return null;
        }
        switch (value) {
            case  "TimestampToSecond":
                return new TimestampToSecondFunc();
            default:
                throw new IllegalArgumentException("invalid transfer function: " + value);
        }
    }

}
