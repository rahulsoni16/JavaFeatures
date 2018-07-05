package com.code.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit2ExcerciseJava8 {
    public static void main(String[] args) {
	List<Person> people = Arrays.asList(new Person("AF", "AL", 12), new Person("BF", "BL", 13),
		new Person("CF", "CL", 32), new Person("DF", "DL", 62), new Person("EF", "EL", 42));

	// Step 1 : Sort by last Name
	System.out.println("Sorted People");
	Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
	// Step 2 : Create a method to print all
	System.out.println("Print all Sorted People");
	performConditionally(people, (p) -> true, (p) -> System.out.println("Person: " + p));

	// step 3: Print all person that have last name starting with c
	System.out.println("Print all Person with C");
	performConditionally(people, (p) -> p.getLastName().startsWith("C"), (p) -> System.out.println("Person: " + p));
	// Step 4: print Conditionally
	System.out.println("Print all Person with A");
	performConditionally(people, (p) -> p.getLastName().startsWith("A"), (p) -> System.out.println("Person: " + p));

	System.out.println("Print all Person aged > 40");
	performConditionally(people, (p) -> p.getAge() > 40,
		(p) -> System.out.println(p.getFirstName() + ": Age:" + p.getAge()));

    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate,
	    Consumer<Person> consumer) {
	for (Person p : people) {
	    if (predicate.test(p)) {
		consumer.accept(p);

	    }
	}
    }

}
