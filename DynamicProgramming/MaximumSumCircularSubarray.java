package leetcode.LeetCode.DynamicProgramming;

public class MaximumSumCircularSubarray {

	public int maxSubarraySumCircular(int[] nums) {
        
		int numsLength = nums.length;
		int currentMaximum = -100000;
		int currentMinimum = 100000;
		int overallMaximum = -100000;
		int overallMinimum = 100000;
		int totalSum = 0;

		for(int i = 0; i < numsLength; i++) {
			currentMaximum = Math.max(currentMaximum + nums[i], nums[i]);
			currentMinimum = Math.min(currentMinimum + nums[i], nums[i]);
			overallMaximum = Math.max(overallMaximum, currentMaximum);
			overallMinimum = Math.min(overallMinimum, currentMinimum);
			totalSum += nums[i];
		}
		int totalSumMinusMinimum = totalSum - overallMinimum;
		return (totalSumMinusMinimum == 0 || totalSumMinusMinimum <= overallMaximum) ? overallMaximum : totalSumMinusMinimum;
    }

}
