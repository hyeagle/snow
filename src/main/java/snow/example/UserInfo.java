package snow.example;

import snow.annotation.ColumnMapping;

import java.sql.Timestamp;
import java.util.List;

public class UserInfo {
    private Long id;

    private String username;

    private Integer age;

    private String country;

    @ColumnMapping("register_time")
    private Timestamp registerTime;

    private List<String> phone;

    private String address;

    @ColumnMapping("device_id")
    private List<String> deviceId;
}
