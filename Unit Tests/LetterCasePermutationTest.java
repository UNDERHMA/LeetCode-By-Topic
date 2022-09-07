package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LetterCasePermutationTest {

	List<String> result1 = new ArrayList<>();
	List<String> result2 = new ArrayList<>();
	
	LetterCasePermutation l = new LetterCasePermutation();
	
	@Test
	public void test() {
		result1.add("a1b2");
		result1.add("a1B2");
		result1.add("A1b2");
		result1.add("A1B2");
		
		result2.add("mqe");
		result2.add("mqE");
		result2.add("mQe");
		result2.add("mQE");
		result2.add("Mqe");
		result2.add("MqE");
		result2.add("MQe");
		result2.add("MQE");
		
		assertEquals(result1, l.letterCasePermutation("a1b2"));
		assertEquals(result2, l.letterCasePermutation("mQe"));
	}

}
