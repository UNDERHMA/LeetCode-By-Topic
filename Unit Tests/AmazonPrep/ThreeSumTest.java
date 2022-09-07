package AmazonPrep.AmazonPrep;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThreeSumTest {

	ThreeSum threeSum = new ThreeSum();
	int[] result1 = new int[1];
	
	@Test
	public void test() {
		assertEquals(result1, threeSum.threeSum(new int[] {-1,0,1,2,-1,-4}));
	}
}
