create table users
(
    id bigint auto_increment,
    constraint users_pk
        primary key (id),
    first_name TEXT not null,
    last_name TEXT not null,
    age int not null,
    email TEXT not null,
    password TEXT not null,
    telephone_number TEXT not null

);

create table events
(
    id bigint auto_increment,
    constraint events_pk
        primary key (id),
    id_creator int not null,
    month TEXT not null,
    year int not null,
    day int not null,
    hour int not null,
    minutes int not null,
    department int not null,
    place TEXT not null,
    number_of_participant int not null,
    type_of_sport TEXT not null,
    level TEXT not null

);



