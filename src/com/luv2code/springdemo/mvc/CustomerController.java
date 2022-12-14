package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// add an initbinder ... to convert input strings [trim]
	// it will help remove leading and trailing whitespaces
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
		
	}
	
	@RequestMapping("/processForm")
	public String prcoessForm( @Valid @ModelAttribute("customer") Customer thecustomer, BindingResult theBindingResult ) {
		
		System.out.println("last name: |"+thecustomer.getLastName()+"|");
		
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else
		return "customer-confirmation";
		
	}

	
	
	
}
