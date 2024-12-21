package com.cursosprimg.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.cursosprimg.market.model")
@EnableJpaRepositories(basePackages = "com.cursosprimg.market.repository")
@SpringBootApplication(scanBasePackages = {"com.cursosprimg.market.service", "com.cursosprimg.market.controller"})
public class VentaproductosApplication {
	public static void main(String[] args) {
		SpringApplication.run(VentaproductosApplication.class, args);
	}
}

