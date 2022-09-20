package leetcode.LeetCode.DynamicProgramming;

public class MaximumScoreFromPerformingMultiplicationOperations {
	
	private int[][] memo;
	private int[] nums;
	private int[] multipliers;
	private int maxSteps;
	private int numsLength;
	
	public int maximumScore(int[] nums, int[] multipliers) {
        
		this.numsLength = nums.length;
		this.maxSteps = multipliers.length;
		this.nums = nums;
		this.multipliers = multipliers;
		this.memo = new int[maxSteps][maxSteps];
		return calculateMaximum(0,0);
    }

	public int calculateMaximum(int steps, int leftStart) {
		
		int right = numsLength-1-(steps-leftStart);
		if(steps == maxSteps) {
			return 0;
		} else if(memo[steps][leftStart] == 0) {
			int multiplier = multipliers[steps];
			memo[steps][leftStart] = Math.max(multiplier * nums[leftStart] + calculateMaximum(steps+1,leftStart+1),
												multiplier * nums[right] + calculateMaximum(steps+1,leftStart));
		}
		return memo[steps][leftStart];
	}
}
