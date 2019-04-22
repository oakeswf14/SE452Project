create table COURSES (
	id identity not null primary key,
	subject varchar(50) not null,
	courseNumber int,
	courseDescription varchar(150) not null,
	courseCredits double, 
	prereqCourseId int,
	concurrentCourseId int, 
	screenerId int
	);
	
insert into courses (subject, courseNumber, courseDescription, courseCredits, prereqCourseId, concurrentCourseId, screenerId)
values ('Software Engineering', 452, 'Enterprise Computing', 4.0, null, 2, 1);

insert into courses (subject, courseNumber, courseDescription, courseCredits, prereqCourseId, concurrentCourseId, screenerId)
values ('Computer Science', 480, 'Machine Learning Programming', 4.0, 0, 1, 1);
