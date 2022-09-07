package GooglePrep.GooglePrep;

import java.util.TreeMap;

public class OddEvenJump {

	public int oddEvenJumps(int[] arr) {
     
		if(arr == null || arr.length == 0) return 0;
		if(arr.length == 1) return 1;
		
		int arrLength = arr.length;
		
		boolean[] oddPossibleArray = new boolean[arrLength];
		boolean[] evenPossibleArray = new boolean[arrLength];
		oddPossibleArray[arrLength-1]  = true;
		evenPossibleArray[arrLength-1]  = true;
		
		if(arr[arrLength-2] <= arr[arrLength-1]) {
			oddPossibleArray[arrLength-2]  = true;
		} 
		if(arr[arrLength-2] >= arr[arrLength-1]) {
			evenPossibleArray[arrLength-2]  = true;
        }
		
		TreeMap<Integer, Integer> potentialValues = new TreeMap<>();
		potentialValues.put(arr[arrLength-1],arrLength-1);
		potentialValues.put(arr[arrLength-2],arrLength-2);
		int smallestLarger, largestSmaller;
		for(int i = arrLength-3; i > -1; i--) {
			smallestLarger = -1;
			largestSmaller = -1;
			if(potentialValues.ceilingEntry(arr[i]) != null) {
				smallestLarger = potentialValues.ceilingEntry(arr[i]).getValue();
			}
			if(potentialValues.floorEntry(arr[i]) != null) {
				largestSmaller = potentialValues.floorEntry(arr[i]).getValue();
			}	
			if(smallestLarger != -1 && evenPossibleArray[smallestLarger] == true) oddPossibleArray[i] = true;
			if(largestSmaller != -1 && oddPossibleArray[largestSmaller] == true) evenPossibleArray[i] = true;
			potentialValues.put(arr[i], i);
		}
		
		int possibleSolutions = 0;
		for(boolean b : oddPossibleArray) {
			if(b) possibleSolutions++;
		}
		return possibleSolutions;
    }

}
