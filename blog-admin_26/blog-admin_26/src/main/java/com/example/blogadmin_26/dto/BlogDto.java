package com.example.blogadmin_26.dto;

import com.example.blogadmin_26.entity.Blog;
import com.example.blogadmin_26.entity.Category;
import com.example.blogadmin_26.entity.User;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * A DTO for the {@link Blog} entity
 */
@Data
public class BlogDto implements Serializable {
    private final Integer id;
    private final String title;
    private final String description;
    private final String content;
    private final String thumbnail;
    private final LocalDateTime createdAt;
    private final Boolean status;
    private final UserDto user;
    private final Set<CategoryDto> categories;

    /**
     * A DTO for the {@link User} entity
     */
    @Data
    public static class UserDto implements Serializable {
        private final Integer id;
        private final String name;
    }

    /**
     * A DTO for the {@link Category} entity
     */
    @Data
    public static class CategoryDto implements Serializable {
        private final Integer id;
        private final String name;
    }
}