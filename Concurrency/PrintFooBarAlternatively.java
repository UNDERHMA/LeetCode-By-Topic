package leetcode.LeetCode;

public class PrintFooBarAlternatively {

	private int n;
	private boolean lock = true;

    public PrintFooBarAlternatively(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
        	while(!lock) {
        		try {
        			wait();
        		}
        		catch (InterruptedException Exc) {
        		}
        	}
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
        	flipLock();
        	notifyAll();
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
        	while(lock) {
        		try {
        			wait();
        		}
        		catch (InterruptedException Exc) {
        		}
        	}
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
        	flipLock();
        	notifyAll();
        }
    }
    
    public void flipLock() {
    	this.lock = !this.lock;
    }
	  
}
