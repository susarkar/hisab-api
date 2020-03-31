package com.ss.entity;

import com.ss.entity.Account.AccountBuilder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
	private String name;
	private String email;
}
