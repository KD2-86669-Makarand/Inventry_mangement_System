package com.invetory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invetory.entities.SupplierEntity;

public interface SupplierRepository extends JpaRepository<SupplierEntity, Long> {

}
