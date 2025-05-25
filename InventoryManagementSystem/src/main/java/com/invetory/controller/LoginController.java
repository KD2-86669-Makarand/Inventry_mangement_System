package com.invetory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invetory.dto.AuthRequest;
import com.invetory.dto.SignUpDto;
import com.invetory.entities.User;
import com.invetory.service.UserService;

@RestController
@RequestMapping("/login")
public class LoginController {

	
	@Autowired
	private UserService user;
	
	@GetMapping("/signin")
	public ResponseEntity<?> signIn(AuthRequest u){
		return ResponseEntity.ok().body(u);
	} 
	
	@PostMapping("/signup")
	public ResponseEntity<?> signUp(SignUpDto u){
		return ResponseEntity.ok().body(u);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?>updateUser(User u){
		return ResponseEntity.ok().body(u);
	}
	
	
}
