package GooglePrep.GooglePrep;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingRoomsII {

	
	public int minMeetingRooms(int[][] intervals) {
        
		if(intervals == null || intervals.length == 0 || intervals[0].length == 0) return 0;
		int yLength = intervals.length;
		
		Queue<Integer> priorityQueue = 
				new PriorityQueue<>((a,b) -> Integer.compare(a,b));
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
		int numberOfRooms = 1;
		int earliestMeetingEndTime = 0;
		
		for(int i = 0; i < yLength; i++) {
			if(priorityQueue.isEmpty()) priorityQueue.add(intervals[i][1]);
			else {
				earliestMeetingEndTime = priorityQueue.peek();
				while(intervals[i][0] >= earliestMeetingEndTime
						&& !priorityQueue.isEmpty()) {
					priorityQueue.poll();
					if(!priorityQueue.isEmpty()) earliestMeetingEndTime = priorityQueue.peek();
					else break;
				}
				priorityQueue.add(intervals[i][1]);
				numberOfRooms = Math.max(numberOfRooms, priorityQueue.size());
			}
		}
		return numberOfRooms;
    }

}
