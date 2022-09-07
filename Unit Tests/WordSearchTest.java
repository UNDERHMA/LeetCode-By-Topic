package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordSearchTest {

	char[][] inputBoard = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
	
	String input1 = "ABCCED";
	String input2 = "SEE";
	String input3 = "ABCB";
	
	WordSearch w = new WordSearch();
	
	@Test
	public void test() {
		assertEquals(true,w.exist(inputBoard, input1));
		assertEquals(true,w.exist(inputBoard, input2));
		assertEquals(false,w.exist(inputBoard, input3));
	}

}
