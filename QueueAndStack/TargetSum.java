package leetcode.LeetCode.QueueAndStack;

public class TargetSum {
	public int findTargetSumWays(int[] nums, int S) {
        if(nums.length == 0) {
        	return 0;
        }
        return depthFirstSolutions(nums,S,0,0);
    }	
	
	public int depthFirstSolutions(int[] nums, int target, int currentSum, 
														int currentIndex) {
		int possibleSolutions = 0;
		if(currentIndex == nums.length - 1) {
			if(currentSum + nums[currentIndex] == target 
					&& currentSum - nums[currentIndex] == target) {
				return 2;
			}
			else if(currentSum + nums[currentIndex] == target 
					|| currentSum - nums[currentIndex] == target) {
				return 1;
			}
			else {
				return 0;
			}
		}
		possibleSolutions += depthFirstSolutions(nums,target,currentSum+nums[currentIndex],currentIndex+1);
		possibleSolutions += depthFirstSolutions(nums,target,currentSum-nums[currentIndex],currentIndex+1);
		return possibleSolutions;
	}
}
