package com.training1.spring.boot.office.trainingToday;

public class BinarySearchImpl {
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
