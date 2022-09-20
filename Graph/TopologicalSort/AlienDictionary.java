package leetcode.LeetCode.Graph.TopologicalSort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class AlienDictionary {

	public String alienOrder(String[] words) {
        
		Map<Character,LetterNode> letterMap = new HashMap<>();
		int wordsLength = words.length;
		
		// Create all LetterNodes and put in the map
		for(String str : words) {
			for(char c : str.toCharArray()) {
				letterMap.putIfAbsent(c, new LetterNode(c));
			}
		}
		
		/* Iterate words, comparing words[i] to words[i+1], 1 character at a time. Once different stop. 
			The first different characters are a definite edge that indicates topological ordering of letters */
		for(int i = 0; i < wordsLength-1; i++) {
			String word1 = words[i];
			String word2 = words[i+1];
			if(word2.startsWith(word1)) continue;
			if(word1.startsWith(word2)) return ""; // to handle invalid test case [abc,ab]
			boolean unequalStarting = false;
			int currentIndex = 0;
			int word1Length = word1.length();
			while(!unequalStarting && currentIndex < word1Length) {
				if(word1.charAt(currentIndex) == word2.charAt(currentIndex)) {
					currentIndex++;
				} else {
					unequalStarting = true;
					letterMap.get(word1.charAt(currentIndex)).nextVertex.add(word2.charAt(currentIndex));
					letterMap.get(word2.charAt(currentIndex)).inDegree++;
				}
			}
		}
		
		// Add 0 in degree letters to a queue
		Queue<LetterNode> queue = new ArrayDeque<>();
		for(Map.Entry<Character, LetterNode> node : letterMap.entrySet()) {
			if(node.getValue().inDegree == 0) queue.add(node.getValue());
			
		}
		
		// Kahn's algorithm - see if there is a valid topological sort and record it in StringBuilder
		StringBuilder result = new StringBuilder();
		boolean[] visited = new boolean[26];
		while(!queue.isEmpty()) {
			LetterNode currentNode = queue.poll();
			result.append(currentNode.letter);
			for(Character c : currentNode.nextVertex) {
				LetterNode nextNode = letterMap.get(c);
				nextNode.inDegree--;
				if(visited[c-'a']) return ""; // cycle present. therefore topological sort impossible
				if(nextNode.inDegree == 0) {
					queue.add(nextNode);
					visited[c-'a'] = true;
				}
			}
		}
		// if all letters used, return string, else return "", as some nodes could not be used because inDegree was too high
		return result.length() == letterMap.size() ? result.toString() : "";
    }
	
	private class LetterNode {
		
		private char letter;
		private List<Character> nextVertex;
		private int inDegree;
		
		public LetterNode(char letter) {
			this.letter = letter;
			this.nextVertex = new ArrayList<>();
			this.inDegree = 0;
		}
	}

}
