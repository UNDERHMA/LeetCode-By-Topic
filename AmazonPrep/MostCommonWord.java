package AmazonPrep.AmazonPrep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
public String mostCommonWord(String paragraph, String[] banned) {
		
		int paragraphLength = paragraph.length();
        if(paragraphLength == 0) return "";
        Set<String> bannedSet = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();
        char[] paragraphCharArray = paragraph.toCharArray();
        
        for(String s : banned) {
        	bannedSet.add(s.toLowerCase());
        }
        
        int start = 0;
        String tempString;
        int tempWordCount;
        for(int i = 0; i < paragraphLength; i++) {
        	if(Character.isLetter(paragraphCharArray[i]) && i != paragraphLength-1) {
        		continue;
        	}
        	else if(start < i) {
                if(Character.isLetter(paragraphCharArray[i]) && i == paragraphLength-1) {
                    tempString = paragraph.substring(start,i+1).toLowerCase();
                }
                else{
        		    tempString = paragraph.substring(start,i).toLowerCase();
                }
        		if(!bannedSet.contains(tempString)) {
        			if(wordCount.get(tempString) != null) {
        				    wordCount.put(tempString,1+wordCount.get(tempString));
        			}
        			else {
        				wordCount.put(tempString,1);
        			}
        		}
        	}
        	start = i+1;
        }
        
        
        String result = "";
        int maxCount = 0;
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        	if(entry.getValue() > maxCount) {
        		maxCount = entry.getValue();
        		result = entry.getKey();
        	}
        }
        return result;        
    }
}
