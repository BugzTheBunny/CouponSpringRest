package com.sprj.coupapi.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprj.coupapi.dao.CompanyRepository;
import com.sprj.coupapi.dao.CouponRepository;
import com.sprj.coupapi.dao.CustomerRepository;
import com.sprj.coupapi.models.Company;
import com.sprj.coupapi.models.Coupon;
import com.sprj.coupapi.models.Customer;

@RestController
public class AdminController {

	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CouponRepository couponRepository;

	@RequestMapping("/")
	public String home() {
		return "-------------Working! Test with postman for now!-------------";
	}

	////////////////
	// GET by id
	////////////////
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable("id") long id) {
		return customerRepository.findById(id);
	}

	@GetMapping("/company/{id}")
	public Company getCompany(@PathVariable("id") long id) {
		return companyRepository.findById(id);
	}

	@GetMapping("/coupon/{id}")
	public Coupon getCoupon(@PathVariable("id") long id) {
		return couponRepository.findById(id);
	}

	/////////////////////////
	// GET for Collections
	/////////////////////////
	@GetMapping("/customers")
	public Collection<Customer> getCustomerList() {
		return customerRepository.findAll();
	}

	@GetMapping("/companies")
	public Collection<Company> getCompanyList() {
		return companyRepository.findAll();
	}

	@GetMapping("/coupons")
	public Collection<Coupon> getCouponList() {
		return couponRepository.findAll();
	}

	/////////////
	// GET By Name
	/////////////

	@GetMapping("/cust/{name}")
	public Customer getCustomer(@PathVariable("name") String name) {
		return customerRepository.findByName(name);
	}

	@GetMapping("/comp/{name}")
	public Company getCompany(@PathVariable("name") String name) {
		return companyRepository.findByName(name);
	}

	///////
	// POST
	///////

	@PostMapping(path = "/addCustomer", consumes = { "application/json" })
	public void addCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);

	}

	@PostMapping(path = "/addCompany", consumes = { "application/json" })
	public void addCompany(@RequestBody Company company) {
		companyRepository.save(company);

	}

	@PostMapping(path = "/addCoupon", consumes = { "application/json" })
	public void addCoupon(@RequestBody Coupon coupon) {
		couponRepository.save(coupon);
	}

	///////////////
	// DELETE by ID
	///////////////

	@DeleteMapping("/dcustomer/{id}")
	public void removeCustomer(@PathVariable("id") long id) {
		customerRepository.delete(customerRepository.findById(id));
	}

	@DeleteMapping("/dcompany/{id}")
	public void removeCompany(@PathVariable("id") long id) {
		companyRepository.delete(companyRepository.findById(id));
	}

	@DeleteMapping("/dcoupon/{id}")
	public void removeCoupon(@PathVariable("id") long id) {
		couponRepository.delete(couponRepository.findById(id));
	}

	///////////
	// PUT
	///////////

	@PutMapping(path = "/updateCustomer", consumes = { "application/json" })
	public void uCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);

	}

	@PutMapping(path = "/updateCompany", consumes = { "application/json" })
	public void uCompany(@RequestBody Company company) {
		companyRepository.save(company);

	}

	@PutMapping(path = "/updateCoupon", consumes = { "application/json" })
	public void uCoupon(@RequestBody Coupon coupon) {
		couponRepository.save(coupon);
	}
}
