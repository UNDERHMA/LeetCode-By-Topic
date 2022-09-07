package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchA2DMatrixTest {

	int[][] input1 = new int[][] {{1}};
	int[][] input2 = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
	int[][] input3 = new int[][] {{1,3}};
	int[][] input4 = new int[][] {{1,1},{2,2}};
	
	SearchA2DMatrix s = new SearchA2DMatrix();
	
	@Test
	public void test() {
		assertEquals(true,s.searchMatrix(input2,11));
		assertEquals(true,s.searchMatrix(input2,1));
		assertEquals(true,s.searchMatrix(input1,1));
		assertEquals(true,s.searchMatrix(input2,3));
		assertEquals(false,s.searchMatrix(input2,13));
		assertEquals(true,s.searchMatrix(input3,3));
		assertEquals(false,s.searchMatrix(input4,0));
	}

}
