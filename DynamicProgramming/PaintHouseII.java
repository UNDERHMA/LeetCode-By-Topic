package leetcode.LeetCode.DynamicProgramming;

public class PaintHouseII {

	public int minCostII(int[][] costs) {
    
		int yLength = costs.length;
		int xLength = costs[0].length;
		
		for(int y = 1; y < yLength; y++) {
			for(int x = 0; x < xLength; x++) {
				int lowestLastValue = Integer.MAX_VALUE;
				for(int j = 0; j < xLength; j++) {
					if(j == x) continue;
					lowestLastValue = Math.min(lowestLastValue, costs[y-1][j]);
				}
				costs[y][x] += lowestLastValue;
			}
		}
		
		int minimumValue = Integer.MAX_VALUE;
		for(int y = yLength-1; y < yLength; y++) {
			for(int x = 0; x < xLength; x++) {
				if(costs[y][x] < minimumValue) minimumValue = costs[y][x];
			}
		}
		return minimumValue;
    }
}
