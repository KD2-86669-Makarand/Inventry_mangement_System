package com.invetory.service;

import java.util.List;

import com.invetory.dto.ApiResponse;
import com.invetory.dto.SupplierDto;

public interface SupplierService 
{
	ApiResponse createSupplier(SupplierDto supplierDto);
	
	ApiResponse updateSupplier(Long supplierId, SupplierDto supplierDto);
	
	List<SupplierDto> getAllSuppliers();
	
}
