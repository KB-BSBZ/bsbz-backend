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

		sqlSession.insert(NS + "addTradeLog", tl);
		System.out.println("sqlSession.insert(NS + \"addTradeLog\", tl); 성공");
		
		sqlSession.update(NS + "updateLeftRoyal", tl);
		System.out.println("sqlSession.update(NS + \"updateLeftRoyal\", tl); 성공");
		
		if(tradeRoyalCnt>0) {
			sqlSession.update(NS + "updateTradeCnt", tl);
			System.out.println("회원의 거래 횟수가 증가합니다.");
		}
	}

}
