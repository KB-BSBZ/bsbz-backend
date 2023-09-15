package com.service.spring.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.spring.dao.UserDAO;
import com.service.spring.domain.BBAccount;
import com.service.spring.domain.ExternalAccount;
import com.service.spring.domain.Product;
import com.service.spring.domain.TradeLog;
import com.service.spring.domain.User;

@Repository
public class UserDAOImpl implements UserDAO {

	public static final String NS = "sql.user.mapper.";

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void register(User user) throws Exception {
		System.out.println("회원 등록합니다.");
		sqlSession.insert(NS + "register", user);
		System.out.println("벌부 계좌가 자동으로 생성됩니다.");
		BBAccount bb = new BBAccount(user.getUserId());
		sqlSession.insert(NS + "register_bbAccount",bb);
		System.out.println("벌부 계좌가 자동으로 생성되었다.");
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
		System.out.println("at service :" + exAccount);
		ExternalAccount ea = new ExternalAccount(user.getUserId(), exAccount);
		System.out.println(ea);
		sqlSession.insert(NS + "addExternalAccount", ea);
		System.out.println("진입 후");
	}

	@Override
	public void deleteExternalAccount(User user, String exAccount) {
		ExternalAccount ea = new ExternalAccount(user.getUserId(), exAccount);
		sqlSession.delete(NS + "deleteExternalAccount", ea);
	}

	@Override
	public void updateUserInfo(User user) {
		sqlSession.update(NS + "update", user);
	}

	@Override
	public List<TradeLog> userTradeLog(User user) {
		System.out.println("진입 전");
		List<TradeLog> temp= sqlSession.selectList(NS+"userTradeLog", user);
		System.out.println("진입 후");
		System.out.println(temp.size());
		return temp;
	}

	@Override
	public List<TradeLog> ownProducts(User user) {
		return sqlSession.selectList(NS+"ownProducts",user);
	}

	@Override
	public int totalRoyals(User user) {
		return sqlSession.selectOne(NS+"totalRoyals",user);
	}

	@Override
	public int showBonus(User user) {
		return sqlSession.selectOne(NS+"showBonus",user);
	}

	@Override
	public int userRanking(User user) {
		return sqlSession.selectOne(NS+"userRanking",user);
	}

	@Override
	public User userInfo(User user) {
		return sqlSession.selectOne(NS+"selectUser",user);
	}
	
	@Override
	public void deleteUser(User user) throws Exception {
		sqlSession.delete(NS + "delete", user);
	}

//	@Override
//	public List<Integer> totalRoyalsDaily(User user) throws Exception {
//		return sqlSession.selectList(NS + "totalRoyalsDaily", user);
//	}
	
	@Override
	public List<TradeLog> totalRoyalsDaily(User user) throws Exception {
		return sqlSession.selectList(NS + "totalRoyalsDaily", user);
	}

}