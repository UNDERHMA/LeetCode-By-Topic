package leetcode.LeetCode.LinkedLists;

public class RemoveLinkedListElements {
	
		private class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	    public ListNode removeElements(ListNode head, int val) {
	        
	        if(head == null) {
	            return null;
	        }
	        
	        ListNode current = head;
	        ListNode next = current.next;
	        
	        if(current.val == val) {
	            while(current == head) {
	                if(next != null && current.val == val) {
	                    head = next;
	                    current.next = null;
	                    current = next;
	                    if(next != null) {
	                        next = next.next;
	                    }
	                }
	                else if(current.val == val){
	                    head = null;
	                    return head;
	                }
	                else{
	                    break;
	                }
	            }
	        }
	        
	        // if next.value = val, remove
	        while(next != null && current != null) {
	            while(next != null && next.val == val) {
	                next = next.next;
	                if(next != null) {
	                    current.next = next;
	                }
	                else {
	                    current.next = null;
	                }
	            }
	            current = current.next;
	            if(current != null) {
	                next = current.next;
	            }
	        }
	        return head;
	    }
	}
