package leetcode.LeetCode.Recursion;

import java.util.HashMap;
import java.util.Map;

public class FibbonacciNumber {
	
	public int fib(int N) {
		Map<Integer,Integer> cached = new HashMap<>();
	    return fib(N,cached);
	}
	
	public int fib(int N, Map<Integer,Integer> cached) {
		if(cached.containsKey(N)) return cached.get(N);
		if(N < 2) return N;
		int result = fib(N-1,cached) + fib(N-2,cached);
		cached.put(N, result);
		return result;
	}

}
