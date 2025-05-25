package com.invetory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invetory.entities.Product;
import com.invetory.service.ProductService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/allProduct")
	public ResponseEntity<?>listOfProduct(){
		return ResponseEntity.ok().body(null);
	}

	@PostMapping("/cart")
	public ResponseEntity<?>addCart(Product p){
		
		return ResponseEntity.ok().body(p);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?>removeFromCart(Long Id){
		
	return	ResponseEntity.ok().body(null);
	}
	
	@PostMapping("/purchase")
	public ResponseEntity<?>purchase(List<Product> l){
		return	ResponseEntity.ok().body(null);
	}
	
	
	
}
