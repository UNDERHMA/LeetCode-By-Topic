package leetcode.LeetCode.Graph.BFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllPathsFromSourceToTarget {

	private List<List<Integer>> results;
	
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
		results = new ArrayList<List<Integer>>();
		if(graph == null || graph.length == 0 || graph[0].length == 0) return results;
		List<Integer> currentResult = new ArrayList<>();
		currentResult.add(0);
		Set<Integer> visited = new HashSet<>();		
		int destination = graph.length-1;
		depthFirstSearch(currentResult,visited,graph,destination);
		return results;
    }
	
	private void depthFirstSearch(List<Integer> currentResult,Set<Integer> visited, int[][] graph, int destination) {
		
		if(currentResult.get(currentResult.size()-1) == destination) {
			results.add(new ArrayList<>(currentResult));
			return;
		}
		int[] currentArray = graph[currentResult.get(currentResult.size()-1)];
		for(int i : currentArray) {
			if(!visited.contains(i)) {
				currentResult.add(i);
				visited.add(i);
				depthFirstSearch(currentResult,visited,graph,destination);
				currentResult.remove(currentResult.size()-1);
				visited.remove(i);
			}
		}
	}

}
