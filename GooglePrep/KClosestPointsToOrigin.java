package GooglePrep.GooglePrep;

import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointsToOrigin {

	public int[][] kClosest(int[][] points, int k) {
		
		if(k == 0 || points == null || points.length == 0) return new int[0][0];
				
		Queue<Point> pointsQueue = new PriorityQueue<>();
		Point newPoint;
		for(int[] coord: points) {
			newPoint = new Point(coord[0],coord[1]);
			pointsQueue.add(newPoint);
			if(pointsQueue.size() > k) pointsQueue.poll();
		}
		
		int[][] result = new int[k][2];
		int kIndex = 0;
		for(Point p : pointsQueue) {
			result[kIndex][0] = p.x;
			result[kIndex][1] = p.y;
			kIndex++;
		}
		return result;
    }
	
	private class Point implements Comparable<Point> {
		
		private int x;
		private int y;
		private double distance;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
			distance = (double) Math.sqrt(Math.pow((0-x),2) + Math.pow((0-y),2));
		}
		
		public int compareTo(Point p2) {
			if(this.distance < p2.distance) return 1;
			return -1;
		}
	}

}
