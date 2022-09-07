package AmazonPrep.AmazonPrep;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
		if(l1 == null && l2 == null) return null;
		ListNode head = new ListNode();
		ListNode current = head;
		List<Integer> reverseSum = new ArrayList<>();
		ListNode l1Current = l1;
		ListNode l2Current = l2;
		int carry = 0;
		
		while(l1Current != null || l2Current != null) {
			if(l1Current != null && l2Current != null) {
				reverseSum.add(l1Current.val + l2Current.val + carry);
			}
			else if(l1Current != null) reverseSum.add(l1Current.val + carry);
			else reverseSum.add(l2Current.val + carry);
			
			if(reverseSum.get(reverseSum.size()-1) > 9) {
				int temp = reverseSum.get(reverseSum.size()-1);
				reverseSum.set(reverseSum.size()-1,temp%10);
				carry = 1;
			} else {
				carry = 0;
			}
			if(l1Current != null) l1Current = l1Current.next;
			if(l2Current != null) l2Current = l2Current.next;
		}
		if(carry == 1)  reverseSum.add(1);
		
		//create result
		int reverseSumSize = reverseSum.size();
		for(int i = 0; i < reverseSumSize; i++) {
			current.val = reverseSum.get(i);
			if(i < reverseSumSize-1) current.next = new ListNode();
			current = current.next;
		}
		return head;
    }
}
