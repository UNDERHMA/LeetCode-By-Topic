package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestValidParenthesesTest {

	LongestValidParentheses l = new LongestValidParentheses();
	
	@Test
	public void test() {
		assertEquals(2,l.longestValidParentheses("(()(((()"));
		assertEquals(4,l.longestValidParentheses(")()())"));
		assertEquals(2,l.longestValidParentheses("(()"));
		assertEquals(2,l.longestValidParentheses("()"));
		assertEquals(4,l.longestValidParentheses(")()()("));
		assertEquals(0,l.longestValidParentheses(""));
		assertEquals(2,l.longestValidParentheses("()(()")); 
	}

}
