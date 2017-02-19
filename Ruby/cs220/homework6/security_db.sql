--Author: arthur.levan@blackburn.edu
--Date: 10/7/16
--Estimate: 5 hours
--Actual: 4 

drop table if exists student;
drop table if exists studentworker;
drop table if exists department;
drop table if exists facility;
drop table if exists procedure;
drop table if exists incidentreport;
drop database if exists security;

create database security;

use security;

create table student
(
studentid int primary key not null,
firstname varchar(64) not null,
lastname varchar(64) not null,
studentproblem varchar(64)
);

create table studentworker
(
studentid int not null,
workerid int not null,
departmentid int not null,
position varchar(64) not null,
primary key (studentid, workerid, departmentid),
foreign key (studentid) references student(studentid),
foreign key (departmentid) references department(departmentid)
);

create table department
(
departmentid int not null,
facilityid int not null,
departmentname vachcar(64) not null,
phonenumber char(10) not null,
primary key (departmentid, facilityid),
foreign key (facilityid) references facility(facilityid)
);

create table facility
(
facilityid int not null primary key,
facilityname varchar(64) not null,
);

create table procedure
(
procedureid int not null primary key,
procedurename varchar(64) not null,
);

create table incidentreport
(
incidentid int not null,
workerid int not null,
procedureid int not null,
emergency boolean not null,
summary text not null,
incidentdate date,
primary key (incidentid, workerid, procedureid),
foreign key (workerid) references studentworker(workerid),
foreign key (procedureid) references procedure(procedureid)
);

CREATE VIEW worker  AS
SELECT
	s.firstname AS studentfirstname,
	s.lastname AS studentlastname,
	sw.workerid AS workerid
FROM
	student s,
	studentworker sw
WHERE
	s.studentid = sw.studentid;

CREATE VIEW incident AS
SELECT
	sw.workerid AS workerid,
	ir.incidentid AS incidentid
FROM
	studentworker sw,
	incidentreport ir
WHERE
	sw.workerid = ir.workerid;
