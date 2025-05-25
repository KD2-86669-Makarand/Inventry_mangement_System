package com.invetory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invetory.entities.StorePurchaseEntity;

public interface StorePurchaseRepository extends JpaRepository<StorePurchaseEntity, Long>{

}
