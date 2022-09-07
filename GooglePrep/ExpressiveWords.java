package GooglePrep.GooglePrep;

public class ExpressiveWords {

	public int expressiveWords(String s, String[] words) {
        
		if(s == null || words == null || s.length() == 0 || words.length == 0) return 0;
		int sLength = s.length();
		
		char currentLetter = s.charAt(0);
		int currentLetterCount = 0;
		StringBuilder regex = new StringBuilder();
		for(int i = 0; i < sLength; i++) {
			if(s.charAt(i) != currentLetter) {
				regex = appendChars(currentLetterCount,regex,currentLetter);
				currentLetterCount = 0;
				currentLetter = s.charAt(i);
			}
			currentLetterCount++;
		}
		
		if(currentLetterCount > 0) {
			regex = appendChars(currentLetterCount,regex,currentLetter);
		}
	
		int resultCount = 0;
		String regexString = regex.toString();
		for(String str : words) {
			if(str.matches(regexString)) resultCount++;
		}
		return resultCount;
    }
	
	private StringBuilder appendChars(int currentLetterCount, StringBuilder regex, char currentLetter) {
		
		if(currentLetterCount < 3) {
			while(currentLetterCount > 0) {
				regex.append(currentLetter);
				currentLetterCount--;
			}
		} else {
			regex.append(currentLetter + "{1," + currentLetterCount + "}");
		}
		return regex;
	}

}
