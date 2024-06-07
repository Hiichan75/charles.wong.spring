package com.example.ehb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.ehb.model.Article;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    @Query(value = "SELECT * FROM Article ORDER BY id DESC LIMIT 10", nativeQuery = true)
    List<Article> findTop10ByOrderByIdDesc();
}
