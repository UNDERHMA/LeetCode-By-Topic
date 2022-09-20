package leetcode.LeetCode.Graph.SingleSourceShortestPath;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CheapestFlightsWithinKStops {
	
	//SPFA - Bellman Ford optimized with a queue
	
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
		Map<Integer,List<int[]>> flightMap = new HashMap<>();
		for(int[] flight: flights) {
			flightMap.putIfAbsent(flight[0], new ArrayList<>());
			int[] destAndPriceArray = new int[] {flight[1],flight[2]};
			flightMap.get(flight[0]).add(destAndPriceArray);
		}
		
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(src);
		int edges = 0;
		int[] previous = new int[n];
		Arrays.fill(previous, Integer.MAX_VALUE);
		int[] current = Arrays.copyOf(previous, n);
		while(!queue.isEmpty() && edges < k+1) {
			int queueSize = queue.size();
			for(int i = 0; i < queueSize; i++) {
				int currentVertex = queue.poll();
				List<int[]> currentEdgeDetails = flightMap.get(currentVertex);
				if(currentEdgeDetails != null) {
					for(int[] array : currentEdgeDetails) {
						//calculate the minimum distance value for the current array
						int distance =  previous[currentVertex] == Integer.MAX_VALUE ? 0 + array[1]
								: array[1] + previous[currentVertex];
						if(distance < current[array[0]]) {
							current[array[0]] = distance;
							queue.add(array[0]);
						}
					}
				}
			}
			edges++;
			if(Arrays.equals(previous, current)) break;
			previous = Arrays.copyOf(current, n);
		}
		
		if(current[dst] != Integer.MAX_VALUE) return current[dst];
		return -1;
    }

}
