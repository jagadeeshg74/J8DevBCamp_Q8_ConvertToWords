package yaksha;


import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import yaksha.*;


public class MainClassTest {
	
	
	@Test
	public void testConvertToWordsOne() throws IOException {
		
//		Assertions.assertEquals("nine thousand nine hundred ninety nine" ,MainClass.convertToWords(9999));
//		
//		Assertions.assertEquals("fifty six" ,MainClass.convertToWords(56));
//		Assertions.assertEquals("five hundred fifty nine" ,MainClass.convertToWords(559));
//		
//		Assertions.assertEquals("seven hundred seventy eight" ,MainClass.convertToWords(778));
//		Assertions.assertEquals("three hundred thirty three" ,MainClass.convertToWords(333));
//		Assertions.assertEquals("one hundred seventeen" ,MainClass.convertToWords(117));
			
		TestUtils.yakshaAssert(TestUtils.currentTest(), MainClass.convertToWords(56).equals( "fifty six") ?"true":"false", TestUtils.businessTestFile );
		
		
	}
	
	@Test
	public void testConvertToWordstwo() throws IOException {
		
					
		TestUtils.yakshaAssert(TestUtils.currentTest(), MainClass.convertToWords(559).equals("five hundred fifty nine") ?"true":"false", TestUtils.businessTestFile );
		
		
	}
	

}
