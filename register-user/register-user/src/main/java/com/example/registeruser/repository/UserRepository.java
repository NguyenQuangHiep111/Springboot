package com.example.registeruser.repository;

import com.example.registeruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Override
    Optional<User> findById(Integer integer);
}