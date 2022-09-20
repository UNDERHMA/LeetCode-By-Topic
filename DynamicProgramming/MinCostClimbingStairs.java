package leetcode.LeetCode.DynamicProgramming;

public class MinCostClimbingStairs {

	public int minCostClimbingStairs(int[] cost) {
        
		int costLength = cost.length;
		if(costLength ==  1) return cost[0];
		int previous = cost[1];
		int twoPrevious = cost[0];
		
		for(int i = 2; i < costLength; i++) {
			int current = Math.min(previous+cost[i], twoPrevious+cost[i]);
			twoPrevious = previous;
			previous = current;
		}
		return Math.min(previous,twoPrevious);
    }

}
