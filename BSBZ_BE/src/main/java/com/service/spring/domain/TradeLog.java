package com.service.spring.domain;

public class TradeLog {
	private int tradelogId;
	private int productId;
	private String userId;
	
	private String tradeDate;
	private int tradeRoyalCnt;
	
	private Product product;
	
	private int sumRoyal;
	
	public TradeLog(int tradelogId, int productId, String userId, String tradeDate, int tradeRoyalCnt,
			Product product, int sumRoyal) {
		super();
		this.tradelogId = tradelogId;
		this.productId = productId;
		this.userId = userId;
		this.tradeDate = tradeDate;
		this.tradeRoyalCnt = tradeRoyalCnt;
		this.product = product;
		this.sumRoyal = sumRoyal;
	}

	public TradeLog() {};
	
	public TradeLog(String tradeDate, int sumRoyal) {
		this.tradeDate = tradeDate;
		this.sumRoyal = sumRoyal;
	}
	
	public TradeLog(int productId, String userId, int tradeRoyalCnt) {
		this.productId = productId;
		this.userId = userId;
		this.tradeRoyalCnt = tradeRoyalCnt;
	}
	
	public TradeLog(int tradelogId, int productId, String userId, int tradeRoyalCnt) {
		this.tradelogId = tradelogId;
		this.productId = productId;
		this.userId = userId;
		this.tradeRoyalCnt = tradeRoyalCnt;
	}
	
	public int getSumRoyal() {
		return sumRoyal;
	}

	public void setSumRoyal(int sumRoyal) {
		this.sumRoyal = sumRoyal;
	}

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

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "TradeLog [tradelogId=" + tradelogId + ", productId=" + productId + ", userId=" + userId + ", tradeDate="
				+ tradeDate + ", tradeRoyalCnt=" + tradeRoyalCnt + ", \n" + product +", \n" + sumRoyal + "]\n";
	}

	
}
