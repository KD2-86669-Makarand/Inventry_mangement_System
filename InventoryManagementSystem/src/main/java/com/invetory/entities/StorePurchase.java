package com.invetory.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name = "StorePurchase") // Admin purchase table
public class StorePurchase extends BaseEntity
{
	@ManyToOne
	private Supplier supplier;
	
	 @ManyToOne
	 private User PurchasedBy;
	 
	 @Enumerated(EnumType.STRING)
	 private OrderStatus status;
	 
	 @OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL)
	    private List<Product> items;
	
}
