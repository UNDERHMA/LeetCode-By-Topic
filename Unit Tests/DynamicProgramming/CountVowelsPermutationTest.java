package leetcode.LeetCode.DynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountVowelsPermutationTest {

	@Test
	void test() {
		CountVowelsPermutation c = new CountVowelsPermutation();
		assertEquals(5,c.countVowelPermutation(1));
		assertEquals(10,c.countVowelPermutation(2));
		assertEquals(68,c.countVowelPermutation(5));
		assertEquals(18208803,c.countVowelPermutation(144));
		assertEquals(237753473,c.countVowelPermutation(158));
	}

}
