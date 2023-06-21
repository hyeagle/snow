package snow.example;

import snow.core.SqlParser;
import snow.core.ResultSetToObjectConverter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collections;
import java.util.List;

public class Demo {

    public void transferSql() throws Exception {
        SqlParser sqlParser = new SqlParser("data/userInfo.yml");
        String sql = "select register_time, count(*) AS count from tb_user_info where device_id = 'sad' group by register_time limit 1, 2";
        String s = sqlParser.transferSql(sql);
        System.out.println(s);
    }

    public void query() throws Exception {
        String sql = "SELECT * FROM tb_user_info";
        List<UserInfo> exec = exec(sql, UserInfo.class);
        System.out.println(exec.size());
        sql = "select username, country, device_id from tb_user_info where age >= 30 order by country";
        exec = exec(sql, UserInfo.class);
        System.out.println(exec.size());
    }

    public void group() throws Exception {
        String sql = "SELECT address, count(*) count FROM tb_user_info group by address";
        List<UserCountry> exec = exec(sql, UserCountry.class);
        System.out.println(exec.size());
    }

    private <T> List<T> exec(String sql, Class<T> clazz) throws Exception {
        String url = "jdbc:clickhouse://localhost:8123/default";
        String username = "default";
        String password = "";

        SqlParser sqlParser = new SqlParser("data/userInfo.yml");
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();

            String s = sqlParser.transferSql(sql);

            ResultSet resultSet = statement.executeQuery(s);
            return ResultSetToObjectConverter.convert(resultSet, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public static void main(String[] args) throws Exception {
        Demo demo = new Demo();
        demo.transferSql();
        demo.query();
        demo.group();
    }
}
