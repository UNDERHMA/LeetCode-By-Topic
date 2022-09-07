package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidNumberTest {

	ValidNumber v = new ValidNumber();
	
	String[] valids = new String[] {
			"46.e3","-01", "2", "0089", "-0.1", "+3.14", "4.", "-.9", 
			"2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"};
	
	String[] invalids = new String[] {"abc", "1a", "1e", "e3", "99e2.5", 
			"--6", "-+3", "95a54e53","e",".","..2", "1.e", "e.1", "2ee2", ".8+",
			"4e1.e",".e1","4e3.", "43.e", "43e"};
	
	@Test
	public void test() {
		for(int i = 0; i < valids.length; i++) {
			assertTrue(v.isNumber(valids[i]));
		}
		for(int j = 0; j < invalids.length; j++) {
			assertFalse(v.isNumber(invalids[j]));
		}
	}

}
