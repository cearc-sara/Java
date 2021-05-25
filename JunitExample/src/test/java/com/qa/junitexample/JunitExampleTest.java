package com.qa.junitexample;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class JunitExampleTest {
	
	@BeforeAll
	public static void start() {
		System.out.println("Start of tests");
	}
	
	@AfterAll
	public static void end() {
		System.out.println("End of tests");
	}
	
	@BeforeEach
	public void beforeEachTest() {
		System.out.println("START OF EACH TEST");
	}
	
	@AfterEach
	public void afterEachTest() {
		System.out.println("END OF EACH TEST");
	}
	
	@Disabled
	@Test
	public void test1() {
		System.out.println("Hello World - 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Hello World - 2");
	}
	
	

}
