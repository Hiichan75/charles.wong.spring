package com.example.ehb.controller;

import com.example.news.model.Article;
import com.example.news.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NewsController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("articles", articleRepository.findAll());
        return "index";
    }

    @GetMapping("/new")
    public String newArticle(Model model) {
        model.addAttribute("article", new Article());
        return "new";
    }

    @PostMapping("/save")
    public String saveArticle(@ModelAttribute Article article) {
        articleRepository.save(article);
        return "redirect:/";
    }

    @GetMapping("/details/{id}")
    public String articleDetails(@PathVariable Long id, Model model) {
        model.addAttribute("article", articleRepository.findById(id).orElse(null));
        return "details";
    }
}
