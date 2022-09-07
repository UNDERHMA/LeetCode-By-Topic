package GooglePrep.GooglePrep;

public class LongestIncreasingPathInAMatrix {

	private int[][] memo;
	
	public int longestIncreasingPath(int[][] matrix) {
        
		if(matrix == null || matrix.length == 0) return 0;
		int yLength = matrix.length;
		int xLength = matrix[0].length;
		int maxLength = 1;
		memo = new int[yLength][xLength];
		
		for(int y = 0; y < yLength; y++) {
			for(int x = 0; x < xLength; x++) {
				maxLength = Math.max(maxLength,depthFirstSearch(x,y,1,matrix,xLength,yLength));
			}
		}
		return maxLength;
    }
	
	public int depthFirstSearch(int x, int y, int runLength, int[][] matrix, int xLength, int yLength) {
		
		if(memo[y][x] != 0) {
			return memo[y][x];
		}
		memo[y][x] = 1;
		if(x > 0 && matrix[y][x-1] > matrix[y][x]) {
			memo[y][x] = Math.max(memo[y][x], 1 + depthFirstSearch(x-1,y,runLength+1,matrix,xLength,yLength));
		}
		if(x < xLength -1 && matrix[y][x+1] > matrix[y][x]) {
			memo[y][x] = Math.max(memo[y][x], 1+ depthFirstSearch(x+1,y,runLength+1,matrix,xLength,yLength));
		}
		if(y > 0 && matrix[y-1][x] > matrix[y][x]) {
			memo[y][x] = Math.max(memo[y][x], 1 + depthFirstSearch(x,y-1,runLength+1,matrix,xLength,yLength));
		}
		if(y < yLength -1 && matrix[y+1][x] > matrix[y][x]) {
			memo[y][x] = Math.max(memo[y][x], 1 + depthFirstSearch(x,y+1,runLength+1,matrix,xLength,yLength));
		}

		return memo[y][x];
	}

}
