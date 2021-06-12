package leetcode.LeetCode.QueueAndStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class FloodFill {
	
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
		if(image.length == 0 && image[0].length == 0) {
			return image;
		}
		int startingColor = image[sr][sc];
		if(startingColor == newColor) {
			return image;
		}
		
		Deque<Point> toProcess = new ArrayDeque<>();
		Point startingPoint = new Point(sc,sr);
		
		
		toProcess.add(startingPoint);
		int size;
		Point current;
		
		while(!toProcess.isEmpty()) {
			size = toProcess.size();
			for(int i = 0; i < size; i++) {
				current = toProcess.pop();
				if(image[current.y][current.x] == startingColor) {
					image[current.y][current.x] = newColor;
					if(current.x-1 >= 0) {
						toProcess.add(new Point(current.x-1,current.y));
					}
					if(current.x+1 < image[0].length) {
						toProcess.add(new Point(current.x+1,current.y));
					}
					if(current.y-1 >= 0) {
						toProcess.add(new Point(current.x,current.y-1));
					}
					if(current.y+1 < image.length) {
						toProcess.add(new Point(current.x,current.y+1));
					}
				}
			}
		}
		return image;
    }
}
