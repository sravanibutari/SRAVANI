package comm.example.spring.controller;

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
@RequestMapping("/student")

public class StudentController {
	
@InitBinder
public void intBinder(WebDataBinder dataBinder)
{
	StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
	dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
}
@RequestMapping("/showForm")
public String showForm(Model theModel) {
	
	
	Student theStudent = new Student();
	
	
	theModel.addAttribute("student", theStudent);
	
	return "student-form";
}

@RequestMapping("/processForm")
public String processForm(@Valid@ModelAttribute("student") Student theStudent,BindingResult theResult) {
	

	System.out.println("theStudent: " + theStudent.getFirstName()
						+ " " + theStudent.getLastName());
	
	if(theResult.hasErrors())
	{
		return "student-form";
	}
	return "student-confirmation";
}
}
