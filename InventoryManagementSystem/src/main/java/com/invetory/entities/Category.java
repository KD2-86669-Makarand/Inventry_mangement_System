package com.invetory.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Categories")
public class Category 
{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryId")
	private Long categoryId;

	@Column(name = "CategoryName", nullable = false)
    private String categoryName;
	
	@Column(name = "Description")
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
