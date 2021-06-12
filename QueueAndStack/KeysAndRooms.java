package leetcode.LeetCode.QueueAndStack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class KeysAndRooms {

	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		
		if(rooms.size() == 0) {
			return false;
		}
        else if(rooms.size() == 1) {
           return true;
        }
		
		Deque<Integer> toUnlock = new ArrayDeque<>();
		int[] visited = new int[rooms.size()];
		visited[0] = 1;
		
		toUnlock.add(0);
		int size;
		int unlockedCount = 1;
		while(!toUnlock.isEmpty()) {
			size = toUnlock.size();
			for(Integer i : rooms.get(toUnlock.pop())) {
				if(visited[i] == 0) {
					visited[i] = 1;
					unlockedCount++;
					toUnlock.add(i);
				}
			}	
		}
		if(unlockedCount == rooms.size()) {
			return true;
		}
		return false;
    }
}
