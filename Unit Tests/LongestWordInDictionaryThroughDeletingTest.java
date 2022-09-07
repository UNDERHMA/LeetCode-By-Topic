package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LongestWordInDictionaryThroughDeletingTest {

	List<String> input1 = new ArrayList<>();
	List<String> input2 = new ArrayList<>();
	
	LongestWordInDictionaryThroughDeleting l = new LongestWordInDictionaryThroughDeleting();
	
	@Test
	public void test() {
		input1.add("ale");
		input1.add("apple");
		input1.add("monkey");
		input1.add("plea");
		
		input2.add("a");
		input2.add("b");
		input2.add("c");
		
		assertEquals("apple",l.findLongestWord("abpcplea", input1));
		assertEquals("a",l.findLongestWord("abpcplea", input2));
	}

}
