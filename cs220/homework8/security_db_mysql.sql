use security;

drop table if exists student;
drop table if exists studentworker;
drop table if exists department;
drop table if exists facility;
drop table if exists instruction;
drop table if exists incident;
SET foreign_key_checks = 1;

drop database if exists security;

create database security;

use security;

create table student
(
studentid integer primary key not null,
firstname varchar(64) not null,
lastname varchar(64) not null
);

create table facility
(
facilityid integer not null primary key,
facilityname varchar(64) not null
);

create table department
(
departmentid integer not null,
facilityid integer not null,
departmentname varchar(64) not null,
phonenumber char(10) not null,
primary key (departmentid, facilityid),
foreign key (facilityid) references facility(facilityid)
);

create table studentworker
(
studentid integer not null,
workerid integer not null,
departmentid integer not null,
position varchar(64) not null,
primary key (workerid, studentid, departmentid),
foreign key (studentid) references student(studentid),
foreign key (departmentid) references department(departmentid)
);

create table instruction
(
instructionid integer not null primary key,
instructionname varchar(64) not null
);

create table incident
(
incidentid integer not null primary key,
workerid integer not null,
instructionid integer not null,
emergency boolean not null,
summary text not null,
incidentdate date,
foreign key (workerid) references studentworker(workerid),
foreign key (instructionid) references instruction(instructionid)
);

CREATE VIEW worker AS
SELECT
	s.firstname AS studentfirstname,
	s.lastname AS studentlastname,
	sw.workerid AS workerid
FROM
	student s,
	studentworker sw
WHERE
	s.studentid = sw.studentid;

CREATE VIEW incidentreport AS
SELECT
	sw.workerid AS workerid,
	i.incidentid AS incidentid
FROM
	studentworker sw,
	incident i
WHERE
	sw.workerid = i.workerid;
