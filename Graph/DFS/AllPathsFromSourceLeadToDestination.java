package leetcode.LeetCode.Graph.DFS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AllPathsFromSourceLeadToDestination {

	public boolean leadsToDestination(int n, int[][] edges, int source, int destination) {
        
		if(source == destination && edges.length == 0 && n > 0) return true;
		if(edges.length == 0 || n == 0) return false;
		Map<Integer,Set<Integer>> graph = new HashMap<>();
		
		for(int[] i : edges) {
			graph.putIfAbsent(i[0], new HashSet<>());
			graph.get(i[0]).add(i[1]);
		}
		
		if(graph.get(destination) != null) return false;
		
		Set<Integer> visited = new HashSet<>();
        visited.add(source);
		return depthFirstSearch(source,visited,destination,graph);
    }
	
	private boolean depthFirstSearch(int currentNode,Set<Integer> visited,int destination, Map<Integer,Set<Integer>> graph) {
		
		if(currentNode == destination) return true;
		Set<Integer> currentNeighbors = graph.get(currentNode);
		if(currentNeighbors == null) return false;
		visited.add(currentNode);
		
		for(Integer i : currentNeighbors) {
			if(visited.contains(i)) return false;
			else {
				boolean result = depthFirstSearch(i,visited,destination,graph);
				if(!result) return false;
			}
		}
		visited.remove(currentNode);
		return true;
	}
}
	

