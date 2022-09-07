package AmazonPrep.AmazonPrep;

public class ReverseNodesInKGroup {
	
	
	public void reverse(ListNode tail, int k) {
		
		ListNode prev = tail;
		ListNode current = tail.next;
		ListNode next = current.next;
		
		while(k>1) {
			current.next = prev;
			prev = current;
			current = next;
			if(current != null)	next = current.next;
			k--;
		}
	}
	

	public ListNode reverseKGroup(ListNode head, int k) {
     
		if(k == 1) return head;
		int currentKCounter = 1;
		ListNode current = head;
		ListNode tail = head;
		ListNode prevTail = null;
		ListNode temp;
        head = null;
		
		while(current != null) {
			if(currentKCounter == k) {
				temp = current.next;
				reverse(tail,k);
				if(prevTail != null) prevTail.next = current;
				prevTail = tail;
				tail.next = temp;
				if(head == null) head = current;
				tail = tail.next;
				current = tail;
				currentKCounter = 1;
			} else {
				current = current.next;
				currentKCounter++;
			}
		}
		return head;
    }
}
