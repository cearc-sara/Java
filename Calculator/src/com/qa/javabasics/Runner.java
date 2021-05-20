package com.qa.javabasics;

public class Runner {

	public static void main(String[] args) {
		
		int result = Calculator.add(6, 9);
		
		System.out.println("The add result = " + result);
		
		Result.method2(120, 83, 110);
		
		System.out.println("\nThe results of the given numbers are " + FlowChart.flow(5, 6, false));
		
		FlowChart.chart(2000);
		
		System.out.println("\nThe results of the BlackJack game is " + BlackJack.results(22, 23));
		
		System.out.println("\nThe sum is " + UniqueSum.sum(9, 9, 9));
		
		System.out.println(Tax.getSalaryPostTax(25678));
		
		Strings.raining();
		
		System.out.println("\n" + Strings.countWords("Hogwarts has three main houses"));
		Strings.newLine("Griffindore, Ravenclaw, Hufflepuff, Slytherin");
		Strings.reverseNewLine("Welcome to Hogwarts");
		
		ArrayLists.sandwiches();
	}

}
