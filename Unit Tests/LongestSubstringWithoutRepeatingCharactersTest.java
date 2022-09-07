package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
	
	String s1 = "abcabcbb";
	String s2 = "bbbbb";
	String s3 = "pwwkew";
	String s4 = "";
	String s5 = "a";
	String s6 = "dvdf";
	
	

	@Test
	public void test() {
		assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s1));
		assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s2));
		assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s3));
		assertEquals(0, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s4));
		assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s5));
		assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s6));
		
	}

}
