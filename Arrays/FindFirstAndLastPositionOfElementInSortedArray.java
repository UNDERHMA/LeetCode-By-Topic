package leetcode.LeetCode.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
	public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        int min = -1;
        int max = -1;
        int[] result = new int[] {-1,-1};
         while(start <= end) {
            mid = start + ((end-start)/2);
            if (nums[mid] > target) {
                end = mid-1;
            }
            else if (nums[mid] < target){
                start = mid+1;
            }
            else {
                if(min == -1) {
                    min = mid;
                }
                if(max == -1) {
                    max = mid;
                }
                min = Math.min(min,searchRange(nums,target,start,mid-1,true));
                max = Math.max(max,searchRange(nums,target,mid+1,end,false));
                result[0] = min;
                result[1] = max;
                return result;
            }
        }
        return result;
    }
    
    // if min true, searchs for min index, else searches for max index
    public int searchRange(int[] nums, int target, int start, int end, boolean min) {
        
        int mid = 0;
        while(start <= end) {
            mid = start + ((end-start)/2);
            if (nums[mid] > target) {
                end = mid-1;
            }
            else if (nums[mid] < target){
                start = mid+1;
            }
            else {
                if(min) {
                    return Math.min(mid,searchRange(nums,target,start,mid-1,true));
                }
                else{
                    return Math.max(mid,searchRange(nums,target,mid+1,end,false));
                }
            }
        }
        if(min) {
            return Integer.MAX_VALUE;
        }
        return Integer.MIN_VALUE;
    }
}
