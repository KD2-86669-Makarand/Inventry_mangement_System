package com.invetory.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.invetory.dto.ApiResponse;
import com.invetory.dto.ProductDto;
import com.invetory.entities.ProductEntity;
import com.invetory.repository.ProductRepository;

import ch.qos.logback.core.model.Model;

@Transactional
@Service
public class ProductServiceImpl implements ProductService 
{
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired 
	private ModelMapper modelMapper;
	
	@Override
	public ApiResponse createProduct(ProductDto productDto) 
	{
		ProductEntity product = modelMapper.map(productDto, ProductEntity.class);
		productRepository.save(product);
		return new ApiResponse("Product Created Successfully !!! With ID : " + product.getId());
	}

	@Override
	public ApiResponse updateProduct(Long productId, ProductDto productDto) 
	{
		Optional<ProductEntity> optProduct = productRepository.findById(productId);
		if(optProduct.isPresent())
		{
			ProductEntity product = optProduct.get();
			product.setProductName(productDto.getProductName());
			product.setDescription(productDto.getDescription());
			product.setPrice(productDto.getPrice());
			productRepository.save(product);
		}
		
		return new ApiResponse("Product Updated Successfully With ID : " + productId);
	}

	@Override
	public List<ProductDto> getAllProducts() {
	    List<ProductEntity> products = productRepository.findAll();
	    return products.stream()
	            .map(product -> modelMapper.map(product, ProductDto.class))
	            .collect(Collectors.toList());
	}

	
	
	
}
