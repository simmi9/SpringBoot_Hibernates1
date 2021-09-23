package com.training1.spring.boot.office.trainingToday;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrainingTodayApplication {

	public static void main(String[] args) {
		/**Implementation1
		 * BinarySearchImpl binSearch=new BinarySearchImpl();
		 */
		
//Implementation2
	
		//BinarySearchImpl binSearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//Getting Application Context by running this spring boot application
		ApplicationContext applicationContext= SpringApplication.run(TrainingTodayApplication.class, args);
		//Getting BinarySearchBean from Application Context
		BinarySearchImpl binSearch = applicationContext.getBean(BinarySearchImpl.class);
				int num=binSearch.binarySearchFn(new int[] {12,133,14},14); 
		
		System.out.println(num);
		
		
	}

}
