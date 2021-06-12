package leetcode.LeetCode.QueueAndStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class _01Matrix {
	public int[][] updateMatrix(int[][] matrix) {
		
		if(matrix.length == 0 || matrix[0].length == 0) {
			return null;
		}
        
		int[][] result = new int[matrix.length][matrix[0].length];
		Deque<Point> bfsList = new ArrayDeque<>();
		bfsList.add(new Point(0,0));
		
		int size;
		int distanceCount;
		Point current;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				distanceCount = 0;
				bfsList.add(new Point(j,i));
				while(!bfsList.isEmpty()) {
					size = bfsList.size();
					for(int k = 0; k < size; k++) {
						current = bfsList.pop();
						if(matrix[current.y][current.x] == 0) {
							result[i][j] = distanceCount;
                            k = size;
                            bfsList = new ArrayDeque<>();
						}
                        else {
							if(current.x-1 >= 0) {
								bfsList.add(new Point(current.x-1,current.y));
							}
							if(current.x+1 < matrix[0].length) {
								bfsList.add(new Point(current.x+1,current.y));
							}
							if(current.y-1 >= 0) {
								bfsList.add(new Point(current.x,current.y-1));
							}
							if(current.y+1 < matrix.length) {
								bfsList.add(new Point(current.x,current.y+1));
							}
						}
					}
					distanceCount++;
				}
			}
		}
		return result;
    }
}
