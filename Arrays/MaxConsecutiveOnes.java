package leetcode.LeetCode.Arrays;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        
        int maximumNumber = 0;
        int currentNumber = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                currentNumber++;
            }
            else {
                currentNumber = 0;
            }
            if(maximumNumber < currentNumber) {
                maximumNumber = currentNumber;
            }
        }
        return maximumNumber;
    }
}
