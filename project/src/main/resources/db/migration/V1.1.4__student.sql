create table STUDENTS (
	student_id identity not null primary key, 
	major varchar(50) not null,
	gpa numeric(3,2),
	first_name varchar(50) not null, 
	last_name varchar(50) not null, 
	email varchar(100));

insert into students (student_id, major, gpa, first_name, last_name, email)
values ('123123', 'Computer Science', 4.00, 'Joey', 'Diaz', 'joey.diaz@gmail.com');

insert into students (student_id, major, gpa, first_name, last_name, email)
values ('321321', 'Computer Science', 4.20, 'Joe', 'Rogan', 'joe.rogan@gmail.com');