package leetcode.LeetCode.DynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumCostForTicketsTest {

	@Test
	void test() {
		int[] days = new int[] {1,4,6,7,8,20};
		int[] costs = new int[] {7,2,15};
	
		MinimumCostForTickets m = new MinimumCostForTickets();
		assertEquals(6,m.mincostTickets(days, costs));
		
	}

}
