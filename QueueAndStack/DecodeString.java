package leetcode.LeetCode.QueueAndStack;

import java.util.Stack;

public class DecodeString {
	
	/*
 Input:
"3[z]2[2[y]pq4[2[jk]e1[f]]]ef"
Expected:
"zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef"
	 */
	
	public static void main(String[] args) {
		DecodeString d = new DecodeString();
		d.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef");
		d.decodeString("3[a]2[b4[F]c]");
		d.decodeString("3[a]2[bc]");
		d.decodeString("3[a2[c]]");
		d.decodeString("2[abc]3[cd]ef");
		d.decodeString("abc3[cd]xyz");
		d.decodeString("2[2[b]]");
	}
	public String decodeString(String s) {
	
		if(s.length() == 0) {
			return "";
		}
		StringBuilder result = new StringBuilder();
		StringBuilder newString = new StringBuilder();
		StringBuilder multiplierString = new StringBuilder();
		Stack<StringBuilder> stringsToBuild = new Stack<>();
		Stack<Integer> multiplier = new Stack<>();
		
		for(int i = 0 ; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i)) && newString.length() > 0
					&& multiplier.isEmpty()) {
				result.append(newString.toString());
				newString = new StringBuilder();
				i--;
			}
			else if(Character.isDigit(s.charAt(i))) {
				while(Character.isDigit(s.charAt(i))) {
					multiplierString.append(s.charAt(i));
					i++;
				}
				multiplier.add(Integer.parseInt(multiplierString.toString()));
				multiplierString = new StringBuilder();
				if(newString.length() > 0 && !multiplier.isEmpty()) {
					stringsToBuild.add(newString);
					newString = new StringBuilder();
				};
			}
			else if(s.charAt(i) == '[') {
				continue;
			}
			else if(s.charAt(i) == ']') {
				int tempMultiplier = multiplier.pop();
				if(s.charAt(i-1) == ']') {
					if(!stringsToBuild.isEmpty()) {
                        StringBuilder temp = new StringBuilder(stringsToBuild.pop());
                        temp.append(newString);
                        newString = new StringBuilder(expand(temp.toString(),tempMultiplier));
                    }
					else {
						 newString = new StringBuilder(expand(newString.toString(),tempMultiplier));
					}
					if(multiplier.isEmpty()) {
						result.append(newString);
						newString = new StringBuilder();
					}
				}
				else if(multiplier.isEmpty()) {
					while(!stringsToBuild.isEmpty()) {
						StringBuilder temp = new StringBuilder(stringsToBuild.pop());
						newString = temp.append(newString);
					}
					result.append(expand(newString.toString(),tempMultiplier));
					newString = new StringBuilder();
				}
				else if(!multiplier.isEmpty()) {
					newString = new StringBuilder(expand(newString.toString(),tempMultiplier));
				}
			}
			else {
				newString.append(s.charAt(i));
			}
		}
		if(newString.length() > 0) {
			result.append(newString);
		}
		return result.toString();
	}
	
	public String expand(String s, int multiplier) {
		StringBuilder newString = new StringBuilder();
		while(multiplier > 0) {
			newString.append(s);
			multiplier--;
		}
		return newString.toString();
	}
}
