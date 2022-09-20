package leetcode.LeetCode.Graph.TopologicalSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlienDictionaryTest {

	@Test
	void test() {
		String[] words = new String[] {"z","x","z"};
		String[] words2 = new String[] {"z","z"};
		String[] words3 = new String[] {"abc","ab"};
		String[] words4 = new String[] {"z","x","a","zb","zx"};
		String[] words5 = new String[] {"aac","aabb","aaba"};
		
		AlienDictionary a = new AlienDictionary();
		
		assertEquals("cba",a.alienOrder(words5));	
		assertEquals("",a.alienOrder(words4));	
		assertEquals("",a.alienOrder(words3));	
		assertEquals("z",a.alienOrder(words2));	
		assertEquals("",a.alienOrder(words));		
	}

}
