package leetcode.LeetCode.DynamicProgramming;

public class PaintFence {

	private int numberOfPosts;
	private int numberOfColors;
	private int[][] memo;
	
	public int numWays(int n, int k) {
        
		this.numberOfPosts = n;
		this.numberOfColors = k;
		this.memo = new int[n][2];
		return calculateNumWays(1,-1,0);
    }

	private int calculateNumWays(int postNumber, int previousPostColor, int twoInARow) {
		
		if(postNumber > numberOfPosts) return 1;
		if(memo[postNumber-1][twoInARow] == 0) {
			for(int i = 1; i <= numberOfColors; i++) {
				if(previousPostColor == i) {
					if(twoInARow == 1) continue;
					memo[postNumber-1][twoInARow] += calculateNumWays(postNumber+1,i,1);
				} else {
					memo[postNumber-1][twoInARow] += calculateNumWays(postNumber+1,i,0);
				}
			}
		}
		return memo[postNumber-1][twoInARow];
	}

}
