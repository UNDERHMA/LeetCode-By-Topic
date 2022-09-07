package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestNiceSubstringTest {

	LongestNiceSubstring l = new LongestNiceSubstring();
	
	@Test
	public void test() {
		assertEquals("aAa",l.longestNiceSubstring("YazaAay"));
		assertEquals("Bb",l.longestNiceSubstring("Bb"));
		assertEquals("",l.longestNiceSubstring("c"));
		assertEquals("dD",l.longestNiceSubstring("dDzeE"));
	}

}
