package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchInsertPositionTest {

	int[] nums1 = new int[] {1,3,5,6};
	
	
	@Test
	public void test() {
		assertEquals(2, SearchInsertPosition.searchInsert(nums1, 5));
		assertEquals(1, SearchInsertPosition.searchInsert(nums1, 2));
		assertEquals(4, SearchInsertPosition.searchInsert(nums1, 7));
		assertEquals(0, SearchInsertPosition.searchInsert(nums1, 0));
		assertEquals(0, SearchInsertPosition.searchInsert(nums1, 1));
		assertEquals(0, SearchInsertPosition.searchInsert(new int[] {1}, 1));
	}

}
