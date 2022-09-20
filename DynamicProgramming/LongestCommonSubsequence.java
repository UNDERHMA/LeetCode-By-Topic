package leetcode.LeetCode.DynamicProgramming;

public class LongestCommonSubsequence {
	
	
	/* Trick here is that for tabulation, you have to look at square y + 1,x + 1, because 
	 * the square + 1 for each means 1 character earlier in the string for each, so we only 
	 * care about the maximum run 1 character earlier for each string.
	 * 
	 * 		a b c d a
	 * a	5 4 3 2 1
	 * b    4 4 3 2 1
	 * c    3 3 3 2 1 
	 * d	2 2	2 2 1	
	 * c	2 2 2 1 1
	 * a    1 1 1 1 1
	 */

	public int longestCommonSubsequence(String text1, String text2) {
        
		int text1Length = text1.length();
		int text2Length = text2.length();
		
		int[][] tabulation = new int[text2Length+1][text1Length+1];
		for(int y = text2Length-1; y >= 0; y--) {
			for(int x = text1Length-1; x >= 0; x--){
				if(text1.charAt(x) == text2.charAt(y)) tabulation[y][x] = 1 + tabulation[y+1][x+1]; //square y + 1, x + 1
				else tabulation[y][x] = Math.max(tabulation[y][x+1],tabulation[y+1][x]);
			}
		}
		return tabulation[0][0];
    }

}
