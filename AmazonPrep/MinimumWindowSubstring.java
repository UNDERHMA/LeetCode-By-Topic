package AmazonPrep.AmazonPrep;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	public String minWindow(String s, String t) {
		
		if(s == null || t == null) return "";
		int sLength = s.length();
		int tLength = t.length();
		if(sLength == 0 || tLength == 0 || sLength < tLength) return "";
		
		Map<Character,Integer> tCharacterCounts = new HashMap<>();
		Map<Character,Integer> currentCharacterCounts = new HashMap<>();
		int startMinWindowIndex = 0;
		int endMinWindowIndex = 0;
		int finalStartMinWindowIndex = 0;
		int finalEndMinWindowIndex = 0;
		int minWindowSize = Integer.MAX_VALUE;
		int tCharactersFound = 0;
		
		for(char c : t.toCharArray()) {
			if(tCharacterCounts.containsKey(c)) {
				tCharacterCounts.put(c,tCharacterCounts.get(c)+1);
			}
			else {
				tCharacterCounts.put(c,1);
			}
		}
		
		for(int i = 0; i < sLength; i++) {
			while(i-startMinWindowIndex > minWindowSize) {
				if(tCharacterCounts.containsKey(s.charAt(startMinWindowIndex))) {
					currentCharacterCounts.put(s.charAt(startMinWindowIndex),
							currentCharacterCounts.get(s.charAt(startMinWindowIndex))-1);
					if(currentCharacterCounts.get(s.charAt(startMinWindowIndex)) <
							tCharacterCounts.get(s.charAt(startMinWindowIndex))) {
					tCharactersFound--;
					}
				}
				startMinWindowIndex++;
			}
			if(tCharacterCounts.containsKey(s.charAt(i))) {
				if(currentCharacterCounts.get(s.charAt(i)) != null) {
					currentCharacterCounts.put(s.charAt(i),
							currentCharacterCounts.get(s.charAt(i))+1);
				}
				else {
					currentCharacterCounts.put(s.charAt(i),1);
				}
				if(currentCharacterCounts.get(s.charAt(i)) <=
						tCharacterCounts.get(s.charAt(i))) {
					tCharactersFound++;
				}
			}
			if(tCharactersFound == tLength) {
				endMinWindowIndex = i+1;
				if((endMinWindowIndex - startMinWindowIndex) < minWindowSize) {
					minWindowSize = endMinWindowIndex - startMinWindowIndex;
					finalStartMinWindowIndex = startMinWindowIndex;
					finalEndMinWindowIndex = endMinWindowIndex;
				}
				while(startMinWindowIndex < endMinWindowIndex){
					if(tCharacterCounts.containsKey(s.charAt(startMinWindowIndex))) {
						currentCharacterCounts.put(s.charAt(startMinWindowIndex),
								currentCharacterCounts.get(s.charAt(startMinWindowIndex))-1);
						if(currentCharacterCounts.get(s.charAt(startMinWindowIndex)) <
								tCharacterCounts.get(s.charAt(startMinWindowIndex))) {
							tCharactersFound--;
							break;
						}
					}
					startMinWindowIndex++;
						if((endMinWindowIndex - startMinWindowIndex) < minWindowSize) {
							minWindowSize = endMinWindowIndex - startMinWindowIndex;
							finalStartMinWindowIndex = startMinWindowIndex;
							finalEndMinWindowIndex = endMinWindowIndex;
						}
					}
					startMinWindowIndex++;
				}
		}
		if(finalStartMinWindowIndex == finalEndMinWindowIndex) return "";
		else return s.substring(finalStartMinWindowIndex,finalEndMinWindowIndex);
	}
}
