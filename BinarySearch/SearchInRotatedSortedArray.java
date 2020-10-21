package leetcode.LeetCode.BinarySearch;

public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
        
        int pivot = -1;
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                pivot = i;
            }
        }
        
        int start = 0;
        int end = pivot;
        int mid = 0;
        
        if(end == -1) {
            end = nums.length-1;
        }
        
        while (start <= end) {
            mid = (start + end) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        
        if(pivot != -1) {
            start = pivot+1;
            end = nums.length-1;
            while (start <= end) {
                mid = (start + end) / 2;
                if(nums[mid] == target) {
                    return mid;
                }
                else if(nums[mid] > target) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;   
    }
}
