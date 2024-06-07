package com.example.ehb.service;

import com.example.ehb.model.Article;
import com.example.ehb.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public List<Article> getLast10Articles() {
        return articleRepository.findTop10ByOrderByIdDesc();
    }

    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }

    public Optional<Article> getArticleById(Long id) {
        return articleRepository.findById(id);
    }
}

