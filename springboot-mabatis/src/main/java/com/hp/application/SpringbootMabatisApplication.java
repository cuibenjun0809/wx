package com.hp.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages={"com.hp"})
@EnableScheduling
public class SpringbootMabatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMabatisApplication.class, args);
	}
}
