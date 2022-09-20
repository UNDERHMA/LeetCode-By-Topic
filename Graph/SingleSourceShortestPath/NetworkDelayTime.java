package leetcode.LeetCode.Graph.SingleSourceShortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class NetworkDelayTime {

	public int networkDelayTime(int[][] times, int n, int k) {
        
		if(n < 2 ) return 0;
		int timesLength = times.length;
		
		//initialize Edge map to organize edges as objects within a map
		Map<Integer,List<Edge>> edgeMap = new HashMap<>();
		for(int i = 0; i < timesLength; i++) {
			edgeMap.putIfAbsent(times[i][0], new ArrayList<>());
			edgeMap.get(times[i][0]).add(new Edge(times[i][2],times[i][0],times[i][1]));
		}
		
		//initialize Priority Queue and add edges from source
		Queue<Edge> priorityQueue = new PriorityQueue<>((a,b) -> a.distance - b.distance);
		List<Edge> edgeList = edgeMap.get(k);
		if(edgeList == null) return -1;
		for(Edge e : edgeList) {
			priorityQueue.add(e);
		}
		
		//BFS according to Dijkstra's to find single shortest path, keeping track of minimum to vertices
		int[] minimums = new int[n];
		Arrays.fill(minimums, Integer.MAX_VALUE);
		minimums[k-1] = 0;
		int edgesAdded = 0;
		while(!priorityQueue.isEmpty() && edgesAdded < n - 1) {
			Edge currentEdge = priorityQueue.poll();
			int toVertex = currentEdge.toVertex;
			int fromVertex = currentEdge.fromVertex;
			int distance = currentEdge.distance + minimums[fromVertex-1];
			if(minimums[toVertex-1] > distance) {
				minimums[toVertex-1] = distance;
				edgeList = edgeMap.get(toVertex);
				if(edgeList == null) continue;
				for(Edge e : edgeList) {
					priorityQueue.add(e);
				}
			}
		}
		
		//Return maximum from minimum array
		int maximum = -1;
		for(int i : minimums) {
			maximum = Math.max(maximum, i);
		}
		if(maximum == Integer.MAX_VALUE) return -1;
		return maximum;
    }
	
	private class Edge {
		
		private int distance;
		private int fromVertex;
		private int toVertex;
		
		public Edge(int distance, int fromVertex, int toVertex) {
			this.distance = distance;
			this.fromVertex = fromVertex;
			this.toVertex = toVertex;
		}
		
	}

}
