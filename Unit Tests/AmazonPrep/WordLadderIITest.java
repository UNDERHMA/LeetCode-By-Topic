package AmazonPrep.AmazonPrep;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class WordLadderIITest {

	WordLadderII wordLadder = new WordLadderII();
	
	@Test
	public void test() {
		List<String> strings = new ArrayList<>();
		strings.add("hot");
		strings.add("dot");
		strings.add("dog");
		strings.add("lot");
		strings.add("log");
		strings.add("cog");
		List<List<String>> result = new ArrayList<>();
		assertEquals(result, 
				wordLadder.findLadders("hit", "cog", strings));
	}
}
