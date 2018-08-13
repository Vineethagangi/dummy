package com.cg.spring.springbootmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.spring")
public class SpringbootmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmvcApplication.class, args);
	}
}
