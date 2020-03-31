package com.ss.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ss.entity.Account;
import com.ss.entity.Customer;

@Transactional
@Repository
public class CustomerRepository {
	 @Autowired
	 @Qualifier("jdbcTemplateCustDB")
	 private JdbcTemplate customerDBJdbcTemplate;
	 
	 public List<Customer> getAllCustomer() {
		  String sql = "select user,email from customer";

		  return customerDBJdbcTemplate.query(sql, new CustomerRowMapper());

		 }
	 
}
