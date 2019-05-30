create table PROFESSORS (
	employee_id identity not null primary key, 
	department varchar(50) not null,
	first_name varchar(50) not null, 
	last_name varchar(50) not null, 
	email varchar(100));

insert into professors(employee_id, department, first_name, last_name, email)
values (890890, 'Computer Science', 'Karen', 'Heart', 'karen.heart@gmail.com');

insert into professors(employee_id, department, first_name, last_name, email)
values (098098, 'Design', 'Jayson', 'Margalus', 'jay.margalus@gmail.com');