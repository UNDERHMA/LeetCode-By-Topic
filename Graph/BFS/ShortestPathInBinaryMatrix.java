package leetcode.LeetCode.Graph.BFS;

import java.util.ArrayDeque;
import java.util.Queue;

import javafx.util.Pair;

public class ShortestPathInBinaryMatrix {
	
	public int shortestPathBinaryMatrix(int[][] grid) {
        
		if(grid == null || grid.length == 0 || grid[0][0] == 1) return -1;
		int gridSize = grid.length;
		int[][] nextGridSpace = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
		Queue<int[]> queue = new ArrayDeque<>();
		queue.add(new int[] {0,0});
		
		int numberOfSteps = 1;
		int[] currentPosition;
		int x,y,nextX,nextY;
		while(!queue.isEmpty()) {
			int queueSize = queue.size();
			for(int i = 0; i < queueSize; i++) {
				currentPosition = queue.poll();
				x = currentPosition[1];
				y = currentPosition[0];
				if(y == x && x == gridSize-1) return numberOfSteps;
				for(int[] next : nextGridSpace) {
					nextY = y + next[0];
					nextX = x + next[1];
					if(nextX > -1 && nextX < gridSize && nextY > -1 && nextY < gridSize 
							&& grid[nextY][nextX] != 1) {
						queue.add(new int[] {nextY,nextX});
						grid[nextY][nextX] = 1;
					}
				}
			}
			numberOfSteps++;
		}
		return -1;
	}
}
