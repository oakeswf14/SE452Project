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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "PROFESSORS")
public class Professor implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
	
	//@Column
	private String department;
	
	//@Column
	private String firstName;
	
	//@Column
	private String lastName;
	
	//@Column
	private String email;
		
	@JoinColumn
	@OneToOne(cascade = CascadeType.ALL)
	private Section section;
	
	/*@OneToMany (
			mappedBy = "professor",
			cascade =  CascadeType.ALL,
			fetch = FetchType.LAZY
			)
	@ToString.Exclude
	private List<Section> previousSection;*/
}
