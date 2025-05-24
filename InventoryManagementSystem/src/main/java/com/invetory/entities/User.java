package com.invetory.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Users")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "firstName", nullable = false)
	private String firstName;
	
	@Column(name = "lastName", nullable = false)
	private String lastName;
	
	@Email
	@Column(name = "Email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "Password", nullable = false)
	private String password;
	
	@Column(name = "Phone", nullable = false, unique = true)
	private String phone;
	
	@Column(name = "Address", nullable = true, length = 1000)
	private String address;
}
