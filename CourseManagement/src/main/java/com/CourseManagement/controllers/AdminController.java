package com.CourseManagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.CourseManagement.models.Admin;

@Controller
//@RequestMapping("/admin")
public class AdminController
{
  @RequestMapping(value="/Admin",method=RequestMethod.GET)
  public String adminLogin(Model model)
  {
	  model.addAttribute("Admin",new Admin());
return "adminlogin";
 
  }
  @RequestMapping(value="/adminLogin",method=RequestMethod.POST)
  public String adminLogin(@ModelAttribute("Admin")Admin admin)
  {
	  return "index";
  }
}