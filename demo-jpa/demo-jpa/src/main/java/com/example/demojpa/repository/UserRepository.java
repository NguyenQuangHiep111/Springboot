package com.example.demojpa.repository;

import com.example.demojpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByNameContainingIgnocase(String name);

    List<User> findByAgeGreaterThan(Integer age);


}