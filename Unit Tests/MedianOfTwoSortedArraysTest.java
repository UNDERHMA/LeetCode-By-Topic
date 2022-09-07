package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
	
	int[] input1nums1 = new int[] {1,3};
	int[] input1nums2 = new int[] {2};
	
	int[] input2nums1 = new int[] {1,2};
	int[] input2nums2 = new int[] {3,4};
	
	int[] input3nums1 = new int[] {0,0};
	int[] input3nums2 = new int[] {0,0};
	
	int[] input4nums1 = new int[] {1};
	int[] input4nums2 = new int[] {1};
	
	int[] input5nums1 = new int[] {2};
	int[] input5nums2 = new int[] {};

	int[] input6nums1 = new int[] {0,0,0,0,0};
	int[] input6nums2 = new int[] {-1,0,0,0,0,0,1};
	
	int[] input7nums1 = new int[] {2,3};
	int[] input7nums2 = new int[] {};
	
	int[] input8nums1 = new int[] {3};
	int[] input8nums2 = new int[] {-2,-1};
					
	int[] input9nums1 = new int[] {1,1,1};
	int[] input9nums2 = new int[] {1,1,1};
		
	int[] input10nums1 = new int[] {1};
	int[] input10nums2 = new int[] {2,3};
	
	int[] input11nums1 = new int[] {1,2,3,5};
	int[] input11nums2 = new int[] {4};
	
	MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
	
	@Test
	public void test() {
		assertEquals(3.00000,m.findMedianSortedArrays(input11nums1, input11nums2),.01);
		assertEquals(2.00000,m.findMedianSortedArrays(input10nums1, input10nums2),.01);
		assertEquals(1.00000,m.findMedianSortedArrays(input9nums1, input9nums2),.01);
		assertEquals(-1.00000,m.findMedianSortedArrays(input8nums1, input8nums2),.01);
		assertEquals(2.50000,m.findMedianSortedArrays(input7nums1, input7nums2),.01);
		assertEquals(0.00000,m.findMedianSortedArrays(input6nums1, input6nums2),.01);
		assertEquals(2.00000,m.findMedianSortedArrays(input1nums1, input1nums2),.01);
		assertEquals(2.50000,m.findMedianSortedArrays(input2nums1, input2nums2),.01);
		assertEquals(0.00000,m.findMedianSortedArrays(input3nums1, input3nums2),.01);
		assertEquals(1.00000,m.findMedianSortedArrays(input4nums1, input4nums2),.01);
		assertEquals(2.00000,m.findMedianSortedArrays(input5nums1, input5nums2),.01);
	}

}
