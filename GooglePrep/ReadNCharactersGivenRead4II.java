package GooglePrep.GooglePrep;

import java.util.Arrays;

public class ReadNCharactersGivenRead4II {
	
	private char[] buffer = new char[4];
	private int currentCount = 0;
	private int readIndex = 4;
	
	public int read(char[] buf, int n) {
		
		int charsRead = 0;
		while(charsRead < n) {
			if(readIndex == 4) {
				currentCount = read4(buffer);
				if(currentCount == 0) return charsRead;
				readIndex = 0;
			}
			if(readIndex == currentCount) break;	
			while(readIndex < currentCount && charsRead < n) {
				buf[charsRead++] = buffer[readIndex++];
			}					
		}
		return charsRead;
    }

	//so IDE does not show error
	public int read4(char[] c) {
		return 1;
	}
}
