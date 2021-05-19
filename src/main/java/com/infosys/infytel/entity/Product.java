package com.infosys.infytel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int prodId;
	@Column(nullable = false)
	String category;
	@Column(nullable = false)
	String description;
	@Column(nullable = false)
	String image;
	@Column(nullable = false)
	double price;
	@Column(nullable = false)
	String productName;
	@Column
	String productRating;
	@Column(nullable = false)
	int sellerId;
	@Column(nullable = false)
	int stock;
	@Column(nullable = false)
	String subcategory;
	
	//parameterless constructor
	public Product() {
		super();
	}
		
		//parameterized constructor
	public Product(int prodId, String category, String description, String image, double price,
				String productName, String productRating, int sellerId, int stock, String subcategory) {
		super();
		this.prodId = prodId;
		this.category = category;
		this.description = description;
		this.image = image;
		this.price = price;
		this.productName = productName;
		this.productRating = productRating;
		this.sellerId = sellerId;
		this.stock = stock;
		this.subcategory = subcategory;
	}	
	
	//getters and setters 
	
	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductRating() {
		return productRating;
	}

	public void setProductRating(String productRating) {
		this.productRating = productRating;
	}

	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
}