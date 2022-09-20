package leetcode.LeetCode.DynamicProgramming;

public class BestTimeToBuyAndSellStockWithTransactionFee {

	private int pricesLength;
	private int[] prices;
	private int fee;
	private int[][] memo;
	
	public int maxProfit(int[] prices, int fee) {
        
		this.pricesLength = prices.length;
		this.prices = prices;
		this.fee = fee;
		this.memo = new int[pricesLength][2];
		return calculateMaxProfit(0,0);
    }
	
	private int calculateMaxProfit(int day, int holding) {
		
		if(day == pricesLength) return 0;
		
		if(memo[day][holding] == 0) {
			int doNothing = calculateMaxProfit(day+1,holding);
			int sellStock = -1;
			int buyStock = -1;
			if(holding == 0) buyStock = -prices[day] + calculateMaxProfit(day+1,1);
			if(holding == 1) sellStock = prices[day] - fee + calculateMaxProfit(day+1,0);
			memo[day][holding] = Math.max(doNothing, Math.max(buyStock, sellStock));
		}
		return memo[day][holding];
	}
	
	/* Iterative:
	 
	 	public int maxProfit(int[] prices, int fee) {
	 
	 		int pricesLength = prices.length;
	 		int maxProfit = 0;
	 		int priceOfStockBeingHeld = -prices[0];
	 		for(int i = 1; i < pricesLength; i++) {
	 			maxProfit = Math.max(maxProfit, prices[i] - fee + priceOfStockBeingHeld); //max of selling or doing nothing
	 			priceOfStockBeingHeld = Math.max(priceOfStockBeingHeld, maxProfit - prices[i]);
	 			// Since maxProfit goes up once you sell, this will make you hold the same amount until you have sold for profit, 
	 			// and then it will only become a new value if you've sold for profit and then found a value after selling that 
	 			// is 1 less than the value you sold for - the fee.
	 		}
	 		return maxProfit;
	 	}
	 
	 */

}
