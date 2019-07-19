package com.code.javafeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author rahul.soni https://www.youtube.com/watch?v=Tapz6_T5oHY&t=641s
 *
 */

public class ConsumerDemo {

    public static void main(String[] args) {
	Consumer<Integer> consumer = (Integer t) -> {
	    System.out.println("ConsumerDemo Testing for Integer :" + t);
	};
	consumer.accept(10);

	Consumer<Integer> consumer2 = t -> System.out.println("1 ConsumerDemo Testing for Integer :" + t);
	consumer2.accept(20);

	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	list.stream().forEach(consumer2);
	list.stream().forEach(t -> System.out.println("2 ConsumerDemo Testing for Integer :" + t));

    }

}
