package leetcode.LeetCode.Recursion;

public class reverseString {

	public void reverseString(char[] s) {
		if(s.length == 0) {
			return;
		}
		helper(0,s.length-1,s);
    }
	
	public void helper(int start, int end, char[] s) {
		if(end < start) {
			return;
		}
		char temp = s[end];
		s[end] = s[start];
		s[start] = temp;
		helper(++start,--end,s);
	}
}
