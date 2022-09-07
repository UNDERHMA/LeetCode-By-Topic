package GooglePrep.GooglePrep;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CourseScheduleII {

	
	public int[] findOrder(int numCourses, int[][] prerequisites) {
        
		if(prerequisites == null || numCourses == 0) return new int[0];
		int prereqLength = prerequisites.length;
		Map<Integer,CourseNode> courseNodesMap = new HashMap<>();
		CourseNode currentNode;
		
		//add all courses from prerequisites to a map of CourseNode objects
		for(int i = 0; i < prereqLength; i++) {
			if(!courseNodesMap.containsKey(prerequisites[i][0])) {
				currentNode = new CourseNode(prerequisites[i][0]);
				currentNode.inDegree = 1;
			} else {
				currentNode = courseNodesMap.get(prerequisites[i][0]);
				currentNode.inDegree++;
			}
			courseNodesMap.put(prerequisites[i][0], currentNode);
			if(!courseNodesMap.containsKey(prerequisites[i][1])) {
				currentNode = new CourseNode(prerequisites[i][1]);
			} else {
				currentNode = courseNodesMap.get(prerequisites[i][1]);
			}
				currentNode.followUpCourses.add(prerequisites[i][0]);
				courseNodesMap.put(prerequisites[i][1], currentNode);
		}
		
		//make sure all nodes from 0 - n-1 are created. Create if not created
		for(int i = 0; i < numCourses; i++) {
			if(!courseNodesMap.containsKey(i)) {
				currentNode = new CourseNode(i);
				courseNodesMap.put(i, currentNode);
			}
		}
		
		int[] result = new int[numCourses];
		int addedCount = 0;
		Queue<CourseNode> topologicalQueue = new ArrayDeque<>();
		
		//add 0 in degree nodes to queue
		for(Map.Entry<Integer,CourseNode> entry : courseNodesMap.entrySet()) {
			if(entry.getValue().inDegree == 0) topologicalQueue.add(entry.getValue());
		}
		
		// use Queue to iterate nodes that have 0 inDegree, setting inDegree of children to inDegree - 1 each time parent is hit
		while(!topologicalQueue.isEmpty()) {
			currentNode = topologicalQueue.poll();
			result[addedCount++] = currentNode.courseNum;
			for(Integer i : currentNode.followUpCourses) {
				CourseNode childNode = courseNodesMap.get(i);
				childNode.inDegree--;
				if(childNode.inDegree == 0) topologicalQueue.add(childNode);
			}
		}
		if(addedCount != numCourses) return new int[0];
		return result;
    }
	
	private class CourseNode {
		
		private int courseNum;
		private Set<Integer> followUpCourses;
		private int inDegree;
		
		CourseNode(int courseNum) {
			this.courseNum = courseNum;
			this.followUpCourses = new HashSet<>();
			this.inDegree = 0;
		}
	}
	
}
