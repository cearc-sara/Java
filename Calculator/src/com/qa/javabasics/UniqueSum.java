package com.qa.javabasics;

public class UniqueSum {
	
	
	public static int sum(int num1, int num2, int num3) {
		if(num1 == num2 && num2 == num3) {
			return 0;
		}else if(num1 == num2 || num1 == num3) {
			return num2 + num3;
		}else if(num2 == num3) {
			return num1 + num2;
		}else {
			return num1 + num2 + num3;
		}
		
	}
}
