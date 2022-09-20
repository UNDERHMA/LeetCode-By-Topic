package leetcode.LeetCode.DynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaintHouseIIITest {

	@Test
	void test() {
		int[] houses = new int[] {0,0,0,0,0};
		int[][] costs = new int[][] {{1,10},{10,1},{10,1},{1,10},{5,1}};
		int[] houses2 = new int[] {0,2,1,2,0};
		int[][] costs2 = new int[][] {{1,10},{10,1},{10,1},{1,10},{5,1}};
		int[] houses3 = new int[] {3,1,2,3};
		int[][] costs3 = new int[][] {{1,1,1},{1,1,1},{1,1,1},{1,1,1}};
		int[] houses4 = new int[] {0,0,0,1};
		int[][] costs4 = new int[][] {{1,5},{4,1},{1,3},{4,4}};
		
		PaintHouseIII p = new PaintHouseIII();
		assertEquals(12,p.minCost(houses4, costs4, 4, 2, 4));
		assertEquals(-1,p.minCost(houses3, costs3, 4, 3, 3));
		assertEquals(9,p.minCost(houses, costs, 5, 2, 3));
		assertEquals(11,p.minCost(houses2, costs2, 5, 2, 3));
	}

}
