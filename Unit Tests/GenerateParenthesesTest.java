package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GenerateParenthesesTest {
	
	String[] strings = new String[] {
	  "((()))",
	  "(()())",
	  "(())()",
	  "()(())",
	  "()()()"};
	
	String[] strings2 = new String[] {
			  "()"};
	
	List<String> result =  Arrays.asList(strings);
	List<String> result2 =  Arrays.asList(strings2);
			
	@Test
	public void test() {
		//assertEquals(result, GenerateParentheses.generateParenthesis(3));
		assertEquals(result2, GenerateParentheses.generateParenthesis(1));
	}

}
