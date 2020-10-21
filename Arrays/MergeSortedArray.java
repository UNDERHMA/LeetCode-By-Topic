package leetcode.LeetCode.Arrays;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pointer = m-1;
        int nums2Pointer = n-1;
        int fillPointerFromBack = nums1.length-1;
        
        while(nums2Pointer >= 0 || nums1Pointer >= 0) {
            if(nums2Pointer < 0) {
                nums1[fillPointerFromBack] = nums1[nums1Pointer];
                fillPointerFromBack--;
                nums1Pointer--;
            }
            else if(nums1Pointer < 0) {
                nums1[fillPointerFromBack] = nums2[nums2Pointer];
                fillPointerFromBack--;
                nums2Pointer--;
            }
            else if(nums1[nums1Pointer] <= nums2[nums2Pointer]) {
                nums1[fillPointerFromBack] = nums2[nums2Pointer];
                fillPointerFromBack--;
                nums2Pointer--;
            }
            else{
                nums1[fillPointerFromBack] = nums1[nums1Pointer];
                fillPointerFromBack--;
                nums1Pointer--;
            }
        }
    }
}
