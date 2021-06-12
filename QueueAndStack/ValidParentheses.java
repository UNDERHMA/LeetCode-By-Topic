package leetcode.LeetCode.QueueAndStack;

import java.util.Stack;

public class ValidParentheses {
	
	public boolean isValid(String s) {
        
		Stack<Character> stack = new Stack<>();
		char temp;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '{' ||
					s.charAt(i) == '[') {
				stack.add(s.charAt(i));
			}
			else if(s.charAt(i) == ')' || s.charAt(i) == '}' ||
					s.charAt(i) == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				else {
					temp = stack.pop();
					if(s.charAt(i) == ')' && temp != '(') {
						return false;
					}
					else if(s.charAt(i) == '}' && temp != '{') {
						return false;
					}
					else if(s.charAt(i) == ']' && temp != '[') {
						return false;
					}
				}
			}
		}
		if(stack.isEmpty()) return true; else return false;
	}
}
