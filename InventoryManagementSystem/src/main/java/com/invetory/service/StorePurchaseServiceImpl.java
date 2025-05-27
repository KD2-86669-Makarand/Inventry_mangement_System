package com.invetory.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.invetory.custom_exception.ResourceNotFoundException;
import com.invetory.dto.ApiResponse;
import com.invetory.dto.ProductDto;
import com.invetory.dto.StorePurchaseDto;
import com.invetory.entities.CategoryEntity;
import com.invetory.entities.OrderStatus;
import com.invetory.entities.ProductEntity;
import com.invetory.entities.StorePurchaseEntity;
import com.invetory.entities.SupplierEntity;
import com.invetory.entities.UserEntity;
import com.invetory.repository.CategoryRepository;
import com.invetory.repository.StorePurchaseRepository;
import com.invetory.repository.SupplierRepository;
import com.invetory.repository.UserRepository;

import ch.qos.logback.core.model.Model;

@Transactional
@Service
public class StorePurchaseServiceImpl implements StorePurchaseService 
{
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private StorePurchaseRepository storePurchaseRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SupplierRepository supplierRepository;
	
	@Autowired
	private ModelMapper modelMapper;

//	@Override
//	public StorePurchaseDto createStorePurchase(StorePurchaseDto dto) 
//	{
//		// Step 1: Create new StorePurchaseEntity
//	    StorePurchaseEntity purchase = new StorePurchaseEntity();
//
//	    // Step 2: Set supplier
//	    SupplierEntity supplier = supplierRepository.findById(dto.getSupplierId())
//	            .orElseThrow(() -> new ResourceNotFoundException("Supplier"));
//	    purchase.setSupplier(supplier);
//
//	    // Step 3: Set purchasedBy (UserEntity)
//	    UserEntity user = userRepository.findById(dto.getUserId())
//	            .orElseThrow(() -> new ResourceNotFoundException("User"));
//	    purchase.setPurchasedBy(user);
//
//	    // Step 4: Set order status
//	    purchase.setStatus(dto.getStatus());
//
//	    // Step 5: Convert ProductDto list to ProductEntity and link back to this purchase
//	    List<ProductEntity> productEntities = dto.getItems().stream().map(productDto -> {
//	        ProductEntity product = new ProductEntity();
//	        product.setProductName(productDto.getProductName());
//	        product.setDescription(productDto.getDescription());
//	        product.setPrice(productDto.getPrice());
//	        product.setAvailableQuantity(productDto.getAvailableQuantity());
//	        product.setProductImage(productDto.getProductImage());
//
//	        // Set supplier
//	        SupplierEntity productSupplier = supplierRepository.findById(productDto.getSupplierId())
//	                .orElseThrow(() -> new ResourceNotFoundException("Supplier"));
//	        product.setSupplier(productSupplier);
//
//	        // Set category
//	        CategoryEntity category = categoryRepository.findById(productDto.getCategoryId())
//	                .orElseThrow(() -> new ResourceNotFoundException("Category"));
//	        product.setCategory(category);
//
//	        // Set back-reference to purchase
//	        product.setPurchase(purchase);
//
//	        return product;
//	    }).toList();
//
//	    // Step 6: Set products to purchase
//	    purchase.setItems(productEntities);
//
//	    // Step 7: Save purchase (cascade saves products too)
//	    StorePurchaseEntity savedPurchase = storePurchaseRepository.save(purchase);
//
//	    // Step 8: Convert savedPurchase to StorePurchaseDto (or return simple success response)
//	    StorePurchaseDto responseDto = new StorePurchaseDto();
//	    responseDto.setSupplierId(savedPurchase.getSupplier().getId());
//	    responseDto.setUserId(savedPurchase.getPurchasedBy().getId());
//	    responseDto.setStatus(savedPurchase.getStatus());
//
//	    List<ProductDto> productDtoList = savedPurchase.getItems().stream().map(prod -> {
//	        ProductDto pdto = new ProductDto();
//	        pdto.setProductName(prod.getProductName());
//	        pdto.setDescription(prod.getDescription());
//	        pdto.setPrice(prod.getPrice());
//	        pdto.setAvailableQuantity(prod.getAvailableQuantity());
//	        pdto.setProductImage(prod.getProductImage());
//	        pdto.setSupplierId(prod.getSupplier().getId());
//	        pdto.setCategoryId(prod.getCategory().getId());
//	        return pdto;
//	    }).toList();
//
//	    responseDto.setItems(productDtoList);
//
//	    return responseDto;
//	}
		
//	@Override
//	public ApiResponse createStorePurchase(StorePurchaseDto storepurchaseDto) 
//	{
//		// fetch supplier
//		SupplierEntity supplier = supplierRepository.findById(storepurchaseDto.getSupplierId())
//				.orElseThrow(() -> new RuntimeException("Supplier Not Found With ID : " + storepurchaseDto.getSupplierId()));
//		
//		// fetch user
//		UserEntity user = userRepository.findById(storepurchaseDto.getUserId())
//				.orElseThrow(() -> new RuntimeException("User Not Found !!!"));
//		
//			StorePurchaseEntity storePurchase = new StorePurchaseEntity();
//			storePurchase.setSupplier(supplier);
//			storePurchase.setPurchasedBy(user);
//			storePurchase.setStatus(storepurchaseDto.getStatus().RECEIVED);
//
//		// convert product dto to entity
//		List<ProductEntity> products = storepurchaseDto.getItems().stream().map(productDto -> {
//			ProductEntity product = modelMapper.map(productDto, ProductEntity.class);
//			product.setPurchase(storePurchase);
//			return product;
//		}).collect(Collectors.toList());
//
//
//		storePurchase.setItems(products);
//		storePurchaseRepository.save(storePurchase);
//
//	    return new ApiResponse("Purchase created successfully !!!");
//	}
	
	@Override
	public ApiResponse createStorePurchase(StorePurchaseDto storepurchaseDto) 
	{
	    // Step 1: Fetch Supplier
	    SupplierEntity supplier = supplierRepository.findById(storepurchaseDto.getSupplierId())
	            .orElseThrow(() -> new RuntimeException("Supplier Not Found With ID : " + storepurchaseDto.getSupplierId()));

	    // Step 2: Fetch User
	    UserEntity user = userRepository.findById(storepurchaseDto.getUserId())
	            .orElseThrow(() -> new RuntimeException("User Not Found !!!"));

	    // Step 3: Create StorePurchase entity
	    StorePurchaseEntity storePurchase = new StorePurchaseEntity();
	    storePurchase.setSupplier(supplier);
	    storePurchase.setPurchasedBy(user);
	    storePurchase.setStatus(OrderStatus.RECEIVED); // or use storepurchaseDto.getStatus()

	    // Step 4: Map product DTOs to product entities and assign purchase
	    List<ProductEntity> products = storepurchaseDto.getItems().stream().map(productDto -> {
	        ProductEntity product = modelMapper.map(productDto, ProductEntity.class);

	        // Optional: if not using ModelMapper for these
	        // product.setProductName(productDto.getProductName());
	        // product.setDescription(productDto.getDescription());
	        // ...

	        product.setPurchase(storePurchase); // link to purchase
	        return product;
	    }).collect(Collectors.toList());

	    // Step 5: Set products to storePurchase
	    storePurchase.setItems(products);

	    // Step 6: Save purchase
	    storePurchaseRepository.save(storePurchase); // products saved via cascade

	    return new ApiResponse("Purchase created successfully !!!");
	}


}
