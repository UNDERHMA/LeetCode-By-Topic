package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimplifyPathTest {

	String input1 = "/...";
	String input2 = "/../";
	String input3 = "/home//foo/";
	String input4 = "/a/./b/../../c/";
	String input5 = "";
	String input6 = "/a/../../b/../c//.//";
	String input7 = "/a//b////c/d//././/..";
	String input8 = "/a//b////c/d//././/hands";
	
	String result1 = "/...";
	String result2 = "/";
	String result3 = "/home/foo";
	String result4 = "/c";
	String result5 = "/";
	String result6 = "/c";
	String result7 = "/a/b/c";
	String result8 = "/a/b/c/d/hands";
	
	SimplifyPath sp = new SimplifyPath();
	
	@Test
	public void test() {
		assertEquals(result1,sp.simplifyPath(input1));
		assertEquals(result2,sp.simplifyPath(input2));
		assertEquals(result3,sp.simplifyPath(input3));
		assertEquals(result4,sp.simplifyPath(input4));
		assertEquals(result5,sp.simplifyPath(input5));
		assertEquals(result6,sp.simplifyPath(input6));
		assertEquals(result7,sp.simplifyPath(input7));
		assertEquals(result8,sp.simplifyPath(input8));
	}

}
