package com.invetory.service;

import com.invetory.dto.AuthRequest;
import com.invetory.dto.UserDto;

import jakarta.validation.Valid;

public interface UserService {

	public UserDto SignupUser(@Valid UserDto dto);

	public UserDto SignInUser(@Valid AuthRequest dto);

}
