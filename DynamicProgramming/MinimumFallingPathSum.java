package leetcode.LeetCode.DynamicProgramming;

public class MinimumFallingPathSum {

	public int minFallingPathSum(int[][] matrix) {
        
		int yLength = matrix.length;
		int xLength = matrix[0].length;
		
		for(int y = 1; y < yLength; y++) {
			for(int x = 0; x < xLength; x++) {
				int currentMinAbove = matrix[y-1][x];
				if(x > 0) currentMinAbove = Math.min(currentMinAbove, matrix[y-1][x-1]);
				if(x < xLength-1) currentMinAbove = Math.min(currentMinAbove, matrix[y-1][x+1]);
				matrix[y][x] += currentMinAbove;
			}
		}
		
		int minimumSum = Integer.MAX_VALUE;
		for(int y = yLength-1; y < yLength; y++) {
			for(int x = 0; x < xLength; x++) {
				minimumSum = Math.min(minimumSum, matrix[y][x]);
			}
		}
		return minimumSum;
    }

}
