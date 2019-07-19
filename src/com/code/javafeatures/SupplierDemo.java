package com.code.javafeatures;

import static com.code.util.NullResolver.resolve;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.code.models.Employee;
import com.code.models.Location;

public class SupplierDemo {

    public static void main(String[] args) {
	Supplier<String> supplier = () -> "SupplierDemo:Nothing Matching";

	List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
	System.out.println(list.stream().filter(t -> t.equalsIgnoreCase("45")).findAny().orElseGet(supplier));

	Employee emp1 = new Employee();
	emp1.setName("Name1").setAge(20).setSalary(10000d).setLocation(new Location()).getLocation().setName(null)
		.setPinCode("");

	Employee emp2 = new Employee();
	emp2.setName("Name2").setAge(20).setSalary(20000d).setLocation(new Location()).getLocation()
		.setName("locationName3").setPinCode("3345");

	Employee emp3 = new Employee();
	emp3.setName("Name3").setAge(30).setSalary(30000d).setLocation(new Location()).getLocation()
		.setName("locationName3").setPinCode("3345");

	List<Employee> employees = Arrays.asList(emp1, emp2, emp3);

	Optional<Employee> employee = employees.stream()
		.filter(emp -> resolve(() -> emp.getLocation().getName()).isPresent()).findFirst();
	if (employee.isPresent()) {
	    System.out.println("Employee Name :" + employee.get().getName());
	}

	List<Employee> employees2 = employees.stream()
		.filter(emp -> resolve(() -> emp.getLocation().getPinCode()).isPresent()).collect(Collectors.toList());
	employees2.forEach(System.out::print);

    }

}
