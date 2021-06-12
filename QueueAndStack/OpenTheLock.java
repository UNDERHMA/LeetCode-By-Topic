package leetcode.LeetCode.QueueAndStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class OpenTheLock {
	
	public int openLock(String[] deadends, String target) {
		
		int targetAsInt = Integer.parseInt(target);
        int totalMoves = 0;
        Deque<Integer> currentLockSettings = new ArrayDeque<>();
        int current;
        int[] visited = new int[10000];

        // Mark deadends as visited
        for(String s : deadends) {
        	current = Integer.parseInt(s);
        	visited[current] = -1;
        }
        
        current = 0;
        currentLockSettings.add(current);
        int modulo10;
        int modulo100;
        int modulo1000;
        int modulo10000;
        while(!currentLockSettings.isEmpty()) {
        	int size = currentLockSettings.size();
        	for(int i = 0; i < size; i++) {
	        	current = currentLockSettings.poll();
	        	if(current == targetAsInt) {
	        		return totalMoves;
	        	}
	        	if(visited[current] == -1) {
	        		// do nothing, do not add any transformations of current to the queue
	        	}
	        	else {
	        		visited[current] = -1;
	        		modulo10 = current%10;
	        		modulo100 = current%100;
	                modulo1000 = current%1000;
	                modulo10000 = current%10000;
	                int newModulo10smaller = (modulo10 == 0) ? current+9 : current-1;
	                if(visited[newModulo10smaller] == 0) {
	                	currentLockSettings.add(newModulo10smaller);
	                }
	                int newModulo10larger = (modulo10 == 9) ? current-9 : current+1;
	                if(visited[newModulo10larger] == 0) {
	                	currentLockSettings.add(newModulo10larger);
	                }
	                int newModulo100smaller = (modulo100 < 10) ? current+90 : current-10;
	                if(visited[newModulo100smaller] == 0) {
	                	currentLockSettings.add(newModulo100smaller);
	                }
	                int newModulo100larger = (modulo100 >= 90) ? current-90 : current+10;
	                if(visited[newModulo100larger] == 0) {
	                	currentLockSettings.add(newModulo100larger);
	                }
	                int newModulo1000smaller = (modulo1000 < 100) ? current+900 : current-100;
	                if(visited[newModulo1000smaller] == 0) {
	                	currentLockSettings.add(newModulo1000smaller);
	                }
	                int newModulo1000larger = (modulo1000 >= 900) ? current-900 : current+100;
	                if(visited[newModulo1000larger] == 0) {
	                	currentLockSettings.add(newModulo1000larger);
	                }
	                
	                int newModulo10000smaller = (modulo10000 < 1000) ? current+9000 : current-1000;
	                if(visited[newModulo10000smaller] == 0) {
	                	currentLockSettings.add(newModulo10000smaller);
	                }
	                int newModulo10000larger = (modulo10000 >= 9000) ? current-9000 : current+1000;
	                if(visited[newModulo10000larger] == 0) {
	                	currentLockSettings.add(newModulo10000larger);
	                }
	        	}
        	}
        	totalMoves++;
        }
        return -1;		
    }
}
