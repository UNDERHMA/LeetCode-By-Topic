package leetcode.LeetCode;

public class TheDiningPhilosophers {
	
	private boolean[] forks = new boolean[5];

	public TheDiningPhilosophers() { 
    }

    // call the run() method of any runnable to execute its code
    public synchronized void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        
        int left = philosopher == 0 ? 4 : philosopher-1;
        int right = philosopher == 4 ? 0 : philosopher+1;
        while(forks[left] || forks[right]) {
            try {
                wait();
            } catch (InterruptedException ie) {}
        }
        forks[left] = true;
        forks[right] = true;
        pickLeftFork.run();
        pickRightFork.run();
        eat.run();
        putLeftFork.run();
        putRightFork.run();
        forks[left] = false;
        forks[right] = false;
        notifyAll();
    }
}
