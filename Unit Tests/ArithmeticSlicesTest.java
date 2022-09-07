package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticSlicesTest {

	int[] input1 = new int[] {1,2,3,4,5,6};
	int[] input2 = new int[] {1,2,3,8,9,10};
	
	ArithmeticSlices a = new ArithmeticSlices();
	
	@Test
	public void test() {
		assertEquals(10,a.numberOfArithmeticSlices(input1));
		assertEquals(2,a.numberOfArithmeticSlices(input2));
	}

}
