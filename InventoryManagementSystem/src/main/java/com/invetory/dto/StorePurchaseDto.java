package com.invetory.dto;

import java.util.List;

import com.invetory.entities.BaseEntity;
import com.invetory.entities.OrderStatus;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StorePurchaseDto 
{
	 	private Long supplierId;
	    
	 	private Long userId; // who creates the order
	 	
	 	 @Schema(example = "RECEIVED", allowableValues = {"PENDING", "RECEIVED", "CANCELLED"})
	 	private OrderStatus status;
	    
	 	private List<ProductDto> items;
}
