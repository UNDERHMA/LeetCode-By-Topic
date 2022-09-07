package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.LeetCode.RotateList.ListNode;

public class RotateListTest {

	@Test
	public void test() {
	
		ListNode l1 = new ListNode();
		ListNode l2 = new ListNode();
		ListNode l3 = new ListNode();
		ListNode l4 = new ListNode();
		ListNode l5 = new ListNode();
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		RotateList rl = new RotateList();
		
		assertEquals(l4,rl.rotateRight(l1,2));
		
	}

}
