package GooglePrep.GooglePrep;

import java.util.ArrayDeque;
import java.util.Deque;

public class BackSpaceStringCompare {

	public boolean backspaceCompare(String s, String t) {
		
		if(s == null || t == null || s.length() == 0 || t.length() == 0)  return false;
		int sCharIndex = s.length()-1;
		int tCharIndex = t.length()-1;
		
		while(sCharIndex > -1 && tCharIndex > -1) {
			if(s.charAt(sCharIndex) == t.charAt(tCharIndex)
					&& s.charAt(sCharIndex) != '#') {
				sCharIndex--;
				tCharIndex--;
			} else if(s.charAt(sCharIndex) != t.charAt(tCharIndex) &&
					s.charAt(sCharIndex) != '#' && t.charAt(tCharIndex) != '#') {
				return false;
			} else {	
				if(s.charAt(sCharIndex) == '#') {
					sCharIndex = newIndexAfterBackspaces(s,sCharIndex);
				}
				if(t.charAt(tCharIndex) == '#') {
					tCharIndex = newIndexAfterBackspaces(t,tCharIndex);
				}
				if(tCharIndex < 0 && sCharIndex < 0) return true;
				if(tCharIndex < 0 || sCharIndex < 0) return false;
			}
			
		}
		if(sCharIndex > -1) sCharIndex = newIndexAfterBackspaces(s,sCharIndex);
		if(tCharIndex > -1) tCharIndex = newIndexAfterBackspaces(t,tCharIndex);
		if(sCharIndex > -1 || tCharIndex > -1) return false;
		return true;
    }
	
	public int newIndexAfterBackspaces(String str, int startingIndex) {
		while(startingIndex > -1 && str.charAt(startingIndex) == '#') {
			int backspaces = 1;
			while(startingIndex > -1) {
				startingIndex--;
				if((startingIndex > -1 && str.charAt(startingIndex) != '#')
						|| startingIndex <= -1) break;
				backspaces++;
			}
			int tempIndex = startingIndex-1;
			while(tempIndex > 0 && tempIndex > startingIndex - backspaces) {
				if(tempIndex > -1 && str.charAt(tempIndex) == '#') backspaces += 2;
				tempIndex--;
			}
			startingIndex = startingIndex - backspaces;
		}
		return startingIndex;
	}
}
