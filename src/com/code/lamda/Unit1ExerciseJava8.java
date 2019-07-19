package com.code.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("AF", "AL", 12), new Person("BF", "BL", 13),
                new Person("CF", "CL", 32), new Person("DF", "DL", 62), new Person("EF", "EL", 42));

        // Step 1 : Sort by last Name
        System.out.println("Sorted People");
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        // Step 2 : Create a method to print all
        System.out.println("Print all Sorted People");
        printConditionally(people, (p) -> true);

        // step 3: Print all person that have last name starting with c
        System.out.println("Print all Person with C");
        printConditionally(people, (p) -> p.getLastName().startsWith("C"));
        // Step 4: print Conditionally
        System.out.println("Print all Person with A");
        printConditionally(people, (p) -> p.getLastName().startsWith("A"));

    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p)) {
                System.out.println("Person: " + p);
            }
        }
    }

}
