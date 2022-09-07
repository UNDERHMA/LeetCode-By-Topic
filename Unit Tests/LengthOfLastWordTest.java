package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class LengthOfLastWordTest {

	String s1 = "asdasdad";
	String s2 = "asda asdads";
	String s3 = "";
	String s4 = "a ";
	String s5 = "     ";
	
	LengthOfLastWord l = new LengthOfLastWord();
	
	@Test
	public void test() {
		assertEquals(8, l.lengthOfLastWord(s1));
		assertEquals(6, l.lengthOfLastWord(s2));
		assertEquals(0, l.lengthOfLastWord(s3));
		assertEquals(1, l.lengthOfLastWord(s4));
		assertEquals(0, l.lengthOfLastWord(s5));
	}

}
