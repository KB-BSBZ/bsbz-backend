package com.service.spring.domain;

public class Product {
	private int productId;
	private String productName;
	private String productType;
	private long productCost;
	private int bonus;
	private int totalRoyal;
	private int leftRoyal;
	private String registerDate;
	private String endDate;
	private String description;
	private String profileUrl;
	private String imageUrl;
	private String extra;
	private int views;

	public Product() {
	};

	public Product(int productId) {
		this.productId = productId;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public long getProductCost() {
		return this.productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	public int getBonus() {
		return this.bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getTotalRoyal() {
		return this.totalRoyal;
	}

	public void setTotalRoyal(int totalRoyal) {
		this.totalRoyal = totalRoyal;
	}

	public int getLeft_royal() {
		return this.leftRoyal;
	}

	public void setLeft_royal(int leftRoyal) {
		this.leftRoyal = leftRoyal;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProfileUrl() {
		return this.profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", productCost=" + productCost + ", bonus=" + bonus + ", totalRoyal=" + totalRoyal + ", leftRoyal="
				+ leftRoyal + ", registerDate=" + registerDate + ", endDate=" + endDate + ", description=" + description
				+ ", profileUrl=" + profileUrl + ", imageUrl=" + imageUrl + ", extra=" + extra + ", views=" + views
				+ "]";
	}

}