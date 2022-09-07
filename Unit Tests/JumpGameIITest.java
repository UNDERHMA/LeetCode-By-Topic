package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class JumpGameIITest {

	
	int[] input1 = new int[] {2,3,1,1,4};
	int[] input2 = new int[] {2,3,0,1,4};
	int[] input3 = new int[] {1,2,1,1,1};
	int[] input4 = new int[] {5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5};
	int[] input5 = new int[] {3,2,1};
	int[] input6 = new int[] {3,1,1,1,1};
	int[] input7 = new int[] {4,1,1,3,1,1,1};
	
	JumpGameII j = new JumpGameII();
	
	@Test
	public void test() {
		assertEquals(5,j.jump(input4));
		assertEquals(3,j.jump(input3));
		assertEquals(2,j.jump(input1));
		assertEquals(2,j.jump(input2));
		assertEquals(1,j.jump(input5));
		assertEquals(2,j.jump(input6));
		assertEquals(2,j.jump(input7));
	}

}
