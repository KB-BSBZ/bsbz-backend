package com.service.spring.domain;


public class TradeLog {
	private int tradelogId;
	private int productId;
	private int userId;

	private String tradeDate;
	private int tradeRoyalCnt;

	public int getTradelogId() {
		return this.tradelogId;
	}

	public void setTradelogId(int tradelogId) {
		this.tradelogId = tradelogId;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTradeDate() {
		return this.tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public int getTradeRoyalCnt() {
		return this.tradeRoyalCnt;
	}

	public void setTradeRoyalCnt(int tradeRoyalCnt) {
		this.tradeRoyalCnt = tradeRoyalCnt;
	}

	@Override
	public String toString() {
		return "TradeLog [tradelogId=" + tradelogId + ", productId=" + productId + ", userId=" + userId + ", tradeDate="
				+ tradeDate + ", tradeRoyalCnt=" + tradeRoyalCnt + "]";
	}

}