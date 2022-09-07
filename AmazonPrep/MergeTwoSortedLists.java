package AmazonPrep.AmazonPrep;

public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
		if(l1 == null && l2 == null) return null;
		ListNode l1Current = l1;
		ListNode l2Current = l2;
		ListNode head;
		ListNode resultCurrent;
		if(l1Current == null) return l2Current;
		if(l2Current == null) return l1Current;
		if(l1Current.val <= l2Current.val)  {
			head = l1Current;
			l1Current = l1Current.next;
		}
		else {
			head = l2Current;
			l2Current = l2Current.next;
		}
		
		resultCurrent = head;
		while(l1Current != null || l2Current != null) {
			
			if(l1Current != null && l2Current != null) {
				if(l1Current.val <= l2Current.val)  {
					resultCurrent.next = l1Current;
					l1Current = l1Current.next;
					resultCurrent = resultCurrent.next;
				}
				else {
					resultCurrent.next = l2Current;
					l2Current = l2Current.next;
					resultCurrent = resultCurrent.next;
				}
			}
			else if(l1Current == null) {
				resultCurrent.next = l2Current;
				break;
			}
			else  {
				resultCurrent.next = l1Current;
				break;
			}
		}
		return head;
    }
	
}
