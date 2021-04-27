package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	Optional<User> findByUserId(Integer userId);

}
