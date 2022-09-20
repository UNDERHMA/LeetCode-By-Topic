package leetcode.LeetCode.DynamicProgramming;

public class HouseRobber {

public int rob(int[] nums) {
        
		int numsLength = nums.length;
		if(numsLength == 1) return nums[0]; 
		int secondPrevious = nums[0];
		int previous = Math.max(nums[1], secondPrevious);
		
		// secondPrevious and previous are always keeping track of max up to that point
		for(int i = 2; i < numsLength; i++) {
			nums[i] = Math.max(previous, secondPrevious + nums[i]);
			secondPrevious = previous;
			previous = nums[i];
		}
		return previous;
    }

}
