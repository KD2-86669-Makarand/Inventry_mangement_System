package com.invetory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invetory.dto.ApiResponse;
import com.invetory.dto.StorePurchaseDto;
import com.invetory.service.StorePurchaseService;

@RestController
@RequestMapping("/storepurchase")
public class StorePurchaseController 
{
	@Autowired
	private StorePurchaseService storePurchaseService;
	
	@PostMapping("/create-store-purchase")
	public ResponseEntity<ApiResponse> createStorePurchase(@RequestBody StorePurchaseDto storePurchaseDto)
	{
		return ResponseEntity.ok(storePurchaseService.createStorePurchase(storePurchaseDto));
	}
	
}
