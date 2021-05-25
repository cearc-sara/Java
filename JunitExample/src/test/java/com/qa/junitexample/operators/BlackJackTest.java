package com.qa.junitexample.operators;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BlackJackTest {
	
	@Test
	public void playDealerWins() {
		int result = BlackJack.play(18, 22);
		assertEquals(18, result);
	}
	
	@Test
	public void playNoOneWins() {
		int result = BlackJack.play(23, 22);
		assertEquals(0, result);
	}
	
	@Test
	public void playPlayerWins() {
		int result = BlackJack.play(22, 19);
		assertEquals(19, result);
	}
	
	@Test
	public void playPlayerWins2() {
		int result = BlackJack.play(18, 19);
		assertEquals(19, result);
	}


}
