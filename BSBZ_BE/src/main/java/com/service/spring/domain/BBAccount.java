package com.service.spring.domain;

public class BBAccount {

	private int bbAccount;
	private String userId;
	private int balance;

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

	@Override
	public String toString() {
		return "BBAccount [bbAccount=" + bbAccount + ", userId=" + userId + ", balance=" + balance + "]";
	}

}