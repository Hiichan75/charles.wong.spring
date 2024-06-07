package com.example.ehb;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.ehb.controller.ArticleController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private ArticleController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
}
