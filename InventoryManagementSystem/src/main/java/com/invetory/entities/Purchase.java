package com.invetory.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Purchase")
public class Purchase 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderId")
	private Long orderId;
	
	@ManyToOne
	private Supplier supplier;
	
	private LocalDateTime createdAt;
	
	 @ManyToOne
	 private User PurchasedBy;
	 
	 @Enumerated(EnumType.STRING)
	 private OrderStatus status;
	
}
