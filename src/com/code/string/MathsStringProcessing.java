package com.code.string;

public class MathsStringProcessing {

    public static void main(String[] args) {
	String mathsString = "20*30/100";

	StringBuilder sbMathsString = new StringBuilder(mathsString);

	int indexOfDelimeter1 = sbMathsString.indexOf("/");
	int indexOfDelimeter2 = sbMathsString.indexOf("*");

	if (indexOfDelimeter1 < indexOfDelimeter2) {
	    System.out.println("20/30*100");

	} else {
	    System.out.println("Invalid");
	}

	// int firstNumber = Integer.parseInt(sbMathsString.substring(0,
	// indexOfDelimeter).toString());
	// int secondNumber =
	// Integer.parseInt(sbMathsString.substring(indexOfDelimeter +
	// 1).toString());

	System.out.println("Final Value:" + indexOfDelimeter1 + " : " + indexOfDelimeter2);

    }

}
