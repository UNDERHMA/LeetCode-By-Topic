package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyStringsTest {

	@Test
	public void test() {
		//assertEquals("53746843983", MultiplyStrings.multiply("881095803","61"));
		//assertEquals("56088", MultiplyStrings.multiply("123","456"));
		assertEquals("21451848", MultiplyStrings.multiply("3652","5874"));
		assertEquals("60352", MultiplyStrings.multiply("164","368"));
		assertEquals("891", MultiplyStrings.multiply("9","99"));
		assertEquals("891", MultiplyStrings.multiply("891","1"));
		assertEquals("891", MultiplyStrings.multiply("1","891"));
		assertEquals("19179547637400180912636493264327509839036469969611613642709710473877932314164", MultiplyStrings.multiply("6752716719037375654442652725945722915786612669126862029212","2840271321219335147"));
	}

}
