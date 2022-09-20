package leetcode.LeetCode.DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int[] nums) {
        
		int numsLength = nums.length;
		int[] tabulation = new int[numsLength];
		Arrays.fill(tabulation, 1);
		int max = 1;
		
		for(int i = numsLength-2; i >= 0; i--) {
			for(int j = i+1; j < numsLength; j++) {
				if(nums[i] < nums[j]) {
					tabulation[i] = Math.max(tabulation[i], tabulation[j]+1);
				}
				if(tabulation[i] > max) max = tabulation[i];
			}
		}
		return max;
    }

}
