package leetcode.LeetCode.Graph.BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReconstructItinerary {
	
	Map<String,GraphNode> locations;
	List<String> result;
	Map<String,Integer> visited;
	
	public List<String> findItinerary(List<List<String>> tickets) {
        
		result = new ArrayList<>();
		if(tickets == null || tickets.size() == 0) return result;
		
		//Create Graph Nodes
		locations = new HashMap<>();
		visited = new HashMap<>();
		GraphNode currentLocation;
		for(List<String> trips : tickets) {
			if(locations.containsKey(trips.get(0))) currentLocation = locations.get(trips.get(0));
			else currentLocation = new GraphNode(trips.get(0));
			currentLocation.destinations.add(trips.get(1));
			locations.put(currentLocation.name,currentLocation);
			if(!locations.containsKey(trips.get(1)))  locations.put(trips.get(1),new GraphNode(trips.get(1)));
			if(visited.containsKey(trips.get(0) + trips.get(1))) {
				visited.put(trips.get(0) + trips.get(1),visited.get(trips.get(0) + trips.get(1))+1);
			} else {
				visited.put(trips.get(0) + trips.get(1),1);
			}
		}
		
		//Sort Graph Nodes lexicographically
		for(Map.Entry<String, GraphNode> entry : locations.entrySet()) {
			currentLocation = entry.getValue();
			Collections.sort(currentLocation.destinations);
		}
		
		if(!locations.containsKey("JFK")) return result;
		result.add("JFK");
		
		depthFirstSearch(locations.get("JFK"),tickets.size()+1);
		return result;
    }
	
	private boolean depthFirstSearch(GraphNode currentLocation, int totalTicketNumber) {
		
		if(result.size() == totalTicketNumber) return true;
		
		for(String destination: currentLocation.destinations) {
			if(visited.get(currentLocation.name + destination) > 0) {
				result.add(destination);
				visited.put(currentLocation.name + destination,visited.get(currentLocation.name + destination)-1);
				if(depthFirstSearch(locations.get(destination),totalTicketNumber)) return true;
				result.remove(result.size()-1);
				visited.put(currentLocation.name + destination,visited.get(currentLocation.name + destination)+1);
			}
		}
		return false;
	}
	
	private class GraphNode {

		private String name;
		private List<String> destinations;
		
		public GraphNode(String name) {
			this.name = name;
			this.destinations = new ArrayList<>();
		}
		
		
	}

}
