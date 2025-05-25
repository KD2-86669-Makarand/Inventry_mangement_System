package com.invetory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invetory.dto.ProductDto;
import com.invetory.entities.ProductEntity;
import com.invetory.service.ProductService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/list")
	public ResponseEntity<?> purchaseList(ProductDto p) {
		return	ResponseEntity.ok().body(null);
	}

	@PutMapping("/return")
	public ResponseEntity<?> Return(ProductEntity p) {
		return	ResponseEntity.ok().body(null);
	}

	@PostMapping("/one")
	public ResponseEntity<?> purchaseOne(ProductEntity p) {
		return	ResponseEntity.ok().body(null);
	}

	@GetMapping("/stock")
	public ResponseEntity<?> stockall(ProductDto p) {
		return	ResponseEntity.ok().body(null);
	}

	@GetMapping("detail")
	public ResponseEntity<?> productDetail(ProductEntity p) {
		return	ResponseEntity.ok().body(null);
	}

}
