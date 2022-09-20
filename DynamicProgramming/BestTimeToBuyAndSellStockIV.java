package leetcode.LeetCode.DynamicProgramming;

public class BestTimeToBuyAndSellStockIV {

	private int[][][] memo;
	private int[] prices;
	private int numberOfTransactions;
	private int pricesLength;
	
	public int maxProfit(int k, int[] prices) {
    
		this.pricesLength = prices.length;
		this.prices = prices;
		this.memo = new int[pricesLength][k][2];
		this.numberOfTransactions = k;
		return maxProfit(0,0,0);
    }
	
	public int maxProfit(int startIndex, int transactionsMade, int holdingStock) {
		
		if(transactionsMade == numberOfTransactions || startIndex == pricesLength) return 0;
		
		if(memo[startIndex][transactionsMade][holdingStock] == 0) {
			int doNothing = maxProfit(startIndex+1,transactionsMade,holdingStock);
			if(holdingStock == 1) {
				int sellStock = prices[startIndex] + maxProfit(startIndex+1,transactionsMade+1,holdingStock-1);
				memo[startIndex][transactionsMade][holdingStock] = Math.max(doNothing, sellStock);
			} else {
				int buyStock = -prices[startIndex] + maxProfit(startIndex+1,transactionsMade,holdingStock+1);
				memo[startIndex][transactionsMade][holdingStock] = Math.max(doNothing, buyStock);
			}
		}
		return memo[startIndex][transactionsMade][holdingStock];
	}

}
