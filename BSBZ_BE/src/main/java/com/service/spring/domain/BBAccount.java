package com.service.spring.domain;

public class BBAccount {

	private int bbAccount;
	private String userId;
	private int balance;
	private int amount;
	
	public BBAccount() {};
	
	public BBAccount(int bbAccount, String userId) {
		super();
		this.bbAccount = bbAccount;
		this.userId = userId;
	}
	
	public BBAccount(String userId, int amount) {
		super();
		this.userId = userId;
		this.amount = amount;
	}
	
	public BBAccount(String userId) {
		super();
		this.userId = userId;
	}


	public BBAccount(int bbAccount, String userId, int balance, int amount) {
		super();
		this.bbAccount = bbAccount;
		this.userId = userId;
		this.balance = balance;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BBAccount [bbAccount=" + bbAccount + ", userId=" + userId + ", balance=" + balance + ", amount="
				+ amount + "]";
	}

	public int getBbAccount() {
		return this.bbAccount;
	}

	public void setBbAccount(int bbAccount) {
		this.bbAccount = bbAccount;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}