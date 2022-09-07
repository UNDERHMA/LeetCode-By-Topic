package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestPalindromicSubstringTest {

	@Test
	public void test() {
		assertEquals("bab", LongestPalindromicSubstring.longestPalindrome("babad"));
		assertEquals("bb", LongestPalindromicSubstring.longestPalindrome("cbbd"));
		assertEquals("eeeeeeeeeeeee", LongestPalindromicSubstring.longestPalindrome("adadsfrefaeeeeeeeeeeeeed"));
	}

}
