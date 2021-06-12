package leetcode.LeetCode.QueueAndStack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	
	public int evalRPN(String[] tokens) {
        
		if(tokens.length == 0) {
			return 0;
		}
		Stack<Integer> numbers = new Stack<>();
		String operators = "+-/*";

		for(int i = 0; i < tokens.length; i++) {
			if(!operators.contains(tokens[i])) {
				numbers.add(Integer.parseInt(tokens[i]));
			}
			else {
				int temp1 = numbers.pop();
				int temp2 = numbers.pop();
				switch (tokens[i].charAt(0)) {
				case '+' : numbers.add(temp2+temp1); break;
				case '-' : numbers.add(temp2-temp1); break;
				case '*' : numbers.add(temp2*temp1); break;
				case '/' : numbers.add(temp2/temp1); break;
				}
			}
		}
		return numbers.pop();
    }
}
