package com.CourseManagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.CourseManagement.models.Student;

@Controller

public class StudentController
{
@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String hello()
	{
		return "index";
	}
	
	
	
/*
* @RequestMapping(value="/studentLogin",method=RequestMethod.GET) public String
* displayLogin() { return "studentLogin"; }
*/

@RequestMapping(value="/StudentLogin",method=RequestMethod.GET)
 public String studentLogin(Model model) {
Student s = new Student();
model.addAttribute("student", s);

return "studentlogin";
 }
@RequestMapping(value = "/login",method=RequestMethod.POST)
public String login(@ModelAttribute("student")Student stu)
{

return "index";
}
/*
* @RequestMapping(value="/studentRegistration",method=RequestMethod.GET) public
* String displayRegister() { return "studentRegistration"; }
*/

@RequestMapping(value="/studentregistration",method=RequestMethod.GET)
public String studentRegister(Model model)

{
	model.addAttribute("student", new Student());
return "student registration";
}
@RequestMapping(value = "/studentRegistration",method=RequestMethod.POST)
public String register(@ModelAttribute("student")Student std )
{
return "studentlogin";

}
}
