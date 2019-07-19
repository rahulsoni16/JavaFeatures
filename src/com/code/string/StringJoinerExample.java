package com.code.string;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {

	String suffix = null;
	String fName = null;
	String lName = "Soni";
	StringJoiner sj = new StringJoiner(",");
	sj.add("Rahul").add("Soni").add(suffix == null ? "" : suffix);
	System.out.println(sj.toString());

	System.out.println(fName + " " + lName);

    }

}
