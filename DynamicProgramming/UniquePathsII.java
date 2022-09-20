package leetcode.LeetCode.DynamicProgramming;

public class UniquePathsII {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] tabulation = new int[m][n];
		if(obstacleGrid[0][0] == 1) return 0;
		tabulation[0][0] = 1;
		
		for(int y = 0; y < m; y++) {
			for(int x = 0; x < n; x++) {
				if(obstacleGrid[y][x] != 1) {
					if(y > 0) tabulation[y][x] += tabulation[y-1][x];
					if(x > 0) tabulation[y][x] += tabulation[y][x-1];
				}
			}
		}
		return tabulation[m-1][n-1];
    }

}
