package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeIntervalsTest {

	int[][] input1 = new int[][] {{1,4},{0,2},{3,5}};
	
	int[][] result1 = new int[][] {{0,5}};
	
	MergeIntervals m = new MergeIntervals();
	
	@Test
	public void test() {
		assertArrayEquals(result1, m.merge(input1));
	}

}
