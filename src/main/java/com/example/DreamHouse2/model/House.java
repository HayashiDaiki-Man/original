package com.example.DreamHouse2.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class House {
	@NotBlank
	@Size(max = 10)
	private String houseQ;
}
