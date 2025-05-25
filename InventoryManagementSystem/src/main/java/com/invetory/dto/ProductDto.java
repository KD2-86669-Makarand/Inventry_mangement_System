package com.invetory.dto;

import com.invetory.entities.CategoryEntity;
import com.invetory.entities.SupplierEntity;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto extends BaseDto {

	
	private String productName;
	private Byte[] productImage;
	private double price;
	private int availableQuantity;
	private CategoryEntity category;
	
	
	
	
		
	
}
