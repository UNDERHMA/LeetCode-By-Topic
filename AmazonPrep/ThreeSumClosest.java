package AmazonPrep.AmazonPrep;

import java.util.Arrays;

public class ThreeSumClosest {

	
	public int threeSumClosest(int[] nums, int target) {
        
		int numsLength = nums.length;
		if(numsLength < 3) return 0;
		Arrays.sort(nums);
		int low;
		int high;
		int currentSum;
		int closestSum = 5000;
		
		for(int i = 0; i <numsLength-2; i++) {
			low = i+1;
			high = numsLength-1;
			while(low<high) {
				currentSum = nums[i] + nums[low] + nums[high];
				if(Math.abs(target-closestSum) > Math.abs(target-currentSum)) {
					closestSum = currentSum;
				}
				if(currentSum == target) return target;
				else if(currentSum > target) high--;
				else low++;
			}
		}
		return closestSum;		
    }

}
