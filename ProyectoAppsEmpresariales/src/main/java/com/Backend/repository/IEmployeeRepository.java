package com.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.models.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long>{

}
