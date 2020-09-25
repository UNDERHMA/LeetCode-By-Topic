package leetcode.LeetCode;

public class PrintInOrder {
	
	private boolean firstThenSecond = false;
	private boolean secondThenThird = false;
	
	public PrintInOrder() {}

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        flipFirstThenSecond();
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
    	while(!firstThenSecond) {
    		try {
    			wait();
    		}
    		catch (InterruptedException exc) {
    		}
    	}
        printSecond.run();
        flipFirstThenSecond();
        flipSecondThenThird();
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
    	while(!secondThenThird) {
    		try {
    			wait();
    		}
    		catch (InterruptedException exc) {
    		}
    	}
        printThird.run();
        flipSecondThenThird();
    }
    
    public void flipFirstThenSecond() {
    	this.firstThenSecond = !firstThenSecond;
    }
    
    public void flipSecondThenThird() {
    	this.secondThenThird = !secondThenThird;
    }
}
