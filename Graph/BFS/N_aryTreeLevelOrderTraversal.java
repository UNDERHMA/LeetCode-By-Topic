package leetcode.LeetCode.Graph.BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class N_aryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(Node root) {
        
		List<List<Integer>> result = new ArrayList<>();
		if(root == null) return result;;
		Queue<Node> queue = new ArrayDeque<>();
		
		queue.add(root);
		while(!queue.isEmpty()) {
			List<Integer> currentLevel = new ArrayList<>();
			int queueSize = queue.size();
			for(int i = 0; i < queueSize; i++) {
				Node currentNode = queue.poll();
				currentLevel.add(currentNode.val);
				for(Node n : currentNode.children) {
					queue.add(n);
				}
			}
			result.add(currentLevel);
		}
		return result;
    }

	private class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	}

}
