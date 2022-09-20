package leetcode.LeetCode.DynamicProgramming;

public class InterleavingString {

	private String s1;
	private String s2;
	private String s3;
	private int s1Length;
	private int s2Length;
	private int s3Length;
	private int[][][] memo;
	
	public boolean isInterleave(String s1, String s2, String s3) {
        
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s1Length = s1.length();
		this.s2Length = s2.length();
		this.s3Length = s3.length();
		if(s1Length + s2Length != s3Length) return false;
		this.memo = new int[s1Length+1][s2Length+1][s3Length+1];
		return checkIfPossible(0,0,0) == 1 ? true : false;
    }
	
	private int checkIfPossible(int s1Index, int s2Index, int s3Index) {
		
		if(s1Index == s1Length && s2Index == s2Length && s3Index == s3Length) return 1;
		
		if(memo[s1Index][s2Index][s3Index] == 0 && s1Index < s1Length && s1.charAt(s1Index) == s3.charAt(s3Index)) {
			memo[s1Index][s2Index][s3Index] = checkIfPossible(s1Index+1,s2Index,s3Index+1);
		}
		if(memo[s1Index][s2Index][s3Index] <= 0 && s2Index < s2Length && s2.charAt(s2Index) == s3.charAt(s3Index)) {
			memo[s1Index][s2Index][s3Index] = checkIfPossible(s1Index,s2Index+1,s3Index+1);
		}
		
		if(memo[s1Index][s2Index][s3Index] <= 0) memo[s1Index][s2Index][s3Index] = -1;
		return memo[s1Index][s2Index][s3Index];
	}

}
