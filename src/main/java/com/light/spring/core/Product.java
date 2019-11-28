package com.light.spring.core;

public class Product {
	
	private String productName;
	private String productDescription;
	private String productId;
	
	public Product(String productId, String productName, String productDescription) {
		this.productName = productName;
		this.productDescription = productDescription;
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productDescription=" + productDescription + ", productId="
				+ productId + "]";
	}
	
	

}
