package com.service.spring.service;

import com.service.spring.domain.User;

public interface BBAccountService {

	// 입금하기
	void withdraw(User user, int amount);

	// 출금하기
	void deposit(User user, int amount);

	// 잔액 조회하기
	int showBalance(User user);
}