package leetcode.LeetCode.LinkedLists;

import java.util.Stack;

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}

public class FlattenMultiLevelDoublyLinkedList {
	    public Node flatten(Node head) {
	        
	        if(head == null) {
	            return null;
	        }
	        
	        Stack<Node> childPointers = new Stack<>();
	        Node current = head;
	        Node next = current.next;
	        
	        while(current != null) {
	            if(current.child != null) {
	                childPointers.push(current);
	                current = current.child;
	                next = current.next;
	            }
	            else if(next != null) {
	                current = next;
	                next = current.next;
	            }
	            else if(next == null){
	                if(!childPointers.isEmpty()) {
	                    //go back to last child added
	                    Node temp = current;
	                    current = childPointers.pop();
	                    next = current.next;
	                    current.next = current.child;
	                    current.child = null;
	                    current.next.prev = current;
	                    if(next!=null){
	                      temp.next = next;
	                      next.prev = temp;
	                      current = next;
	                      next = current.next;
	                    }
	                }
	                else{
	                    current = null;
	                }
	            }
	        }
	        return head;
	    }
}
