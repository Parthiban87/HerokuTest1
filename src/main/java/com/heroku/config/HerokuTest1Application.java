package com.heroku.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.heroku")
@SpringBootApplication
public class HerokuTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(HerokuTest1Application.class, args);
	}
}
