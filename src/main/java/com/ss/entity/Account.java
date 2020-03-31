package com.ss.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
	private String name;
	private String email;
}
