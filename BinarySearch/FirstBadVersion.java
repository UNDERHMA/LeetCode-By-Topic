package leetcode.LeetCode.BinarySearch;

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class FirstBadVersion {
	public int firstBadVersion(int n) {     
        
        int start = 1;
        int end = n;
        int currentVersionToCall = 0;
        int result = -1;
        
        while (start < end) {
            currentVersionToCall = start + ((end - start)  / 2);
            if(isBadVersion(currentVersionToCall)) {
                result = currentVersionToCall;
                end = currentVersionToCall;
            }
            else {
                start = currentVersionToCall+1;
            }
        }
        
        if(isBadVersion(start)) {
            return start;
        }
        return result;
    }
}	
