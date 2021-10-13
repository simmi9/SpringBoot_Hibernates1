package com.springBoot.restfulWebServices2.restfulwebserviceswithboot2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages={"com.springBoot"})
public class RestfulWebServicesWithBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesWithBoot2Application.class, args);
	}

}
