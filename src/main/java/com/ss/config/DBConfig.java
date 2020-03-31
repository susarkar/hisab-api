package com.ss.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DBConfig {
	@Bean(name = "accountDB")
	 @ConfigurationProperties(prefix = "spring.datasource")
	 public DataSource dataSource1() {
	  return DataSourceBuilder.create().build();
	 }

	 @Bean(name = "jdbcTemplateAcctDB")
	 public JdbcTemplate jdbcTemplate1(@Qualifier("accountDB") DataSource ds) {
	  return new JdbcTemplate(ds);
	 }
	 
	 @Bean(name = "custDB")
	 @ConfigurationProperties(prefix = "spring.customer-db")
	 public DataSource dataSource2() {
	  return  DataSourceBuilder.create().build();
	 }

	 @Bean(name = "jdbcTemplateCustDB")
	 public JdbcTemplate jdbcTemplate2(@Qualifier("custDB") DataSource ds) {
	  return new JdbcTemplate(ds);
	 }
}
