package leetcode.LeetCode.DynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumScoreFromPerformingMultiplicationOperationsTest {

	@Test
	void test() {
		int[] nums1 = new int[] {1,2,3};
		int[] mult1 = new int[] {3,2,1};
		int[] nums2 = new int[] {-5,-3,-3,-2,7,1};
		int[] mult2 = new int[] {-10,-5,3,4,6};
		
		
		MaximumScoreFromPerformingMultiplicationOperations m = new MaximumScoreFromPerformingMultiplicationOperations();
		
		assertEquals(102,m.maximumScore(nums2, mult2));
		assertEquals(14,m.maximumScore(nums1, mult1));
	}

}
