package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddBinaryTest {
	
	String a1 = "11";
	String b1 = "1";
	String a2 = "1010";
	String b2 = "1011";
	String a3 = "1011";
	String b3 = "1010";
	String a4 = "1011";
	String b4 = "10111010";
	String a5 = "10111010";
	String b5 = "1011";

	AddBinary ab = new AddBinary();
	
	@Test
	public void test() {
		assertEquals("100",ab.addBinary(a1, b1));
		assertEquals("10101",ab.addBinary(a2, b2));
		assertEquals("10101",ab.addBinary(a3, b3));
		assertEquals("11000101",ab.addBinary(a4, b4));
		assertEquals("11000101",ab.addBinary(a5, b5));
	}

}
