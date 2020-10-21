package leetcode.LeetCode.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
	public int[] replaceElements(int[] arr) {
        
        int cachedLargestIndex = 0;
        int cachedLargestValue = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length-1; i++) {
            if(cachedLargestIndex > i) {
                arr[i] = cachedLargestValue;
            }
            else { 
                cachedLargestValue = Integer.MIN_VALUE;
                for(int j = i+1; j < arr.length; j++) {
                    if(arr[j] > cachedLargestValue) {
                        cachedLargestValue = arr[j];
                        cachedLargestIndex = j;
                    }
                }
                arr[i] = cachedLargestValue;
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
