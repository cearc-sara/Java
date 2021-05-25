package com.qa.javabasics;

public class BlackJack {
	public static int results(int num1, int num2) {
		if(num1 > 0 && num1 <= 21 && num1 > num2) {
			return num1;
		}else if(num2 > 0 && num2 <= 21 && num2 > num1) {
			return num2;
		}else {
			return 0;
		}
	}

}
