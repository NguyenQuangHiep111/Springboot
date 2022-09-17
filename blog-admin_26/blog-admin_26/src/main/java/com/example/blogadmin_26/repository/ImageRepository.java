package com.example.blogadmin_26.repository;

import com.example.blogadmin_26.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
    List<Image> getByUser_Id(Integer id);
}