create database studentdal;
use studentdal;
create table studenttab(
id int PRIMARY KEY auto_increment,
sname VARCHAR(20),
scourse varchar(30),
sfee int);
show tables;
select * from studenttab;
-- drop table studenttab;