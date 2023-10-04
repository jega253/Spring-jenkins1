package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

	public static final Logger log = LoggerFactory.getLogger(SpringApplication.class);
	@Test
	void contextLoads() {
		log.info("test class");
		assertThat(true);
	}

}
