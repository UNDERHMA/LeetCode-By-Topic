package leetcode.LeetCode.DynamicProgramming;

public class PaintHouse {

	private int[][] costs;
	private int costsLength;
	private int[][] memo;
	
	public int minCost(int[][] costs) {
        
		this.costs = costs;
		this.costsLength = costs.length;
		this.memo = new int[costsLength][3];
		return calculateMin(0,0);
    }
	
	private int calculateMin(int index, int lastHousePainted) {
		
		if(index == costsLength) return 0;
		
		if(memo[index][lastHousePainted] == 0) {
			int redPainted = Integer.MAX_VALUE, bluePainted = Integer.MAX_VALUE, greenPainted = Integer.MAX_VALUE;
			if(lastHousePainted != 0 || index == 0) {
				redPainted = costs[index][0] + calculateMin(index+1,0);
			}
			if(lastHousePainted != 1) {
				bluePainted= costs[index][1] + calculateMin(index+1,1);
			}
			if(lastHousePainted != 2) {
				greenPainted = costs[index][2] + calculateMin(index+1,2);
			}
			memo[index][lastHousePainted] = Math.min(redPainted, Math.min(bluePainted, greenPainted));
		}
		return memo[index][lastHousePainted];
	}
	
	/*
	// Iterative
	public int minCost(int[][] costs) {
		
		int costsLength = costs.length;
		
		for(int i = 1; i < costsLength; i++) {
			costs[i][0] += Math.min(costs[i-1][1], costs[i-1][2]);
			costs[i][1] += Math.min(costs[i-1][0], costs[i-1][2]);
			costs[i][2] += Math.min(costs[i-1][0], costs[i-1][1]);
		}
		return Math.min(costs[costsLength-1][0],Math.min(costs[costsLength-1][1],costs[costsLength-1][2]));
	}
	*/

}
