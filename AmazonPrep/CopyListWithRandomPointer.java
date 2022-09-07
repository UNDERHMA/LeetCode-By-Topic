package AmazonPrep.AmazonPrep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CopyListWithRandomPointer {

	class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	}

public Node copyRandomList(Node head) {
		
		if(head == null) return null;
        Node current = head;
		Map<Node,Node> visited = new HashMap<>();
		Node newHead = new Node(current.val);
		Node currentNew = newHead;
        visited.put(head,newHead);
		
		while(current != null) {
			currentNew.next = getNode(visited,current.next);
			currentNew.random = getNode(visited,current.random);
			current = current.next;
            currentNew = currentNew.next;
		}
		return newHead;
    }
	
	public Node getNode(Map<Node,Node> visited, Node node) {
		
		if(node == null) {
			return null;
		}
		else if(visited.get(node) != null) {
			return visited.get(node);
		}
		else {
			Node newNode = new Node(node.val);
			visited.put(node,newNode);
			return newNode;
		}
    }

}
