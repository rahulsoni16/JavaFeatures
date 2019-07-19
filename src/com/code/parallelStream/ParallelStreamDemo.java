package com.code.parallelStream;

import java.util.ArrayList;
import java.util.List;

import com.code.models.Employee;

public class ParallelStreamDemo {

    public static void main(String[] args) {

	long t1, t2;
	List<Employee> eList = new ArrayList<Employee>();
	for (int i = 0; i < 100; i++) {
	    eList.add(new Employee("A", 20, 20000D, null));
	    eList.add(new Employee("B", 20, 3000D, null));
	    eList.add(new Employee("C", 20, 15002D, null));
	    eList.add(new Employee("D", 20, 7856D, null));
	    eList.add(new Employee("E", 20, 200D, null));
	    eList.add(new Employee("F", 20, 50000D, null));
	}

	/*****
	 * Here We Are Creating A 'Sequential Stream' & Displaying The Result
	 *****/
	t1 = System.currentTimeMillis();
	System.out.println("Sequential Stream Count?= " + eList.stream().filter(e -> e.getSalary() > 15000).count());

	t2 = System.currentTimeMillis();
	System.out.println("Sequential Stream Time Taken?= " + (t2 - t1) + "\n");

	/*****
	 * Here We Are Creating A 'Parallel Stream' & Displaying The Result
	 *****/
	t1 = System.currentTimeMillis();
	System.out.println(
		"Parallel Stream Count?= " + eList.parallelStream().filter(e -> e.getSalary() > 15000).count());

	t2 = System.currentTimeMillis();
	System.out.println("Parallel Stream Time Taken?= " + (t2 - t1));
    }
}