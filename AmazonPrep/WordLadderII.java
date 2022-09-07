package AmazonPrep.AmazonPrep;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class WordLadderII {

	public List<List<String>> findLadders(String beginWord, String endWord, 
			List<String> wordList) {
 
		
		List<List<String>> result = new ArrayList<>();
		if(beginWord == null || endWord == null || wordList == null) return result;
		int beginWordLength = beginWord.length();
		
		//return empty list if endWord not in wordList
		boolean answerPossible = false;
		for(String word : wordList) {
			if(word.equals(endWord)) {
				answerPossible = true;
				break;
			}
		}
		if(!answerPossible) return result;
		Deque<List<String>> currentWordQueue = new ArrayDeque<>();
		List<String> tempList = new ArrayList<>();
		tempList.add(beginWord);
		currentWordQueue.add(tempList);
		Iterator<String> wordListIterator = wordList.iterator();
		String currentWord = beginWord;
		String currentWordListWord;
		int queueSize = 1;
		
		// Create an adjacency map to speed up
		Map<String,List<String>> adjacencyList = new HashMap<>();
		while(wordListIterator.hasNext()) {
			currentWordListWord = wordListIterator.next();
			fillAdjacencyList(currentWordListWord,adjacencyList,beginWordLength);
		}
		wordListIterator = wordList.iterator();
		
		//Keep track of visited
		Set<String> visited = new HashSet<>();
		visited.add(beginWord);		
		
		while(!currentWordQueue.isEmpty() && result.size() == 0) {
			queueSize = currentWordQueue.size();
			for(int i = 0; i < queueSize; i++) {
				tempList = currentWordQueue.poll();
				currentWord = tempList.get(tempList.size()-1);
				visited.add(currentWord);	
				while(wordListIterator.hasNext()) {
					currentWordListWord = wordListIterator.next();
					if(!visited.contains(currentWordListWord) &&       
							adjacencyList.get(currentWordListWord).contains(currentWord)) {
						tempList.add(currentWordListWord);
						currentWordQueue.add(new ArrayList<>(tempList));
						if(currentWordListWord.equals(endWord)) {
                            result.add(new ArrayList<>(tempList));
                        }
						tempList.remove(tempList.size()-1);
					}
				}
				wordListIterator = wordList.iterator();
			}
		}
		return result;
    }
	
	public static void fillAdjacencyList(String s1, Map<String,List<String>> adjacencyList,
			int beginWordLength) {
		
		List<String> adjacencyListStrings = new ArrayList<>();
		char[] s1CharArray = s1.toCharArray();
		char c;
		char temp;
		for(int j = 0; j < beginWordLength; j++) {
			c = 'a';
			for(int i = 0; i < 26; i++) {
				temp = s1CharArray[j];
				s1CharArray[j] = c;
				adjacencyListStrings.add(String.valueOf(s1CharArray));
				s1CharArray[j] = temp;
				c++;
			}
		}
		adjacencyList.put(s1, adjacencyListStrings);
	}
	
}
