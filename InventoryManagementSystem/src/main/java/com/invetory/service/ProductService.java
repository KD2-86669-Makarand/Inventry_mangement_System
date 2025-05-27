package com.invetory.service;

import java.util.List;

import com.invetory.dto.ApiResponse;
import com.invetory.dto.ProductDto;
import com.invetory.entities.ProductEntity;

public interface ProductService 
{
	ApiResponse createProduct(ProductDto productDto);
	
	ApiResponse updateProduct(Long productId, ProductDto productDto);
	
	List<ProductDto> getAllProducts();
	
//	List<ProductDto> getProductByCategory(Long categoryId);
	
	
}
