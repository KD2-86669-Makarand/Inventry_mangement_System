package com.invetory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invetory.entities.StorePurchase;

public interface StorePurchaseRepository extends JpaRepository<StorePurchase, Long>{

}
