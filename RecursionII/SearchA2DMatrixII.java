package leetcode.LeetCode.RecursionII;

public class SearchA2DMatrixII {
	
	public boolean searchMatrix(int[][] matrix, int target) {
        
		int width = matrix[0].length-1;
		int height = matrix.length-1;
		int midWidth = width/2;
		int midHeight = height/2;
		return searchMatrix(matrix,target,midWidth,midHeight,midWidth,midHeight) ||
				searchMatrix(matrix,target,width,midHeight,width-midWidth,midHeight) ||
				searchMatrix(matrix,target,midWidth,height,midWidth,height-midHeight) ||
				searchMatrix(matrix,target,width,height,width-midWidth,height-midHeight);
    }
	
	public boolean searchMatrix(int[][] matrix, int target, int xBottomRightIndex,
			int yBottomRightIndex, int subMatrixWidth, int subMatrixHeight) {
		
		if(matrix[yBottomRightIndex][xBottomRightIndex] == target) return true;
		else if(matrix[yBottomRightIndex][xBottomRightIndex] < target) return false;
		
		int midWidth = subMatrixWidth/2;
		int midHeight = subMatrixHeight/2;
		
		return searchMatrix(matrix,target,subMatrixWidth-midWidth,subMatrixHeight-midHeight,
				subMatrixWidth-midWidth,subMatrixHeight-midHeight) ||
				searchMatrix(matrix,target,width,midHeight,width-midWidth,midHeight) ||
				searchMatrix(matrix,target,midWidth,height,midWidth,height-midHeight) ||
				searchMatrix(matrix,target,width,height,width-midWidth,height-midHeight);
		
	}
}
