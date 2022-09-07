package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestRectangleInHistogramTest {

	int[] input1 = new int[] {2,1,2};
	int[] input2 = new int[] {2,1,5,6,2,3};
	int[] input3 = new int[] {4,2,0,3,2,4,3,4};
	
	LargestRectangleInHistogram l = new LargestRectangleInHistogram();
	
	@Test
	public void test() {
		assertEquals(10,l.largestRectangleArea(input3));
		assertEquals(3,l.largestRectangleArea(input1));
		assertEquals(10,l.largestRectangleArea(input2));
	}

}
