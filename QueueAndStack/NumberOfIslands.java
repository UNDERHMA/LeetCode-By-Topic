package leetcode.LeetCode.QueueAndStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumberOfIslands {

	public static int numIslands(char[][] grid) {
		
		Deque<Point> queue = new ArrayDeque<>();
		int islandCount = 0;
		
		for(int i = 0; i < grid[0].length; i++) {
			for(int j = 0; j < grid.length; j++) {
				if(grid[j][i] == '0') { 
					continue;
				}
				else if(grid[j][i] == '1') {
					islandCount++;
					Point newPoint = new Point(i,j);
					Point current = newPoint;
					queue.add(newPoint);
					while(!queue.isEmpty()) {
						current = queue.poll();
						if(1+current.x < grid[0].length && grid[current.y][1+current.x] == '1') {
							newPoint = new Point(current.x+1,current.y);
							queue.add(newPoint);
							grid[current.y][1+current.x] = '0';
						}
						if(1+current.y < grid.length && grid[1+current.y][current.x] == '1') {
							newPoint = new Point(current.x,1+current.y);
							queue.add(newPoint);
							grid[1+current.y][current.x] = '0';
						}
						if(current.x-1 >= 0 && grid[current.y][current.x-1] == '1') {
							newPoint = new Point(current.x-1,current.y);
							queue.add(newPoint);
							grid[current.y][current.x-1] = '0';
						}
						if(current.y-1 >= 0 && grid[current.y-1][current.x] == '1') {
							newPoint = new Point(current.x,current.y-1);
							queue.add(newPoint);
							grid[current.y-1][current.x] = '0';
						}
					}
				}
				
			}
		}
		return islandCount;
    }
}
