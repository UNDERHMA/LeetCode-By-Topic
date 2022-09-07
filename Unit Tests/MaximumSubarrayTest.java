package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumSubarrayTest {

	@Test
	public void test() {
		assertEquals(6, MaximumSubarray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}

}
