package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RestoreIPAddressesTest {

	
	RestoreIPAddresses r = new RestoreIPAddresses();
	
	@Test
	public void test() {
		assertEquals(new ArrayList<String>(),r.restoreIpAddresses("0000"));
		assertEquals(new ArrayList<String>(),r.restoreIpAddresses("25525511135"));
	}

}
