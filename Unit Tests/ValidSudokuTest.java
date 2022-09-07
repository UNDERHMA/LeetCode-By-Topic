package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidSudokuTest {

	char[][] board1 = new char[][] 
			{{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
	
	@Test
	public void test() {
		assertEquals(true, ValidSudoku.isValidSudoku(board1));
	}

}
