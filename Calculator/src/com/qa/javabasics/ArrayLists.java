package com.qa.javabasics;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
	public static void sandwiches() {
		List<String> sandwiches = new ArrayList<>();
		
		sandwiches.add("bread");
		sandwiches.add("meat");
		sandwiches.add("cheese");
		
		System.out.println(sandwiches);
		
		for (int i = 0; i < sandwiches.size(); i++) {
			System.out.println(sandwiches.get(i));
		}
		
		sandwiches.add("mustard");
		sandwiches.add("mayo");
		sandwiches.add("bread");
		
		sandwiches.set(3, "tomato");
		
		sandwiches.remove(2);
		
		for(String i : sandwiches) {
			System.out.println("The items are: " + i);
		}
		
		System.out.println("\nThe item at index 1 is: " + sandwiches.get(1));
		System.out.println("The item at index 4 is: " + sandwiches.get(4));
	}

}
