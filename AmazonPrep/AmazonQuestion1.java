package AmazonPrep.AmazonPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AmazonQuestion1 {

	
	public static List<String> sortBoxes(List<String> boxList) {

		//variables and checking input
		if(boxList == null) return null;
		int boxListSize = boxList.size();
		if(boxListSize < 1) return boxList;
		List<String> result = new ArrayList<>();
		
		//add older junction boxes to result list
		int firstSpace;
		for(String s : boxList) {
			firstSpace = s.indexOf(" ");
			if(!Character.isDigit(s.charAt(firstSpace+1))) {
				result.add(s);
			}
		}
		
		//sort older junction boxes with comparator in result list
		Collections.sort(result, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				
				String substring1 = s1.substring(s1.indexOf(" ")+1);
				String substring2 = s2.substring(s2.indexOf(" ")+1);
				if(substring1.equals(substring2)) {
					//set substrings to alphanumeric identifier to compare the identifier instead
					substring1 = s1.substring(0,s1.indexOf(" "));
					substring2 = s2.substring(0,s2.indexOf(" "));
				}
				
				int minLength = Math.min(substring1.length(),substring2.length());
				for(int i = 0; i < minLength; i++) {
					if(substring1.charAt(i) < substring2.charAt(i)) return -1;
					if(substring1.charAt(i) > substring2.charAt(i)) return 1;
				}

				if(minLength == substring1.length() && minLength == substring2.length()) {
					return 0;
				}
				else if(minLength == substring1.length()) {
					return -1;
				}
				else {
					return 1;
				}
				
			}
		});
		
		//iterate through original list and add newer junction boxes to result list
		for(String s : boxList) {
			firstSpace = s.indexOf(" ");
			if(Character.isDigit(s.charAt(firstSpace+1))) {
				result.add(s);
			}
		}
		
		//return result
		return result;
	 }
	
	
}
