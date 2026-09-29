package com.example.springboot2026.data.repository;

import com.example.springboot2026.data.entity.BlogCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IBlogRepository extends JpaRepository<BlogCategoryEntity,Long> {

    //Delivery Query

}
