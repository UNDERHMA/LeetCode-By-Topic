package AmazonPrep.AmazonPrep;

public class StringToIntegerATOI {

	
	public int myAtoi(String s) {
        
		int sLength = s.length();
		if(sLength == 0) return 0;
		char[] chars = s.toCharArray();
		
		int startIndex = 0;
		int endIndex = 0;
		boolean digitEncountered = false;
		boolean signEncountered = false;
		boolean negative = false;
		int result = 0;
		
		char currentChar;
		for(int i = 0; i < sLength; i++) {
			currentChar = chars[i];
			if(currentChar != ' ' && currentChar != '+' && currentChar != '-'
					& !Character.isDigit(currentChar)) {
				if(!digitEncountered) return 0;
				break; // stop iterating through char[], we've found end
			}
			else if(currentChar == '-' || currentChar == '+' || currentChar == ' ') {
				if(digitEncountered) break; // stop iterating through char[], we've found end
				else if(signEncountered) return 0; //invalid, two signs
				else if(currentChar == '-' || currentChar == '+') {
					signEncountered = true;
					if(currentChar == '-') negative = true;
				}
			}
			else {
				if(digitEncountered == false) {
					if(currentChar == '0') {
						signEncountered = true; //no sign can follow this
						continue;
					}
					startIndex = i;
					endIndex = i;
					digitEncountered = true;
				} else {
					endIndex = i;
				}
			}
		}
		
		if(!digitEncountered) return 0;
		String digitString = s.substring(startIndex,endIndex+1);
		
		if(digitString.length() > 10) {
			if(negative) return Integer.MIN_VALUE;
			else return Integer.MAX_VALUE;
		}
		
		if(digitString.length() == 10) { 
			String maxMinString = "";
			if(negative) {
				maxMinString = String.valueOf(Integer.MIN_VALUE);
				maxMinString = maxMinString.substring(1);
				for(int i = 0; i < 10; i++) {
					if(digitString.charAt(i) == maxMinString.charAt(i)) continue;
					else if(digitString.charAt(i) < maxMinString.charAt(i)) break;
					else return Integer.MIN_VALUE;
				}
			} else {
				maxMinString = String.valueOf(Integer.MAX_VALUE);
				for(int i = 0; i < 10; i++) {
					if(digitString.charAt(i) == maxMinString.charAt(i)) continue;
					else if(digitString.charAt(i) < maxMinString.charAt(i)) break;
					else return Integer.MAX_VALUE;
				}
			}
		}
		
		int multiplier = 1;
		if(negative) multiplier = -1;
		for(int i = digitString.length()-1; i >= 0; i--) {
			result += multiplier * Integer.parseInt(String.valueOf(digitString.charAt(i)));
			multiplier *= 10;
		}
		return result;
    }

}
