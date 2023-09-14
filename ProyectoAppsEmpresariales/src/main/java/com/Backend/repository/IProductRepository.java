package com.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.models.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{

}
