package leetcode.LeetCode.Recursion;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

	public int climbStairs(int n) {
		if(n < 0)	return 0;
		if(n == 1) 	return 1;
		Map<Integer,Integer> cached = new HashMap<>();
		int result = climbStairs(n-1,cached);
		result += climbStairs(n-2,cached);
		return result;
    }
	
	public int climbStairs(int n, Map<Integer,Integer> cached) {
		if(cached.containsKey(n)) {
			return cached.get(n);
		}
		if(n < 0)	return 0;
		if(n == 0) 	return 1;
		int result = climbStairs(n-1,cached);
		result += climbStairs(n-2,cached);
		cached.put(n,result);
		return result;
    }
}
