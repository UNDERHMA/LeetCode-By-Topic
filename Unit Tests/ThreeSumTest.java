package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ThreeSumTest {

	List<List<Integer>> dummy = new ArrayList<>();
	
	ThreeSum t = new ThreeSum();
	@Test
	public void test() {
		assertEquals(dummy,t.threeSum(new int[] {-1,0,1,2,-1,-4,-2,-3,3,0,4}));
	}

}
