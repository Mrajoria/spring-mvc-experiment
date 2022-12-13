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
	public String processForm( @ModelAttribute("student") Student theStudent) {
		
		//log the input data 
		System.out.println("first name is: "+theStudent.getFirstName());
		
		System.out.println("last name is: "+theStudent.getLastName());
		
		System.out.println("country is: "+theStudent.getCountry());

		
		
		return "student-confirmation";
		
	}

}
