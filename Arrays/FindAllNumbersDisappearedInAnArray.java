package leetcode.LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
		public List<Integer> findDisappearedNumbers(int[] nums) {
        
        for(int i = 0; i < nums.length; i++) {
            
            if(nums[Math.abs(nums[i])-1] > 0) {
                nums[Math.abs(nums[i])-1] *= -1;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] > 0) {
                result.add(i+1);
            }
        }
        return result;        
    }
}
