package com.training1.spring.boot.office.trainingToday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingTodayApplication {

	public static void main(String[] args) {
		/**Implementation1
		 * BinarySearchImpl binSearch=new BinarySearchImpl();
		 */
		
//Implementation2
	
		BinarySearchImpl binSearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int num=binSearch.binarySearchFn(new int[] {12,133,14},14); 
		System.out.println(num);
		
		SpringApplication.run(TrainingTodayApplication.class, args);
	}

}
