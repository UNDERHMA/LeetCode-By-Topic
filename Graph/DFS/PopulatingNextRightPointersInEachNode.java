package leetcode.LeetCode.Graph.DFS;

import java.util.ArrayDeque;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {

	public Node connect(Node root) {
        
		if(root == null) return root;
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(root);
		Node currentNode;
		
		while(!queue.isEmpty()) {
			int queueSize = queue.size();
			for(int i = 0; i < queueSize; i++) {
				currentNode = queue.poll();
				if(i < queueSize-1) currentNode.next = queue.peek();
				else currentNode.next = null;
				if(currentNode.left != null) {
					queue.add(currentNode.left);
					queue.add(currentNode.right);
				}
			}
		}
		return root;
    }

	private class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}
	    
	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, Node _left, Node _right, Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	}
}
