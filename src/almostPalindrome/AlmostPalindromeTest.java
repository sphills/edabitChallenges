package almostPalindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlmostPalindromeTest {
	  @Test
	  public void test1() {
	    assertEquals(true, AlmostPalindrome.almostPalindrome("abcdcbg"));
	  }
		
		@Test
	  public void test2() {
	    assertEquals(true, AlmostPalindrome.almostPalindrome("abccia"));
	  }
		
		@Test
	  public void test3() {
	    assertEquals(false, AlmostPalindrome.almostPalindrome("abcdaaa"));
	  }
		
		@Test
	  public void test4() {
	    assertEquals(true, AlmostPalindrome.almostPalindrome("gggfgig"));
	  }
		
		@Test
	  public void test5() {
	    assertEquals(false, AlmostPalindrome.almostPalindrome("gggffff"));
	  }
		
		@Test
	  public void test6() {
	    assertEquals(true, AlmostPalindrome.almostPalindrome("GIGGG"));
	  }
		
		@Test
	  public void test7() {
	    assertEquals(true, AlmostPalindrome.almostPalindrome("ggggi"));
	  }
		
		@Test
	  public void test8() {
			System.out.println("Should return false if already palindrome.");
	    assertEquals(false, AlmostPalindrome.almostPalindrome("ggggg"));
	  }
		
		@Test
	  public void test9() {
			System.out.println("Should return false if already palindrome.");
	    assertEquals(false, AlmostPalindrome.almostPalindrome("gggfggg"));
	  }
		
		@Test
	  public void test10() {
	    assertEquals(false, AlmostPalindrome.almostPalindrome("1234312"));
	  }
}
