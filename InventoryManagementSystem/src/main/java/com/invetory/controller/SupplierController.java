package com.invetory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invetory.dto.ApiResponse;
import com.invetory.dto.SupplierDto;
import com.invetory.service.SupplierService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RequestMapping("/supplier")
@RestController
public class SupplierController 
{
	@Autowired
	private SupplierService supplierService;
	
	@PostMapping("/create-supplier")
	public ResponseEntity<ApiResponse> createSupplier(@RequestBody SupplierDto supplierDto)
	{
		return ResponseEntity.ok(supplierService.createSupplier(supplierDto));
	}
	
	@PutMapping("update-supplier/{id}")
	public ResponseEntity<ApiResponse> updateSupplier(@PathVariable Long id, @RequestBody SupplierDto supplierDto)
	{
		return ResponseEntity.ok(supplierService.updateSupplier(id, supplierDto));
	}
	
	@GetMapping("/get-supplier/{supplierId}")
	public ResponseEntity<SupplierDto> getById(@PathVariable Long supplierId)
	{
		return ResponseEntity.ok(supplierService.getSupplierById(supplierId));
	}
	
	@GetMapping("/get-all-suppliers")
	public ResponseEntity<List<SupplierDto>> getAllSupplliers()
	{
		return ResponseEntity.ok(supplierService.getAllSuppliers());
	}

}
