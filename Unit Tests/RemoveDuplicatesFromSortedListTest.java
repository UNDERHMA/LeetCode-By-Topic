package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {

	ListNode one = new ListNode(1);
	ListNode two = new ListNode(1);
	ListNode three = new ListNode(2);
	
	RemoveDuplicatesFromSortedList r = new RemoveDuplicatesFromSortedList();
	
	@Test
	public void test() {
		one.next = two;
		two.next = three;
		int[] test = new int[2];
		int index = 0;
		int[] answer = new int[] {1,2};
		
		ListNode head = r.deleteDuplicates(one);
		while(head != null) {
			test[index++] = head.val;
			head = head.next;
		}
		
		assertArrayEquals(answer,test);
	}

}
