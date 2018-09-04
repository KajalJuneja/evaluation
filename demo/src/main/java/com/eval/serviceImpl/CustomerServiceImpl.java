package com.eval.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eval.dao.CustomerDao;
import com.eval.entity.Customer;
import com.eval.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<Customer> addCustomer() throws Exception {
		System.out.println("in service");
		String serviceResult;
		
		return customerDao.findAll();
		
		
	}

}
