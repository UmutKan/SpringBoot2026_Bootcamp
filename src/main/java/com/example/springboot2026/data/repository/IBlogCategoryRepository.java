package com.example.springboot2026.data.repository;

import com.example.springboot2026.data.entity.BlogCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBlogCategoryRepository extends JpaRepository<BlogCategoryEntity,Long> {

    //Delivery Query
    boolean existsByCategoryNameIgnoreCase(String categoryName);
    Optional<BlogCategoryEntity> findByCategoryNameIgnoreCase(String categoryName);

}
