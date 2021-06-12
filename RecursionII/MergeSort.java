package leetcode.LeetCode.RecursionII;

public class MergeSort {
		
	public int[] sortArray(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return nums;
        sortArray(nums,0,nums.length-1);
        return nums;
    }
	
	public int[] sortArray(int[] nums, int start, int end) {
        if(start >= end) return nums;
        int mid = start + ((end-start)/2);
        sortArray(nums,start,mid);
        sortArray(nums,mid+1,end);
        mergeArray(nums,start,end);
        return nums;
    }
	
	public void mergeArray(int[] nums, int start, int end) {
		// create temp array for copying and fill it with the current window's data
		int[] temp = new int[(end-start)+1];
		for(int i = start; i <= end; i++) {
			temp[i-start] = nums[i];
		}
		/* go through original array and pick next smallest values based on two
		pointers to temp which point to the smallest non-used element in each half
		of the temp array */
		int pointer1 = 0;
		int pointer2 = (temp.length/2) + (temp.length%2);
		for(int i = start; i <= end; i++) {
			if(pointer2 > (end-start)) {
				nums[i] = temp[pointer1];
				pointer1++;
			}
			else if(pointer1 > ((temp.length-1)/2)){
				nums[i] = temp[pointer2];
				pointer2++;
			}
			else if(temp[pointer1] < temp[pointer2]) {
				nums[i] = temp[pointer1];
				pointer1++;
			}
			else {
				nums[i] = temp[pointer2];
				pointer2++;
			}
		}
	}
}
