package com.invetory.dto;

import com.invetory.entities.CategoryEntity;
import com.invetory.entities.SupplierEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto extends BaseDto 
{
	private String productName;
	private String description;
	 @Schema(hidden = true) // Hide from Swagger for now
	private Byte[] productImage;
	private double price;
	private int availableQuantity;
//	private CategoryEntity category;
	private Long categoryId;       // Instead of CategoryEntity
    private Long supplierId;       // Instead of SupplierEntity
		
}
