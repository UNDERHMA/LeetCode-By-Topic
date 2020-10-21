package leetcode.LeetCode.LinkedLists;

public class LinkedListCycle {
	private class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	public boolean hasCycle(ListNode head) {
        
        if(head == null) {
            return false;
        }
        
        ListNode pointerSlow = head;
        ListNode pointerFast = head;
        
        while(pointerSlow != null && pointerFast != null) {
            pointerSlow = pointerSlow.next;
            pointerFast = pointerFast.next;
            if(pointerFast != null) {
                pointerFast = pointerFast.next;
            }
            if(pointerSlow == null && pointerFast == null) {
                return false; //reached end on list of size 1
            }
            else if(pointerFast == pointerSlow) {
                return true;
            }
        }
        return false;
    }
}
