package com.service.spring.dao;

import com.service.spring.domain.User;

public interface BBAccountDAO {

	// 입금하기
	void withdraw(int amount);

	// 출금하기
	void deposit(int amount);

	// 잔액 조회하기
	void showBalance(User user);
}