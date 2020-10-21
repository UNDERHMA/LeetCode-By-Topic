package leetcode.LeetCode.Arrays;

public class RemoveElement {
public int removeElement(int[] nums, int val) {
        
        // get count of elements to remove
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                count++;
                }
        }
        // remove elements
        int countRemoved = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                int j = i;
                while(j <= nums.length - countRemoved){
                    if(j+1 <= nums.length - countRemoved) {
                        nums[j] = nums[j+1];
                    }
                    j++;
                }
                if(nums[i] == val && i < nums.length - count) {
                    i--;
                }
                countRemoved++;
            }
        }
        return nums.length-count;
    }
}
