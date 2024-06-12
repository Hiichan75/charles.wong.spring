package com.example.ehb.controller;

import com.example.ehb.model.Article;
import com.example.ehb.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.MessageSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private LocaleResolver localeResolver;

    @GetMapping
    public String listArticles(Model model, Locale locale) {
        model.addAttribute("title", messageSource.getMessage("app.title", null, locale));
        model.addAttribute("articles", articleService.getLast10Articles());
        return "articles";
    }

    @GetMapping("/{id}")
    public String viewArticle(@PathVariable Long id, Model model, Locale locale) {
        Article article = articleService.getArticleById(id).orElse(new Article());
        model.addAttribute("title", messageSource.getMessage("app.title", null, locale));
        model.addAttribute("article", article);
        return "details";
    }

    @GetMapping("/new")
    public String newArticleForm(Model model, Locale locale) {
        model.addAttribute("title", messageSource.getMessage("app.title", null, locale));
        model.addAttribute("article", new Article());
        return "new";
    }


    @PostMapping
    public String saveArticle(@Valid @ModelAttribute Article article, BindingResult result, Model model, Locale locale) {
        if (result.hasErrors()) {
            return "new";
        }
        articleService.saveArticle(article);
        return "redirect:/articles";
    }

    @GetMapping("/delete/{id}")
    public String deleteArticle(@PathVariable Long id) {
        articleService.deleteArticle(id);
        return "redirect:/articles";
    }

    @GetMapping("/about")
    public String aboutPage(Model model, Locale locale) {
        model.addAttribute("title", messageSource.getMessage("app.about", null, locale));
        return "about";
    }

}
