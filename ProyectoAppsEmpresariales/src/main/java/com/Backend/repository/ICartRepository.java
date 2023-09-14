package com.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.models.Cart;

public interface ICartRepository extends JpaRepository<Cart, Long>{

}
