package AmazonPrep.AmazonPrep;

import java.util.List;

public class AmazonQuestion2 {

	private static int[][] cachedMinimumSteps;
	private static int resultIndexX;
	private static int resultIndexY;
	
	public static int minimumDistance(List<List<Integer>> area) {
	    
		// checking input and setting a few variables		
		if(area == null) return -1;
		int yLength = area.size();
		if(yLength == 0) return -1;
		int xLength = area.get(0).size();
		if(xLength == 0) return -1;
		
	    cachedMinimumSteps = new int[yLength][xLength]; // min steps to reach x,y for memoization
		resultIndexX = -1; // x value of result index
		resultIndexY = -1; // y value of result index
		int stepsTraveled = 0;
		int currentPositionX = 0;
		int currentPositionY = 0;
		
		findMinumumStepsToDeliver(area,currentPositionX,currentPositionY,stepsTraveled,
				xLength,yLength);
		
		if(resultIndexX == -1 && resultIndexY == -1) return -1;
		else return cachedMinimumSteps[resultIndexY][resultIndexX];
	}
	
	public static void findMinumumStepsToDeliver(List<List<Integer>> area, int currentPositionX,
			int currentPositionY, int stepsTraveled, int xLength, int yLength) {
		
		int currentValue = area.get(currentPositionY).get(currentPositionX);
		if(currentValue == 0) return;
		if(currentValue == 1) {
			if(cachedMinimumSteps[currentPositionY][currentPositionX] == 0) {
				cachedMinimumSteps[currentPositionY][currentPositionX] = stepsTraveled;
			}
			else if(cachedMinimumSteps[currentPositionY][currentPositionX] < stepsTraveled) {
				return;
			}
		}
		if(currentValue == 9) {
			if(resultIndexX == -1 && resultIndexY == -1) {
				cachedMinimumSteps[currentPositionY][currentPositionX] = stepsTraveled;
				resultIndexY = currentPositionY;
				resultIndexX = currentPositionX;
			} else {
				if(stepsTraveled < cachedMinimumSteps[currentPositionY][currentPositionX]) {
					cachedMinimumSteps[currentPositionY][currentPositionX] = stepsTraveled;
				}
			}
			return;
		}
		
		//branch out in 4 directions to find the delivery location
		if(currentPositionY-1 > 0){
			findMinumumStepsToDeliver(area,currentPositionX,currentPositionY-1,stepsTraveled+1,
					xLength,yLength);
		}
		if(currentPositionX-1 > 0){
			findMinumumStepsToDeliver(area,currentPositionX-1,currentPositionY,stepsTraveled+1,
					xLength,yLength);
		}
		if(currentPositionY+1 < yLength){
			findMinumumStepsToDeliver(area,currentPositionX,currentPositionY+1,stepsTraveled+1,
					xLength,yLength);
		}
		if(currentPositionX+1 < xLength) {
			findMinumumStepsToDeliver(area,currentPositionX+1,currentPositionY,stepsTraveled+1
					
					,
					xLength,yLength);
		}
		
		return;
	}
	
	
}
