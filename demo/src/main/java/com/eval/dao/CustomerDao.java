package com.eval.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.eval.entity.Customer;

@Service
public interface CustomerDao  {

	public List<Customer> addCustomer();

}
