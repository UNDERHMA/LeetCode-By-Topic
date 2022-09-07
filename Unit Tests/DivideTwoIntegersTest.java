package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivideTwoIntegersTest {

	
	
	DivideTwoIntegers d = new DivideTwoIntegers();
	
	@Test
	public void test() {
		assertEquals(-2,d.divide(-1039162657,490823224));
		assertEquals(0,d.divide(1004958205,-2137325331));
		assertEquals(-1,d.divide(10,-10));
		assertEquals(0,d.divide(1,2)); 
		assertEquals(-1073741824,d.divide(-2147483648,2));
		assertEquals(3,d.divide(10,3));
		assertEquals(-2,d.divide(7,-3));
		assertEquals(2,d.divide(-7,-3));
		assertEquals(0,d.divide(0,1));
		assertEquals(1,d.divide(1,1)); 
		assertEquals(-1,d.divide(1,-1)); 
		assertEquals(1,d.divide(Integer.MAX_VALUE,Integer.MAX_VALUE));
		assertEquals(-1,d.divide(Integer.MIN_VALUE,Integer.MAX_VALUE));
		assertEquals(Integer.MAX_VALUE,d.divide(Integer.MIN_VALUE,-1));
		assertEquals(Integer.MIN_VALUE,d.divide(Integer.MIN_VALUE,1));
		assertEquals(1,d.divide(Integer.MIN_VALUE,Integer.MIN_VALUE));
		assertEquals(0,d.divide(Integer.MAX_VALUE,Integer.MIN_VALUE));
	}

}
