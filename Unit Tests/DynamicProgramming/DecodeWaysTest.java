package leetcode.LeetCode.DynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecodeWaysTest {

	@Test
	void test() {
		String s = "12";
		String s1 = "226";
		String s2 = "06";
		String s3 = "2611055971756562";
		
		DecodeWays d = new DecodeWays();
		assertEquals(2,d.numDecodings(s));
		assertEquals(3,d.numDecodings(s1));
		assertEquals(0,d.numDecodings(s2));
		assertEquals(4,d.numDecodings(s3));
	}

}
