package com.invetory.entities;

import java.util.List;

import org.springframework.boot.context.properties.bind.Name;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "Suppliers")
@Entity
public class Supplier extends BaseEntity
{
	@Column(name = "SupplierName", nullable = false)
    private String supplierName;
	
	@Column(name = "Email", unique = true)
    private String email;
	
	@Column(name = "ContactNo", unique = true)
    private String contactNumber;
	
	@Column(name = "Address")
    private String address;

    @OneToMany(mappedBy = "supplier")
    private List<Product> products;

}
