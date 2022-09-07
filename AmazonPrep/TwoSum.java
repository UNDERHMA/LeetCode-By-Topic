package AmazonPrep.AmazonPrep;

import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		
		int length = nums.length;
		if(length == 0) return null;
		if(length == 1 && nums[0] == target) return new int[] {0};
		HashMap<Integer,Integer> hash = new HashMap<>();
		
		int currentValue = 0;
		for(int i = 0; i < length; i++) {
			currentValue = nums[i];
			if(hash.containsKey(currentValue)) {
				if(target - currentValue == currentValue) {
					return new int[] {i,hash.get(currentValue)};
				}
			}
			else {
				hash.put(nums[i],i);
			}
		}
		
		int complement;
		// for each in entrySet, take out, and then see if compliment exists
		for(int i = 0; i < length; i++ ) {
			currentValue = nums[i];
			hash.remove(currentValue);
			complement = target - currentValue;
			if(hash.get(complement) != null) {
				return new int[] {i,hash.get(complement)};
			}
		}
		
		return null;
    }
}
