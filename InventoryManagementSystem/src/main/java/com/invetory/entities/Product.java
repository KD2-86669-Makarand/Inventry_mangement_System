package com.invetory.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Products")
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProductId")
	private int productId;
	
	@Column(name = "ProductName", nullable = false)
	private String productName;
	
//	@Column(name = "ProductImage")
//	private String productImage;
	
	@Column(name = "Price")
	private double price;
	
	@Column(name = "Quantity")
	private int quantity;
	
	@Column(name = "Status")
	@Enumerated(EnumType.STRING)
    private ProductStatus status;
}

	
	
	
	

