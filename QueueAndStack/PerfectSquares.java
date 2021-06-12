package leetcode.LeetCode.QueueAndStack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PerfectSquares {
	public int numSquares(int n) {
		
		if(n <= 0) {
			return -1;
		}
		
		List<Integer> possiblePerfectSquares = new ArrayList<>();
        Deque<Integer> sums = new ArrayDeque<>();
        int[] duplicateDetection = new int[n];
		int maxSquareRoot = (int) Math.sqrt(n);
		int current = 0;
		int next = 0;
		int countOfIntegers = 1;
		int size = 0;
		
		if(maxSquareRoot * maxSquareRoot == n) {
			return 1;
		}
		
		for(int i = maxSquareRoot; i >= 1; i--) {
			possiblePerfectSquares.add(i*i);
			sums.add(i*i);
			duplicateDetection[(i*i)] = -1;;
		}
		
		while(!sums.isEmpty()) {
			size = sums.size();
			for(int j = 0; j < size; j++) {
				current = sums.poll();
				for(Integer i : possiblePerfectSquares) {
					next = current + i;
					if(next == n) {
						return 1 + countOfIntegers;
					}
					else if(next > n) {
						// do nothing
					}
					else if(duplicateDetection[next] != -1) {
						sums.add(next);
						duplicateDetection[next] = -1;
					}
				}
			}
			countOfIntegers++;
		}
		return -1;
    }
}
