package com.service.spring.domain;

public class ExternalAccount {

	private String userId;
	private String exAccount;

	public ExternalAccount() {
	};

	public ExternalAccount(String userId, String exAccount) {
		super();
		this.userId = userId;
		this.exAccount = exAccount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getExAccount() {
		return exAccount;
	}

	public void setExAccount(String exAccount) {
		this.exAccount = exAccount;
	}

	@Override
	public String toString() {
		return "ExternalAccount [userId=" + userId + ", exAccount=" + exAccount + "]";
	}

}