package AmazonPrep.AmazonPrep;

public class LongestPalindromicSubstring {

	private int maxLength = 1;
	private int maxStart = 0;
	private int maxEnd = 1;
	
	public String longestPalindrome(String s) {
        
		if(s == null || s.equals("")) return "";
		int sLength = s.length();
		int startIndex = 0;
		
		while(startIndex < sLength) {
			findMaxExpansion(startIndex, false, s, sLength);
			if(startIndex < sLength-1 && s.charAt(startIndex) == s.charAt(startIndex + 1)) {
				findMaxExpansion(startIndex, true, s, sLength);
			}
			startIndex++;
		}
		return s.substring(maxStart, maxEnd);
    }
	
	private void findMaxExpansion(int startIndex, boolean twoCharactersInMiddleExpansion, String s, int sLength) {
		
		int endIndex = 0;
		if(twoCharactersInMiddleExpansion) {
			endIndex = startIndex + 1;
			if(maxLength < 2) {
				maxLength = 2;
				maxStart = startIndex;
				maxEnd = startIndex + 2;
			}
		} else {
			endIndex = startIndex;
		}
		
		while(startIndex > 0 && endIndex < sLength-1) {
			startIndex = startIndex - 1;
			endIndex = endIndex + 1;
			if(s.charAt(startIndex) == s.charAt(endIndex)) {
				if(maxLength < (endIndex - startIndex + 1)) {
					maxLength = endIndex - startIndex + 1;
					maxStart = startIndex;
					maxEnd = endIndex+1;
				}
			} else {
				break;
			}
		}
	}
	
}
