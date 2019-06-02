alter table COURSES add course_code varchar(3);
alter table COURSES add course_term varchar (11);

UPDATE courses SET course_code = 'SE', course_term = 'Fall 2019' WHERE subject = 'Software Engineering';

UPDATE courses SET course_code = 'CSC', course_term = 'Winter 2020' WHERE subject = 'Computer Science';