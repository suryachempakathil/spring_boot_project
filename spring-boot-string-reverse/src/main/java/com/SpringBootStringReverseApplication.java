package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootStringReverseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStringReverseApplication.class, args);
	}

}
