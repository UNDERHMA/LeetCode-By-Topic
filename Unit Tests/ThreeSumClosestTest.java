package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeSumClosestTest {

	int[] s1 = new int[] {-1,2,1,-4};
	int[] s2 = new int[] {0,0,0};
	int[] s3 = new int[] {0,2,1,-3};
	int[] s4 = new int[] {1,1,-1,-1,3};
	int[] s5 = new int[] {1,2,4,8,16,32,64,128};
	
	@Test
	public void test() {
		/*assertEquals(2, ThreeSumClosest.threeSumClosest(s1, 1));
		assertEquals(0, ThreeSumClosest.threeSumClosest(s2, 1));
		assertEquals(0, ThreeSumClosest.threeSumClosest(s3, 1));
		assertEquals(-1, ThreeSumClosest.threeSumClosest(s4, -1));*/
		assertEquals(82, ThreeSumClosest.threeSumClosest(s5, 82));
	}

}
