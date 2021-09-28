package rockPaperScissors;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {

	@Test
	public void test1() {
		assertEquals("Player 2 wins", RockPaperScissors.rps("rock", "paper"));
	}
		
	@Test
	public void test2() {
		assertEquals("Player 1 wins", RockPaperScissors.rps("paper", "rock"));
	}
		
	@Test
	public void test3() {
		assertEquals("Player 2 wins", RockPaperScissors.rps("paper", "scissors"));
	}
		
	@Test
	public void test4() {
		assertEquals("TIE", RockPaperScissors.rps("scissors", "scissors"));
	}

	@Test
	public void test5() {
		assertEquals("TIE", RockPaperScissors.rps("sCiSsOrS", "ScIsSoRs"));
	}
	
	@Test
	public void test6() {
		assertEquals("Player 1 wins", RockPaperScissors.rps("scissors", "paper"));
	}
		
	@Test
	public void test7() {
		assertEquals("The value entered for Player 1 wasn't 'rock,' 'paper,' or 'scissors'. Please only enter 'rock,' 'paper,' or 'scissors'.", RockPaperScissors.rps("Chocolate PIE", "paper"));
	}
	
	@Test
	public void test8() {
		assertEquals("The value entered for Player 2 wasn't 'rock,' 'paper,' or 'scissors'. Please only enter 'rock,' 'paper,' or 'scissors'.", RockPaperScissors.rps("rock", "Banana CREAM pie"));
	}
}
