package GooglePrep.GooglePrep;

public class PlusOne {

	public int[] plusOne(int[] digits) {
	     
		if(digits == null) return null;
		boolean carry = true;
		int currentIndex = digits.length-1;
		
		while(carry && currentIndex >= 0) {
			digits[currentIndex] += 1;
			if(digits[currentIndex] == 10) {
				digits[currentIndex] = 0;
				currentIndex--;
				continue;
			}
			carry = false;
		}
        if(currentIndex == -1) {
            digits = new int[digits.length+1];
            digits[0] = 1;
        }
		return digits;
    }

}
