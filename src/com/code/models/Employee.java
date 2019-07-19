package com.code.models;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ToString
public class Employee {

    private String name;
    private Integer age;
    private Double salary;
    private Location location;

    public Employee(String name, Integer age, Double salary, Location location) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.location = location;
    }

    public Employee() {
	super();
    }

}
