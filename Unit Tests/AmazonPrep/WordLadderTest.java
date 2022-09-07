package AmazonPrep.AmazonPrep;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class WordLadderTest {


	static String i1 = "hit";
	static String i2 = "cog";
	
	@Test
	public void test() {
		WordLadder wl = new WordLadder();
		List<String> inputList = new ArrayList<>();
		inputList.add("hot");
		inputList.add("dot");
		inputList.add("dog");
		inputList.add("lot");
		inputList.add("log");
		assertEquals(5, wl.ladderLength(i1, i2, inputList));
	}
}
