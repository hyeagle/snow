create table if not exists default.tb_user_info
(
    id Int64,
    username String,
    age Int8,
    country String,
    register_time DateTime64(3),
    phone Array(String),
    `extra_info_string.key` Array(String),
    `extra_info_string.value` Array(String),
    `extra_info_array.key` Array(String),
    `extra_info_array.value` Array(Array(String)),
    INDEX idx_id id TYPE minmax GRANULARITY 1
) ENGINE = MergeTree
ORDER BY (username, age);

insert into default.tb_user_info (id, username, age, register_time, country, phone, `extra_info_string.key`, `extra_info_string.value`, `extra_info_array.key`, `extra_info_array.value`)
values
(1, 'ross1', 11, '2022-10-01 08:00:00', 'cn', ['10000', '10001'], ['address'], ['address1'], ['device_id'], [['d1','d2']]),
(2, 'ross2', 21, '2022-10-01 08:00:00', 'cn', ['20000', '20001'], ['address'], ['address2'], ['device_id'], [['d1','d3']]),
(3, 'ross3', 31, '2022-10-01 08:00:00', 'cn', ['30000', '30001', '30002'], ['address'], ['address3'], ['device_id'], [['d2']]),
(4, 'ross4', 41, '2022-10-01 08:00:00', 'us', ['40000', '40001', '40002'], ['address'], ['address4'], ['device_id'], [['d4','d2']]),
(5, 'ross5', 51, '2022-10-01 08:00:00', 'us', ['50000', '50001', '50002'], ['address'], ['address5'], ['device_id'], [['d1','d4']]),
(6, 'ross6', 61, '2022-10-01 08:00:00', 'ca', ['60000', '60001', '60002'], ['address'], ['address6'], ['device_id'], [['d1','d2']]),
(7, 'ross7', 71, '2022-10-01 08:00:00', 'ca', ['70000', '70001', '70002'], ['address'], ['address7'], ['device_id'], [['d1','d2', 'd3', 'd4']]),
(8, 'ross8', 81, '2022-10-01 08:00:00', 'jp', ['80000', '80001', '80002'], ['address'], ['address8'], ['device_id'], [['d3','d4']]),
(9, 'ross9', 12, '2022-10-01 08:00:00', 'jp', ['90000', '90001', '90002'], ['address'], ['address9'], ['device_id'], [['d1','d2']]),
(10, 'ross110', 13, '2022-10-01 08:00:00', 'cn', ['100000', '100001', '100002'], ['address'], ['address10'], ['device_id'], [['d1','d2', 'd3']]);