package leetcode.LeetCode.LinkedLists;

public class ReverseLinkedList {
		private class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	    public ListNode reverseList(ListNode head) {
	        
	        if(head == null) {
	            return null;
	        }
	        
	        ListNode current = head;
	        ListNode next = current.next;
	        ListNode first = current;
	        
	        while(next != null) {
	            first.next = next.next;
	            head = next;
	            next.next = current;
	            current = next;
	            next = first.next;
	        }
	        first.next = null;
	        return head;
	    }
}