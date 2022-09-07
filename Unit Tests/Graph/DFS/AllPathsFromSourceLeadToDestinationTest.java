package leetcode.LeetCode.Graph.DFS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllPathsFromSourceLeadToDestinationTest {

	@Test
	void test() {
		int [][] input = {{0,1},{0,2},{0,3},{0,3},{1,2},{1,3},{1,4},{2,3},{2,4},{3,4}};
		AllPathsFromSourceLeadToDestination a = new AllPathsFromSourceLeadToDestination();
		
		assertEquals(true,a.leadsToDestination(5, input, 0, 4));
	}

}
