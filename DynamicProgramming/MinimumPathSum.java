package leetcode.LeetCode.DynamicProgramming;

import java.util.Arrays;

public class MinimumPathSum {

	public int minPathSum(int[][] grid) {
        
		int yLength = grid.length;
		int xLength = grid[0].length;
		int[][] tabulation = new int[yLength][xLength];
		for(int[] a : tabulation) {
			Arrays.fill(a, Integer.MAX_VALUE);
		}
		tabulation[0][0] = grid[0][0];
		
		for(int y = 0; y < yLength; y++) {
			for(int x = 0; x < xLength; x++) {
				int currentMinimum = 0;
				if(x == 0 && y == 0) continue;
				if(y > 0 && x > 0) currentMinimum = Math.min(tabulation[y-1][x],tabulation[y][x-1]);
				else if(y > 0) currentMinimum = tabulation[y-1][x];
				else currentMinimum = tabulation[y][x-1];
				tabulation[y][x] = currentMinimum + grid[y][x];
			}
		}
		return tabulation[yLength-1][xLength-1];
    }

}
