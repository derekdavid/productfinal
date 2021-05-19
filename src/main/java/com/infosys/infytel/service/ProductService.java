package com.infosys.infytel.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.infosys.infytel.dto.ProductDTO;
import com.infosys.infytel.entity.Product;
import com.infosys.infytel.repository.ProductRepository;
import com.infosys.infytel.repository.SubscribedproductRepository;
import com.infosys.infytel.validator.Validator;


@Service
public class ProductService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	SubscribedproductRepository subscribedproductRepository;
	
	@Autowired
	Validator validator;
	
	@Autowired
	Environment environment;
	
	
	//Fetch all products list
	public List<ProductDTO> getAllProducts() throws Exception{
		System.out.println("In service");
		List<Product>products = productRepository.findAll();
		List<ProductDTO> productDTOs = new ArrayList<>();
		
		for(Product product:products) {
			ProductDTO productDTO = ProductDTO.valueOf(product);
			productDTOs.add(productDTO);
		}
		logger.info("Product details : {}", productDTOs);
		return productDTOs;
	}

	//fetch product list by category
	public List<ProductDTO> getProductByCategory(@PathVariable String category) throws Exception {
		// TODO Auto-generated method stub
		List<Product> products = productRepository.findByCategory(category);
		List<ProductDTO> productDTOs = new ArrayList<>();
		
		for(Product product:products) {
			productDTOs.add(ProductDTO.valueOf(product));
		}
		logger.info("Product details according to category : {}", productDTOs);
		
		return productDTOs;
	}

	//fetch product list by name
	public List<ProductDTO> getProductByName(String productName) throws Exception {
		// TODO Auto-generated method stub
		
		List<Product> products = productRepository.findByProductName(productName);
		List<ProductDTO> productDTOs = new ArrayList<>();
		
		for(Product product:products) {
			productDTOs.add(ProductDTO.valueOf(product));
		}
		logger.info("Product details according to product name : {}", productDTOs);
		return productDTOs;
	}

	//fetch product list by productid
	public ProductDTO getProdByProdId(Integer prodId) {
		Product product = productRepository.findByProdId(prodId);
		ProductDTO productDTO=null;
		if(product!=null) {
			productDTO = ProductDTO.valueOf(product);
		}
		return productDTO;
	}

	//add a product
	public void addProduct(ProductDTO productDTO) throws Exception {
		validator.validateProduct(productDTO);
		List<Product> product = productRepository.findByProductName(productDTO.getProductName());
		if(product.isEmpty()) {
			Product products = productDTO.createEntity();
			productRepository.save(products);
		}
		else {
			throw new Exception(environment.getProperty("PRODUCT_ALREADY_EXISTS"));
		}
	}
	
	//remove a product
	public boolean removeProduct(Integer productId)
	{
		Optional<Product> product = productRepository.findById(productId);
		if(product.isPresent()) {
			Product product1 = product.get();
			productRepository.delete(product1);
			return true;
		}else {
			return false;
		}
	}

	//update stock
	public void updateStock(ProductDTO productDTO) throws Exception {
		validator.validateProduct(productDTO);
		Product product = productRepository.findByProdId(productDTO.getProdId());
		if(product!=null)
		{
			//Product product1 = productDTO.createEntity();
			product.setStock(productDTO.getStock());
			productRepository.save(product);
		}
	}



}

