package com.chalenges.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prime {
	
	public static void main(String[] args) {		
		prime(1,5);
	}
	

	public static void prime(int low, int high) {
		
		List<Integer> primeNumbers =	IntStream.range(low,high)
		        .filter(number -> IntStream.range(2,number)
		                .noneMatch(divider -> number % divider == 0))
		        .boxed()
		        .collect(Collectors.toList());
				
				primeNumbers.stream().forEach(a->System.out.println(a));

    }

}
