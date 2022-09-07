package leetcode.LeetCode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import leetcode.LeetCode.MergeTwoSortedLists.ListNode;

public class MergeTwoSortedListsTest {

	@Test
	public void test() {
	
		MergeTwoSortedLists.ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		
		ListNode nextl1 = new ListNode(2);
		ListNode nextl2 = new ListNode(3);
		
		ListNode lastl1 = new ListNode(4);
		ListNode lastl2 = new ListNode(4);
		
		l1.next = nextl1;
		nextl1.next = lastl1;
		l2.next = nextl2;
		nextl2.next = lastl2;
		
		ListNode r1 = new ListNode(1);
		ListNode r2 = new ListNode(1);
		ListNode r3 = new ListNode(2);
		ListNode r4 = new ListNode(3);
		ListNode r5 = new ListNode(4);
		ListNode r6 = new ListNode(4);
		
		r1.next = r2;
		r2.next = r3;
		r3.next = r4;
		r4.next = r5;
		r5.next = r6;
		
		
		assertEquals(r1, MergeTwoSortedLists.mergeTwoLists(l1,l2));
	}
}
