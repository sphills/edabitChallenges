package phoneNumberDecoder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhoneNumberDecoderTest {
	
	@Test
	public void test1() {
		assertEquals("123-647-3937", PhoneNumberDecoder.textToNum("123-647-EYES"));
	}
			
	@Test
	public void test2() {
		assertEquals("(325)444-8378", PhoneNumberDecoder.textToNum("(325)444-TEST"));
	}
		
	@Test
	public void test3() {
		assertEquals("653-879-8447", PhoneNumberDecoder.textToNum("653-TRY-THIS"));
	}
		
	@Test
	public void test4() {
		assertEquals("435-224-7613", PhoneNumberDecoder.textToNum("435-224-7613"));
	}
		
	@Test
	public void test5() {
		assertEquals("(333)668-3245", PhoneNumberDecoder.textToNum("(33D)ONT-FAIL"));
	}
		
	@Test
	public void test6() {
		assertEquals("(025)445-6741", PhoneNumberDecoder.textToNum("(025)445-6741"));
	}
}
