package leetcode.LeetCode.DynamicProgramming;

import java.util.Arrays;

public class CoinChange2 {

	/*
	// Iterative/Tabulation
	public int change(int amount, int[] coins) {
        
		int coinsLength = coins.length;
		int[] tabulation = new int[amount+1];
		tabulation[0] = 1;
		
		for(int coinIndex = 0; coinIndex < coinsLength; coinIndex++) {
			for(int amountIndex = 1; amountIndex <= amount; amountIndex++) {
				int previousIndex = -1;
				if(amountIndex - coins[coinIndex] > -1) previousIndex = amountIndex - coins[coinIndex];
				if(previousIndex > -1) tabulation[amountIndex] += tabulation[previousIndex];
			}
		}
		return tabulation[amount];
    } */
	
	/* Recursive/memoization
	 */
	    private int[] coins;
		private int amount;
		private int coinsLength;
		private int[][] memo;
 		
		public int change(int amount, int[] coins) {
	        
			this.amount = amount;
			this.coins = coins;
			this.coinsLength = coins.length;
			this.memo = new int[amount][coinsLength];
			for(int[] a : memo) {
				Arrays.fill(a, -1);
			}
			return calculateWays(0,0);
	    }
		
		private int calculateWays(int currentAmount,int startInCoinsArray) {
			
			if(currentAmount == amount) return 1;
			if(currentAmount > amount) return 0;
			
			if(memo[currentAmount][startInCoinsArray] == -1) {
				memo[currentAmount][startInCoinsArray] = 0;
				for(int i = startInCoinsArray; i < coinsLength; i++) {
					memo[currentAmount][startInCoinsArray] += calculateWays(currentAmount + coins[i],i);
				}
			}
			return memo[currentAmount][startInCoinsArray];
		}
	 /* 
	 * 
	 */
	


}
