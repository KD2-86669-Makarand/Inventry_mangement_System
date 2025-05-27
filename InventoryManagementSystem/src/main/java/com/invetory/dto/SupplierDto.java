package com.invetory.dto;

import java.util.List;

import com.invetory.entities.ProductEntity;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SupplierDto 
{
    private String supplierName;
	
    private String email;
	
    private String contactNumber;
	
    private String address;

//    private List<ProductEntity> products;
}
