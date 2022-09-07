package leetcode.LeetCode.Graph.MST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinCostToConnectAllPoints {

	public int minCostConnectPoints(int[][] points) {
        
		int numberOfPoints = points.length;
		List<Edge> edgeAndDistance = new ArrayList<>();
		for(int i = 0; i < numberOfPoints-1; i++) {
			for(int j = i+1; j < numberOfPoints; j++) {
				int distance = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
				Edge edge = new Edge(i,j,distance);
				edgeAndDistance.add(edge);
			}
		}
		Collections.sort(edgeAndDistance);
		
		UnionFind unionFind = new UnionFind(numberOfPoints);
		int totalDistance = 0;
		int totalToConnect = numberOfPoints-1;
		while(totalToConnect > 0 && !edgeAndDistance.isEmpty()) {
			Edge edge = edgeAndDistance.remove(0);
			if(unionFind.union(edge.edge1,edge.edge2)) {
				totalDistance += edge.distance;
				totalToConnect--;
			}
		}
		return totalDistance;
    }
	
	private class Edge implements Comparable<Edge>{
		
		private int edge1;
		private int edge2;
		private int distance;
		
		public Edge(int edge1, int edge2, int distance) {
			this.edge1 = edge1;
			this.edge2 = edge2;
			this.distance = distance;
		}
		
		public int compareTo(Edge e) {
			return this.distance - e.distance;
		}
	}
	
	private class UnionFind {
		
		int[] rank;
		int[] root;
		
		public UnionFind(int n) {
			this.rank = new int[n];
			this.root = new int[n];
			for(int i = 0; i < n; i++) {
				rank[i] = i;
				root[i] = i;
			}
		}
		
		private int find(int n) {
			if(n == root[n]) {
				return n;
			}
			return find(root[n]);
		}
		
		private boolean union(int a, int b) {
			int rootA = find(a);
			int rootB = find(b);
			if(rootA == rootB) return false;
			if(rank[rootA] > rank[rootB]) {
				root[rootB] = rootA;
			} else if(rank[rootA] < rank[rootB]) {
				root[rootA] = rootB;
			} else {
				root[rootB] = rootA;
				rank[rootA]++;
			}
			return true;
		}
		
	}

}
