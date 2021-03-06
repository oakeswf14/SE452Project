package edu.depaul.cdm.se452.project.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "COURSES")
public class Course implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	//@Column
	private String subject;
	
	//@Column
	private int courseNumber;
	
	//@Column
	private String courseDescription;
	
	//@Column
	private double courseCredits;
	
	//@Column
	private int prereqCourseId;
	
	//@Column
	private int concurrentCourseId;
	
	//@Column
	private int screenerId;
	
	@OneToMany (
			mappedBy = "course",
			cascade =  CascadeType.ALL,
			fetch = FetchType.LAZY
			)
	@ToString.Exclude
	private List<Section> courseSections;
}
