package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class EditDistanceTest {
	
	String input1Word1 = "horse";
	String input1Word2 = "ros";
	String input3Word1 = "";
	String input4Word1 = "zoologicoarchaeologist";
	
	String input2Word1 = "intention";
	String input2Word2 = "execution";
	String input3Word2 = "four";
	String input4Word2 = "zoogeologist";
	
	EditDistance ed = new EditDistance();
	
	@Test
	public void test() {
		assertEquals(3,ed.minDistance(input1Word1, input1Word2));
		assertEquals(5,ed.minDistance(input2Word1, input2Word2));
		assertEquals(4,ed.minDistance(input3Word1, input3Word2));
		assertEquals(10,ed.minDistance(input4Word1, input4Word2));
	}

}
