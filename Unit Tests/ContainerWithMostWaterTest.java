package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainerWithMostWaterTest {

	int[] a1 = new int[] {1,8,6,2,5,4,8,3,7};
	int[] a2 = new int[] {1,8};
	int[] a3 = new int[] {1,8,6,2,523,432,8,3,7};
	
	@Test
	public void test() {
		assertEquals(49, ContainerWithMostWater.maxArea(a1));
		assertEquals(1, ContainerWithMostWater.maxArea(a2));
		assertEquals(432, ContainerWithMostWater.maxArea(a3));
	}

}
