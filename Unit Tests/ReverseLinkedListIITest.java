package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseLinkedListIITest {

	ReverseLinkedListII r = new ReverseLinkedListII();
	
	@Test
	public void test() {
		ListNode l5 = new ListNode(5,null);
		ListNode l4 = new ListNode(4,l5);
		ListNode l3 = new ListNode(3,l4);
		ListNode l2 = new ListNode(2,l3);
		ListNode l1 = new ListNode(1,l2);
		
		assertEquals(l1,r.reverseBetween(l1, 2, 4));
	}

}
