package leetcode.LeetCode.DynamicProgramming;

public class BestTimeToBuyAndSellStockWithCooldown {

	private int[] prices;
	private int pricesLength;
	private int[][] memo;
	
	public int maxProfit(int[] prices) {
        
		this.prices = prices;
		this.pricesLength = prices.length;
		this.memo = new int[pricesLength][2];
		return maxProfit(0,0);
    }
	
	private int maxProfit(int startIndex, int holding) {
		
		if(startIndex >= pricesLength) return 0;
		
		if(memo[startIndex][holding] == 0) {
			int doNothing = maxProfit(startIndex+1,holding);
			if(holding == 1) {
				int sellStock = prices[startIndex] + maxProfit(startIndex+2,0);
				memo[startIndex][holding] = Math.max(doNothing, sellStock);
			} else {
				int buyStock = -prices[startIndex] + maxProfit(startIndex+1,1);
				memo[startIndex][holding] = Math.max(doNothing, buyStock);
			}
		}
		return memo[startIndex][holding];
	}


}
