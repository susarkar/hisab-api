package com.ss.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.ss.entity.Account;

public class AccountRowMapper implements RowMapper {

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {

		return Account.builder().name(rs.getString("name")).email("email").build();
		

	}

}
