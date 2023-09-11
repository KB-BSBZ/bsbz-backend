package com.service.spring.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.spring.dao.BBAccountDAO;
import com.service.spring.domain.BBAccount;
import com.service.spring.domain.User;

@Repository
public class BBAccountDAOImpl implements BBAccountDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public static final String NS = "sql.account.mapper.";

	@Override
	public void withdraw(User user, int amount) {
		BBAccount bbAccount = new BBAccount(user.getUserId(), -amount);
		sqlSession.update(NS + "update", bbAccount);
	}

	@Override
	public void deposit(User user, int amount) {
		BBAccount bbAccount = new BBAccount(user.getUserId(), amount);
		sqlSession.update(NS + "update", bbAccount);
	}

	@Override
	public int showBalance(User user) {
		return sqlSession.selectOne(NS+"showBalance", user);
	}

}
