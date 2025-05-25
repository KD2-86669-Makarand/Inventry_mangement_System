package com.invetory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invetory.dto.AuthRequest;
import com.invetory.dto.UserDto;
import com.invetory.entities.UserEntity;
import com.invetory.service.UserService;


import jakarta.validation.Valid;


@RequestMapping("/login")
@RestController
public class LoginController {

	
	@Autowired
	private UserService userService;
	
	@PostMapping("/signin")
	public ResponseEntity<?> signIn( @RequestBody @Valid AuthRequest dto){
		
		UserDto res=userService.SignInUser(dto);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	} 
	
	@PostMapping("/signup")
	public ResponseEntity<?> signUp(@RequestBody @Valid UserDto dto){
		System.out.println(dto);
		UserDto res=userService.SignupUser(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(dto);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?>updateUser(UserEntity u){
		return ResponseEntity.ok().body(u);
	}
	
	
}
