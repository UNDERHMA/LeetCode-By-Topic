package leetcode.LeetCode.DynamicProgramming;

public class NthTribonacciNumber {

	
	public int tribonacci(int n) {
        
		if(n == 0) return 0;
		if(n == 1 || n == 2) return 1;
		int[] tabulation = new int[n+1];
		tabulation[1] = 1;
		tabulation[2] = 1;
		
		for(int i = 3; i < n+1; i++) {
			tabulation[i] = tabulation[i-3] + tabulation[i-2] + tabulation[i-1];
		}
		return tabulation[n];
    }

}
