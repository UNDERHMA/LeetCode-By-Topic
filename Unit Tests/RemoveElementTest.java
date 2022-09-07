package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveElementTest {

	@Test
	public void test() {
		
		int[] array1 = new int[] {3,2,2,3};
		int[] array2 = new int[] {0,1,2,2,3,0,4,2};
		int[] array3 = new int[] {};
		int[] array4 = new int[] {1,1,1};
		
		//assertEquals(2, RemoveElement.removeElement(array1, 3));
		assertEquals(5, RemoveElement.removeElement(array2, 2));
		assertEquals(0, RemoveElement.removeElement(array3, 0));
		assertEquals(0, RemoveElement.removeElement(array4, 1));
	}

}
