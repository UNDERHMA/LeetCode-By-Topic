package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertIntervalTest {

	@Test
	public void test() {
	
		int[][] input1Intervals = new int[][] {{1,3},{6,9}};
		int[][] input2Intervals = new int[][] {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[][] input3Intervals = new int[][] {};
		int[][] input4Intervals = new int[][] {{1,5}};
		int[][] input5Intervals = new int[][] {{1,5}};
		int[][] input6Intervals = new int[][] {{1,5}};
		
		int[] input1New = new int[] {2,5};
		int[] input2New = new int[] {4,8};
		int[] input3New = new int[] {5,7};
		int[] input4New = new int[] {6,8};
		int[] input5New = new int[] {0,3};
		int[] input6New = new int[] {2,4};
		
		int[][] input1Result = new int[][] {{1,5},{6,9}};
		int[][] input2Result = new int[][] {{1,2},{3,10},{12,16}};
		int[][] input3Result = new int[][] {{5,7}};
		int[][] input4Result = new int[][] {{1,5},{6,8}};
		int[][] input5Result = new int[][] {{0,5}};
		int[][] input6Result = new int[][] {{1,5}};
		
		InsertInterval ii = new InsertInterval();
		
		assertArrayEquals(input1Result,ii.insert(input1Intervals,input1New));
		assertArrayEquals(input2Result,ii.insert(input2Intervals,input2New));
		assertArrayEquals(input3Result,ii.insert(input3Intervals,input3New));
		assertArrayEquals(input4Result,ii.insert(input4Intervals,input4New));
		assertArrayEquals(input5Result,ii.insert(input5Intervals,input5New));
		assertArrayEquals(input6Result,ii.insert(input6Intervals,input6New));
	}

}
