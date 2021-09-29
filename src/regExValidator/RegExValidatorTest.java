package regExValidator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RegExValidatorTest {

	@Test
	public void test01() { 
		assertEquals(true, RegExValidator.validate("544466"));
	}
	
	@Test
	public void test02() { 
		assertEquals(true, RegExValidator.validate("121317"));
	}
	
	@Test
	public void test03() { 
		assertEquals(false, RegExValidator.validate("4512a5"));
	}
	
	@Test
	public void test04() { 
		assertEquals(true, RegExValidator.validate("123456"));
	}
	
	@Test
	public void test05() { 
		assertEquals(false, RegExValidator.validate(""));
	}
	
	@Test
	public void test06() { 
		assertEquals(false, RegExValidator.validate("21904"));
	}
	
	@Test
	public void test07() { 
		assertEquals(true, RegExValidator.validate("9451"));
	}
	
	@Test
	public void test08() { 
		assertEquals(true, RegExValidator.validate("213132"));
	}
	
	@Test
	public void test09() { 
		assertEquals(false, RegExValidator.validate(" 4520"));
	}
	
	@Test
	public void test10() { 
		assertEquals(false, RegExValidator.validate("15632 "));
	}
	
	@Test
	public void test11() { 
		assertEquals(true, RegExValidator.validate("000000"));
	}
}
