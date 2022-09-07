package AmazonPrep.AmazonPrep;

public class RomanToInteger {

	public int romanToInt(String s) {
        
		if(s.equals("")) return 0;
		char[] chars = s.toCharArray();
		int end = s.length()-1;
		int result = 0;
		
		while(end >= 0) {
			if(chars[end] == 'I') {
				result++;
				end--;
			}
			else if(chars[end] == 'V') {
				end--;
				if(end > -1 && chars[end] == 'I') {
					result += 4;
					end--;
				}
				else result += 5;
			}
			else if(chars[end] == 'X') {
				end--;
				if(end > -1 && chars[end] == 'I') {
					result += 9;
					end--;
				}
				else result += 10;
			}
			else if(chars[end] == 'L') {
				end--;
				if(end > -1 && chars[end] == 'X') {
					result += 40;
					end--;
				}
				else result += 50;
			}
			else if(chars[end] == 'C') {
				end--;
				if(end > -1 && chars[end] == 'X') {
					result += 90;
					end--;
				}
				else result += 100;
			}
			else if(chars[end] == 'D') {
				end--;
				if(end > -1 && chars[end] == 'C') {
					result += 400;
					end--;
				}
				else result += 500;
			}
			else if(chars[end] == 'M') {
				end--;
				if(end > -1 && chars[end] == 'C') {
					result += 900;
					end--;
				}
				else result += 1000;
			}
		}
		return result;
    }

}
