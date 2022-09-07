package AmazonPrep.AmazonPrep;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInArray {

	public int findKthLargest(int[] nums, int k) {
     
		Comparator comparator = new Comparator<Integer>(){
			@Override
			public int compare(Integer a, Integer b) {
				return b-a;
			}
		};
		Queue<Integer> priorityQueue = new PriorityQueue<>(comparator);
		
		for(int i : nums) {
			priorityQueue.add(i);
		}
		for(int i = 0; i < k-1; i++) {
			priorityQueue.poll();
		}
		return priorityQueue.poll();
    }
}
