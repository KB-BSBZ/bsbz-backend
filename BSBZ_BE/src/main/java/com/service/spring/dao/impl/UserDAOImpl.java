package com.service.spring.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.spring.dao.UserDAO;
import com.service.spring.domain.ExternalAccount;
import com.service.spring.domain.Product;
import com.service.spring.domain.User;

@Repository
public class UserDAOImpl implements UserDAO {

	public static final String NS = "sql.user.mapper.";

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void register(User user) throws Exception {
		sqlSession.insert(NS + "register", user);
	}

	@Override
	public User login(User user) throws Exception {
		return sqlSession.selectOne(NS + "selectUser", user);
	}

	@Override
	public String idExist(String id) throws Exception {
		return sqlSession.selectOne(NS + "idExist", id);
	}

	@Override
	public void addExternalAccount(User user, String exAccount) {
		ExternalAccount ea = new ExternalAccount(user.getUserId(), exAccount);
		System.out.println(ea);
		sqlSession.insert(NS + "addExternalAccount", ea);
		System.out.println("진입 후");
	}

	@Override
	public void deleteExternalAccount(User user, String exAccount) {
		ExternalAccount ea = new ExternalAccount(user.getUserId(), exAccount);
		sqlSession.insert(NS + "deleteExternalAccount", ea);
	}

	@Override
	public void updateUserInfo(User user) {
		sqlSession.update(NS + "update", user);
	}

	@Override
	public List<Product> userTradeLog(User user) {

		return null;
	}

	@Override
	public List<Product> ownProducts(User user) {

		return null;
	}

	@Override
	public int totalRoyals(User user) {

		return 0;
	}

	@Override
	public int showBonus(User user) {

		return 0;
	}

	@Override
	public int userRanking(User user) {

		return 0;
	}

}
