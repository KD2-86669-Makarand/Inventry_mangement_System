package com.invetory.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invetory.entities.User;

@RestController
@RequestMapping("/login")
public class LoginController {

	
	@GetMapping("/signin")
	public ResponseEntity<?> signIn(User u){
		return ResponseEntity.ok().body(u);
	} 
	
	@PostMapping("/signup")
	public ResponseEntity<?> signUp(User u){
		return ResponseEntity.ok().body(u);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?>updateUser(User u){
		return ResponseEntity.ok().body(u);
	}
	
	
}
