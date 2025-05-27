package com.invetory.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.invetory.dto.ApiResponse;
import com.invetory.dto.SupplierDto;
import com.invetory.entities.SupplierEntity;
import com.invetory.repository.SupplierRepository;

@Transactional
@Service
public class SupplierServiceImpl  implements SupplierService
{
	@Autowired
	private SupplierRepository supplierRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ApiResponse createSupplier(SupplierDto supplierDto) 
	{
		SupplierEntity supplier = modelMapper.map(supplierDto, SupplierEntity.class);
		supplierRepository.save(supplier);
		return new ApiResponse("Supplier Created Successfully !!! With ID : " + supplier.getId());
	}

	@Override
	public ApiResponse updateSupplier(Long supplierId, SupplierDto supplierDto) 
	{
		 SupplierEntity supplier = supplierRepository.findById(supplierId)
			        .orElseThrow(() -> new RuntimeException("Supplier not found with ID: " + supplierId));

			supplier.setSupplierName(supplierDto.getSupplierName());
			supplier.setContactNumber(supplierDto.getContactNumber());
			supplier.setAddress(supplierDto.getAddress());
			supplierRepository.save(supplier);
		
		return new ApiResponse("Supplier Updated Successfully With ID : " + supplierId);
	}

	@Override
	public List<SupplierDto> getAllSuppliers() 
	{
		List<SupplierEntity> suppliers = supplierRepository.findAll();
		
		return suppliers.stream()
				.map(supplier -> modelMapper.map(supplier, SupplierDto.class))
				.collect(Collectors.toList());
	}

	@Override
	public SupplierDto getSupplierById(Long id) 
	{
	    SupplierEntity supplier = supplierRepository.findById(id)
	        .orElseThrow(() -> new RuntimeException("Supplier not found with ID: " + id));
	    return modelMapper.map(supplier, SupplierDto.class);
	}

	
	
	
	
}
