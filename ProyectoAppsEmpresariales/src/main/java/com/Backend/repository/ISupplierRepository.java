package com.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.models.Supplier;

public interface ISupplierRepository extends JpaRepository<Supplier, Long> {

}
