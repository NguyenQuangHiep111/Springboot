package com.example.springsecuritybasic.repository;

import com.example.springsecuritybasic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//public class UserRepository {
//
//}
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//    User getById(Integer id);
    Optional<User> findByEmail (String email);
}
