package com.eval.service;

import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.springframework.stereotype.Service;

import com.eval.entity.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public interface CustomerService {

	public List<Customer> addCustomer() throws Exception;

}
