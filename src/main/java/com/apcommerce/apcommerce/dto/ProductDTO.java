package com.apcommerce.apcommerce.dto;

import com.apcommerce.apcommerce.entities.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {

	private Long id;
	private String name;
	private String description;
	private Double price;
	private String imgUrl;

	public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
	}

	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		price = entity.getPrice();
		imgUrl = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	@NotBlank
	@Size(min = 3, max = 80, message = "O nome precisa ter entre 3 e 80 caracteres.")
	public String getName() {
		return name;
	}

	@NotBlank
	@Size(min = 10, message = "A descrição precisa ter pelo menos 10 caracteres.")
	public String getDescription() {
		return description;
	}

	@Positive
	public Double getPrice() {
		return price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	
}
