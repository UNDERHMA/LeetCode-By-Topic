package leetcode.LeetCode.DynamicProgramming;

public class UniquePaths {

	public int uniquePaths(int m, int n) {
    
		int[][] tabulation = new int[m][n];
		tabulation[0][0] = 1;
		
		for(int y = 0; y < m; y++) {
			for(int x = 0; x < n; x++) {
				if(y > 0) tabulation[y][x] += tabulation[y-1][x];
				if(x > 0) tabulation[y][x] += tabulation[y][x-1];
			}
		}
		return tabulation[m-1][n-1];
    }

}
