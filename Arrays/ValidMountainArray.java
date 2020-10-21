package leetcode.LeetCode.Arrays;

public class ValidMountainArray {
	public boolean validMountainArray(int[] A) {
        if(A.length < 3) {
            return false;
        }
        
        boolean increasing = true;
        for(int i = 0; i < A.length-1; i++) {
            if(A[i+1] < A[i]) {
                increasing = false;
                if(i == 0) {
                    return false;
                }
            }
            else if(!increasing && A[i+1] >= A[i]) {
                return false;
            }
            else if(A[i+1] == A[i]) {
                return false;
            }
        }
        if(increasing) {
            return false;
        }
        return true;
    }
}
