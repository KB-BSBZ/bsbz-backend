package com.service.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.spring.dao.UserDAO;
import com.service.spring.domain.Product;
import com.service.spring.domain.TradeLog;
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
		userDAO.addExternalAccount(user, exAccount);
	}

	@Override
	public void deleteExternalAccount(User user, String exAccount) {
		userDAO.deleteExternalAccount(user, exAccount);
	}

	@Override
	public void updateUserInfo(User user) {
		userDAO.updateUserInfo(user);
	}

	@Override
	public List<TradeLog> userTradeLog(User user) {
		return userDAO.userTradeLog(user);
	}

	@Override
	public List<TradeLog> ownProducts(User user) {
		return userDAO.ownProducts(user);
	}

	@Override
	public int totalRoyals(User user) {
		return userDAO.totalRoyals(user);
	}

	@Override
	public int showBonus(User user) {
		return userDAO.showBonus(user);
	}

	@Override
	public int userRanking(User user) {
		return userDAO.userRanking(user);
	}

	@Override
	public User userInfo(User user) {
		return userDAO.userInfo(user);
	}
	
	@Override
	public void deleteUser(User user) throws Exception {
		userDAO.deleteUser(user);
	}

	@Override
	public List<TradeLog> totalRoyalsDaily(User user) throws Exception {
		return userDAO.totalRoyalsDaily(user);
	}

}