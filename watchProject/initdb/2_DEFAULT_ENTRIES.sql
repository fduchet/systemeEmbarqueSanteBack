insert into defaultdb.users(first_name, last_name, weight, height, email_address, age) values ('Sébastien','Comte',72,178,'sc@orange.fr',22);
insert into defaultdb.users(first_name, last_name, weight, height, email_address, age) values ('Marg','Buisson',65,175,'mb@yo.fr',22);
insert into defaultdb.users(first_name, last_name, weight, height, email_address, age) values ('Nicolas','Vauvillier',78,180,'nv@mdr.fr',22);

insert into defaultdb.runs(total_distance, total_time, average_speed, average_heart_rate, average_oxygen_level, description, user_id) values (15,60,15.3,130,96,'Course le long de la Seine avec beaucoup de vent', 1);

insert into defaultdb.calories(time, value, run_id) VALUES (0,0,1);
insert into defaultdb.calories(time, value, run_id) VALUES (0.25,4,1);
insert into defaultdb.calories(time, value, run_id) VALUES (0.5,10,1);
insert into defaultdb.calories(time, value, run_id) VALUES (0.75,15,1);
insert into defaultdb.calories(time, value, run_id) VALUES (1,20,1);
insert into defaultdb.calories(time, value, run_id) VALUES (1.25,27,1);
insert into defaultdb.calories(time, value, run_id) VALUES (1.5,31,1);
insert into defaultdb.calories(time, value, run_id) VALUES (1.75,38,1);
insert into defaultdb.calories(time, value, run_id) VALUES (2,42,1);
insert into defaultdb.calories(time, value, run_id) VALUES (2.25,47,1);
insert into defaultdb.calories(time, value, run_id) VALUES (2.5,52,1);
insert into defaultdb.calories(time, value, run_id) VALUES (2.75,55,1);
insert into defaultdb.calories(time, value, run_id) VALUES (3,59,1);

/*insert into defaultdb.distances(time, value, run_id) values (0,0,1);
insert into defaultdb.distances(time, value, run_id) values (0.25,0.45,1);
insert into defaultdb.distances(time, value, run_id) values (0.5,0.96,1);
insert into defaultdb.distances(time, value, run_id) values (0.75,1.43,1);
insert into defaultdb.distances(time, value, run_id) values (1,1.90,1);
insert into defaultdb.distances(time, value, run_id) values (1.25,2.24,1);
insert into defaultdb.distances(time, value, run_id) values (1.5,2.60,1);
insert into defaultdb.distances(time, value, run_id) values (1.75,3.2,1);
insert into defaultdb.distances(time, value, run_id) values (2,3.6,1);
insert into defaultdb.distances(time, value, run_id) values (2.25,4,1);
insert into defaultdb.distances(time, value, run_id) values (2.5,4.4,1);
insert into defaultdb.distances(time, value, run_id) values (2.75,4.9,1);
insert into defaultdb.distances(time, value, run_id) values (3,5.2,1);*/

insert into defaultdb.heart_rates(time, value, run_id) VALUES (0,100,1);
insert into defaultdb.heart_rates(time, value, run_id) VALUES (0.25,115,1);
insert into defaultdb.heart_rates(time, value, run_id) VALUES (0.50,130,1);
insert into defaultdb.heart_rates(time, value, run_id) VALUES (0.75,140,1);
insert into defaultdb.heart_rates(time, value, run_id) VALUES (1,142,1);
insert into defaultdb.heart_rates(time, value, run_id) VALUES (1.25,141,1);
insert into defaultdb.heart_rates(time, value, run_id) VALUES (1.5,150,1);
insert into defaultdb.heart_rates(time, value, run_id) VALUES (1.75,142,1);
insert into defaultdb.heart_rates(time, value, run_id) VALUES (2,140,1);
insert into defaultdb.heart_rates(time, value, run_id) VALUES (2.25,135,1);
insert into defaultdb.heart_rates(time, value, run_id) VALUES (2.50,138,1);
insert into defaultdb.heart_rates(time, value, run_id) VALUES (2.75,139,1);
insert into defaultdb.heart_rates(time, value, run_id) VALUES (3,135,1);

insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (0,98,1);
insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (0.25,98,1);
insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (0.5,97,1);
insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (0.75,97,1);
insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (1,97,1);
insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (1.25,97,1);
insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (1.5,96,1);
insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (1.75,96,1);
insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (2,96,1);
insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (2.25,96,1);
insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (2.5,96,1);
insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (2.75,96,1);
insert into defaultdb.oxygen_levels(time, value, run_id) VALUES (3,95,1);


insert into defaultdb.temperatures(time, value, run_id) VALUES (0,37.2,1);
insert into defaultdb.temperatures(time, value, run_id) VALUES (0.25,37.3,1);
insert into defaultdb.temperatures(time, value, run_id) VALUES (0.5,37.4,1);
insert into defaultdb.temperatures(time, value, run_id) VALUES (0.75,37.6,1);
insert into defaultdb.temperatures(time, value, run_id) VALUES (1,37.6,1);
insert into defaultdb.temperatures(time, value, run_id) VALUES (1.25,37.6,1);
insert into defaultdb.temperatures(time, value, run_id) VALUES (1.5,37.5,1);
insert into defaultdb.temperatures(time, value, run_id) VALUES (1.75,37.6,1);
insert into defaultdb.temperatures(time, value, run_id) VALUES (2,37.7,1);
insert into defaultdb.temperatures(time, value, run_id) VALUES (2.25,37.7,1);
insert into defaultdb.temperatures(time, value, run_id) VALUES (2.5,37.9,1);
insert into defaultdb.temperatures(time, value, run_id) VALUES (2.75,38.0,1);
insert into defaultdb.temperatures(time, value, run_id) VALUES (3,38.0,1);


insert into defaultdb.distances(time, value, run_id) VALUES (0,0,1);
insert into defaultdb.distances(time, value, run_id) VALUES (0.25,0.05,1);
insert into defaultdb.distances(time, value, run_id) VALUES (0.5,0.1,1);
insert into defaultdb.distances(time, value, run_id) VALUES (0.75,0.15,1);
insert into defaultdb.distances(time, value, run_id) VALUES (1,0.21,1);
insert into defaultdb.distances(time, value, run_id) VALUES (1.25,0.26,1);
insert into defaultdb.distances(time, value, run_id) VALUES (1.5,0.32,1);
insert into defaultdb.distances(time, value, run_id) VALUES (1.75,0.36,1);
insert into defaultdb.distances(time, value, run_id) VALUES (2,0.41,1);
insert into defaultdb.distances(time, value, run_id) VALUES (2.25,0.47,1);
insert into defaultdb.distances(time, value, run_id) VALUES (2.5,0.52,1);
insert into defaultdb.distances(time, value, run_id) VALUES (2.75,0.57,1);
insert into defaultdb.distances(time, value, run_id) VALUES (3,0.61,1);


insert into defaultdb.speeds(time, value, run_id) VALUES (0,12,1);
insert into defaultdb.speeds(time, value, run_id) VALUES (0.25,12,1);
insert into defaultdb.speeds(time, value, run_id) VALUES (0.5,12,1);
insert into defaultdb.speeds(time, value, run_id) VALUES (0.75,12,1);
insert into defaultdb.speeds(time, value, run_id) VALUES (1,12,1);
insert into defaultdb.speeds(time, value, run_id) VALUES (1.25,12,1);
insert into defaultdb.speeds(time, value, run_id) VALUES (1.5,12,1);
insert into defaultdb.speeds(time, value, run_id) VALUES (1.75,12,1);
insert into defaultdb.speeds(time, value, run_id) VALUES (2,12,1);
insert into defaultdb.speeds(time, value, run_id) VALUES (2.25,12,1);
insert into defaultdb.speeds(time, value, run_id) VALUES (2.5,12,1);
insert into defaultdb.speeds(time, value, run_id) VALUES (2.75,12,1);
insert into defaultdb.speeds(time, value, run_id) VALUES (3,12,1);

