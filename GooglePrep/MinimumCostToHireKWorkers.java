package GooglePrep.GooglePrep;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumCostToHireKWorkers {

	public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        
		if(quality == null || wage == null || k < 1 || wage.length == 0 || quality.length == 0) return 0;
		int length = wage.length;
		Worker[] workers = new Worker[length];
		for(int i = 0; i < length; i++) {
			Worker currentWorker = new Worker(quality[i],wage[i]);
			workers[i] = currentWorker;
		}
		Arrays.sort(workers);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		double minWage = Integer.MAX_VALUE;
		int currentSumOfWorkerQuality = 0;
		for(Worker w : workers) {
			pq.offer(-w.quality);
			currentSumOfWorkerQuality += w.quality;
			if(pq.size() > k) {
				currentSumOfWorkerQuality += pq.poll();
			}
			if(pq.size() == k) {
				minWage = Math.min(minWage, w.ratio * currentSumOfWorkerQuality);
			}	
		}
		return minWage;
    }
	
	private class Worker implements Comparable<Worker>{
		
		int quality;
		int wage;
		double ratio;
		
		Worker(int quality,int wage) {
			this.quality = quality;
			this.wage = wage;
			this.ratio = (double) wage / quality;
		}
		
		public int compareTo(Worker w) {
			if(w.ratio > ratio) return -1;
			return 1;
		}
	}

}
