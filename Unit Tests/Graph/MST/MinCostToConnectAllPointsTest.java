package leetcode.LeetCode.Graph.MST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinCostToConnectAllPointsTest {

	@Test
	void test() {
		int[][] points = new int[][] {{2,-3},{-17,-8},{13,8},{-17,-15}};
		
		MinCostToConnectAllPoints m = new MinCostToConnectAllPoints();
		assertEquals(53,m.minCostConnectPoints(points));
	}

}
