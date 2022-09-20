package leetcode.LeetCode.DynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumSumCircularSubarrayTest {

	@Test
	void test() {
		int[] input = new int[] {5,-3,5};
		int[] input1 = new int[] {-3,-2,-3};
		MaximumSumCircularSubarray m = new MaximumSumCircularSubarray();
		
		assertEquals(10,m.maxSubarraySumCircular(input));
		assertEquals(-2,m.maxSubarraySumCircular(input1));
	}

}
