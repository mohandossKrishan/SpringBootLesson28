package com.hoaxifymohan.hoaxifymohan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class HoaxifymohanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoaxifymohanApplication.class, args);
	}

}
