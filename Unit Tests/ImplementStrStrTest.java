package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImplementStrStrTest {

	@Test
	public void test() {
		assertEquals(2, ImplementStrStr.strStr("hello", "ll"));
		assertEquals(-1, ImplementStrStr.strStr("aaaaa", "bba"));
		assertEquals(-1, ImplementStrStr.strStr("", "bba"));
		assertEquals(0, ImplementStrStr.strStr("aaaaa", ""));
		assertEquals(0, ImplementStrStr.strStr("a", "a"));
	}

}
