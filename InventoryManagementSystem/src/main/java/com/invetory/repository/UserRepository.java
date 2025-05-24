package com.invetory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invetory.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
