package leetcode.LeetCode.Graph.SingleSourceShortestPath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheapestFlightsWithinKStopsTest {

	@Test
	void test() {
		
		int[][] flights = new int[][] {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
		int[][] flights1 = new int[][] {{0,1,100},{1,2,100},{0,2,500}};
		int[][] flights2 = new int[][] {{0,1,5},{1,2,5},{0,3,2},{3,1,2},{1,4,1},{4,2,1}};
		int[][] flights3 = new int[][] {{0,3,3},{3,4,3},{4,1,3},{0,5,1},{5,1,100},{0,6,2},{6,1,100},{0,7,1},{7,8,1},{8,9,1},{9,1,1},{1,10,1},{10,2,1},{1,2,100}};
		
		
		CheapestFlightsWithinKStops c = new CheapestFlightsWithinKStops();
		assertEquals(11,c.findCheapestPrice(11, flights3, 0, 2, 4));
		assertEquals(7,c.findCheapestPrice(5, flights2, 0, 2, 2));
		assertEquals(200,c.findCheapestPrice(3, flights1, 0, 2, 1));
		assertEquals(700,c.findCheapestPrice(4, flights, 0, 3, 1));
	}

}
