package leetcode.LeetCode.Graph;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.LeetCode.Graph.UnionFind.NumberOfProvinces;

public class NumberOfProvincesTest {

	@Test
	public void test() {
		int[][] input = new int[][] {{1,1,0},{1,1,0},{0,0,1}};
		int[][] input2 = new int[][] {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
		int[][] input3 = new int[][] {{1,1,0,0,0,0,0,1,0,1},{1,1,0,0,0,0,0,0,0,0},{0,0,1,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,0,0,0},{0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0},{0,0,1,0,0,0,1,1,0,0},{1,0,0,0,0,0,1,1,0,0},{0,0,0,0,0,0,0,0,1,1},{1,0,0,0,0,0,0,0,1,1}};
		
		NumberOfProvinces n = new NumberOfProvinces();
		
		assertEquals(4,n.findCircleNum(input3));
		assertEquals(2,n.findCircleNum(input));
		assertEquals(1,n.findCircleNum(input2));
		
	}

}
