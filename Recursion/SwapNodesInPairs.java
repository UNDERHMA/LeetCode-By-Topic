package leetcode.LeetCode.Recursion;

public class SwapNodesInPairs {
	
	public Node swapPairs(Node head) {
		if(head == null) {
			return null;
		}
		if(head.next == null) {
			return head;
		}
		Node newHead = head.next;
		head.next = newHead.next;
		newHead.next = head;
		head.next = swapPairs(head.next);
		return newHead;
    }
}
