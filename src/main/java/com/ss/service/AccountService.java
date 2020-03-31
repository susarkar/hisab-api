package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ss.entity.Account;
import com.ss.repository.AccountRepository;

public class AccountService {
	@Autowired
	AccountRepository accountRepository;
	public List<Account> getAllAccounts() {
		return accountRepository.getAllAccount();
	}
}
