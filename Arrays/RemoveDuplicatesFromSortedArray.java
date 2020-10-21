package leetcode.LeetCode.Arrays;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
        
        int lengthRemoved = 0;
        for(int i = nums.length-2; i >= 0; i--) {
            if(nums[i] == nums[i+1]) {
                lengthRemoved++;
                for(int j = i+1; j < nums.length; j++){
                    nums[j-1] = nums[j];
                }
            }
        }
        return nums.length - lengthRemoved;
    }
}
