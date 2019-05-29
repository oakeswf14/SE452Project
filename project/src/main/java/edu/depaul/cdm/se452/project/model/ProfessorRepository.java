package edu.depaul.cdm.se452.project.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//repository class to help perform CRUD operations on the professors table
public interface ProfessorRepository extends CrudRepository<Professor, Long> {
	//returns all professors available
	List<Professor> findAll();
}