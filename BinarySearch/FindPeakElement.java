package leetcode.LeetCode.BinarySearch;

public class FindPeakElement {
	 public int findPeakElement(int[] nums) {
	        int start = 0;
	        int end = nums.length-1;
	        return findPeakElement(nums,start,end);
	    }
	    
	    public static int findPeakElement(int[] nums, int start, int end) {
	        int mid = start + ((end-start) / 2);
	        if(start > end || mid < 0 || mid >= nums.length) {
	            return -1;
	        }
	        else if((mid == nums.length-1 || nums[mid] > nums[mid+1]) &&
	                ( mid == 0 || nums[mid] > nums[mid-1])) {
	            return mid;
	        }
	        else {
	            int value1 = findPeakElement(nums,start,mid-1);
	            int value2 = findPeakElement(nums,mid+1,end);
	            if(value1 != -1) {
	                return value1;
	            }
	            else {
	                return value2;
	            }
	        }
	    }
}
