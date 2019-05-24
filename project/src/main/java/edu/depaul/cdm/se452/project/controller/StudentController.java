package edu.depaul.cdm.se452.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

	@GetMapping("/hello")
	public String greeting1(Model model)
	{
		model.addAttribute("name", "Chris");
		return "greeting";
		
	}
}
