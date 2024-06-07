package com.example.ehb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ehb.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
