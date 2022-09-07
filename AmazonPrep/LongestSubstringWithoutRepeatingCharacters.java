package AmazonPrep.AmazonPrep;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		
	int longestLength = 0;
	int sLength = s.length();
	if(sLength < 1) return 0;
	HashMap<Character,Integer> uniqueChars = new HashMap<>();
	char[] stringAsCharArray = s.toCharArray();
	
	for(int i = 0; i < sLength; i++) {
		if(uniqueChars.get(stringAsCharArray[i]) != null) {
			longestLength = Math.max(longestLength, uniqueChars.size());
			i = uniqueChars.get(stringAsCharArray[i]);
			uniqueChars.clear();
		}
		else {
			uniqueChars.put(stringAsCharArray[i],i);
		}
	}
	
	if(!uniqueChars.isEmpty()) longestLength = Math.max(longestLength, uniqueChars.size());
	return longestLength;
	}
	
}
