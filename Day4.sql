use batch18103;
show tables;

select * from emp;

show databases;
use avizva;
show tables;
select * from employee;
select * from student;
insert into employee(emp_age,emp_name) values(29,'Jatin');
insert into employee(emp_age,emp_name) values(27,'Jitesh');
insert into employee(emp_age,emp_name) values(24,'Naman');
insert into employee(emp_age,emp_name) values(21,'Nitin');
insert into employee(emp_age,emp_name) values(22,'Priya');
desc employee;

select * from employee where emp_id between 5 and 8;
select * from employee where emp_id>=5 and emp_id<=8;

desc employee;

-- auto_increment functionality

create table learners 
(
	learner_id int primary key auto_increment,
    learner_name varchar(50),
    learner_age int
);

desc learners;
select * from learners;
insert into learners(learner_name,learner_age) 
values('Amresh',21);
insert into learners(learner_name,learner_age) 
values('Priyank',28);
insert into learners(learner_name,learner_age) 
values('Parimal',23);
insert into learners(learner_name,learner_age) 
values('Rahul',26);



insert into learners(learner_age) values(26);

select * from learners;

-- LIKE operator
-- wildcard operator
-- % (multiple character match)(0 or multiple character match)
-- _ (single character match)(must be specified character count)

select * from learners where learner_name like '%a%';
select * from learners where learner_name like '__a%';
select * from learners where learner_name IS NULL;

select * from learners where learner_id IN (1,4,5,8,10,12);
select * from learners where learner_id =ANY(1,5,8,10);
-- sub query
-- we can have nested queries but inner queries 
-- will be executing first and as per the response
-- outer queries will execute.
-- ALL shows the functionality of AND operator
-- ANY shows the functionality of OR operator
select * from learners where learner_id<ALL
(select learner_id from learners where 
learner_age<24);
-- select * from learners where learner_id<ANY(5,7,9);
 -- INNER QUERY RESPONSE - 5,7,9
select * from learners;
update learners set learner_age=28 where learner_id=1;

select * from learners where learner_id<ALL
(select learner_id from learners where 
learner_name LIKE '%a%');
-- exists : check whether record generated by inner query exists or not
select * from learners where exists (select learner_id from learners
where learner_age<23);
select * from learners where not exists (select learner_id from learners
where learner_age<20);



select * from learners where learner_id IN 
(select learner_id from learners where 
learner_name LIKE '%a%');
-- fetch the record of the candidate which is having the
-- highest age

select * from learners where learner_age=(
select max(learner_age) from learners
);

select learner_id,learner_name,max(learner_age) from learners;


select * from learners where learner_name not like '%a%';
select * from learners where learner_name not like '__a%';
select * from learners where learner_name IS NOT NULL;
select * from employee where emp_id not between 5 and 8;
select * from employee where emp_id not in (1,4,8,10);

-- generate a query to fetch the details where emp_id is even
select * from employee where emp_id IN(
select emp_id from employee where emp_id%2=0);
