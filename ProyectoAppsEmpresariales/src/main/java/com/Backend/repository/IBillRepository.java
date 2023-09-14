package com.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.models.Bill;

public interface IBillRepository extends JpaRepository<Bill, Long>{

}
