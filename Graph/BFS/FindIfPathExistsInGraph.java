package leetcode.LeetCode.Graph.BFS;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class FindIfPathExistsInGraph {

	 public boolean validPath(int n, int[][] edges, int source, int destination) {
		 
		 if(source == destination) return true;
		 if(n == 0 || edges == null) return false;
		 
		 Map<Integer,Set<Integer>> nodes = new HashMap<>();
		 
		 for(int[] e : edges) {
			 nodes.putIfAbsent(e[0], new HashSet<>());
			 nodes.get(e[0]).add(e[1]);
			 nodes.putIfAbsent(e[1], new HashSet<>());
			 nodes.get(e[1]).add(e[0]);
		 }
		 
		 Queue<Integer> queue = new ArrayDeque<>();
		 queue.add(source);
		 Set<Integer> currentNeighbors;
		 boolean[] visited = new boolean[n];
		 while(!queue.isEmpty()) {
			 currentNeighbors = nodes.get(queue.poll());
			 if(currentNeighbors == null) continue;
			 for(int i : currentNeighbors) {
				 if(i == destination) return true;
				 if(visited[i] == false) {
					 queue.add(i);
					 visited[i] = true;
				 }
			 }
		 }
		 return false;
	 }
}
