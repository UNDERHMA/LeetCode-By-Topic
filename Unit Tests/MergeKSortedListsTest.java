package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeKSortedListsTest {

	ListNode node1 = new ListNode(-2);
	ListNode node2 = new ListNode(-1);
	ListNode node3 = new ListNode(-1);
	ListNode node4 = new ListNode(-1);
	ListNode node5 = null;
	
	ListNode answer1 = new ListNode(-2);
	ListNode answer2 = new ListNode(-1);
	ListNode answer3 = new ListNode(-1);
	ListNode answer4 = new ListNode(-1);
	
	MergeKSortedLists m = new MergeKSortedLists();
	
	@Test
	public void test() {
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		ListNode[] input = new ListNode[2];
		input[0] = node1;
		input[1] = node5;
		
		answer1.next = answer2;
		answer2.next = answer3;
		answer3.next = answer4;
		assertEquals(answer1,m.mergeKLists(input));
	}

}
