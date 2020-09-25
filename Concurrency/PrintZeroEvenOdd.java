package leetcode.LeetCode;

public class PrintZeroEvenOdd {

private int n;
private boolean lock0 = true;
private boolean lock1 = false;
private boolean lock2 = false;

    
    public PrintZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void zero(IntConsumer printNumber) throws InterruptedException {
	    	
    	for(int i = 0; i < n; i++) {
    		while(!lock0) {
	    		try {
	    			wait();
	    		}
	    		catch (InterruptedException exc) {
	    		}
	    	}
        	printNumber.accept(0);
        	if(i % 2 == 0) {
        		flipLock1();
        		flipLock0();
        	}
        	else {
        		flipLock2();
        		flipLock0();
        	}
        	notifyAll();
        }
    }

    public synchronized void odd(IntConsumer printNumber) throws InterruptedException {
    	
    	for(int i = 1; i <= n; i+=2) {
    		while(!lock1) {
	    		try {
	    			wait();
	    		}
	    		catch (InterruptedException exc) {
	    		}
	    	}
    		printNumber.accept(i);
        	flipLock1();
        	flipLock0();
        	notifyAll();
        }
    }

    public synchronized void even(IntConsumer printNumber) throws InterruptedException {
	    	
    	for(int i = 2; i <= n; i+=2) {
    		while(!lock2) {
	    		try {
	    			wait();
	    		}
	    		catch (InterruptedException exc) {
	    		}
	    	}
    		printNumber.accept(i);
        	flipLock2();
        	flipLock0();
        	notifyAll();
        }
    }
    
    public void flipLock0() {
    	this.lock0 = !this.lock0;
    }
    
    public void flipLock1() {
    	this.lock1 = !this.lock1;
    }
    
    public void flipLock2() {
    	this.lock2 = !this.lock2;
    }
}
