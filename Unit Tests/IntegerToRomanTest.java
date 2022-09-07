package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToRomanTest {

	@Test
	public void test() {
		assertEquals("I", IntegerToRoman.intToRoman(1));
		assertEquals("III", IntegerToRoman.intToRoman(3));
		assertEquals("IV", IntegerToRoman.intToRoman(4));
		assertEquals("IX", IntegerToRoman.intToRoman(9));
		assertEquals("LVIII", IntegerToRoman.intToRoman(58));
		assertEquals("LXXXVI", IntegerToRoman.intToRoman(86));
		assertEquals("MCMXCIV", IntegerToRoman.intToRoman(1994));
		assertEquals("MMCDXLIV", IntegerToRoman.intToRoman(2444));
		assertEquals("MMDLXXIV", IntegerToRoman.intToRoman(2574));
		assertEquals("MMMDCCCXCIV", IntegerToRoman.intToRoman(3894));
	}

}
