package GooglePrep.GooglePrep;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public int numUniqueEmails(String[] emails) {
        
		if(emails == null || emails.length == 0) return 0;
		Set<String> possibleEmails = new HashSet<>();
		String[] currentStringArray;
		StringBuilder currentStringBuilder;
		for(String s : emails) {
			currentStringArray = s.split("@");
			currentStringArray[0] = removeChars(currentStringArray[0]);
			currentStringBuilder = new StringBuilder();
			currentStringBuilder.append(currentStringArray[0]).append('@').append(currentStringArray[1]);
			possibleEmails.add(currentStringBuilder.toString());
		}
		return possibleEmails.size();
    }
	
	private String removeChars(String currentString) {
		char[] currentStringArray = currentString.toCharArray();
		StringBuilder resultString = new StringBuilder();
		for(char c : currentStringArray) {
			if(c == '+') break;
			if(c == '.') continue;
			resultString.append(c);
		}
		return resultString.toString();
	}

}
