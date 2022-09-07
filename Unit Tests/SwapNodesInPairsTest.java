package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.LeetCode.SwapNodesInPairs.ListNode;

public class SwapNodesInPairsTest {

	ListNode l4 = new ListNode(4);
	ListNode l3 = new ListNode(3, l4);
	ListNode l2 = new ListNode(2, l3);
	ListNode l1 = new ListNode(1, l2);
	
	
	
	@Test
	public void test() {
		assertEquals(l1, SwapNodesInPairs.swapPairs(l1));
		assertEquals(null, SwapNodesInPairs.swapPairs(null));
		assertEquals(l1, SwapNodesInPairs.swapPairs(l1));
	}

}
