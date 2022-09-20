package leetcode.LeetCode.DynamicProgramming;

import java.util.Arrays;

public class PaintHouseIII {

	
	private int[][][] memo;
	private int[] houses;
	private int[][] cost;
	private int m;
	private int n;
	private int target;
	
	public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        
		memo = new int[m][target+1][n];
		for(int[][] a : memo) {
			for(int[] b : a) {
				Arrays.fill(b,Integer.MAX_VALUE);
			}
		}
		this.houses = houses;
		this.cost = cost;
		this.m = m;
		this.n = n;
		this.target = target;
		int result = calculateMinCost(0,0,0);
		if(result >= 10000000) result = -1;
		return result;
    }
	
	private int calculateMinCost(int homeNumber, int previousHouseColor, int numberOfNeighborHoods) {
		
		if(homeNumber == m && numberOfNeighborHoods == target) return 0;
		if(homeNumber == m || numberOfNeighborHoods > target) return 10000000;
		
		if(houses[homeNumber] != 0) {
			int neighborHoodNumberIncrease = homeNumber == 0 || houses[homeNumber]-1 != previousHouseColor ? 1 : 0;
			memo[homeNumber][numberOfNeighborHoods][previousHouseColor] = Math.min(memo[homeNumber][numberOfNeighborHoods][previousHouseColor],
					calculateMinCost(homeNumber+1,houses[homeNumber]-1,neighborHoodNumberIncrease + numberOfNeighborHoods));
		} else if(memo[homeNumber][numberOfNeighborHoods][previousHouseColor]  == Integer.MAX_VALUE)  {
			for(int i = 1; i <= n; i++) {
				int neighborHoodNumberIncrease = homeNumber == 0 || previousHouseColor != i-1 ? 1 : 0;
				memo[homeNumber][numberOfNeighborHoods][previousHouseColor] = Math.min(memo[homeNumber][numberOfNeighborHoods][previousHouseColor],
						cost[homeNumber][i-1] + calculateMinCost(homeNumber+1,i-1,neighborHoodNumberIncrease + numberOfNeighborHoods));
			}
		}
		return memo[homeNumber][numberOfNeighborHoods][previousHouseColor];
	}

}
