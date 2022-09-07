package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TextJustificationTest {

	String[] input1 = new String[] {"This", "is", "an", "example", "of", 
			"text", "justification."};
	String[] input2 = new String[] {"What","must","be","acknowledgment",
			"shall","be"};
	String[] input3 = new String[] {"Science","is","what","we","understand","well",
			"enough","to","explain","to","a","computer.","Art",
			"is","everything","else","we","do"};
	String[] input4 = new String[] {"ask","not","what","your","country","can","do",
			"for","you","ask","what","you","can","do","for","your","country"};
	
	List<String> result1 = new ArrayList<>();
	List<String> result2 = new ArrayList<>();
	List<String> result3 = new ArrayList<>();
	List<String> result4 = new ArrayList<>();
	
	TextJustification tj = new TextJustification();
	
	@Test
	public void test() {
		result1.add("This    is    an");
		result1.add("example  of text");
		result1.add("justification.  ");
		
		result2.add("What   must   be");
		result2.add("acknowledgment  ");
		result2.add("shall be        ");
		
		result3.add("Science  is  what we");
		result3.add("understand      well");
		result3.add("enough to explain to");
		result3.add("a  computer.  Art is");
		result3.add("everything  else  we");
		result3.add("do                  ");

		result4.add("ask   not   what");
		result4.add("your country can");
		result4.add("do  for  you ask");
		result4.add("what  you can do");
		result4.add("for your country");

		assertEquals(result1,tj.fullJustify(input1, 16));
		assertEquals(result2,tj.fullJustify(input2, 16));
		assertEquals(result3,tj.fullJustify(input3, 20));
		assertEquals(result4,tj.fullJustify(input4, 16));
	}

}
