create table SECTIONS (
	id identity primary key auto_increment,
	section_number int,
	meeting_location varchar (50) not null,
	seat_capacity int,
	available_seats int,
	waitlist_seats int,
	section_course int,

foreign key (section_course) references courses(id));

INSERT INTO SECTIONS (section_number, meeting_location, seat_capacity, available_seats, waitlist_seats, section_course)
VALUES (410, 'Jackson 310', 40, 40, 20, (SELECT id from COURSES WHERE course_code = 'SE' AND course_number = 452)),
(910, 'Online', 30, 25, 20, (SELECT id from COURSES WHERE course_code = 'SE' AND course_number = 452));
 	