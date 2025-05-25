package com.invetory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invetory.entities.UserEntity;
import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

	Optional<UserEntity> findByEmail(String email);
}
