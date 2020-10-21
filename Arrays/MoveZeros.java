package leetcode.LeetCode.Arrays;

public class MoveZeros {
	public void moveZeroes(int[] nums) {
        
        int zeroCount = 0;
        int writePointer = 0;
        //rewrite array by writing non-zero elements from index 0 onward
        for(int readPointer = 0; readPointer < nums.length; readPointer++) {
            if(nums[readPointer] != 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            } 
            else {
                zeroCount++;
            }
        }
        
        //add zeros at the end
        for(int i = 0; i < zeroCount; i++) {
            nums[nums.length-1-i] = 0;
        }
    }
}
