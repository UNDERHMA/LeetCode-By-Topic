package leetcode.LeetCode.Graph.MST;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinCostToConnectAllPointsPrims {

	public int minCostConnectPoints(int[][] points) {
		
		int numberOfPoints = points.length;
		Queue<Edge> edgesPQ = new PriorityQueue<>((a,b) -> a.distance - b.distance);
		
		// add edges from 0 to queue
		for(int i = 1; i < numberOfPoints; i++) {
			int distance = Math.abs(points[0][0] - points[i][0]) +Math.abs(points[0][1] - points[i][1]);
			edgesPQ.add(new Edge(distance,0,i));
		}
		
		int totalDistance = 0;
		int edgesToAdd = numberOfPoints - 1;
		boolean[] visited = new boolean[numberOfPoints];
		visited[0] = true;
		//compute total distance by always selecting the minimum edge from the visited cut
		while(edgesToAdd > 0 && !edgesPQ.isEmpty()) {
			Edge currentEdge = edgesPQ.poll();
			int addedVertex = currentEdge.toVertex;
			if(!visited[addedVertex]) {
				totalDistance += currentEdge.distance;
				visited[addedVertex] = true;
				edgesToAdd--;
				int currentX = points[addedVertex][0];
				int currentY = points[addedVertex][1];
				for(int i = 0; i < numberOfPoints; i++) {
					if(!visited[i] && i != addedVertex) {
						int distance = Math.abs(currentX - points[i][0]) +Math.abs(currentY - points[i][1]);
						edgesPQ.add(new Edge(distance,addedVertex,i));
					}
				}
			}
		}
		return totalDistance;
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
