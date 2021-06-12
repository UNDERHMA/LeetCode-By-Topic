package leetcode.LeetCode.QueueAndStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementStackUsingQueues {
	
	public Deque<Integer> queue1;
	public Deque<Integer> queue2;
	
	/** Initialize your data structure here. */
    public ImplementStackUsingQueues() {
        this.queue1 = new ArrayDeque<>();
        this.queue2 = new ArrayDeque<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        	queue1.add(x);
        	while(!queue2.isEmpty()) {
        		queue1.add(queue2.pop());
        	}
        	while(!queue1.isEmpty()) {
        		queue2.add(queue1.pop());
        	}
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue2.pop();
    }
    
    /** Get the top element. */
    public int top() {
    	return queue2.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(queue2.isEmpty()) {
        	return true;
        }
        return false;
    }
}
