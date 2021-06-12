package leetcode.LeetCode.QueueAndStack;

import java.util.ArrayList;

public class CloneGraph {
	
	public Node cloneGraph(Node node) {
		
		Node[] duplicateDetector = new Node[100];
        if(node == null) {
        	return null;
        }
        Node current = new Node(node.val,new ArrayList<Node>(node.neighbors));
        duplicateDetector[current.val-1] = current;
        depthFirstCopy(current,duplicateDetector);
        return current;
    }
	
	public void depthFirstCopy(Node node, Node[] duplicateDetector) {
		for(int i = 0; i < node.neighbors.size(); i++) {
			if(duplicateDetector[node.neighbors.get(i).val-1] == null) {
				Node current = new Node(node.neighbors.get(i).val,
						new ArrayList<Node>(node.neighbors.get(i).neighbors));
				duplicateDetector[current.val-1] = current;
				node.neighbors.set(i, current);
				depthFirstCopy(current,duplicateDetector);
			}
			else {
				node.neighbors.set(i, duplicateDetector[node.neighbors.get(i).val-1]);
			}
		}
	}
}
