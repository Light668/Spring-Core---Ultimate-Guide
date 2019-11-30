package com.light.spring.core.javaconfig.autowire.collection;

public class Product {

	private String productId;
	private String productDescription;

	public Product(String productId, String productDescription) {
		this.productId = productId;
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productDescription=" + productDescription + "]";
	}

}
