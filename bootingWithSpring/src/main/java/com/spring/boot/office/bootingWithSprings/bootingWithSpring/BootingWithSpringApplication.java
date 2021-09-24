package com.spring.boot.office.bootingWithSprings.bootingWithSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.boot.office.bootingWithSprings.bootingWithSpring")
public class BootingWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootingWithSpringApplication.class, args);
	}

}
