package com.code.funcInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

	Supplier<String> supplier = () -> "Supplier Demo";

	List<String> list = Arrays.asList();

	list.stream().findAny().orElseGet(supplier);

	System.out.println(list.stream().filter(t -> t.equalsIgnoreCase("a")).findFirst().orElseGet(supplier));

    }

}
