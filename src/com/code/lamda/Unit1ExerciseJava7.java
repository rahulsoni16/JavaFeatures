package com.code.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava7 {

    public static void main(String[] args) {
	List<Person> people = Arrays.asList(new Person("AF", "AL", 12), new Person("BF", "BL", 13),
		new Person("CF", "CL", 32), new Person("DF", "DL", 62), new Person("EF", "EL", 42));

	// Step 1 : Sort by last Name

	Collections.sort(people, new Comparator<Person>() {
	    @Override
	    public int compare(Person o1, Person o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	    }
	});
	// Step 2 : Create a method to print all
	printAll(people);

	// step 3: Print all person that have last name starting with c
	printAllStartWithC(people);

	printConditionally(people, new Condition() {
	    @Override
	    public boolean test(Person p) {
		return p.getLastName().startsWith("C");
	    }
	});

	printConditionally(people, new Condition() {
	    @Override
	    public boolean test(Person p) {
		return p.getLastName().startsWith("A");
	    }
	});

    }

    private static void printConditionally(List<Person> people, Condition condition) {
	for (Person p : people) {
	    if (condition.test(p)) {
		System.out.println("Person With C: " + p);
	    }
	}

    }

    private static void printAllStartWithC(List<Person> people) {
	for (Person p : people) {
	    if (p.getLastName().startsWith("C")) {
		System.out.println("Person With C: " + p);
	    }
	}

    }

    private static void printAll(List<Person> people) {
	for (Person p : people) {
	    System.out.println("Person: " + p);
	}
    }

}
