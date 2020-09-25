package leetcode.LeetCode;

import java.util.function.IntConsumer;

public class FizzBuzzMultithreaded {

	private int n;
	private volatile int counter = 1;

    public FizzBuzzMultithreaded(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public synchronized void fizz(Runnable printFizz) throws InterruptedException {
    	while(counter <= n) {
	        if(counter % 3 != 0 || counter % 5 == 0) {
	        	wait();
	        }
	        else {
		        printFizz.run();
		        counter++;
		        notifyAll();
	        }
    	}
    }

    // printBuzz.run() outputs "buzz".
    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {
    	while(counter <= n) {
	        if(counter % 5 != 0 || counter % 3 == 0) {
	        	wait();
	        }
	        else {
		    	printBuzz.run();
		        counter++;
		        notifyAll();
	        }
    	}
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
    	while(counter <= n) {
	        if(counter % 5 != 0 || counter % 3 != 0) {
	        	wait();
	        }
	        else {
		    	printFizzBuzz.run();
		        counter++;
		        notifyAll();
    		}
    	}
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
    	while(counter <= n) {
	        if(counter % 5 == 0 || counter % 3 == 0) {
        		wait();
	        }
	        else {
	        	printNumber.accept(counter);
		        counter++;
		        notifyAll();
	        }
    	}
    }
    
}
