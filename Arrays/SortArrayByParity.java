package leetcode.LeetCode.Arrays;

public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {
        
        int evenPointer = 0;
        int oddPointer = 0;
        int[] answer = new int[A.length];
        
        for(int i = 0 ; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                answer[evenPointer++] = A[i];
            }
        }
        for(int i = 0 ; i < A.length; i++) {
            if(A[i] % 2 != 0) {
                answer[evenPointer + oddPointer++] = A[i];
            }
        }
        return answer;
    }
}
