package AmazonPrep.AmazonPrep;

public class ImplementstrStr {

	public int strStr(String haystack, String needle) {
        
		if(needle.equals("")) return 0;
		int needleLength = needle.length();
		int haystackLength = haystack.length();
		int needleIndex = 0;
		
		for(int i = 0; i < haystackLength; i++) {
			if(haystack.charAt(i) == needle.charAt(needleIndex)) {
				needleIndex++;
				if(needleIndex == needleLength) return i - (needleLength-1);
			} else {
				i -= needleIndex;
				needleIndex = 0;
			}
		}
		return -1;
	}

}
