package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartitionListTest {

	ListNode l1 = new ListNode();
	ListNode l2 = new ListNode();
	ListNode l3 = new ListNode();
	ListNode l4 = new ListNode();
	ListNode l5 = new ListNode();
	ListNode l6 = new ListNode();
	ListNode l7 = new ListNode();
	
	ListNode sl1 = new ListNode();
	ListNode sl2 = new ListNode();
	ListNode sl3 = new ListNode();
	ListNode sl4 = new ListNode();
	ListNode sl5 = new ListNode();
	ListNode sl6 = new ListNode();
	ListNode sl7 = new ListNode();

	
	int[] result1 = new int[] {1,0,2,2,4,3,5};
	
	PartitionList p = new PartitionList();
	
	@Test
	public void test() {
		
		l1.val = 1;
		l2.val = 4;
		l3.val = 3;
		l4.val = 0;
		l5.val = 2;
		l6.val = 5;
		l7.val = 2;
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = null;
		
		sl1.val = 1;
		sl2.val = 0;
		sl3.val = 2;
		sl4.val = 2;
		sl5.val = 4;
		sl6.val = 3;
		sl7.val = 5;
		
		sl1.next = l2;
		sl2.next = l3;
		sl3.next = l4;
		sl4.next = l5;
		sl5.next = l6;
		sl6.next = l7;
		sl7.next = null;
		
		assertEquals(sl1,p.partition(l1,3));
	}

}
