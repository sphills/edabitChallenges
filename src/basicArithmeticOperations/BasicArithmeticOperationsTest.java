package basicArithmeticOperations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasicArithmeticOperationsTest {
	
	@Test
	public void test01() { 
		assertEquals(3, BasicArithmeticOperations.operation("1", "2", "add"));
	}

	@Test
	public void test02() { 
		assertEquals(-19, BasicArithmeticOperations.operation("1", "-20", "add"));
	}

	@Test
	public void test03() { 
		assertEquals(-2147483648, BasicArithmeticOperations.operation("9", "0", "divide"));
	}

	@Test
	public void test04() { 
		assertEquals(100, BasicArithmeticOperations.operation("10", "10", "multiply"));
	}

	@Test
	public void test05() { 
		assertEquals(100, BasicArithmeticOperations.operation("-10", "-10", "multiply"));
	}

	@Test
	public void test06() { 
		assertEquals(0, BasicArithmeticOperations.operation("10", "10", "subtract"));
	}

	@Test
	public void test07() { 
		assertEquals(0, BasicArithmeticOperations.operation("0", "0", "subtract"));
	}

	@Test
	public void test08() { 
		assertEquals(0, BasicArithmeticOperations.operation("0", "1", "divide"));
	}

	@Test
	public void test09() { 
		assertEquals(0, BasicArithmeticOperations.operation("0", "25415", "divide"));
	}

	@Test
	public void test10() { 
		assertEquals(1, BasicArithmeticOperations.operation("4", "3", "divide"));
	}

	@Test
	public void test11() { 
		assertEquals(5, BasicArithmeticOperations.operation("21", "4", "divide"));
	}

	@Test
	public void test12() { 
		assertEquals(4, BasicArithmeticOperations.operation("13", "3", "divide"));
	}
}
