package leetcode.LeetCode.DynamicProgramming;

public class DominoAndTrominoTiling {
	
	public int numTilings(int n) {
	        
	       if(n == 1) return 1;
	       if(n == 2) return 2;
	       int modulo = (int) (Math.pow(10, 9) + 7);
	       long[] memoFull = new long[n+1];
	       long[] memoPartial = new long[n+1];
	       memoFull[1] = 1;
	       memoFull[2] = 2;
	       memoPartial[1] = 0;
	       memoPartial[2] = 1;
	        
	       for(int i = 3; i <= n; i++){
	          memoFull[i] = (memoFull[i-1] + memoFull[i-2] + (2 * memoPartial[i-1])) % modulo;
	          memoPartial[i] = (memoPartial[i-1] + memoFull[i-2]) % modulo;
	       }
	       return (int) memoFull[n];		
    }

}
