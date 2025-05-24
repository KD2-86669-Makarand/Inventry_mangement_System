package com.invetory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invetory.entities.Purchase;

public interface PurchseRepository extends JpaRepository<Purchase, Long> {

}
