package leetcode.LeetCode.LinkedLists;

public class RemoveNthNodeFromEnd {

		private class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        
	        //iterate to end
	        ListNode current = head;
	        int size = 0;
	        
	        while(current != null) {
	            size++;
	            current = current.next;
	        }
	        
	        //remove element
	        ListNode removalPointer = head;
	        if(n > size) {
	            return null;
	        }
	        else if(n == size) { //removing head
	            if(n == 1) {
	                head = null;
	                return null;
	            }
	            else {
	                ListNode temp = head.next;
	                head.next = null;
	                head = temp;
	                return head;
	            }
	        }
	        else {
	            int movesToRemoval = size - n - 1; // -1 so we stop 1 before element to remove
	            for(int i = 0; i < movesToRemoval; i++) {
	                removalPointer = removalPointer.next;
	            }
	            if(n == 1){
	                removalPointer.next = null;
	                return head;
	            }
	            else {
	                removalPointer.next = removalPointer.next.next;
	                return head;
	            }   
	        }
	         
	    }
	}
