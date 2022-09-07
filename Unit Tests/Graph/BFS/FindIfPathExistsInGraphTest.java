package leetcode.LeetCode.Graph.BFS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindIfPathExistsInGraphTest {

	@Test
	void test() {
		int[][] input = new int[][] {{0,7},{0,8},{6,1},{2,0},{0,4},{5,8},{4,7},{1,3},{3,5},{6,5}};
		
		FindIfPathExistsInGraph f = new FindIfPathExistsInGraph();
		assertEquals(true,f.validPath(10, input, 7, 5));
	}

}
