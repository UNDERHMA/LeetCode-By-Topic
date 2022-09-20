package leetcode.LeetCode.DynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximalSquareTest {

	@Test
	void test() {
		char[][] input = new char[][] {{'0','1'}};
		MaximalSquare m = new MaximalSquare();
		assertEquals(1,m.maximalSquare(input));
	}

}
