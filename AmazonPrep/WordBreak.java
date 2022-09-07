package AmazonPrep.AmazonPrep;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public boolean wordBreak(String s, List<String> wordDict) {
        
		if(s == null || wordDict.isEmpty() || s.length() == 0) return false;
		int sLength = s.length();
		Set<String> memo = new HashSet<>();
		
		return (isPossible(s,wordDict,sLength,memo,0));
    }
	
	private boolean isPossible(String s, List<String> wordDict, int sLength, Set<String> memo, int startIndex) {
		
		if(startIndex == sLength) return true;
		if(memo.contains(s.substring(0,startIndex+1))) return false;
		boolean possible = false;
		
		for(int i = startIndex; i <= sLength; i++) {
			if(wordDict.contains(s.substring(startIndex, i))) {
				possible = isPossible(s,wordDict,sLength,memo,i);
			}
			if(possible) break;
		}
		if(!possible) memo.add(s.substring(0,startIndex+1));
		
		return possible;
	}

}
