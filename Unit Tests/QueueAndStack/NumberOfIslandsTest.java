package leetcode.LeetCode.QueueAndStack;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfIslandsTest {

	char[][] input1 = new char[][]  {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
	char[][] input2 = new char[][]  {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
	char[][] input3 = new char[][] {{'1','1','1'},{'0','1','0'},{'1','1','1'}};
	
	@Test
	public void test() {
		assertEquals(3,NumberOfIslands.numIslands(input1));
		assertEquals(1,NumberOfIslands.numIslands(input2));
		assertEquals(1,NumberOfIslands.numIslands(input3));
	}

}
