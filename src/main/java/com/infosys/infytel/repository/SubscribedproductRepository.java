package com.infosys.infytel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.entity.Subscribedproduct;



public interface SubscribedproductRepository extends JpaRepository<Subscribedproduct, Integer>{
	public List<Subscribedproduct> findByBuyerId(int buyerId);
}
