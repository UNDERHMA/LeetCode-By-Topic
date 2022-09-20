package leetcode.LeetCode.Graph.TopologicalSort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MinimumHeightTrees {

	
	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		
		// Create TreeNode Map and initial 0 - n-1
		Map<Integer,TreeNode> treeNodeMap = new HashMap<>();
		for(int i = 0; i < n; i++) {
			treeNodeMap.put(i,new TreeNode(i));
		}
		
		// Add edges to TreeNode Map
		for(int[] e : edges) {
			treeNodeMap.get(e[0]).connectedNodes.add(e[1]);
			treeNodeMap.get(e[1]).connectedNodes.add(e[0]);
		}
		
		// Initialize Queue for BFS and add leaf nodes (1 edge). Also initialize set of nodes to keep track of nodes uses.
		Queue<TreeNode> queue = new ArrayDeque<>();
		Set<Integer> nodesNotUsed = new HashSet<>();
		for(Map.Entry<Integer,TreeNode> entry : treeNodeMap.entrySet()) {
			if(entry.getValue().connectedNodes.size() == 1) queue.add(entry.getValue());
			nodesNotUsed.add(entry.getKey());
		}
		
		// BFS, adding to queue when edges size == 1 which means it is a leaf. Very similar to topological sort when inDegree == 0.
		while(nodesNotUsed.size() > 2 && !queue.isEmpty()) {
			int queueSize = queue.size();
			for(int i = 0; i < queueSize; i++) {
				TreeNode currentNode = queue.poll();
				nodesNotUsed.remove(currentNode.edgeNumber);
				for(int nextEdges : currentNode.connectedNodes) {
					TreeNode nextNode = treeNodeMap.get(nextEdges);
					nextNode.connectedNodes.remove(currentNode.edgeNumber);
					if(nextNode.connectedNodes.size() == 1) queue.add(nextNode);
				}
			}
		}
		List<Integer> result = new ArrayList<>(nodesNotUsed);
		return result;
    }
	
	
	private class TreeNode {
		
		private int edgeNumber;
		private Set<Integer> connectedNodes;
		
		public TreeNode(int edgeNumber) {
			this.edgeNumber = edgeNumber;
			this.connectedNodes = new HashSet<>();
		}
	}

}
