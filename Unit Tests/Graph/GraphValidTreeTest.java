package leetcode.LeetCode.Graph;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.LeetCode.Graph.UnionFind.GraphValidTree;

public class GraphValidTreeTest {

	@Test
	public void test() {
		int[][] input1 = new int[][] {{0,1},{0,2},{0,3},{1,4}};
		int[][] input2 = new int[][] {{}};
		int[][] input3 = new int[][] {};
		
		GraphValidTree g = new GraphValidTree();
		assertEquals(true,g.validTree(5, input1));
		assertEquals(true,g.validTree(1, input2));
		assertEquals(true,g.validTree(1, input3));
	}

}
