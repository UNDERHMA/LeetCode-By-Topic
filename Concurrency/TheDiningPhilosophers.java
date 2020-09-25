package leetcode.LeetCode;

public class TheDiningPhilosophers {
	
	private boolean[] forkLock = new boolean[] {false, false, false, false, false};

	public TheDiningPhilosophers() { 
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
    	
    	synchronized(this) {
    		if(philosopher == 0 && forkLock[philosopher] == true || 
    				forkLock[4] == true) {
    			wait();
    		}
    		else if(philosopher != 0 && (forkLock[philosopher] == true 
    				|| forkLock[philosopher-1] == true)) {
    			wait();
    		}
    		
    		if(philosopher == 0) {
    			forkLock[4] = true;
    			forkLock[1] = true;
    		}
    		else if(philosopher == 4) {
    			forkLock[0] = true;
    			forkLock[3] = true;
    		}
    		else {
    			forkLock[philosopher+1] = true;
    			forkLock[philosopher-1] = true;
    		}
    		notifyAll();
    		
    		// Perform eating
        	pickLeftFork.run();
        	pickRightFork.run();
        	eat.run();
        	putLeftFork.run();
        	putRightFork.run();
        	
        	// Unlock
        	if(philosopher == 0) {
    			forkLock[4] = false;
    			forkLock[1] = false;
    		}
    		else if(philosopher == 4) {
    			forkLock[0] = false;
    			forkLock[3] = false;
    		}
    		else {
    			forkLock[philosopher+1] = false;
    			forkLock[philosopher-1] = false;
    		}
    		notifyAll();
    	}
    }
}
