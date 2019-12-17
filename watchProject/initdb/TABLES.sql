drop table calories;
drop table outside_temperatures;
drop table body_temperatures;
drop table heart_rates;
drop table oxygen_levels;
drop table speeds;
drop table distances;
drop table runs;
drop table users;


create table users
(
    id          bigint auto_increment
        primary key,
    first_name  text       null,
    last_name   text       null,
    weight        text       null,
    height        text       null,
    email_address        text       null,
    age   text       null
);

create table runs
(
    id  bigint auto_increment
        primary key,
    total_distance       text       null,
    total_time         text       null,
    average_speed   text       null,
    average_heart_rate text       null,
    average_oxygen_level        int        null,
    description text null,
    user_id bigint,
    constraint runs_user_fk foreign key(user_id) references users(id)

);

create table oxygen_levels
(
    id   bigint auto_increment
        primary key,
    time text null ,
    value text null ,
    run_id bigint,
    constraint oxygen_levels_run_fk foreign key(run_id) references runs(id)
);

create table speeds
(
    id   bigint auto_increment
        primary key,
    time text null ,
    value text null ,
    run_id bigint,
    constraint speeds_run_fk foreign key(run_id) references runs(id)
);

create table calories
(
    id   bigint auto_increment
        primary key,
    time text null ,
    value text null ,
    run_id bigint,
    constraint calories_run_fk foreign key(run_id) references runs(id)
);

create table distances
(
    id   bigint auto_increment
        primary key,
    time text null ,
    value text null ,
    run_id bigint,
    constraint distances_run_fk foreign key(run_id) references runs(id)
);

create table heart_rates
(
    id   bigint auto_increment
        primary key,
    time text null ,
    value text null ,
    run_id bigint,
    constraint heart_rates_run_fk foreign key(run_id) references runs(id)
);

create table body_temperatures
(
    id   bigint auto_increment
        primary key,
    time text null ,
    value text null ,
    run_id bigint,
    constraint body_temperatures_run_fk foreign key(run_id) references runs(id)
);

create table outside_temperatures
(
    id bigint auto_increment
        primary key,
    time text null,
    value text null,
    run_id bigint,
    constraint outside_temperatures_run_fk foreign key(run_id) references runs(id)
);



