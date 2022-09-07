package GooglePrep.GooglePrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class BackSpaceStringCompareTest {

	@Test
	public void test() {
		BackSpaceStringCompare b = new BackSpaceStringCompare();
		String s1 = "ab#c";
		String s2 = "ad#c";
		
		String s3 = "ab##";
		String s4 = "c#d#";
		
		String s5 = "a##c";
		String s6 = "#a#c";
		
		String s7 = "bxj##tw";
		String s8 = "bxo#j##tw";
		
		String s9 = "nzp#o#g";
		String s10 = "b#nzp#o#g";

		String s11 = "rheyggodcclgstf";
		String s12 = "#rheyggodcclgstf";
		
		assertEquals(true,b.backspaceCompare(s11, s12));
		assertEquals(true,b.backspaceCompare(s9, s10));
		assertEquals(true,b.backspaceCompare(s7, s8));
		assertEquals(true,b.backspaceCompare(s1, s2));
		assertEquals(true,b.backspaceCompare(s3, s4));
		assertEquals(true,b.backspaceCompare(s5, s6));
	}

}
