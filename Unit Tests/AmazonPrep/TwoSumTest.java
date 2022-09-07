package AmazonPrep.AmazonPrep;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class TwoSumTest extends TestCase {

	TwoSum twoSum = new TwoSum();
	int[] answer1 = new int[] {0,1};
	int[] input1 = new int[] {2,7,11,15};
	int[] answer2 = new int[] {1,2};
	int[] input2 = new int[] {3,2,4};

	@Test
	public void test() {
		assertArrayEquals(answer1,twoSum.twoSum(input1,9));
		assertArrayEquals(answer2,twoSum.twoSum(input2,6));
	}
}
