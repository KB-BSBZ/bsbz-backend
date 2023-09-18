package com.service.spring.domain;


public class User {
	private String userId;
	private String password;
	private String email;
	private String userName;
	private String ssn;
	private String phoneNum;
	private int tradeCnt;
	
	public User() {};
	
	public User(String userId) {
		this.userId = userId;
	}
	
	public User(String userId, String password, String email, String userName, String ssn, String phoneNum,
			int tradeCnt) {
		super();
		this.userId = userId;
		this.password = password;
		this.email = email;
		this.userName = userName;
		this.ssn = ssn;
		this.phoneNum = phoneNum;
		this.tradeCnt = tradeCnt;
	}
	public User(String userId, String password, String email, String userName, String ssn, String phoneNum) {
		super();
		this.userId = userId;
		this.password = password;
		this.email = email;
		this.userName = userName;
		this.ssn = ssn;
		this.phoneNum = phoneNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getTradeCnt() {
		return tradeCnt;
	}

	public void setTradeCnt(int tradeCnt) {
		this.tradeCnt = tradeCnt;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", email=" + email + ", userName=" + userName
				+ ", ssn=" + ssn + ", phoneNum=" + phoneNum + ", tradeCnt=" + tradeCnt + "]";
	}

}
