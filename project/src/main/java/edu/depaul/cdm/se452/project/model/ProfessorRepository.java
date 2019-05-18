package edu.depaul.cdm.se452.project.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//repository class to help perform CRUD operations on the professors table
public interface CourseRepository extends CrudRepository<Student, Long> {
	//find a professor by passing a course number
	List<Professor> findProfByCourse(int num);
	
	@Override
	//returns all professors available
	List<Professor> findAll();
}