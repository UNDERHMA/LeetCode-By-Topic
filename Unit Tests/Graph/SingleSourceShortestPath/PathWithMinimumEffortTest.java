package leetcode.LeetCode.Graph.SingleSourceShortestPath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PathWithMinimumEffortTest {

	@Test
	void test() {
		int[][] heights = new int[][] {{1,2,2},{3,8,2},{5,3,5}};
		int[][] heights2 = new int[][] {{1,10,6,7,9,10,4,9}};

		
		PathWithMinimumEffort p = new PathWithMinimumEffort();
		assertEquals(9,p.minimumEffortPath(heights2));
		assertEquals(2,p.minimumEffortPath(heights));
		
	}

}
