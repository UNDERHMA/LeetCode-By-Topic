package AmazonPrep.AmazonPrep;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharactersToMakeStringsEqual {

	public boolean makeEqual(String[] words) {
        
		int hashed = 0;
		HashMap<Integer,Integer> hash = new HashMap<>();
		
		for(String s: words) {
			if(hash.containsKey(s.length())) {
				hash.put(words.length,hash.get(words.length)+1);
			}
			else {
				hashed++;
				hash.put(words.length,1);
			}
		}
		
		if(hashed > 3) return false;
		
		int oneValueCount = 0;
		for(Map.Entry<Integer, Integer> entry: hash.entrySet()) {
			if(entry.getValue() == 1) oneValueCount++;
		}
		
		int[] lengthOfSolution = new int[2]; 
		if(hashed >= 2 && oneValueCount == 2) {
			int currentIndex = 0;
			for(Map.Entry<Integer, Integer> entry: hash.entrySet()) {
				if(entry.getValue() == 1) {
					lengthOfSolution[currentIndex++] = entry.getValue();
				}
			}
		} else {
			return false;
		}
		
		String[] strings = new String[2];
		for(String s : words) {
			int currentIndex = 0;
			if(s.length() == lengthOfSolution[0] 
					|| s.length() == lengthOfSolution[1]) {
				strings[currentIndex++] = s;
			}
		}
		
		int smallerLength = strings[0].length();
		int largerLength = strings[1].length();
		for(int i = 0; i < smallerLength; i++) {
			for(int j = 0; j < largerLength; j++) {
				if(strings[0].charAt(i) == strings[1].charAt(j)) {
					
				}
			}
		}
		
		
		
    }
}
