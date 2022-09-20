package leetcode.LeetCode.Graph.SingleSourceShortestPath;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class PathWithMinimumEffort {
	
	//Solved using Bellman Ford. Could also use Dijkstra's since the edges are not weighted.

	public int minimumEffortPath(int[][] heights) {
        
		int ySize = heights.length;
		int xSize = heights[0].length;
		int[][] minimumHeightDiffArray = new int[ySize][xSize];
		for(int[] array: minimumHeightDiffArray) {
			Arrays.fill(array, Integer.MAX_VALUE);
		}
		minimumHeightDiffArray[0][0] = 0;
		
		Queue<int[]> queue = new ArrayDeque<>();
		queue.add(new int[] {0,0});
		
		while(!queue.isEmpty()) {
			int[] currentPoint = queue.poll();
			int origDistance = minimumHeightDiffArray[currentPoint[0]][currentPoint[1]];
			if(currentPoint[0] > 0) {
				int distance = Math.max(origDistance,Math.abs(heights[currentPoint[0]][currentPoint[1]] 
						- heights[currentPoint[0]-1][currentPoint[1]]));
				if(minimumHeightDiffArray[currentPoint[0]-1][currentPoint[1]] > distance) {
					minimumHeightDiffArray[currentPoint[0]-1][currentPoint[1]] = distance;
					queue.add(new int[] {currentPoint[0]-1,currentPoint[1]});
				}
			}
			if(currentPoint[0] < ySize-1) {
				int distance = Math.max(origDistance,Math.abs(heights[currentPoint[0]][currentPoint[1]] 
						- heights[currentPoint[0]+1][currentPoint[1]]));
				if(minimumHeightDiffArray[currentPoint[0]+1][currentPoint[1]] > distance) {
					minimumHeightDiffArray[currentPoint[0]+1][currentPoint[1]] = distance;
					queue.add(new int[] {currentPoint[0]+1,currentPoint[1]});
				}
			}
			if(currentPoint[1] > 0) {
				int distance = Math.max(origDistance,Math.abs(heights[currentPoint[0]][currentPoint[1]] 
						- heights[currentPoint[0]][currentPoint[1]-1]));
				if(minimumHeightDiffArray[currentPoint[0]][currentPoint[1]-1] > distance) {
					minimumHeightDiffArray[currentPoint[0]][currentPoint[1]-1] = distance;
					queue.add(new int[] {currentPoint[0],currentPoint[1]-1});
				}
			}
			if(currentPoint[1] < xSize-1) {
				int distance = Math.max(origDistance,Math.abs(heights[currentPoint[0]][currentPoint[1]] 
						- heights[currentPoint[0]][currentPoint[1]+1]));
				if(minimumHeightDiffArray[currentPoint[0]][currentPoint[1]+1] > distance) {
					minimumHeightDiffArray[currentPoint[0]][currentPoint[1]+1] = distance;
					queue.add(new int[] {currentPoint[0],currentPoint[1]+1});
				}
			}
		}
		return minimumHeightDiffArray[ySize-1][xSize-1];
    }

}
