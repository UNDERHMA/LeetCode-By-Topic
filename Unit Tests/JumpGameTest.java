package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class JumpGameTest {

	@Test
	public void test() {

		int[] result1 = new int[] {2,3,1,1,4};
		int[] result2 = new int[] {3,2,1,0,4};
		int[] result3 = new int[] {2,0};
		
		JumpGame jg = new JumpGame();

		assertTrue(jg.canJump(result1));
		assertFalse(jg.canJump(result2));
		assertTrue(jg.canJump(result3));
	}

}
