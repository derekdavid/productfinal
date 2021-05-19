package com.infosys.infytel.dto;

import com.infosys.infytel.entity.Product;

public class ProductDTO {

	int prodId;
	String category;
	String description;
	String image;
	double price;
	String productName;
	String productRating;
	int sellerId;
	int stock;
	String subcategory;
	
	//parameterless constructor
	public ProductDTO() {
		super();
	}
		
		//parameterized constructor
	public ProductDTO(int prodId, String category, String description, String image, double price,
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
	//update
	// Converts Entity into DTO
	public static ProductDTO valueOf(Product product) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setCategory(product.getCategory());
		productDTO.setDescription(product.getDescription());
		productDTO.setImage(product.getImage());
		productDTO.setPrice(product.getPrice());
		productDTO.setProdId(product.getProdId());
		productDTO.setProductName(product.getProductName());
		productDTO.setProductRating(product.getProductRating());
		productDTO.setSellerId(product.getSellerId());
		productDTO.setStock(product.getStock());
		productDTO.setSubcategory(product.getSubcategory());
		return productDTO;
	}
	
	//convert dto into entity
		public Product createEntity()
		{
			Product product = new Product();
			product.setCategory(this.getCategory());
			product.setDescription(this.getDescription());
			product.setImage(this.getImage());
			product.setPrice(this.getPrice());
			product.setProdId(this.getProdId());
			product.setProductName(this.getProductName());
			product.setProductRating(this.getProductRating());
			product.setSellerId(this.getSellerId());
			product.setStock(this.getStock());
			product.setSubcategory(this.getSubcategory());
			return product;
		}


	@Override
	public String toString() {
		return "ProductDTO [prodId=" + prodId + ", category=" + category + ", description="
				+ description + ", image=" + image + ", price=" + price + ", productName=" + productName + ", productRating="
				+ productRating + ", sellerId=" + sellerId + ", stock=" + stock + ", subcategory=" + subcategory + "]";
	}	
}

