package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Student student = new Student();
		
		// add student object to model
		theModel.addAttribute("student", student);
		
		return "student-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm( @RequestParam("firstName")  String firstName, @RequestParam("lastName")  String lastName, Model model) {
		
		//log the input data 
		System.out.println("first name is: "+firstName);
		
		System.out.println("last name is: "+lastName);
		
		model.addAttribute("firstName", firstName);
		
		model.addAttribute("lastName", lastName);
		
		return "student-confirmation";
		
	}

}
