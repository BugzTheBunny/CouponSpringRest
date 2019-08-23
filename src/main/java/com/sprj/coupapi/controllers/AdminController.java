package com.sprj.coupapi.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sprj.coupapi.dao.CompanyRepository;
import com.sprj.coupapi.dao.CouponRepository;
import com.sprj.coupapi.dao.CustomerRepository;
import com.sprj.coupapi.models.Company;
import com.sprj.coupapi.models.Coupon;
import com.sprj.coupapi.models.Customer;

@Controller
public class AdminController {

	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CouponRepository couponRepository;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	////////////////
	// GET by id
	////////////////
	@RequestMapping("/customer/{id}")
	@ResponseBody
	public String getCustomer(@PathVariable("id") long id) {
		return customerRepository.findById(id).toString();
	}

	@RequestMapping("/company/{id}")
	@ResponseBody
	public String getCompany(@PathVariable("id") long id) {
		return companyRepository.findById(id).toString();
	}

	@RequestMapping("/coupon/{id}")
	@ResponseBody
	public String getCoupon(@PathVariable("id") long id) {
		return couponRepository.findById(id).toString();
	}

	/////////////////////////
	// GET for Collections
	/////////////////////////
	@RequestMapping("/customers")
	@ResponseBody
	public Collection<Customer> getCustomerList() {
		return customerRepository.findAll();
	}

	@RequestMapping("/companies")
	@ResponseBody
	public Collection<Company> getCompanyList() {
		return companyRepository.findAll();
	}

	@RequestMapping("/coupons")
	@ResponseBody
	public Collection<Coupon> getCouponList() {
		return couponRepository.findAll();
	}

	/////////////
	// GET By Name
	/////////////

	@RequestMapping("/customer/{name}")
	@ResponseBody
	public Customer getCustomer(@PathVariable("name") String name) {
		return customerRepository.findByName(name);
	}

	@RequestMapping("/company/{name}")
	@ResponseBody
	public Company getCompany(@PathVariable("name") String name) {
		return companyRepository.findByName(name);
	}

	///////
	// POST
	///////

	@RequestMapping("/addCustomer")
	@ResponseBody
	public String addCustomer(Customer customer) {
		customerRepository.save(customer);
		return "Customer Added!";

	}

	@RequestMapping("/addCompany")
	@ResponseBody
	public String addCompany(Company company) {
		companyRepository.save(company);
		return "Company Added!";

	}

	@RequestMapping("/addCoupon")
	@ResponseBody
	public String addCoupon(Coupon coupon) {
		couponRepository.save(coupon);
		return "Coupon Added!";
	}

	///////////////
	// DELETE by ID
	///////////////

	@RequestMapping("/dcustomer/{id}")
	@ResponseBody
	public String removeCustomer(@PathVariable("id") long id) {
		customerRepository.delete(customerRepository.findById(id));
		return "Customer #" + id + " Was Removed";
	}

	@RequestMapping("/dcompany/{id}")
	@ResponseBody
	public String removeCompany(@PathVariable("id") long id) {
		companyRepository.delete(companyRepository.findById(id));
		return "Company #" + id + " Was Removed";
	}

	@RequestMapping("/dcoupon/{id}")
	@ResponseBody
	public String removeCoupon(@PathVariable("id") long id) {
		couponRepository.delete(couponRepository.findById(id));
		return "Coupon #" + id + " Was Removed";
	}

}
