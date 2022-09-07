package AmazonPrep.AmazonPrep;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class WordSearchIITest {

	@Test
	public void test() {
		
		char[][] board = new char[1][2];
		board[0][0] = 'a';
		board[0][1] = 'b';
		
		String[] words = new String[1];
		words[0] = "ba";
		
		List<String> result = new ArrayList<>();
		result.add("ba");
		
		WordSearchII wordSearchII = new WordSearchII();
		
		assertEquals(result,wordSearchII.findWords(board, words));
		
	}

}
