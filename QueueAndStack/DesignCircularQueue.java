package leetcode.LeetCode.QueueAndStack;

public class DesignCircularQueue {
	
	private int[] queue;
	private int head = -1;
	private int tail = -1;
	
	 /** Initialize your data structure here. Set the size of the queue to be k. */
    public DesignCircularQueue(int k) {
        queue = new int[k];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(!isFull()) {
        	if(tail == -1 && head == -1) {
        		head = 0;
        		tail = 0;
        		queue[tail] = value;
        	}
        	else if(tail != queue.length-1) {
        		tail++;
        		queue[tail] = value;
        	}
        	else {
        		tail = 0;
        		queue[tail] = value;
        	}
        	return true;
        }
        return false;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) {
        	return false;
        }
        else {
        	queue[head] = 0;
        	if(head == tail) {
    			head = -1;
    			tail = -1;
    		}
        	else if(head == queue.length-1) {
        		head = 0; 
        	}
        	else {
        		head++;
        	}
        	return true;
        }
    }
    
    /** Get the front item from the queue. */
    public int Front() {
    	if(isEmpty()) {
    		return -1;
    	}
        return queue[head];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
    	if(isEmpty()) {
    		return -1;
    	}
        return queue[tail];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
    	return head == -1 ? true : false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(head > tail) {
        	return head - tail == 1 ? true : false;
        }
        if(tail > head) {
        	return head == 0 && tail == queue.length-1 ? true : false;
        }
        return false;
    }
}
