package GooglePrep.GooglePrep;

import java.util.HashMap;
import java.util.Map;

public class FindAndReplaceInString {

	public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        
		if(s == null || indices == null || sources == null || sources == null || s.length() ==0 
				|| indices.length == 0 | sources.length == 0 | sources.length == 0) return s;
		
		Map<Integer,Integer> replacementStrings = new HashMap<>();
		int length = indices.length;
		for(int i = 0; i < length; i++) {
			if(s.startsWith(sources[i], indices[i])) replacementStrings.put(indices[i], i);
		}
		
		int sLength = s.length();
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < sLength; i++) {
			if(replacementStrings.containsKey(i)) {
				result.append(targets[replacementStrings.get(i)]);
				i = i + (sources[replacementStrings.get(i)].length()-1);
			} else {
				result.append(s.charAt(i));
			}
		}
		return result.toString();
    }
}
