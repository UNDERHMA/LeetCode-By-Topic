package leetcode.LeetCode;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class BuildingH20 {
	
	private Semaphore hydrogen = new Semaphore(2);
	private Semaphore oxygen = new Semaphore(1);
	private CyclicBarrier barrier = new CyclicBarrier(3);
	
	public BuildingH20() {
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
    	try {
        	hydrogen.acquire();
    		barrier.await(); // cyclic barrier allows threads to all wait for each other until the barrier is reached, so three threads release once 3 is hit
                // and 3 is only hit when 2H, 1O because of semaphores
    		// releaseHydrogen.run() outputs "H". Do not change or remove this line.
                releaseHydrogen.run();
                hydrogen.release();
    	} catch (BrokenBarrierException exc) {
    		exc.printStackTrace();
    	}
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
    	try {
        	oxygen.acquire();
    		barrier.await();
    		// releaseOxygen.run() outputs "O". Do not change or remove this line.
    		releaseOxygen.run();
    		oxygen.release();
    	} catch (BrokenBarrierException exc) {
    		exc.printStackTrace();
    	}
    }
}
