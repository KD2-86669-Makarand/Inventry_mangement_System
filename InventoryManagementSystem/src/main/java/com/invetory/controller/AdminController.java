package com.invetory.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invetory.entities.Product;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/list")
	public ResponseEntity<?> purchaseList(Product p) {
		return	ResponseEntity.ok().body(null);
	}

	@PutMapping("/return")
	public ResponseEntity<?> Return(Product p) {
		return	ResponseEntity.ok().body(null);
	}

	@PostMapping("/one")
	public ResponseEntity<?> purchaseOne(Product p) {
		return	ResponseEntity.ok().body(null);
	}

	@GetMapping("/stock")
	public ResponseEntity<?> stockall(Product p) {
		return	ResponseEntity.ok().body(null);
	}

	@GetMapping("detail")
	public ResponseEntity<?> productDetail(Product p) {
		return	ResponseEntity.ok().body(null);
	}

}
