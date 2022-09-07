package GooglePrep.GooglePrep;

public class NextClosestTime {

	private int nextTime;
	
	public String nextClosestTime(String time) {
     
		if(time == null || time.length() == 0) return time;
		if(time.equals("11:11")) return time;
		if(time.equals("22:22")) return time;
		nextTime = 0;
		String tempString = time.replace(":", "");
		int timeAsInt = Integer.parseInt(String.valueOf(tempString));
		int[] timeAsArray = new int[4];
		for(int i = 0; i < 4; i++) {
			timeAsArray[i] = Character.getNumericValue((tempString.charAt(i)));
		}
		
		calculatePossibleSolutions(timeAsArray,timeAsInt,0,0);
		
		StringBuilder result = new StringBuilder(String.valueOf(nextTime));
		while(result.length() < 4) {
			result.insert(0, 0);
		}
		result.insert(2, ':');
		return result.toString();		
    }

	private void calculatePossibleSolutions(int[] timeAsArray,int timeAsInt,
			 int currentNumber, int currentIndex) {
		
		if(currentIndex == 4) {
			if(nextTime == 0 && currentNumber != timeAsInt) nextTime = currentNumber;
			// greater, less than, and on different days conditions
			else if((timeAsInt < currentNumber && currentNumber < nextTime &&
					nextTime > timeAsInt) || (timeAsInt > currentNumber
					&& currentNumber < nextTime && timeAsInt > nextTime) ||
					(timeAsInt < currentNumber && nextTime < timeAsInt)) {
				nextTime = currentNumber;
			}
			return;
		}
		
		int tempNumber = currentNumber;
		for(int i = 0; i < 4; i++) {
			if(currentIndex == 0) {
				tempNumber += timeAsArray[i] * 1000;
				if(tempNumber < 2400) {
					calculatePossibleSolutions(timeAsArray,timeAsInt,tempNumber,1);
				}
			} else if(currentIndex == 1) {
				tempNumber += timeAsArray[i] * 100;
				if(tempNumber < 2400) {
					calculatePossibleSolutions(timeAsArray,timeAsInt,tempNumber,2);
				}
			} else if(currentIndex == 2) {
				tempNumber += timeAsArray[i] * 10;
				if(timeAsArray[i] < 6) {
					calculatePossibleSolutions(timeAsArray,timeAsInt,tempNumber,3);
				}
			} else if(currentIndex == 3) {
				tempNumber += timeAsArray[i];
				calculatePossibleSolutions(timeAsArray,timeAsInt,tempNumber,4);
			}
			tempNumber = currentNumber;
		}
	}
	
}
