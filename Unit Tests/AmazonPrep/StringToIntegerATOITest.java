package AmazonPrep.AmazonPrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringToIntegerATOITest {

	String input1 = "42";
	String input2 = "     -42";
	String input3 = "4193 with words";
	String input4 = "words and 987";
	String input5 = "-91283472332";
	String input6 = "91283472332";
	String input7 = "-2147483648";
	String input8 = "2147483647";
	String input9 = "+";
	String input10 = "  0000000000012345678";
	
	StringToIntegerATOI s = new StringToIntegerATOI();
	
	@Test
	public void test() {
		assertEquals(42,s.myAtoi(input1));
		assertEquals(-42,s.myAtoi(input2));
		assertEquals(4193,s.myAtoi(input3));
		assertEquals(0,s.myAtoi(input4));
		assertEquals(-2147483648,s.myAtoi(input5));
		assertEquals(2147483647,s.myAtoi(input6));
		assertEquals(-2147483648,s.myAtoi(input7));
		assertEquals(2147483647,s.myAtoi(input8));
		assertEquals(0,s.myAtoi(input9));
		assertEquals(12345678,s.myAtoi(input10));
		assertEquals(0,s.myAtoi("00000-42a1234"));
	}

}
