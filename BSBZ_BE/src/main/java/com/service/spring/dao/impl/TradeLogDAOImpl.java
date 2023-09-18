package com.service.spring.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.spring.dao.TradeLogDAO;
import com.service.spring.domain.Product;
import com.service.spring.domain.TradeLog;
import com.service.spring.domain.User;

@Repository
public class TradeLogDAOImpl implements TradeLogDAO {
	
	public static final String NS = "sql.tradelog.mapper.";

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void trade(User user, Product product, int tradeRoyalCnt) {
		TradeLog tl = new TradeLog(product.getProductId(), user.getUserId(), tradeRoyalCnt);
		System.out.println(tl);
		int balance = sqlSession.selectOne(NS + "showBalance", user);
		if(balance >= (tradeRoyalCnt * 10000)) {
			sqlSession.insert(NS + "addTradeLog", tl);
			System.out.println("sqlSession.insert(NS + \"addTradeLog\", tl); 성공");
			
			sqlSession.update(NS + "updateLeftRoyal", tl);
			System.out.println("sqlSession.update(NS + \"updateLeftRoyal\", tl); 성공");
			
			sqlSession.update(NS + "update", -(tradeRoyalCnt * 10000));
			System.out.println("돈 차감 성공");
		}else {
			System.out.println("돈 부족 거래 실패");
		}
		if(tradeRoyalCnt>0) {
			sqlSession.update(NS + "updateTradeCnt", tl);
			System.out.println("회원의 거래 횟수가 증가합니다.");
		}
	}

}
