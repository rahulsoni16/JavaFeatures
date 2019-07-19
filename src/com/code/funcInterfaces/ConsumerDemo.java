package com.code.funcInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * https://www.youtube.com/watch?v=Tapz6_T5oHY
 * 
 * @author rahul.soni
 *
 */

public class ConsumerDemo {

    public static void main(String[] args) {
	Consumer<Integer> consumer = t -> System.out.println("Printing :" + t);

	List<Integer> listOfInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	listOfInt.stream().forEach(consumer);
    }
}
