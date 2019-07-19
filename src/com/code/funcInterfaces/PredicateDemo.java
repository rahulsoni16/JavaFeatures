package com.code.funcInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

	/*
	 * Predicate<Integer> predicate = t -> { if (t % 2 == 0) { return true;
	 * } else { return false; } };
	 */
	Predicate<Integer> isEven = t -> t % 2 == 0;
	Predicate<Integer> isOdd = t -> t % 2 == 1;
	List<Integer> listOfInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

	listOfInt.stream().filter(t -> t % 2 == 0).forEach(t -> {
	    System.out.println("All even :" + t);
	});

	listOfInt.stream().filter(t -> t % 2 == 1).forEach(t -> {
	    System.out.println("All Odd :" + t);
	});
    }

}
