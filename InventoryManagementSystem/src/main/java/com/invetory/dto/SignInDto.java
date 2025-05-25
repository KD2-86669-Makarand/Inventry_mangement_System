package com.invetory.dto;

import jakarta.validation.constraints.NotBlank;

public class SignInDto {
	
	@NotBlank(message = "Email is required")
	private String email;
	@NotBlank(message = "Password is required")
	private String password;

}
