package AmazonPrep.AmazonPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {

	public int[] topKFrequent(int[] nums, int k) {
        
		Map<Integer,Number> numberMap = new HashMap<>();
		for(int i : nums) {
			Number currentNumber = numberMap.get(i);
			if(currentNumber == null) numberMap.put(i, new Number(i));
			else {
				currentNumber.occurrences++;
				numberMap.put(i, currentNumber);
			}
		}
		
		Queue<Number> priorityQueue = new PriorityQueue<>();
		for(Map.Entry<Integer, Number> entry : numberMap.entrySet()) {
			priorityQueue.add(entry.getValue());
		}
		
		int[] result = new int[k];
		for(int i = 0; i < k; i++) {
			result[i] = priorityQueue.poll().value;
		}
		return result;
    }
	
	private class Number implements Comparable<Number> {
		
		int value;
		int occurrences;
		
		public Number (int value) {
			this.value = value;
			this.occurrences = 1;
		}

		@Override
		public int compareTo(Number o) {
			if(this.occurrences >= o.occurrences) return -1;
			return 1;
		}
		
		
	}

}
