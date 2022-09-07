package leetcode.LeetCode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {
	
	@Test
	public void test() {
		int[] array = new int[] {0,0,1,1,1,2,2,3,3,4};
		int[] array1 = new int[] {};
		int[] array2 = new int[] {0,1};
		
		assertEquals(5, RemoveDuplicatesFromSortedArray.removeDuplicates(array));
		assertEquals(0, RemoveDuplicatesFromSortedArray.removeDuplicates(array1));
		assertEquals(2, RemoveDuplicatesFromSortedArray.removeDuplicates(array2));
	}

}
