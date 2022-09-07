package AmazonPrep.AmazonPrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinimumWindowSubstringTest {
	
	MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();

	@Test
	public void test() {
		assertEquals("BANC",minimumWindowSubstring.minWindow("ADOBECODEBANC","ABC"));
	}

}
