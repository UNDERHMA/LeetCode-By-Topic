package AmazonPrep.AmazonPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
        
		int strsLength = strs.length;
		List<List<String>> result = new ArrayList<>();
		if(strsLength == 0) return result;
		HashMap<String,List<Integer>> hashTable = new HashMap<>();
	
		// hash every sorted char array as a String
		List<Integer> tempList;
		for(int i = 0 ; i < strsLength; i++) {
			char[] temp = strs[i].toCharArray();
			Arrays.sort(temp);
			if(hashTable.containsKey(String.valueOf(temp))) {
				tempList = hashTable.get(String.valueOf(temp));
				tempList.add(i);
				hashTable.put(String.valueOf(temp),tempList);
			}
			else {
				tempList = new ArrayList<>();
				tempList.add(i);
				hashTable.put(String.valueOf(temp),tempList);
			}
		}
		
		List<String> tempResult;
		for(Map.Entry<String, List<Integer>> entry: hashTable.entrySet()) {
			//format as string list
			tempList = entry.getValue();
			tempResult = new ArrayList<>();
			for(Integer i : tempList) {
				tempResult.add(strs[i]);
			}
			result.add(tempResult);
		}
		return result;
    }
}
