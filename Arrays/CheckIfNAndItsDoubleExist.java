package leetcode.LeetCode.Arrays;

import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {
public boolean checkIfExist(int[] arr) {
        
        Arrays.sort(arr);
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            j = arr[i] * 2;
            if(binarySearch(arr,j,i)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean binarySearch(int[] arr, int searchValue, int originalIndex) {
        int startIndex = 0;
        int endIndex = arr.length-1;
        int mid;
        while(startIndex <= endIndex){
            mid = startIndex + ((endIndex-startIndex)/2);
            if(arr[mid] == searchValue) {
                if(mid == originalIndex) {
                    if(mid+1 <= endIndex && arr[mid+1] == searchValue) {
                        return true;
                    }
                    else if(mid-1 >= startIndex && arr[mid-1] == searchValue) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else{
                    return true;
                }
            }
            else if(arr[mid] > searchValue) {
                endIndex = mid - 1;
            }
            else {
                startIndex = mid+1;
            }
        }
        return false;
    }
}
