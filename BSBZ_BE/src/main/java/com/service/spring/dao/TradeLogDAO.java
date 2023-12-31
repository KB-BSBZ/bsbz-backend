package com.service.spring.dao;

import com.service.spring.domain.Product;
import com.service.spring.domain.User;

public interface TradeLogDAO {
	// 유저 id, 상품 id, 구매 수량 ... User 구매 횟수 += 1, Product royal -= tradeRoyalCnt
	void trade(User user, Product product, int tradeRoyalCnt);
}
