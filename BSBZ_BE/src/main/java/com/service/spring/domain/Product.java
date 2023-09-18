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
	private int isDone;

	public Product() {
	};

	public Product(int productId, String productName, String productType, long productCost, int bonus, int totalRoyal,
			int leftRoyal, String registerDate, String endDate, String description, String profileUrl, String imageUrl,
			String extra, int views, int isDone) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productCost = productCost;
		this.bonus = bonus;
		this.totalRoyal = totalRoyal;
		this.leftRoyal = leftRoyal;
		this.registerDate = registerDate;
		this.endDate = endDate;
		this.description = description;
		this.profileUrl = profileUrl;
		this.imageUrl = imageUrl;
		this.extra = extra;
		this.views = views;
		this.isDone = isDone;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public long getProductCost() {
		return productCost;
	}

	public void setProductCost(long productCost) {
		this.productCost = productCost;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getTotalRoyal() {
		return totalRoyal;
	}

	public void setTotalRoyal(int totalRoyal) {
		this.totalRoyal = totalRoyal;
	}

	public int getLeftRoyal() {
		return leftRoyal;
	}

	public void setLeftRoyal(int leftRoyal) {
		this.leftRoyal = leftRoyal;
	}

	public int getLeft_royal() {
		return this.leftRoyal;
	}

	public void setLeft_royal(int leftRoyal) {
		this.leftRoyal = leftRoyal;
	}
	
	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getExtra() {
		return extra;
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

	public int getIsDone() {
		return isDone;
	}

	public void setIsDone(int isDone) {
		this.isDone = isDone;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", productCost=" + productCost + ", bonus=" + bonus + ", totalRoyal=" + totalRoyal + ", leftRoyal="
				+ leftRoyal + ", registerDate=" + registerDate + ", endDate=" + endDate + ", description=" + description
				+ ", profileUrl=" + profileUrl + ", imageUrl=" + imageUrl + ", extra=" + extra + ", views=" + views
				+ ", isDone=" + isDone + "]";
	}


}