package com.code.javafeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.code.models.Employee;

/**
 * 
 * @author rahul.soni
 * 
 *         http://www.javabrahman.com/java-8/java-8-reducing-with-streams-reduce-method-tutorial-with-examples/
 *         https://www.javabrahman.com/java-8/java-8-mapping-with-streams-map-flatmap-methods-tutorial-with-examples/
 * 
 *
 */

public class ReducingWithStreams {
    static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45, 7000.00, null),
	    new Employee("Harry Major", 25, 10000.00, null), new Employee("Ethan Hardy", 65, 8000.00, null),
	    new Employee("Nancy Smith", 22, 12000.00, null), new Employee("Deborah Sprightly", 29, 9000.00, null));

    public static void main(String[] args) {
	// Example 1: Finding aggregate of stream elements using Stream.reduce()
	// method
	Double totalSalaryExpense = employeeList.stream().map(emp -> emp.getSalary()).reduce(0.00, (a, b) -> a + b);
	System.out.println("Total salary expense: " + totalSalaryExpense);

	// Example 2: Using Stream.reduce() method for finding employee with
	// maximum salary
	Optional<Employee> maxSalaryEmp = employeeList.stream()
		.reduce((Employee a, Employee b) -> a.getSalary() < b.getSalary() ? b : a);

	if (maxSalaryEmp.isPresent()) {
	    System.out.println("Employee with max salary: " + maxSalaryEmp.get());
	}

	// Java 8 code showing Stream.map() method usage
	List<String> mappedList = employeeList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
	System.out.println("\nEmployee Names");
	mappedList.forEach(System.out::println);

	// Definition & usage of flatMap() method
	List<String> nameCharList = employeeList.stream().map(emp -> emp.getName().split(""))
		.flatMap(array -> Arrays.stream(array)).map(str -> str.toUpperCase()).filter(str -> !(str.equals(" ")))
		.collect(Collectors.toList());
	nameCharList.forEach(str -> System.out.print(str));

	Stream<String[]> splittedNames = employeeList.stream().map(emp -> emp.getName().split(""));
	// splittedNames.forEach(System.out::println);
	Stream<String> characterStream = splittedNames.flatMap(array -> Arrays.stream(array));
	System.out.println();
	// characterStream.forEach(System.out::print);
	Stream<String> characterStreamWOSpace = characterStream.filter(str -> !str.equalsIgnoreCase(" "));
	// characterStreamWOSpace.forEach(System.out::print);

	List<String> listOfUpperChars = characterStreamWOSpace.map(str -> str.toUpperCase())
		.collect(Collectors.toList());
	listOfUpperChars.forEach(System.out::print);

    }
}
