package com.qa.javabasics;

public class Tax {
	
//	Create the tax class, it contains 2 methods.
//	Method 1 - which takes a salary and works out the percentage by which the salary will be taxed.
	public static int getTaxPercent(int salary) {
		int result = 0;
		
		if(salary >= 45000) {
			result = 25;
		}else if(salary >= 30000) {
			result = 20;
		}else if(salary >= 20000) {
			result = 15;
		}else if(salary >= 15000) {
			result = 10;
		}
		return result;
	}
	
//	Method 2 - which works out the exact amount that the user will be taxed using a similar process to that in the first method. That amount should be returned and output to the console.
	public static float getSalaryPostTax(int salary) {
		float percentage = (float)getTaxPercent(salary) * .01f;
		float taxableAmount = percentage * (float)salary;
		return (int)taxableAmount;
	}
//	These 2 methods should be able to work independently, so it is fine in this case if some of the code is repeated.*
//	The salaries are taxed as below:
//	0 - 14,999 : 0% tax
//	15,000 - 19,999 : 10% tax
//	20,000 - 29,999 : 15% tax
//	30,000 - 44,999 : 20% tax
//	45,000+ : 25% tax
//	Finally combine the 2 methods so that the second method utilizes the first method to return the correct result.

}
