package leetcode.LeetCode.DynamicProgramming;

public class CountVowelsPermutation {


	public int countVowelPermutation(int n) {
        
		long[][] tabulation = new long[n][5];
		tabulation[0][0] = 1L; // a
		tabulation[0][1] = 1L; // e
		tabulation[0][2] = 1L; // i
		tabulation[0][3] = 1L; // o
		tabulation[0][4] = 1L; // u
		
		int modulo = (int) (Math.pow(10, 9) + 7);
		
		for(int i = 0; i < n-1; i++) {
			tabulation[i+1][0] += (tabulation[i][1] + tabulation[i][2] + tabulation[i][4]) % modulo; //add to next a row if e,i,u
			tabulation[i+1][1] += (tabulation[i][0] + tabulation[i][2]) % modulo; //add to next e row if a,i
			tabulation[i+1][2] += (tabulation[i][1] + tabulation[i][3]) % modulo; //add to next i row if e,o
			tabulation[i+1][3] += tabulation[i][2] % modulo; //add to next o row if i
			tabulation[i+1][4] += (tabulation[i][2] + tabulation[i][3]) % modulo; //add to next u row if i or o
		}
		
		long sum = 0L;
		sum += (tabulation[n-1][0] + tabulation[n-1][1] + tabulation[n-1][2] + tabulation[n-1][3] +
				tabulation[n-1][4]) % modulo;
		return (int) sum;
    }

}
