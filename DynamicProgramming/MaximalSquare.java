package leetcode.LeetCode.DynamicProgramming;

public class MaximalSquare {

	
	public int maximalSquare(char[][] matrix) {
		
		int yLength = matrix.length;
		int xLength = matrix[0].length;
		int maximum = 0;
		
		int[][] intMatrix = new int[yLength][xLength];
		for(int y = 0; y < yLength; y++) {
			for(int x = 0; x < xLength; x++) {
				intMatrix[y][x] = Character.getNumericValue(matrix[y][x]);
			}
		}
		
		for(int y = 1; y < yLength; y++) {
			for(int x = 1; x < xLength; x++) {
				if(intMatrix[y][x] == 1) {
					int neighborSquareMinimum = Math.min(intMatrix[y-1][x-1], Math.min(intMatrix[y][x-1] , 
							intMatrix[y-1][x]));
					if(neighborSquareMinimum > 0) {
						intMatrix[y][x] = (char) Math.max(intMatrix[y][x],neighborSquareMinimum+1);
					}
					if(intMatrix[y][x] > maximum) maximum = intMatrix[y][x];
				}
			}
		}
		
		if(maximum == 0) {
			for(int y = 0; y < yLength; y++) {
				if(intMatrix[y][0] == 1) return 1;
			}
			for(int x = 0; x < xLength; x++) {
				if(intMatrix[0][x] == 1) return 1;
			}
		}
		return maximum * maximum;
    }


}
