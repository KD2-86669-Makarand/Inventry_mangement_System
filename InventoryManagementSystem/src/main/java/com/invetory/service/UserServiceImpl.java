package com.invetory.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.invetory.custom_exception.ResourceNotFoundException;
import com.invetory.dto.AuthRequest;
import com.invetory.dto.UserDto;
import com.invetory.entities.UserEntity;
import com.invetory.repository.UserRepository;

import jakarta.validation.Valid;

@Transactional
@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto SignupUser(@Valid UserDto dto) {
		
		UserEntity user=modelMapper.map(dto, UserEntity.class);
		
		UserEntity persitstentUser=userRepository.save(user);
		
		return modelMapper.map(persitstentUser, UserDto.class);
	}

	@Override
	public UserDto SignInUser(@Valid AuthRequest dto) {
		UserEntity persitstenrUser= userRepository.findByEmail(dto.getEmail()).orElseThrow(()->new ResourceNotFoundException("User not found"));
		if(!dto.getPassword().equals(persitstenrUser.getPassword())) {
			
			throw new IllegalArgumentException("Invalid credentials");
		}
		
		return modelMapper.map(persitstenrUser, UserDto.class);
	}

}
