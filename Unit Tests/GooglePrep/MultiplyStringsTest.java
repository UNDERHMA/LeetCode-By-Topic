package GooglePrep.GooglePrep;

import org.junit.Test;

import junit.framework.TestCase;

public class MultiplyStringsTest extends TestCase {

	
	@Test
	public void test() {
		MultiplyStrings m = new MultiplyStrings();
		assertEquals("56088",m.multiply("123", "456"));
		assertEquals("891",m.multiply("9", "99"));
		assertEquals("998001",m.multiply("999", "999"));
	}
}
