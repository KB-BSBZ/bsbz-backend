package com.service.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.spring.dao.TradeLogDAO;
import com.service.spring.domain.Product;
import com.service.spring.domain.User;
import com.service.spring.service.TradeLogService;

@Repository
public class TradeLogServiceImpl implements TradeLogService {
	
	@Autowired
	private TradeLogDAO tradeLogDAO;

	@Override
	public void trade(User user, Product product, int tradeRoyalCnt) {
		tradeLogDAO.trade(user, product, tradeRoyalCnt);
	}

}
