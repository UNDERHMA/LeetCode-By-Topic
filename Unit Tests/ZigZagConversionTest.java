package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZigZagConversionTest {

	@Test
	public void test() {
		assertEquals("PAHNAPLSIIGYIR", ZigZagConversion.convert("PAYPALISHIRING", 3));
		assertEquals("PINALSIGYAHRPI", ZigZagConversion.convert("PAYPALISHIRING", 4));
		assertEquals("ACB", ZigZagConversion.convert("ABC", 2));
	}

}
