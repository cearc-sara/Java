package com.qa.javabasics;

public class Calculator {
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int mult(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double divd(double num1, double num2) {
		if(num1 > num2) {
			System.out.println("Division cannot be performed.");
		}
		return num1 / num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

}
