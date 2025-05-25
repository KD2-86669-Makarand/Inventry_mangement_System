package com.invetory.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseDto {

	@JsonProperty(access = Access.READ_ONLY)//it is only use for de-serialization
	private Long id;
	
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime creationDate;
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime updationTimeStamp;
	
}
