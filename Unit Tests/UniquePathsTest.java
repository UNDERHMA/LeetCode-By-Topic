package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniquePathsTest {

	@Test
	public void test() {
		
		UniquePaths up = new UniquePaths();
		assertEquals(28,up.uniquePaths(3,7));
		assertEquals(6,up.uniquePaths(3,3));
		assertEquals(6,up.uniquePaths(51,9));
	}

}
