package com.code.lamda;

import java.util.function.BiConsumer;

public class ExcpetionHandlingExample {

    public static void main(String[] args) {
	int[] someNumbers = { 1, 2, 3, 4 };
	int key = 0;

	process(someNumbers, key, (a, b) -> wrapperLamda(System.out.println(a / b)));

    }

    private static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> consumer) {
	try {
	    consumer.accept(t, u);
	} catch (ArithmeticException e) {
	    System.out.println("Exception i ");
	}
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
	for (int i : someNumbers) {
	    consumer.accept(i, key);

	}

    }

}
