package com.service.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.spring.dao.BBAccountDAO;
import com.service.spring.domain.User;
import com.service.spring.service.BBAccountService;

@Service
public class BBAccountServiceImpl implements BBAccountService {
	
	@Autowired
	private BBAccountDAO bbAccountDAO;

	@Override
	public void withdraw(User user, int amount) {
		bbAccountDAO.withdraw(user, amount);
	}

	@Override
	public void deposit(User user, int amount) {
		bbAccountDAO.deposit(user, amount);
	}

	@Override
	public int showBalance(User user) {
		return bbAccountDAO.showBalance(user);
	}
}
