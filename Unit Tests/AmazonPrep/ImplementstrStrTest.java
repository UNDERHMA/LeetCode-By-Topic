package AmazonPrep.AmazonPrep;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImplementstrStrTest {

	ImplementstrStr i = new ImplementstrStr();
	
	@Test
	public void test() {
		assertEquals(4,i.strStr("mississippi","issip"));
		assertEquals(2,i.strStr("hello","ll"));
		assertEquals(-1,i.strStr("aaaaa","bba"));
		assertEquals(0,i.strStr("",""));
	}
	
}
