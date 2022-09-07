package GooglePrep.GooglePrep;

public class MultiplyStrings {

	
	public String multiply(String num1, String num2) { 
		if(num1 == null || num2 == null) return "";
		int num1Length = num1.length();
		int num2Length = num2.length();
		int totalLength = num1Length+num2Length;
		int[][] calculationMatrix = new int[totalLength+2][totalLength];
		
		// fill array with 1st and 2nd nums in first two rows
		insertNums(calculationMatrix,num1Length,num2Length,totalLength,num1,num2);
		calculateMatrixValues(calculationMatrix,num1Length,num2Length,totalLength);
		calculateSumInLastRow(calculationMatrix);
		return lastRowAsString(calculationMatrix);
    }
	
	public void insertNums(int[][] calculationMatrix, int num1Length, int num2Length, 
			int totalLength, String num1, String num2) {
		int offset = 0;
		for(int i = totalLength - 1; i > totalLength-1-num1Length; i--) {
			calculationMatrix[0][i] = Character.getNumericValue(num1.charAt(num1Length-1-offset));
			offset++;
		}
		offset = 0;
		for(int i = totalLength - 1; i > totalLength-1-num2Length; i--) {
			calculationMatrix[1][i] = Character.getNumericValue(num2.charAt(num2Length-1-offset));
			offset++;
		}
	}

	public void calculateMatrixValues(int[][] calculationMatrix, int num1Length, 
			int num2Length, int totalLength) {
		int verticalOffset = 2;
		int startOffset = 0;
		int rowCursor;
		int currentProduct;
		int carry = 0;
		for(int i = totalLength - 1; i > totalLength-1-num2Length; i--) {
			rowCursor = 0;
			for(int j = totalLength - 1; j > totalLength-1-num1Length; j--) {
				currentProduct = calculationMatrix[0][j] * calculationMatrix[1][i];
				currentProduct += carry;
				if(currentProduct > 10) {
					carry = currentProduct / 10;
					calculationMatrix[verticalOffset][totalLength-1-rowCursor-startOffset] += 
							currentProduct % 10;
				}
				else {
					calculationMatrix[verticalOffset][totalLength-1-rowCursor-startOffset] = 
							currentProduct;
					carry = 0;
				}
				rowCursor++;
			}
			if(carry != 0) {
				calculationMatrix[verticalOffset][totalLength-1-rowCursor-startOffset] = carry;
				carry = 0;
			}
			startOffset++;
			verticalOffset++;
		}
	}
	
	public void calculateSumInLastRow(int[][] calculationMatrix) {
		int yLength = calculationMatrix.length;
		int xLength = calculationMatrix[0].length;
		int currentSum;
		int carry = 0;
		for(int x = xLength-1; x >= 0; x--) {
			currentSum = 0;
			for(int y = 2; y < yLength-1; y++) {
				currentSum += calculationMatrix[y][x];
			}
			if(currentSum + carry < 10) {
				calculationMatrix[yLength-1][x] += currentSum + carry;
				carry = 0;
			} else {
				calculationMatrix[yLength-1][x] += (currentSum + carry) % 10;
				carry = (currentSum+carry)/10;
			}
		}
	}
	
	
	public String lastRowAsString(int[][] calculationMatrix) {
		StringBuilder sb = new StringBuilder();
		boolean leadingZerosTrimmed = false;
		int yLength = calculationMatrix.length;
		int xLength = calculationMatrix[0].length;
		for(int i = 0; i < xLength; i++) {
			if(!leadingZerosTrimmed) {
				if(calculationMatrix[yLength-1][i] == 0) continue;
				leadingZerosTrimmed = true;
			}
			sb.append(calculationMatrix[yLength-1][i]);
		}
		return (sb.length() > 0) ? sb.toString() : "0";
	}
	
}
