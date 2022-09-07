package AmazonPrep.AmazonPrep;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
	
	LongestSubstringWithoutRepeatingCharacters function = new LongestSubstringWithoutRepeatingCharacters();
	
	String input1 = "abcabcbb";
	String input2 = "bbbbb";
	String input3 = "pwwkew";
	String input4 = "";
	String input5 = "aab";
	String input6 = "dvdf";
	
	@Test 
	public void test() {
		assertEquals(3,function.lengthOfLongestSubstring(input1));
		assertEquals(1,function.lengthOfLongestSubstring(input2));
		assertEquals(3,function.lengthOfLongestSubstring(input3));
		assertEquals(0,function.lengthOfLongestSubstring(input4));
		assertEquals(2,function.lengthOfLongestSubstring(input5));
		assertEquals(3,function.lengthOfLongestSubstring(input6));
	}

}
