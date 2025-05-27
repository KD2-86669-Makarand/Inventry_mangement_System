package com.invetory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invetory.entities.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>
{

}
