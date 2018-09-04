package com.eval.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.eval.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {

	

}
