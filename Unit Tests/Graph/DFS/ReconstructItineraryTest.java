package leetcode.LeetCode.Graph.DFS;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ReconstructItineraryTest {

	@Test
	public void test() {
		List<List<String>> input = Arrays.asList(Arrays.asList("EZE","AXA"), Arrays.asList("TIA","ANU"), 
				Arrays.asList("ANU","JFK"), Arrays.asList("JFK","ANU"), Arrays.asList("ANU","EZE"), 
				Arrays.asList("TIA","ANU"), Arrays.asList("AXA","TIA"), Arrays.asList("TIA","JFK"), 
				Arrays.asList("ANU","TIA"), Arrays.asList("JFK","TIA"));
		
		List<String> answer = Arrays.asList("JFK","ANU","EZE","AXA","TIA","ANU","JFK","TIA","ANU","TIA","JFK");
		ReconstructItinerary r = new ReconstructItinerary();
		
		assertEquals(answer, r.findItinerary(input));
	}

}
