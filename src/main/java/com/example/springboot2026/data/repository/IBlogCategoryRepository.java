package com.example.springboot2026.data.repository;

import com.example.springboot2026.data.entity.BlogCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IBlogCategoryRepository extends JpaRepository<BlogCategoryEntity,Long> {

    //Delivered Query: Spring metot isimlerinden yararlanarak SQL sorguları üretiriz.
    /*
    Spring Data, JPA metot isimlerini otomatik olarak SQL/JPQL sorgusunu oluşturur
    exists: kayıt var mı?
    IgnoreCase: büyük küçük harfe duyarsız
     */
    boolean existsByCategoryNameIgnoreCase(String categoryName); //büyük küçük harfe bakmadan bu kategori adı var mı
    Optional<BlogCategoryEntity> findByCategoryNameIgnoreCase(String categoryName); //büyük küçük harfe bakmadan kategori bul
    List<BlogCategoryEntity> findAllByOrderByCategoryNameAsc();//küçükten büyüğe sırala
    List<BlogCategoryEntity> findAllByOrderByCategoryNameDesc();//büyükten küçüğe sırala

    List<BlogCategoryEntity> findByCategoryNameContainingIgnoreCase(String categoryName); // SQL ==> '%JAVA%'
    List<BlogCategoryEntity> findByCategoryNameStartingWithIgnoreCase(String categoryName);// SQL ==> 'JAVA%'
    List<BlogCategoryEntity> findByCategoryNameEndingWithIgnoreCase(String categoryName);// SQL ==> '%JAVA'


    //JPQL: ==> entity + java field isimlerini kullanarak SQL sorguları üretiriz.
    @Query("""
        SELECT category
        FROM BlogCategoryEntity category
       WHERE LOWER(category.categoryName) = LOWER(:categoryName) 
        """)
    Optional<BlogCategoryEntity> findCategoryByNameJpql(@Param("categoryName") String categoryName);

    @Query("""
        SELECT category
        FROM BlogCategoryEntity category
       WHERE LOWER(category.categoryName) 
        LIKE LOWER(CONCAT('%', :categoryName, '%'))
        """)
    Optional<BlogCategoryEntity> searchCategoryByNameJpql(@Param("categoryName") String categoryName);

    @Query("""
        SELECT category
        FROM BlogCategoryEntity category
        ORDER BY category.categoryName ASC 
        """)
    Optional<BlogCategoryEntity> findAllCategoriesOrderByNameJpql();
    //Native Query: ==> Gerçek databse tablo + kolon isimlerini kullanarak SQL sorguları üretiriz.
}
