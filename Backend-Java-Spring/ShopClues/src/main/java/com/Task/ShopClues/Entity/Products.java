package com.Task.ShopClues.Entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

@DynamoDBTable(tableName = "Shopclues")
public class Products {

	@DynamoDBHashKey(attributeName = "productId")
	private Long productId;

	@DynamoDBAttribute(attributeName = "productQty")
	private Long productQty;

	@DynamoDBAttribute(attributeName = "productSku")
	private String productSku;

	@DynamoDBAttribute(attributeName = "productName")
	private String productName;

	@DynamoDBAttribute(attributeName = "productPrice")
	private Integer productPrice;

	@DynamoDBAttribute(attributeName = "productShortName")
	private String productShortName;

	@DynamoDBAttribute(attributeName = "productDescription")
	private String productDescription;

	@DynamoDBAttribute(attributeName = "createdDate")
	private String createdDate;

	@DynamoDBAttribute(attributeName = "deliveryTimeSpan")
	private String deliveryTimeSpan;

	@DynamoDBAttribute(attributeName = "categoryId")
	private Integer categoryId;

	@DynamoDBAttribute(attributeName = "productImageUrl")
	private String productImageUrl;

	@DynamoDBAttribute(attributeName = "categoryName")
	private String categoryName;

	// Getters and setters

	@DynamoDBHashKey(attributeName = "productId")
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@DynamoDBAttribute
	public Long getProductQty() {
		return productQty;
	}

	public void setProductQty(Long productQty) {
		this.productQty = productQty;
	}

	@DynamoDBAttribute
	public String getProductSku() {
		return productSku;
	}

	public void setProductSku(String productSku) {
		this.productSku = productSku;
	}

	@DynamoDBAttribute
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@DynamoDBAttribute
	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	@DynamoDBAttribute
	public String getProductShortName() {
		return productShortName;
	}

	public void setProductShortName(String productShortName) {
		this.productShortName = productShortName;
	}

	@DynamoDBAttribute
	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@DynamoDBAttribute
	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@DynamoDBAttribute
	public String getDeliveryTimeSpan() {
		return deliveryTimeSpan;
	}

	public void setDeliveryTimeSpan(String deliveryTimeSpan) {
		this.deliveryTimeSpan = deliveryTimeSpan;
	}

	@DynamoDBAttribute
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@DynamoDBAttribute
	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	@DynamoDBAttribute
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	// Constructors

	public Products() {
	}

	public Products(Long productQty, Long productId, String productSku, String productName,
			Integer productPrice, String productShortName, String productDescription, String createdDate,
			String deliveryTimeSpan, Integer categoryId, String productImageUrl, String categoryName) {
		super();
		this.productQty = productQty;
		this.productId = productId;
		this.productSku = productSku;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productShortName = productShortName;
		this.productDescription = productDescription;
		this.createdDate = createdDate;
		this.deliveryTimeSpan = deliveryTimeSpan;
		this.categoryId = categoryId;
		this.productImageUrl = productImageUrl;
		this.categoryName = categoryName;
	}

	// toString method

	@Override
	public String toString() {
		return "Products [productQty=" + productQty + ", productId=" + productId + ", productSku="
				+ productSku + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productShortName=" + productShortName + ", productDescription=" + productDescription
				+ ", createdDate=" + createdDate + ", deliveryTimeSpan=" + deliveryTimeSpan + ", categoryId="
				+ categoryId + ", productImageUrl=" + productImageUrl + ", categoryName=" + categoryName + "]";
	}
}
