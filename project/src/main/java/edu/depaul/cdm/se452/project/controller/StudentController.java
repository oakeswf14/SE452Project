package edu.depaul.cdm.se452.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import edu.depaul.cdm.se452.project.model.Course;
import edu.depaul.cdm.se452.project.model.CourseRepository;

@Controller
@RequestMapping("/student")
public class StudentController implements WebMvcConfigurer {
	
	@Autowired
	private CourseRepository courseRepo;
	
	public StudentController(CourseRepository repo)
	{
		this.courseRepo = repo;
	}
	
	@GetMapping("addCourses")
	public String showAllCourses(Model model)
	{
		//List <Course> courseList = courseRepo.findAll();
		model.addAttribute("courses", courseRepo.findAll());
		//model.addAttribute("name", "Chris");
		return "student/addCourses";
	}
	
	@GetMapping("courseSearch")
	public String showFilteredCourses(//@RequestParam (required = false) String subject,
									  //@RequestParam (required = false) String code,
									  @RequestParam String courseNumber,
									  //@RequestParam (required = false) String term,
									  Model model)
	{
		if (!courseNumber.isEmpty())
			model.addAttribute("courses",courseRepo.findByCourseNumber(Integer.parseInt(courseNumber)));
		return "student/addCourses";
	}
	
	@PostMapping("courseSearch")
	public String showCourses(@ModelAttribute Course course)
	{
		return "student/addCourses";
	}
}
