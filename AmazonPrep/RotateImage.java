package AmazonPrep.AmazonPrep;

public class RotateImage {

	public void rotate(int[][] matrix) {
        
		int matrixLength = matrix.length;
		int temp1;
		int temp2;
		int start = 0;
		
		while(matrixLength > 0) {
			for(int i = 0; i < matrixLength-1; i++) {
				temp1 = matrix[start+i][matrixLength-1+start];
				matrix[start+i][matrixLength-1+start] = matrix[start][start+i];
				temp2 = matrix[matrixLength-1+start][matrixLength-1+start-i];
				matrix[matrixLength-1+start][matrixLength-1+start-i] = temp1;
				temp1 = matrix[matrixLength-1-i+start][start];
				matrix[matrixLength-1-i+start][start] = temp2;
				matrix[start][start+i] = temp1;
			}
			start++;
			matrixLength -= 2;
		}
		
	}
	
}
