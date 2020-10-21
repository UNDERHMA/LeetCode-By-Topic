package leetcode.LeetCode.LinkedLists;

public class LinkedListCycleII {
	
	private class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
	public ListNode detectCycle(ListNode head) {
        if(head == null) {
           return null; // no cycle possible
       }
       
       ListNode findsFrontOfCycle = head;
       ListNode pointerSlow = head;
       ListNode pointerFast = head;
       
       while(pointerSlow != null && pointerFast != null) {
           pointerSlow = pointerSlow.next;
           pointerFast = pointerFast.next;
           if(pointerFast != null) {
               pointerFast = pointerFast.next;
           }
           if(pointerSlow == null && pointerFast == null) {
               return null; //reached end on list of size 1 - no cycle
           }
           else if(pointerFast == pointerSlow) {
               if(findsFrontOfCycle == pointerSlow) {
                   return findsFrontOfCycle;
               }
               while(findsFrontOfCycle != pointerSlow){
                   pointerSlow = pointerSlow.next;
                   if(findsFrontOfCycle == pointerSlow) {
                       return findsFrontOfCycle;
                   }
                   if(pointerSlow == pointerFast) {
                       findsFrontOfCycle = findsFrontOfCycle.next;
                   }
               }
           }
       }
       return null; // no cycle
   }
}
