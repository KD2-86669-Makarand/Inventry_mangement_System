package com.invetory.dto;

import com.invetory.entities.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SignUpDto {
	@NotBlank(message = "FirstName is required")
	private String firstName;
	@NotBlank(message = "LastName is required")
	private String lastName;

	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	private String email;
	@NotBlank(message = "Password is required")
	@Size(min = 6, message = "Password must be at least 6 characters")
	private String password;
	@NotBlank(message = "Phone is required")
	private String phone;
	@NotBlank(message = "Address is required")
	private String address;

}
