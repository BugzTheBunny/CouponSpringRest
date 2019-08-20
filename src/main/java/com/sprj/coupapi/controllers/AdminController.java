package com.sprj.coupapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sprj.coupapi.dao.CompanyRepository;
import com.sprj.coupapi.dao.CouponRepository;
import com.sprj.coupapi.dao.CustomerRepository;
import com.sprj.coupapi.models.Company;

@Controller
public class AdminController {

	@Autowired
	CompanyRepository companyRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	CouponRepository couponRepository;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addCompany")
	public String addCustomer(Company company) {
		companyRepository.save(company);
		return "home.jsp";
	}

}
