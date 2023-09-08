package com.service.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.spring.dao.UserDAO;
import com.service.spring.domain.Product;
import com.service.spring.domain.User;
import com.service.spring.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public void register(User user) throws Exception {
		userDAO.register(user);
	}

	@Override
	public User login(User user) throws Exception {
		return userDAO.login(user);
	}

	@Override
	public String idExist(String id) throws Exception {
		/*
		 * 해당 아이디가 존재 안 하면 return 값이 null
		 */
		return userDAO.idExist(id);
	}

	@Override
	public void addExternalAccount(User user, String exAccount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteExternalAccount(User user, String exAccount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUserInfo(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> userTradeLog(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> ownProducts(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int totalRoyals(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int showBonus(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int userRanking(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
