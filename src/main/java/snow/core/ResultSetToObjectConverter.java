package snow.core;

import snow.annotation.ColumnMapping;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class ResultSetToObjectConverter {
    public static <T> List<T> convert(ResultSet resultSet, Class<T> targetType) {
        List<T> resultList = new ArrayList<>();

        try {
            while (resultSet.next()) {
                T targetObject = targetType.getDeclaredConstructor().newInstance();

                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();

                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object columnValue = resultSet.getObject(i);

                    Field field = getField(targetType, columnName);
                    if (field != null) {
                        field.setAccessible(true);
                        if (field.getType() == List.class && columnValue instanceof Array) {
                            ParameterizedType listType = (ParameterizedType) field.getGenericType();
                            Class<?> elementType = (Class<?>) listType.getActualTypeArguments()[0];
                            List<Object> list = convertToArray((Array) columnValue, elementType);
                            field.set(targetObject, list);
                        } else {
                            if (columnValue instanceof Number) {
                                Object value = convertToObject(columnValue, field.getType());
                                field.set(targetObject, value);
                            } else {
                                field.set(targetObject, columnValue);
                            }
                        }
                    }
                }

                resultList.add(targetObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultList;
    }

    private static Field getField(Class<?> targetType, String columnName) {
        // 尝试直接获取与列名匹配的字段
        try {
            return targetType.getDeclaredField(columnName);
        } catch (NoSuchFieldException e) {
            // 字段不存在，尝试通过注解查找匹配的字段
            for (Field field : targetType.getDeclaredFields()) {
                ColumnMapping columnMapping = field.getAnnotation(ColumnMapping.class);
                if (columnMapping != null && columnMapping.value().equals(columnName)) {
                    return field;
                }
            }
        }

        return null;
    }

    private static List<Object> convertToArray(Array array, Class<?> elementType) {
        try {
            Object[] values = (Object[]) array.getArray();
            List<Object> list = new ArrayList<>();
            for (Object value : values) {
                list.add(convertToObject(value, elementType));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Object convertToObject(Object value, Class<?> targetType) {
        if (value != null && targetType != null && !targetType.isAssignableFrom(value.getClass())) {
            // 进行类型转换
            if (targetType == Integer.class || targetType == int.class) {
                return Integer.parseInt(value.toString());
            } else if (targetType == Long.class || targetType == long.class) {
                return Long.parseLong(value.toString());
            } else if (targetType == Double.class || targetType == double.class) {
                return Double.parseDouble(value.toString());
            } else if (targetType == Boolean.class || targetType == boolean.class) {
                return Boolean.parseBoolean(value.toString());
            } else {
                // 其他类型处理
                // 这里需要根据具体的业务逻辑进行类型转换
                // ...
            }
        }
        return value;
    }

}
