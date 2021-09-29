package timeConverter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeConverterTest {

	@Test
	public void test1() {
		assertEquals("0:00", TimeConverter.convertTime("12:00 am"));
	}
		
	@Test
	public void test2() {
		assertEquals("18:20", TimeConverter.convertTime("6:20 pm"));
	}
		
	@Test
	public void test3() {
		assertEquals("9:00 pm", TimeConverter.convertTime("21:00"));
	}
		
	@Test
	public void test4() {
		assertEquals("5:05 am", TimeConverter.convertTime("5:05"));
	}
	
	@Test
	public void test5() {
		assertEquals("3:58 am", TimeConverter.convertTime("3:58"));
	}
	
	@Test
	public void test6() {
		assertEquals("3:58 pm", TimeConverter.convertTime("15:58"));
	}
	
	@Test
	public void test7() {
		assertEquals("17:32", TimeConverter.convertTime("5:32 pm"));
	}
}