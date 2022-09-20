package leetcode.LeetCode.DynamicProgramming;

public class NumberOfDiceRollsWithTargetSum {

	public int numRollsToTarget(int n, int k, int target) {
		
		long[][] tabulation = new long[n+1][target+1];
		tabulation[0][0] = 1;
		int modulo = (int) (Math.pow(10, 9) + 7);
		
			for(int diceUsed = 1; diceUsed <= n; diceUsed++) {
				for(int currentSum = 1; currentSum <= target; currentSum++) {
					for(int diceSideValue = 1; diceSideValue <= Math.min(k, currentSum); diceSideValue++) {
						tabulation[diceUsed][currentSum] = (tabulation[diceUsed][currentSum] 
																	+ tabulation[diceUsed-1][currentSum-diceSideValue]) % modulo;
					}
				}
			}
        return (int) tabulation[n][target];
    }
	

}
