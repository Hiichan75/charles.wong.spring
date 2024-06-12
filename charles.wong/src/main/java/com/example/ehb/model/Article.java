package com.example.ehb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "{error.titleRequired}")
    private String title;

    @NotEmpty(message = "{error.nameRequired}")
    private String name;

    @NotEmpty(message = "{error.categoryRequired}")
    private String category;

    @Column(length = 5000) //  Increase length as needed
    @Size(min = 10, max = 5000, message = "{error.contentLength}")
    private String content;

    @NotEmpty(message = "{error.reporterRequired}")
    private String reporter;

    @NotEmpty(message = "{error.email}")
    @Email(message = "{error.email}")
    private String email;

    // Constructors, getters, and setters...

    public Article() {
    }

    public Article(String title, String name, String category, String content, String reporter, String email) {
        this.title = title;
        this.name = name;
        this.category = category;
        this.content = content;
        this.reporter = reporter;
        this.email = email;
    }

    // Getters and Setters...
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", content='" + content + '\'' +
                ", reporter='" + reporter + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
