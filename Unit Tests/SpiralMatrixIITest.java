package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpiralMatrixIITest {

	int [][] test1 = new int[][] {{1,2,3},{8,9,4},{7,6,5}};
	int [][] test2 = new int[][] {{1}};
	int [][] test3 = new int[][] {{}};
	int [][] test4 = new int[][] {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
	
	SpiralMatrixII s = new SpiralMatrixII();
	
	@Test
	public void test() {
		assertArrayEquals(test1,s.generateMatrix(3));
		assertArrayEquals(test2,s.generateMatrix(1));
		assertArrayEquals(test3,s.generateMatrix(0));
		assertArrayEquals(test4,s.generateMatrix(4));
	}

}
