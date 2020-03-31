package com.ss.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ss.entity.Account;

@Transactional
@Repository
public class AccountRepository {
	 @Autowired
	 @Qualifier("jdbcTemplateAcctDB")
	 private JdbcTemplate accountDBJdbcTemplate;
	 
	 public List<Account> getAllAccount() {
		  String sql = "select name,email from account";

 
		  return accountDBJdbcTemplate.query(sql, new AccountRowMapper());

		 }
	 
	
}
