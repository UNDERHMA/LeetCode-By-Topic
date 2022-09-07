package leetcode.LeetCode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidParenthesesTest {
	
	@Test
	public void test1() {
		assertEquals(true, ValidParentheses.isValid("()"));
		assertEquals(true, ValidParentheses.isValid("()[]{}"));
		assertEquals(false, ValidParentheses.isValid("(]"));
		assertEquals(false, ValidParentheses.isValid("([)]"));
		assertEquals(true, ValidParentheses.isValid("{[]}"));
	}

}
