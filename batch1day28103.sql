show databases;

use batch18103;

show tables;

desc user;

describe user;


insert into user values(1,'Nisha','8920916725');

insert into user(userId,userName) values(2,'Priya');

insert into user(userName,userId) values('Priya',3);
-- bulk of data/multiple data through a single insert command 
insert into user values
(4,'Jatin','78678080'),
(5,'Preksha','976543820');

desc user;
select * from user;

create table emp 
(
	empId int primary key,
    empName varchar(50) not null,
    empAge int default 24
);

desc emp;
insert into emp(empId,empName) values(1,'Dhanesh');

select * from emp;

insert into emp(empId,empName,empAge) values(2,NULL,25);

show tables;
select * from emp;
truncate table emp;

select * from user;

drop table user;

desc emp;
select * from emp;
alter table emp add (empContact varchar(11));

insert into emp values(1,'Aditya',22,'584948304');
insert into emp values(2,'Aditi',21,'434948304');
insert into emp values(3,'Shreya',23,'4343248304');
insert into emp values(4,'Shreyas',24,'667948304');
insert into emp values(5,'Shivaansh',25,'766948304');

select * from emp;

alter table emp add ( empEmail varchar(20));
-- after | before
alter table emp add empQualification varchar(30) after empName;
select * from emp;
desc emp;
alter table emp drop column empQualification;
ALTER TABLE emp MODIFY empName varchar(100); 
-- alter table emp modify (empName varchar(80),empContact varchar(20));
select * from employee;
-- rename table 
ALTER TABLE emp RENAME TO employee;
RENAME TABLE employee to emp;
-- rename a column
alter table emp rename column empEmail to email; 
select * from emp;