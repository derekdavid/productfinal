package com.infosys.infytel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "subscribedproduct")
public class Subscribedproduct {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(nullable = false)
	int buyerId;
	@Column(nullable = false)
	int prodId;
	@Column(nullable = false)
	int quantity;
	
	//constructors
	public Subscribedproduct() {
		super();
	}
	
	public Subscribedproduct(int buyerId, int prodId, int quantity) {
		super();
		
		this.buyerId = buyerId;
		this.prodId = prodId;
		this.quantity = quantity;
	}

	//getters and setters


	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
