package com.training1.spring.boot.office.trainingToday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingTodayApplication {

	public static void main(String[] args) {
		BinarySearchImpl binSearch=new BinarySearchImpl();
		int num=binSearch.binarySearchFn(new int[] {12,133,14},14); 
		System.out.println(num);
		
		SpringApplication.run(TrainingTodayApplication.class, args);
	}

}
