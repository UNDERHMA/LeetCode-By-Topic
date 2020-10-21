package leetcode.LeetCode.Arrays;

public class FindNumbersWithEvenNumberOfDigits {
	public int findNumbers(int[] nums) {
        
        int evenCount = 0;
        
        for(int i : nums) {
            if(String.valueOf(i).length() % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}
