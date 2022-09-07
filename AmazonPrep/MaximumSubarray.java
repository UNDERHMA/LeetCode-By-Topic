package AmazonPrep.AmazonPrep;

public class MaximumSubarray {

	public int maxSubArray(int[] nums) {
        
		if(nums == null || nums.length == 0) return 0;
		int numsLength = nums.length;
		int maximumSum = nums[0];
		int currentSum = maximumSum;
		
		for(int i = 1; i < numsLength; i++) {
			currentSum = Math.max(currentSum + nums[i], nums[i]);
			if(currentSum > maximumSum) maximumSum = currentSum;
		}
		return maximumSum;
    }

}
