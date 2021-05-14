package com.qa.calculator;

public class Result {
	
	public static int physics;
	public static int chemistry;
	public static int biology;
	public static double total;
	public static double percentage;

	public static void main(String[] args) {
		method2();
		
	}
	
	public static int method1(int num1, int num2, int num3) {
		biology = num3;
		chemistry = num2;
		physics = num1;
		total = num1 + num2 + num3;
		int exam1 = physics;
		int exam2 = chemistry;
		int exam3 = biology;
		int result = (int) total;
		
		System.out.println("Exam 1 = " + exam1 + ", Exam 2 = " + exam2 + ", Exam 3 = " + exam3);
		System.out.println("Total Score = " + result);
		return result;
		
	}
	
	public static void method2() {
		percentage = (method1(150, 120, 140) * 100) / 450;
		
		System.out.println("The total percentage of all the scores is " +(int) percentage + "%");
	}
		


}
