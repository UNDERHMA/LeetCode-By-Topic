package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormArrayByConcatenatingSubarraysOfAnotherArrayTest {

	int[][] groups1 = new int[][] {{1,-1,-1},{3,-2,0}};
	int[] nums1 = new int[] {1,-1,0,1,-1,-1,3,-2,0};
	
	int[][] groups2 = new int[][] {{10,-2},{1,2,3,4}};
	int[] nums2 = new int[] {1,2,3,4,10,-2};
	
	int[][] groups3 = new int[][] {{1,2,3},{3,4}};
	int[] nums3 = new int[] {7,7,1,2,3,4,7,7};
	
	FormArrayByConcatenatingSubarraysOfAnotherArray f = new FormArrayByConcatenatingSubarraysOfAnotherArray();
	
	@Test
	public void test() {
		assertEquals(true, f.canChoose(groups1, nums1));
		assertEquals(false, f.canChoose(groups2, nums2));
		assertEquals(false, f.canChoose(groups3, nums3));
	}

}
