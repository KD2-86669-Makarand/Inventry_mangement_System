package com.invetory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invetory.entities.PurchaseEntity;

public interface PurchseRepository extends JpaRepository<PurchaseEntity, Long> {

}
