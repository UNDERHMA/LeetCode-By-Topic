package leetcode.LeetCode.Arrays;

import java.util.Arrays;

public class HeightChecker {
	public int heightChecker(int[] heights) {
        
        int studentsWhoNeedToMove = 0;
        int[] copy = new int[heights.length];
        
        for(int i = 0; i < heights.length; i++) {
            copy[i] = heights[i];
        }
        Arrays.sort(copy);
        for(int i = 0; i < heights.length; i++) {
            if(copy[i] != heights[i]){
                studentsWhoNeedToMove++;
            }
        }
        return studentsWhoNeedToMove;
    }
}
