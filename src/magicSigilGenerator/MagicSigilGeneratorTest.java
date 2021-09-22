package magicSigilGenerator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagicSigilGeneratorTest {
	
	@Test
	public void test1() {
		assertEquals("FRNDSWHLVM", MagicSigilGenerator.sigilize("I HAVE WONDERFUL FRIENDS WHO LOVE ME"));
	}
		
	@Test
	public void test2() {
		assertEquals("MBNYCSFL", MagicSigilGenerator.sigilize("My business is financially successful"));
	}
		
	@Test
	public void test3() {
		assertEquals("HVBJNDTPYSWL", MagicSigilGenerator.sigilize("I have a job I enjoy and it pays well"));
	}
		
	@Test
	public void test4() {
		assertEquals("CSMPLYGNTHRD", MagicSigilGenerator.sigilize("I heard the song closing time playing on the radio"));
	}
		
	@Test
	public void test5() {
		assertEquals("MLTHY", MagicSigilGenerator.sigilize("i am healthy"));
	}
		
	@Test
	public void test6() {
		assertEquals("FNDYSLMT", MagicSigilGenerator.sigilize("I FOUND MY SOULMATE"));
	}
}
