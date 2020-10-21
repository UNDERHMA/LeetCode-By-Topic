package leetcode.LeetCode.LinkedLists;

public class OddEvenLinkedList {
		private class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	    public ListNode oddEvenList(ListNode head) {
	        
	        if(head == null) {
	            return null;
	        }
	        
	        if(head.next == null) {
	            return head;
	        }
	        
	        ListNode current = head;
	        ListNode next = current.next;
	        ListNode evenStart = next;
	        ListNode temp;
	        int nodeCount = 1;
	        
	        while(next != null) {
	            nodeCount++;
	            temp = next;
	            current.next = next.next;
	            next = next.next;
	            if(next != null) {
	                current = temp;
	            }
	            else{
	                if(nodeCount % 2 == 0) {
	                    current.next = evenStart;
	                }
	                else{
	                    temp.next = evenStart;
	                }
	            }
	        }
	        return head;
	    }
	}
