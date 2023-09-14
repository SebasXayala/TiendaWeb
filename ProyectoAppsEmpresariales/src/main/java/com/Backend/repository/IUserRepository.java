package com.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.models.User;

public interface IUserRepository extends JpaRepository<User, Long>{

}
