package com.invetory.dto;

import com.invetory.entities.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class UserDto {
//	@NotBlank(message = "FirstName is required")
	private String firstName;
//	@NotBlank(message = "LastName is required")
	private String lastName;

//	@NotBlank(message = "Email is required")
//	@Email(message = "Invalid email format")
	private String email;
//	@NotBlank(message = "Password is required")
//	@Size(min = 6, message = "Password must be at least 6 characters")
	private String password;
//	@NotBlank(message = "Phone is required")
	private String phone;
//	@NotBlank(message = "Address is required")
	private String address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", phone=" + phone + ", address=" + address + "]";
	}
	
	

}
