package com.service.spring.domain;


public class ExternalAccount {

	private String exAccount1;
	private String exAccount2;
	private String exAccount3;

	public String getExAccount1() {
		return this.exAccount1;
	}

	public void setExAccount1(String exAccount1) {
		this.exAccount1 = exAccount1;
	}

	public String getExAccount2() {
		return this.exAccount2;
	}

	public void setExAccount2(String exAccount2) {
		this.exAccount2 = exAccount2;
	}

	public String getExAccount3() {
		return this.exAccount3;
	}

	public void setExAccount3(String exAccount3) {
		this.exAccount3 = exAccount3;
	}

	@Override
	public String toString() {
		return "ExternalAccount [exAccount1=" + exAccount1 + ", exAccount2=" + exAccount2 + ", exAccount3=" + exAccount3
				+ "]";
	}

}