package com.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.models.Category;

public interface ICategoryRepository extends JpaRepository<Category, Long>{

}
