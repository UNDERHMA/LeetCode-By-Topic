package leetcode.LeetCode.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindKClosestElements {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        int foundIndex = -1;
        
        while(start <= end) {
            mid = start + ((end-start)/2);
            if(arr[mid] == x) {
                foundIndex = mid;
                break;
            }
            else if(arr[mid] > x) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        
        
        int minimumDifferenceIndex = mid;
        if(foundIndex == -1) {
            int minimumDifference = Math.abs(arr[mid]-x);
            if(mid-1 >= 0) {
                if(minimumDifference >= Math.abs(arr[mid-1]-x)) {
                    minimumDifference = Math.abs(arr[mid-1]-x);
                    minimumDifferenceIndex = mid-1;
                }
            }
            if(mid+1 < arr.length) {
                if(minimumDifference > Math.abs(arr[mid+1]-x)) {
                    minimumDifference = Math.abs(arr[mid+1]-x);
                    minimumDifferenceIndex = mid+1;
                }
            }
        }
        
        foundIndex = minimumDifferenceIndex;
        int largerPointer = foundIndex + 1;
        int smallerPointer = foundIndex - 1;
        
        List<Integer> result = new ArrayList<>();
        result.add(arr[foundIndex]);
        
        for(int i = k-1; i > 0; i--) {
            if(largerPointer >= arr.length) {
                result.add(arr[smallerPointer]);
                smallerPointer--;
            }
            else if(smallerPointer < 0) {
                result.add(arr[largerPointer]);
                largerPointer++;
            }
            else {
	            if(Math.abs((x - arr[largerPointer])) < Math.abs((x - arr[smallerPointer]))) {
	                result.add(arr[largerPointer]);
	                largerPointer++;
	            }
	            else{
	                result.add(arr[smallerPointer]);
	                smallerPointer--;
	            }
	        }
        }
        Collections.sort(result);
        return result;
    }
}
