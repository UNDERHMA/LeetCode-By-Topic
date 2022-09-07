package AmazonPrep.AmazonPrep;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	 char val;
	 Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
     TrieNode parent;
     String wordText;
}
