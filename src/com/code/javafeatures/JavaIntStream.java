package com.code.javafeatures;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * 
 * @author rahul.soni https://www.youtube.com/watch?v=N3gQdIn90CI
 */

public class JavaIntStream {
    public static void main(String[] args) {

	int[] numbers = { 3, 3, 5, 1, 2, 7, 0 };
	numbers = IntStream.range(1, 100).toArray();
	IntStream.of(numbers).min().ifPresent(min -> System.out.println(min));// Lamda
	IntStream.of(numbers).max().ifPresent(System.out::println);// Method Ref

	IntSummaryStatistics stats = IntStream.of(numbers).summaryStatistics();
	System.out.println(stats);

	IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);
    }

}
