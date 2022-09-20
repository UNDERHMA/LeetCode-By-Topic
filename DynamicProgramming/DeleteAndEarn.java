package leetcode.LeetCode.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class DeleteAndEarn {

	public int deleteAndEarn(int[] nums) {
		
		Map<Integer,Integer> numsMap = new HashMap<>();
		int maxNumber = -1;
		for(int i: nums) {
			if(numsMap.containsKey(i)) numsMap.put(i,numsMap.get(i) + i);
			else numsMap.put(i, i);
			maxNumber = Math.max(maxNumber, i);
		}
			
		int secondPrevious = numsMap.getOrDefault(1, 0);
		int previous = Math.max(secondPrevious,numsMap.getOrDefault(2, 0));
		
		for(int i = 3; i <= maxNumber; i++) {
			int currentValue = Math.max(previous,numsMap.getOrDefault(i, 0) + secondPrevious);
			secondPrevious = previous;
			previous = currentValue;
		}
		return previous;
    }

}
