package AmazonPrep.AmazonPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	
	public List<List<Integer>> threeSum(int[] nums) {
        
		int numsLength = nums.length;
		List<List<Integer>> results = new ArrayList<>();
		if(numsLength < 3) return results;
		Arrays.sort(nums);
		
		int valueToSearch = 0;
		int result = -1;
		for(int i = 0; i < numsLength-2; i++) {
			for(int j = numsLength-1; j > i+1; j--) {
				valueToSearch = -1 * (nums[i]+nums[j]);
				result = Arrays.binarySearch(nums, i+1, j, valueToSearch);
				if(result > -1) {
					List<Integer> resultToAdd = Arrays.asList(nums[i], valueToSearch, nums[j]);
					results.add(resultToAdd);
					int temp = nums[i];
					while (i < numsLength-2 && nums[i] == temp) {
						i++;
					}
					i--;
				}
			}
		}
		return results;
    }
	
}
