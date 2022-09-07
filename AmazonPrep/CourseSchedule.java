package AmazonPrep.AmazonPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {
	
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        
		if(prerequisites == null || numCourses < 1) return false;
		int prerequisitesLength = prerequisites.length;
		if(prerequisitesLength < 1) return true;
		Map<Integer, List<Integer>> nodesMap = new HashMap<>();

		
		List<Integer> currentNeighbors;
		for(int i = 0; i < prerequisitesLength; i++) {
			if(nodesMap.containsKey(prerequisites[i][1])) {
				currentNeighbors = nodesMap.get(prerequisites[i][1]);
				currentNeighbors.add(prerequisites[i][0]);
			}
			else {
				currentNeighbors = new ArrayList<Integer>();
				currentNeighbors.add(prerequisites[i][0]);
				nodesMap.put(prerequisites[i][1],currentNeighbors);
			}
		}
		
		int[] visited = new int[numCourses];
		for(Map.Entry<Integer, List<Integer>> entry : nodesMap.entrySet()) {
			currentNeighbors = entry.getValue();
			if(visited[entry.getKey()] == 1) continue;
			int newVisited[] = new int[numCourses];
			if(hasCycleInSubgraph(entry.getKey(),nodesMap,visited,numCourses,newVisited)) return false;
		}
		return true;
    }
	
	public boolean hasCycleInSubgraph(int i, Map<Integer, List<Integer>> nodesMap,
			int[] visited, int numCourses, int[] newVisited) {
		
		if(newVisited[i] == 1) return true; //base case
		if(visited[i] == 1) return false; //base case
		List<Integer> currentNeighbors = nodesMap.get(i);
		if(currentNeighbors == null) return false; //base case 2
		for(Integer integer : currentNeighbors) {
			newVisited[i] = 1;
			visited[i] = 1;
			if(hasCycleInSubgraph(integer,nodesMap,visited,numCourses,newVisited)) return true;
			newVisited[i] = 0;
		}
		return false;
	}
	
}
