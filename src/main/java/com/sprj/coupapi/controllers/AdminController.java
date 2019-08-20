package com.sprj.coupapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sprj.coupapi.dao.CompanyRepository;
import com.sprj.coupapi.models.Company;

@Controller
public class AdminController {

	CompanyRepository rp;
	Company comp;

	@RequestMapping("/test")
	public String test() {
		
		return "home.jsp";
	}

}
