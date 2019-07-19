package com.code.lamda;

import java.util.function.BiConsumer;

public class ExcpetionHandlingExample {

    public static void main(String[] args) {
	int[] someNumbers = { 1, 2, 3, 4 };
	int key = 0;

	process(someNumbers, key, wrapperLamda((a, b) -> System.out.println(a / b)));

    }

    private static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> consumer) {

	return (k, v) -> {
	    System.out.println("Inside wrapper Lamda");
	    try {
		consumer.accept(k, v);
	    } catch (ArithmeticException e) {
		System.out.println("Exception Inside wrapper Lamda " + e.getMessage());
	    }
	};
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
	for (int i : someNumbers) {
	    consumer.accept(i, key);

	}

    }

}
