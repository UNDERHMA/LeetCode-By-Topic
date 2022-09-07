package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecodeWaysTest {
	
	DecodeWays d = new DecodeWays();
	
	@Test
	public void test() {
		assertEquals(1,d.numDecodings("27"));
		assertEquals(0,d.numDecodings("270"));
		assertEquals(0,d.numDecodings("1313102701"));
		assertEquals(0,d.numDecodings("100"));
		assertEquals(0,d.numDecodings("1313413401"));
		System.out.println(d.numDecodings("111111111111111111111111111111111111111111111"));
	}

}
