package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestCommonPrefixTest {

	String[] array = new String[]{"aa","a"};
	String[] array1 = new String[]{"flower","flow","flight"};

	@Test
	public void test() {
		assertEquals("a", LongestCommonPrefix.longestCommonPrefix(array));
		assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(array1));
	}

}
