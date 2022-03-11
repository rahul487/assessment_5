package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@Autowired
	Studentrepo repo;
	@RequestMapping("login")
	public String checklogin(HttpServletRequest req,HttpServletResponse res) {
	String user = req.getParameter("suser");
	String password = req.getParameter("spassword");
	if(repo.findByName(user)!= null) {
		return "Login Successfull" + "\n" + "Welcome to" +user;
	}
	else {
		return "check the credentials or Register";
	}
	}
	

}
