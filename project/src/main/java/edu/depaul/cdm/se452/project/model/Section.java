package edu.depaul.cdm.se452.project.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sections")
public class Section implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sectionId;
	
	@Column
	private int sectionNumber;
	
	@Column
	//holds the day(s) of the week the class section meets
	private Date meetingDay;
	
	@Column
	//holds the meeting time for the course section
	private Date meetingTime;
	
	@Column
	//holds the meeting location for the course section
	//ONLINE for online courses
	private String meetingLocation;
	
	@Column
	//foreign key to course table
	private Long courseId;
	
	@Column
	//year value for when the section is offered
	private Date termOffered;
	
	@Column
	//number of possible seats to be filled for the course section
	private int seatCapacity;
	
	@Column
	//number of seats available for the section
	private int availableSeats;
	
	@Column
	//number of seats to have for students waiting to enroll
	private int waitListSeats;
	
	@ManyToOne
	@JoinColumn(name = "course_section", nullable = false)
	private Course course;
	
	/*@OneToMany(
            mappedBy = "enrolled",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @ToString.Exclude
    private List<Student> enrolledStudents*/;
    
    /*@OneToMany(
            mappedBy = "waitList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @ToString.Exclude
    private List<Student> waitListStudents*/
}
