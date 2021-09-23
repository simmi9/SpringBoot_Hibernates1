package com.training1.spring.boot.office.trainingToday;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm=sortAlgorithm;
	}
	public int binarySearchFn(int[] numbers, int searchFor) {
		//Implementation1
		BubbleSortAlgorithm bsa= new BubbleSortAlgorithm();
		int[] sortedNumbers = bsa.sort(numbers);
		//Implementation2 in main
		return 3;
	}
}
