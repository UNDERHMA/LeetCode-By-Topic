package GooglePrep.GooglePrep;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithAtMostTwoDistinctCharacters {

	public int lengthOfLongestSubstringTwoDistinct(String s) {
       
		if(s == null || s.length() == 0) return 0;
		char[] sAsCharArray = s.toCharArray();
		int sLength = s.length();
		int currentCount = 0, maxCount = 0, currentIndex = 0;
		int letterOneIndex = -1, letterTwoIndex = -1, maxUniqueIndex = -1;
		
		while(currentIndex < sLength) {
			if(letterOneIndex == -1) {
				letterOneIndex = currentIndex;
			} else if(letterTwoIndex == -1) {
				letterTwoIndex = currentIndex;
			} 
			if(letterTwoIndex != -1 
					&& sAsCharArray[currentIndex] != sAsCharArray[letterOneIndex]
					&& sAsCharArray[currentIndex] != sAsCharArray[letterTwoIndex]) {
				if(currentCount > maxCount) maxCount = currentCount;
				letterOneIndex = maxUniqueIndex;
				letterTwoIndex = currentIndex;
				currentCount = letterTwoIndex - letterOneIndex;
			}
			if(maxUniqueIndex == -1 
					|| sAsCharArray[currentIndex] != sAsCharArray[maxUniqueIndex]) {
				maxUniqueIndex = currentIndex;
			}
			currentCount++;
			currentIndex++;		
		}
		if(currentCount > maxCount) maxCount = currentCount;
		return maxCount;
    }

}
