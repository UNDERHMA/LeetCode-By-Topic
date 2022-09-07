package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniquePathsIITest {

	int[][] input1 = new int[][] {{0,0,0},{0,1,0},{0,0,0}};
	int[][] input2 = new int[][] {{0,1},{0,0}};
	int[][] input3 = new int[][] {{}};
	int[][] input4 = new int[][] {{1}};
	int[][] input5 = new int[][] {{1,0,0},{0,1,0},{0,0,0}};
	
	@Test
	public void test() {
		UniquePathsII up = new UniquePathsII();
		assertEquals(2,up.uniquePathsWithObstacles(input1));
		assertEquals(1,up.uniquePathsWithObstacles(input2));
		assertEquals(0,up.uniquePathsWithObstacles(input3));
		assertEquals(0,up.uniquePathsWithObstacles(input4));
		assertEquals(0,up.uniquePathsWithObstacles(input5));
	}

}
