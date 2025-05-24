package com.invetory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invetory.entities.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
