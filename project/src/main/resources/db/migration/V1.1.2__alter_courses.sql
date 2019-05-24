alter table COURSES add course_code varchar(3);

UPDATE courses SET course_code = 'SE' WHERE subject = 'Software Engineering';

UPDATE courses SET course_code = 'CSC' WHERE subject = 'Computer Science';