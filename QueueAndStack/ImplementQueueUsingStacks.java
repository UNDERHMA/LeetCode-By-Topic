package leetcode.LeetCode.QueueAndStack;

import java.util.Stack;

public class ImplementQueueUsingStacks {
	
	public Stack<Integer> stack1;
	public Stack<Integer> stack2;
	
	/** Initialize your data structure here. */
    public ImplementQueueUsingStacks() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!stack1.isEmpty()) {
        	stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.isEmpty()) {
        	stack1.push(stack2.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	if(empty()) {
    		return -1;
    	}
    	else {
    		return stack1.pop();
    	}
    }
    
    /** Get the front element. */
    public int peek() {
    	if(empty()) {
    		return -1;
    	}
    	else {
    		return stack1.peek();
    	}
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return stack1.isEmpty();
    }

}
