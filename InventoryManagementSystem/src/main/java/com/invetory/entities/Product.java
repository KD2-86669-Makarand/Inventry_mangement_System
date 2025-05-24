package com.invetory.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
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
public class Product extends BaseEntity
{
	@Column(name = "ProductName", nullable = false)
	private String productName;
	
	@Lob
	@Column(name = "ProductImage")
	private Byte[] productImage;
	
	@Column(name = "Price")
	private double price;
	
	@Column(name = "Quantity")
	private int availableQuantity;
	
	@Column(name = "Status")
	@Enumerated(EnumType.STRING)
    private ProductStatus status;
	
	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "supplierId")
	private Supplier supplier;

	@ManyToOne
	private StorePurchase purchase;
	
}

	
	
	
	

