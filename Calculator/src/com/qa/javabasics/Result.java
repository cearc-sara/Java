package com.qa.javabasics;

public class Result {
	
	public static int physics;
	public static int chemistry;
	public static int biology;
	public static double total;
	public static double overallPercentage;
	public static double passMark = 60.0;
	

	
	public static double method1(int num1, int num2, int num3) {
		biology = num3;
		chemistry = num2;
		physics = num1;
		total = num1 + num2 + num3;
		int exam1 = physics;
		int exam2 = chemistry;
		int exam3 = biology;
		double result = total;
		double percentOfPhysics = (exam1 * 100)/ 150.0;
		double percentOfChemistry = (exam2 * 100) / 150.0;
		double percentOfBiology = (exam3 * 100) / 150.0;
		
		if(percentOfPhysics < passMark) {
			System.out.println("\nYou have failed Physics with a " + (int) percentOfPhysics + "%. You need a " + (int) passMark + "% to pass.");
		}
		if(percentOfChemistry < passMark) {
			System.out.println("\nYou have failed Chemistry with a " + (int) percentOfChemistry + "%. You need a " + (int) passMark + "% to pass.");
		}
		if(percentOfBiology < passMark) {
			System.out.println("\nYou have failed Biology with a " + (int) percentOfBiology + "%. You need a " + (int) passMark + "% to pass.");
		}
		
		System.out.println("\nPhysics Exam = " + exam1 + ", Chemistry Exam = " + exam2 + ", Biology Exam = " + exam3);
		System.out.println("\nTotal Score = " + result);
		System.out.println("\nPhysics = " + (int) percentOfPhysics + "%");
		System.out.println("Chemistry = " + (int) percentOfChemistry + "%");
		System.out.println("Biology = " + (int) percentOfBiology + "%");
		return result;
		
	}
	
	public static int method2(int num1, int num2, int num3) {
		overallPercentage = (method1(num1, num2, num3) * 100) / 450;
		
		
		System.out.println("\nThe total percentage of all the scores is " + (int) overallPercentage + "%");
		return (int) overallPercentage;
	}
		


}
