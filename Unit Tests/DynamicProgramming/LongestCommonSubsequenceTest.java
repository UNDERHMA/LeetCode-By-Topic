package leetcode.LeetCode.DynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceTest {

	@Test
	void test() {
		LongestCommonSubsequence l = new LongestCommonSubsequence();
		assertEquals(1,l.longestCommonSubsequence("bsbininm","jmjkbkjkv"));
		assertEquals(5,l.longestCommonSubsequence("abcba","abcbca"));
	}

}
