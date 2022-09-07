package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchInRotatedSortedArrayIITest {

	int[] inputArray = new int[] {2,5,6,0,0,1,2};
	int[] inputArray2 = new int[] {1,0,1,1,1};
	int[] inputArray3 = new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
	int[] inputArray4 = new int[] {1,1};
	int[] inputArray5 = new int[] {3,1};
	int[] inputArray6 = new int[] {4,5,6,7,0,1,2};
	int[] inputArray7 = new int[] {2,3,0,0};
	int[] inputArray8 = new int[] {15,16,19,20,25,1,3,4,5,7,10,14};
	int target1 = 0;
	int target2 = 3;
	int target3 = 2;
	int target4 = 1;
	int target5 = 25;
	
	SearchInRotatedSortedArrayII s = new SearchInRotatedSortedArrayII();
	
	@Test
	public void test() {
		assertTrue(s.search(inputArray8, target5));
		assertTrue(s.search(inputArray7, target1));
		assertTrue(s.search(inputArray6, target1));
		assertTrue(s.search(inputArray, target1));
		assertFalse(s.search(inputArray, target2));
		assertTrue(s.search(inputArray2, target1));
		assertTrue(s.search(inputArray3, target3));
		assertTrue(s.search(inputArray5, target4));
		assertFalse(s.search(inputArray4, target1));
	}

}
