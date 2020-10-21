package leetcode.LeetCode.LinkedLists;

public class IntersectionOfTwoLinkedLists {
		private class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
	        // iterate to end of both, count steps
	        ListNode currentA = headA;
	        int countA = 0;
	        while(currentA != null) {
	            countA++;
	            currentA = currentA.next;
	        }
	        
	        ListNode currentB = headB;
	        int countB = 0;
	        while(currentB != null) {
	            countB++;
	            currentB = currentB.next;
	        }
	                
	        // move longer one forward so that it has same to the end as shorter
	        currentA = headA;
	        currentB = headB;
	        if(countA > countB) {
	            while(countA > countB) {
	                countA--;
	                currentA = currentA.next;
	            }
	        }
	        else if(countA < countB) {
	            while(countA < countB) {
	                countB--;
	                currentB = currentB.next;
	            }
	        }
	        
	        // go by one until answer is found
	        while(currentA != null) {
	            if(currentA == currentB) {
	                return currentA;
	            }
	            currentA = currentA.next;
	            currentB = currentB.next;
	        }
	        return null;
	    }
	}
