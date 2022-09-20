package leetcode.LeetCode.DynamicProgramming;

public class MaximumLengthOfRepeatedSubarray {

	public int findLength(int[] nums1, int[] nums2) {
        
		int nums1Length = nums1.length;
		int nums2Length = nums2.length;
		
		int[][] tabulation = new int[nums1Length+1][nums2Length+1];
		int max = 0;
		
		for(int y = nums1Length-1; y >= 0; y--) {
			for(int x = nums2Length-1; x >= 0; x--) {
				if(nums1[y] == nums2[x]) {
					tabulation[y][x] = 1 + tabulation[y+1][x+1];
					max = Math.max(max, tabulation[y][x]);
				}
			}
		}
		return max;
    }

}
