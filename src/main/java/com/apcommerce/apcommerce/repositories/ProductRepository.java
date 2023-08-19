package com.apcommerce.apcommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apcommerce.apcommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
