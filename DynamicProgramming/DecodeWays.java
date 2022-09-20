package leetcode.LeetCode.DynamicProgramming;

public class DecodeWays {

	// Tabulation
	public int numDecodings(String s) {
	    
		int sLength = s.length();
		char[] temp = s.toCharArray();
		int[] sArray = new int[sLength];
		for(int i = 0; i < sLength; i++) {
			sArray[i] = temp[i] - '0';
		}
		int[] tabulation = new int[sLength+1];

		tabulation[0] = 1;
		tabulation[1] = sArray[0] == 0 ? 0 : 1;
		for(int i = 2; i < sLength+1; i++) {
			
			if(sArray[i-1] != 0) tabulation[i] += tabulation[i-1];
					
			int prevValue = sArray[i-1];
			int secondPrevValue = sArray[i-2];
			if(secondPrevValue == 1 || (secondPrevValue == 2 && prevValue < 7)) {
				tabulation[i] += tabulation[i-2];
			}
		}
		return tabulation[sLength];
    }
	
	
	/* Memoization
	private int[] sArray;
	private int sLength;
	private int[] memo;
	
	public int numDecodings(String s) {
    
		sLength = s.length();
		char[] temp = s.toCharArray();
		sArray = new int[sLength];
		for(int i = 0; i < sLength; i++) {
			sArray[i] = temp[i] - '0';
		}
		memo = new int[sLength];
		return numberOfWays(0);
    }
	
	private int numberOfWays(int startIndex) {
		
		if(startIndex == sLength) return 1;
		
		int currentValue = sArray[startIndex];
		int nextValue = -1;
		if(startIndex < sLength - 1) nextValue = sArray[startIndex+1];
		
		if(memo[startIndex] == 0) {
			if(currentValue != 0 && nextValue != 0) memo[startIndex] += numberOfWays(startIndex+1);
			if(nextValue != -1 && (currentValue == 1 || (currentValue == 2 && nextValue < 7))) {
				memo[startIndex] += numberOfWays(startIndex+2);
			}
		}
		return memo[startIndex];
	} */

}
