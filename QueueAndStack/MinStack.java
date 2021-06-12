package leetcode.LeetCode.QueueAndStack;

public class MinStack {
	
	private class Node {
		private int value;
		private int minimum;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return this.value;
		}
		public int getMinimum() {
			return this.minimum;
		}
		public Node getNext() {
			return this.next;
		}
		public int setValue(int value) {
			return this.value = value;
		}
		public int setMinimum(int minimum) {
			return this.minimum = minimum;
		}
		public Node setNext(Node node) {
			return this.next = node;
		}
		
	}
	
	private Node head;
	
	/** initialize your data structure here. */
    public MinStack() {
    }
    
    public void push(int x) {
        if(this.head == null) {
        	head = new Node(x);
        	head.minimum = x;
        }
        else {
        	Node current = head;
        	head = new Node(x);
        	head.setNext(current);
        	if(x < current.getMinimum()) head.setMinimum(x); 
        	else head.setMinimum(current.getMinimum());
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return this.head.getValue();
    }
    
    public int getMin() {
        if(this.head == null) {
        	return Integer.MIN_VALUE;
        }
        else {
        	return head.getMinimum();
        }
    }
}
