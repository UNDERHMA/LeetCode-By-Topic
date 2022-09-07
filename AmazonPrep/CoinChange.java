package AmazonPrep.AmazonPrep;

import java.util.Arrays;

public class CoinChange {
	
	public int coinChange(int[] coins, int amount) {
        
		if(coins == null || coins.length == 0 || amount < 0) return -1;
		if(amount == 0) return 0;
		Arrays.sort(coins);
		int[] memo = new int[amount];
		Arrays.fill(memo,-1);
		stepsToSolve(coins, amount, 0, 0, memo);
		return memo[amount-1];
    }
	
	
	private void stepsToSolve(int[] coins, int amount, int currentAmount, int steps, int[] memo) {
		
		if(currentAmount == amount) {
			return;
		}
		for(int i = coins.length-1; i > -1; i--) {	
			if(currentAmount + coins[i] <= amount && currentAmount + coins[i] > 0) {
				currentAmount = currentAmount + coins[i];
				if((memo[currentAmount-1] == -1 || steps+1 < memo[currentAmount-1])) {
					memo[currentAmount-1] = steps+1;
					stepsToSolve(coins, amount, currentAmount,steps+1, memo);
				}
				currentAmount = currentAmount - coins[i];
			}
		}
		return;
	}
	
	
}
