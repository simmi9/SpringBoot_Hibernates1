package com.springBoot.restfulWebServices2.restfulwebserviceswithboot2.HelloWorld;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	//Hello world Bean
		
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean(){
		return new HelloWorldBean("hello Bean world");
	}

	//Using path variables
	@GetMapping(path="/hello-world-bean/pathVariable/{name}")
	public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name){
		return new HelloWorldBean(String.format("hello Bean world, %s",name));
	}
}

