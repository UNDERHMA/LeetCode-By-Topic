package leetcode.LeetCode.DynamicProgramming;

import java.util.Arrays;

public class MinimumDifficultyOfAJobSchedule {
	
	private int[][] memo;
	private int arrLength;
	private int daysToWork;
	private int[] jobDifficulty;
	private int[] hardestRemaining;
	
	public int minDifficulty(int[] jobDifficulty, int d) {
        
		this.jobDifficulty = jobDifficulty;
		this.arrLength = jobDifficulty.length;
		this.daysToWork = d;
		this.memo = new int[daysToWork][arrLength];
		this.hardestRemaining = new int[arrLength+1];
		
		for(int i = 0; i < daysToWork; i++) {
			Arrays.fill(memo[i], -1);		//Works for filling 2d array
		}

		for(int i = arrLength - 1; i >= 0; i--) {
			hardestRemaining[i] = Math.max(jobDifficulty[i], hardestRemaining[i+1]);
		}
		
		return recurse(0,1);
    }
	
	private int recurse(int startIndex, int daysUsed) {
			
		if(daysUsed == daysToWork) {
			return hardestRemaining[startIndex];
		}

		int endIndexForIteration = arrLength - (daysToWork - daysUsed);
		if(endIndexForIteration < 1) return -1; // not enough tasks to complete 1 per day
		if (memo[daysUsed][startIndex] == -1) {
			int currentMinimum = Integer.MAX_VALUE;
			int mostDificultJobToday = 0;
			for(int i = startIndex; i < endIndexForIteration; i++) {
				mostDificultJobToday = Math.max(jobDifficulty[i], mostDificultJobToday);
				currentMinimum = Math.min(currentMinimum,mostDificultJobToday + recurse(i+1,daysUsed+1));
			}
			memo[daysUsed][startIndex] = currentMinimum;
		}
		return memo[daysUsed][startIndex];
	}

}
