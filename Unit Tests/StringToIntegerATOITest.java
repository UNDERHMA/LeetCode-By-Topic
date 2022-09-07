package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringToIntegerATOITest {

	
	StringToIntegerATOI s = new StringToIntegerATOI();
	
	@Test
	public void test() {
		assertEquals(0,s.myAtoi("00000-42a1234"));
		assertEquals(1,s.myAtoi("00001-42a1234"));
		assertEquals(42,s.myAtoi("42"));
		assertEquals(-42,s.myAtoi("  -42"));
		assertEquals(42,s.myAtoi("  +42"));
		assertEquals(-42,s.myAtoi("-42a"));
		assertEquals(0,s.myAtoi("a42"));
		assertEquals(0,s.myAtoi(" a42"));
		assertEquals(0,s.myAtoi("+-12"));
		assertEquals(0,s.myAtoi("--12"));
		assertEquals(0,s.myAtoi("++12"));
		assertEquals(-1,s.myAtoi("-1+2"));
		assertEquals(2147483647,s.myAtoi("21474836466"));
		assertEquals(2147483647,s.myAtoi("4147483647"));
		assertEquals(-2147483648,s.myAtoi("-21474836476"));
		assertEquals(-2147483648,s.myAtoi("-4147483647"));
		assertEquals(2147483647,s.myAtoi("21474836460"));
		assertEquals(12345678,s.myAtoi("  0000000000012345678"));
		assertEquals(0,s.myAtoi(""));
		assertEquals(0,s.myAtoi("  +  413"));
	}
	

}
