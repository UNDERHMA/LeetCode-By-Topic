package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainerWithMostWaterIITest {

	int[] input1 = new int[] {1,8,6,2,5,4,8,3,7};
	int[] input2 = new int[] {1,2,1};
	int[] input3 = new int[] {1,1};
	int[] input4 = new int[] {1,2,3,4};
	
	ContainerWithMostWaterII c = new ContainerWithMostWaterII();
	
	@Test
	public void test() {
		assertEquals(4,c.maxArea(input4));
		assertEquals(1,c.maxArea(input3));
		assertEquals(2,c.maxArea(input2));
		assertEquals(49,c.maxArea(input1));
	}

}
