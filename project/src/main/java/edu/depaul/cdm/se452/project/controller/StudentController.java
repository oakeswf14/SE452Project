package edu.depaul.cdm.se452.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.depaul.cdm.se452.project.model.Course;
import edu.depaul.cdm.se452.project.model.CourseRepository;

@Controller
public class StudentController {
	
	@Autowired
	private CourseRepository courseRepo;
	
	public StudentController(CourseRepository repo)
	{
		this.courseRepo = repo;
	}

	@GetMapping("/hello")
	public String greeting1(Model model)
	{
		model.addAttribute("name", "Chris");
		return "greeting";
	}
	
	@GetMapping("/addCourses")
	public String showAllCourses(Model model)
	{
		//List <Course> courseList = courseRepo.findAll();
		model.addAttribute("courses", courseRepo.findAll());
		//model.addAttribute("name", "Chris");
		return "student/addCourses";
	}	
}
