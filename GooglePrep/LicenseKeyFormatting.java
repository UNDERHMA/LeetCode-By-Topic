package GooglePrep.GooglePrep;

public class LicenseKeyFormatting {

	public String licenseKeyFormatting(String s, int k) {
        
		if(s == null || k == 0 || s.length() == 0) return "";
		int totalLength = 0;
		int sLength = s.length();
		char[] sAsArray = s.toCharArray();
 		for(char c : sAsArray) {
 			if(c != '-') totalLength++;
 		}
 		if(totalLength == 0) return "";
 		
 		int modulo = totalLength % k;
 		int currentCount = 0;
 		int currentIndex = 0;
 		StringBuilder sb = new StringBuilder();
 		while(currentCount < modulo) {
 			if(sAsArray[currentIndex] != '-') {
 				sb.append(Character.toUpperCase(sAsArray[currentIndex]));
 				currentCount++;
 			}
 			currentIndex++;
 		}
 		if(modulo != 0 && modulo < totalLength) sb.append('-');
 		currentCount = 0;
 		while(currentIndex < sLength) {
 			if(currentCount == k) {
 				sb.append('-');
 				currentCount = 0;
 			}
 			if(sAsArray[currentIndex] != '-') {
 				sb.append(Character.toUpperCase(sAsArray[currentIndex]));
 				currentCount++;
 			}
 			currentIndex++;
 		}
 		if(sb.charAt(sb.length()-1) == '-') sb.deleteCharAt(sb.length()-1);
 		return sb.toString();
    }

}
