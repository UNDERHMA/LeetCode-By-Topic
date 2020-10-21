package leetcode.LeetCode.Arrays;

import java.util.Arrays;

public class ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        else if(nums.length < 3) {
            int maximum = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] > maximum) {
                    maximum = nums[i];
                }
            }
            return maximum;
        }
        else {
            Arrays.sort(nums);
            int counter = 0;
            for(int i = nums.length - 1; i > 0 ; i--) {
                if(nums[i] > nums[i-1]) {
                    counter++;
                }
                if(counter == 2) {
                    return nums[i-1];
                }
            }
        }
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > maximum) {
                maximum = nums[i];
            }
        }
        return maximum;
    }
}
