package leetcode.LeetCode.Graph.TopologicalSort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ParallelCourses {

	public int minimumSemesters(int n, int[][] relations) {
        
		// Create an entry for each course in a map
		Map<Integer,Course> coursesToRelationsMap = new HashMap<>();
		for(int i = 1; i <= n; i++) {
			coursesToRelationsMap.put(i, new Course(i));
		}
		
		// Initialize inDegree and list of next courses
		for(int[] relation : relations) {
				coursesToRelationsMap.get(relation[0]).nextCourses.add(relation[1]);
				coursesToRelationsMap.get(relation[1]).inDegree++;
		}
		
		// Add 0 inDegree to a queue:
		Queue<Course> queue = new ArrayDeque<>();
		for(Map.Entry<Integer, Course> entry : coursesToRelationsMap.entrySet()) {
			if(entry.getValue().inDegree == 0) queue.add(entry.getValue());
		}
		
		// Perform Topological Sort based on Kahn's algorithm. Add to queue when inDegree == 0
		int numberOfSemesters = 0;
		int visited = 0;
		while(!queue.isEmpty()) {
			int queueSize = queue.size();
			for(int i = 0; i < queueSize; i++) {
				Course currentCourse = queue.poll();
				visited++;
				for(int nc : currentCourse.nextCourses) {
					Course nextCourse = coursesToRelationsMap.get(nc);
					nextCourse.inDegree--;
					if(nextCourse.inDegree == 0) queue.add(nextCourse);					
				}
			}
			numberOfSemesters++;
		}
		return visited == n ? numberOfSemesters : -1;
    }
	
	
	private class Course {
		
		private int courseNum;
		private int inDegree;
		private List<Integer> nextCourses;
		
		public Course (int courseNum) {
			this.courseNum = courseNum;
			this.inDegree = 0;
			this.nextCourses = new ArrayList<>();
		}
	}
}
