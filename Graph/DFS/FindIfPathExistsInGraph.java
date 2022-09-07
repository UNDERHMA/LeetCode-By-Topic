package leetcode.LeetCode.Graph.DFS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindIfPathExistsInGraph {

	public boolean validPath(int n, int[][] edges, int source, int destination) {
        
		if(source < n && source == destination) return true;
		if(edges == null || edges.length == 0) return false;
		
		Map<Integer,GraphNode> graphNodes = new HashMap<>();
		GraphNode currentGraphNode;
		// construct Graph and store nodes in graphNodes map
		for(int i = 0; i < n; i++) {
			graphNodes.put(i, new GraphNode(i));
		}
		for(int[] array: edges) {
			currentGraphNode = graphNodes.get(array[0]);
			currentGraphNode.neighbors.add(graphNodes.get(array[1]));
			currentGraphNode = graphNodes.get(array[1]);
			currentGraphNode.neighbors.add(graphNodes.get(array[0]));
		}
		return depthFirstSearch(graphNodes.get(source),graphNodes,destination,new HashSet<Integer>());	
    }

	private boolean depthFirstSearch(GraphNode currentNode,Map<Integer,GraphNode> graphNodes, 
										int destination, Set<Integer> visited) {
		
		if(destination == currentNode.val) return true;
		visited.add(currentNode.val);
		
		for(GraphNode g : currentNode.neighbors) {
			if(visited.contains(g.val)) continue;
			if(depthFirstSearch(g,graphNodes,destination,visited)) return true;	
		}
		return false;
	}
	
	private class GraphNode {
		
		private int val;
		private Set<GraphNode> neighbors;
		
		
		public GraphNode(int val) {
			this.val = val;
			this.neighbors = new HashSet<>();
		}
		
		
	}
}
