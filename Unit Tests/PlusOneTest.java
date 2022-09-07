package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlusOneTest {
	
	int[] input1 = new int[] {9,9,9};
	int[] input2 = new int[] {0};
	int[] input3 = new int[] {5,0,9,9};
	int[] input4 = new int[] {5,9,9,9};
	
	int[] result1 = new int[] {1,0,0,0};
	int[] result2 = new int[] {1};
	int[] result3 = new int[] {5,1,0,0};
	int[] result4 = new int[] {6,0,0,0};
	
	PlusOne p = new PlusOne();
	
	@Test
	public void test() {
		assertArrayEquals(result1,p.plusOne(input1));
		assertArrayEquals(result2,p.plusOne(input2));
		assertArrayEquals(result3,p.plusOne(input3));
		assertArrayEquals(result4,p.plusOne(input4));
	}

}
