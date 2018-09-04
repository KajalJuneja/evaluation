package com.eval.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eval.entity.Customer;
import com.eval.service.CustomerService;

@RestController
@RequestMapping("/dashboard/")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value = "addCustomer", method = RequestMethod.GET)
	public List<Customer> addCustomer() throws Exception {
		 System.out.println("in controller");
		
		
		return customerService.addCustomer();
		 
		
		 	 
	 }
	
	@RequestMapping(value = "check", method = RequestMethod.GET)
	public String check() throws Exception {
		 System.out.println("in controller");
		
		
		 
		return "SUCCESS";
		 	 
	 }
	
	
	

}
