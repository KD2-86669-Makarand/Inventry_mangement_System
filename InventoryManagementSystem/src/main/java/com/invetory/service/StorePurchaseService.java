package com.invetory.service;

import com.invetory.dto.ApiResponse;
import com.invetory.dto.StorePurchaseDto;

public interface StorePurchaseService 
{
	public ApiResponse createStorePurchase(StorePurchaseDto storepurchaseDto);
	
	
}
