package leetcode.LeetCode.QueueAndStack;

public class NumberOfIslandsDFS {

		public int numIslands(char[][] grid) {
			
			int islandCount = 0;
			
			for(int x = 0; x < grid[0].length; x++) {
				for(int y = 0; y < grid.length; y++) {
					if(grid[y][x] == '0') { 
						continue;
					}
					else if(grid[y][x] == '1') {
						islandCount++;
						depthFirstSearch(x+1,y,grid);
						depthFirstSearch(x,y+1,grid);
						depthFirstSearch(x-1,y,grid);
						depthFirstSearch(x,y-1,grid);
					}
				}
			}
			return islandCount;
	    }
		
		public void depthFirstSearch(int x, int y, char[][] grid) {
			if(x > grid[0].length-1 || y > grid.length-1 || x < 0 || y < 0) {
                return;
            }
			if(grid[y][x] == '1') {
				grid[y][x] ='0';
				depthFirstSearch(x+1,y,grid);
				depthFirstSearch(x,y+1,grid);
				depthFirstSearch(x-1,y,grid);
				depthFirstSearch(x,y-1,grid);
			}
		}
		
}
