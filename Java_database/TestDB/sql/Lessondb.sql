drop database if exists lessondb;
create database lessondb;
use lessondb;

create table table_lesson(
user_id int(11),
user_name varchar(255),
age int (11),
prefecture varchar(255)
);

insert into table_lesson values(1,"Ato",29,"千葉県");
insert into table_lesson values(2,"Tanaka",27,"神奈川");
insert into table_lesson values(3,"Sato",30,"埼玉県");
insert into table_lesson values(4,"Kato",29,"茨城県");