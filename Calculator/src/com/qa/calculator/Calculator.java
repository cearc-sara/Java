package com.qa.calculator;

public class Calculator {

	public static void main(String[] args) {
		int sum = add(2, 3);
		System.out.println(sum);
		
		int subtract = sub(7, 9);
		System.out.println(subtract);
		
		int multiply = mult(7, 9);
		System.out.println(multiply);
		
		double divde = divd(9.0, 12.0);
		System.out.println(divde);

	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int mult(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double divd(double num1, double num2) {
		return num1 / num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

}
