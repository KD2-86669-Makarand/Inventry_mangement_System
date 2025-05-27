package com.invetory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invetory.dto.ApiResponse;
import com.invetory.dto.ProductDto;
import com.invetory.entities.ProductEntity;
import com.invetory.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RequestMapping("/product")
@RestController
public class ProductController 
{
	@Autowired
	private ProductService productService;
	
	@PostMapping("/create-product")
	public ResponseEntity<ApiResponse> createProduct(@RequestBody ProductDto productDto) 
	{
		return ResponseEntity.ok(productService.createProduct(productDto));
	}
	
	@PutMapping("/update-product{id}")
	public ResponseEntity<ApiResponse> updateProduct(Long productId, ProductDto productDto)
	{
		return ResponseEntity.ok(productService.updateProduct(productId, productDto));
	}
	
	@GetMapping("get-all-products")
	public ResponseEntity<List<ProductDto>> getAllProducts()
	{
		return ResponseEntity.ok(productService.getAllProducts());
	}
}
