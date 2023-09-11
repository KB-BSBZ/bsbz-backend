package com.service.spring.domain;


public class ExternalAccount {
	
	private int externalAccountId;
	private String userId;
	private String exAccount;
	
	public ExternalAccount() {};
	public ExternalAccount(String userId, String exAccount) {
		super();
		this.userId = userId;
		this.exAccount = exAccount;
	}
	public ExternalAccount(int externalAccountId, String userId, String exAccount) {
		super();
		this.externalAccountId = externalAccountId;
		this.userId = userId;
		this.exAccount = exAccount;
	}
	
	public int getExternalAccountId() {
		return externalAccountId;
	}
	public void setExternalAccountId(int externalAccountId) {
		this.externalAccountId = externalAccountId;
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
