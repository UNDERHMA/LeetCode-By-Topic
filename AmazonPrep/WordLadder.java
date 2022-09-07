package AmazonPrep.AmazonPrep;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder {

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		
		//check for valid input
		if(beginWord == null || endWord == null || wordList == null) return 0;
		int beginWordLength = beginWord.length();
		
		Deque<String> transformationQueue = new ArrayDeque<>();
		transformationQueue.add(beginWord);
		Set<String> usedTransformations = new HashSet<>();
		
		//make sure endWord is in list, else return 0
		
		String currentString;
		int numberOfWordsInTransformationChain = 1;
		int numberOfWordsInBFSIteration;
		while(!transformationQueue.isEmpty()) {
			numberOfWordsInBFSIteration = transformationQueue.size();
			for(int i = 0; i < numberOfWordsInBFSIteration; i++) {
				currentString = transformationQueue.poll();
				if(currentString.equals(endWord)) {
					return numberOfWordsInTransformationChain;
				}
				for(String potentialTransformation : wordList) {
					if(isValidTransformation(currentString, potentialTransformation, beginWordLength)
							&& !usedTransformations.contains(potentialTransformation)) {
						transformationQueue.add(potentialTransformation);
						usedTransformations.add(potentialTransformation);
					}
				}
			}
			numberOfWordsInTransformationChain++;
		}
		return 0;
    }

	public static boolean isValidTransformation(String beginWord, String potentialTransformation,
			int beginWordLength) {
		
		int charactersDifferent = 0;
		int currentChar = 0;
		while(currentChar < beginWordLength) {
			if(beginWord.charAt(currentChar) != potentialTransformation.charAt(currentChar)) {
				charactersDifferent++;
			}
			if(charactersDifferent > 1) return false;
			currentChar++;
		}
		return charactersDifferent == 1 ? true : false;
	}
}
