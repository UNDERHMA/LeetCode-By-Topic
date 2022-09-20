package leetcode.LeetCode.DynamicProgramming;

public class MinimumCostForTickets {

	public int mincostTickets(int[] days, int[] costs) {
        
		int daysLength = days.length;
		int[] tabulation = new int[366];
		int currentDayIndex = 0;
		int lastDay = days[daysLength-1];

		for(int i = 1; i <= lastDay; i++) {
			if(i == days[currentDayIndex]) {
				tabulation[i] = costs[0] + tabulation[i-1];
				int sevenValue = i >= 7 ? tabulation[i-7] : 0;
				int thirtyValue = i >= 30 ? tabulation[i-30] : 0;
				tabulation[i] = Math.min(tabulation[i], costs[1] + sevenValue);
				tabulation[i] = Math.min(tabulation[i], costs[2] + thirtyValue);
				currentDayIndex++;
			} else {
				tabulation[i] = tabulation[i-1];
			}
		}
		return tabulation[lastDay];
    }

}
