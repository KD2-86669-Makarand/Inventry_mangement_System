package com.invetory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invetory.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
