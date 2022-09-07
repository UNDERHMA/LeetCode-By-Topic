
package AmazonPrep.AmazonPrep;

public class MergeKSortedLists {

	
	public ListNode mergeKLists(ListNode[] lists) {
        
		
		/*********
		
		SLOW runtime - 258ms vs 4ms on average - check why?
		
		
		Answer = try divide and conquer, merge two lists at a time, then repeat -> Leads to less
		iterations over null values
		
		
		
		*/
		
		
		
		
		
		
		
		if(lists.length == 0) return null;
		int listLength = lists.length;
		int currentMin;
		int currentMinIndex = 0;
		int nullCount = 0;
		for(ListNode n : lists) {
			if(n == null) nullCount++;
		}
		
		ListNode newHead = null;
		ListNode current = null;
		while(nullCount < listLength) {
			currentMin = Integer.MAX_VALUE;
			currentMinIndex = -1;
			for(int i = 0; i < listLength; i++) {
				if(lists[i] == null) continue;
				if(lists[i].val < currentMin) {
					currentMin = lists[i].val;
					currentMinIndex = i;
				}
			}
			if(newHead == null) {
				current = new ListNode(currentMin);
				newHead = current;
			} else {
				current.next = new ListNode(currentMin);
				current = current.next;
			}
			lists[currentMinIndex] = lists[currentMinIndex].next;
			if(lists[currentMinIndex] == null) nullCount++;
		}
		return newHead;
    }


}
