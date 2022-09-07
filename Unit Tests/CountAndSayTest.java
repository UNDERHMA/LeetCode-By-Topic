package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountAndSayTest {

	CountAndSay c = new CountAndSay();
	
	@Test
	public void test() {
		assertEquals("1211",c.countAndSay(4));
	 	assertEquals("23321511",c.countAndSay(5));
	}

}
