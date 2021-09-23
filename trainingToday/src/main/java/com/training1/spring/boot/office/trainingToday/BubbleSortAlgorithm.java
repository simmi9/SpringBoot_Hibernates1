package com.training1.spring.boot.office.trainingToday;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
	
public int[] sort(int[] numbers) {
	return numbers;
}
}
