package com.qa.junitexample.operators;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		double result = Calculator.add(15, 7);
		assertEquals(22, result);
	}
	
	@Test
	public void subTest() {
		double result = Calculator.sub(17, 3);
		assertEquals(14, result);
	}
	
	@Test
	public void mulTest() {
		double result = Calculator.mul(16, 2);
		assertEquals(32, result);
	}
	
	@Test
	public void divTest() {
		double result = Calculator.div(20, 2);
		assertEquals(10, result);
	}
	
	@Test
	public void modTest() {
		double result = Calculator.mod(200, 10);
		assertEquals(0, result);
	}

}
