package com.ss.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ss.entity.Account;
import com.ss.entity.Customer;

public class CustomerRowMapper implements RowMapper {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		return Customer.builder().name(rs.getString("name")).email("email").build();
	}

}
