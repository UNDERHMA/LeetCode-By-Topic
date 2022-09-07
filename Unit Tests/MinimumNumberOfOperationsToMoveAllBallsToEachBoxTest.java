package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBoxTest {

	int[] result2 = new int[] {11,8,5,4,3,4};
	int[] result1 = new int[] {1,1,3};
	
	MinimumNumberOfOperationsToMoveAllBallsToEachBox m = new MinimumNumberOfOperationsToMoveAllBallsToEachBox();
	
	@Test
	public void test() {
		assertEquals(result2,m.minOperations("001011"));
		assertEquals(result1,m.minOperations("110"));
	}

}
