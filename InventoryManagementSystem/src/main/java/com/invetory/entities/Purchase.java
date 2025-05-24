package com.invetory.entities;

import java.util.List;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "CustomerPurchase")
public class Purchase extends BaseEntity
{
	@OneToMany
	private List<Product> products;
	
	private int quantity;
	
	private double totalAmount;
	
	 @Enumerated(EnumType.STRING)
	 private OrderStatus orderStatus;
	
}
