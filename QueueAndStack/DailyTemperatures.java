package leetcode.LeetCode.QueueAndStack;

import java.util.Stack;

public class DailyTemperatures {

	public int[] dailyTemperatures(int[] T) {
		
        int[] results = new int[T.length];
        Stack<Integer> temperatureStack = new Stack<>();
        
        results[results.length-1] = 0;
        temperatureStack.add(T.length-1);
        
        for(int i = T.length-2; i >= 0; i--) {
        	while(!temperatureStack.isEmpty()) {
	        	if(T[i] < T[temperatureStack.peek()]) {
	        		results[i] = temperatureStack.peek()-i;
	        		temperatureStack.add(i);
	        		break;
	        	}
	        	else {
	        		temperatureStack.pop();
	        	}
	        	if(temperatureStack.isEmpty()) {
	        		results[i] = 0;
	            	temperatureStack.add(i);
	            	break;
	        	}
        	}
        }
        return results;
    }
}
