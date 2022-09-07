package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.LeetCode.AddTwoNumbers.ListNode;

public class AddTwoNumbersTest {

	ListNode three = new ListNode(8);
	ListNode two = new ListNode(0, three);
	ListNode one = new ListNode(7, two);

	ListNode three1 = new ListNode(3);
	ListNode two1 = new ListNode(4, three1);
	ListNode one1 = new ListNode(2, two1);
	
	ListNode three2 = new ListNode(4);
	ListNode two2 = new ListNode(6, three2);
	ListNode one2 = new ListNode(5, two2);
	
	ListNode one3 = new ListNode(0);
	
	@Test
	public void test() {
		assertEquals(one, AddTwoNumbers.addTwoNumbers(one1,one2));
		assertEquals(one3, AddTwoNumbers.addTwoNumbers(one3,one3));
	}

}
