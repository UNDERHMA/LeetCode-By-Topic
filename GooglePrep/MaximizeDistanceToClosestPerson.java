package GooglePrep.GooglePrep;

public class MaximizeDistanceToClosestPerson {

	public int maxDistToClosest(int[] seats) {
    
		if(seats == null || seats.length == 0) return -1;
		int seatsLength = seats.length;
		int currentIndexLength = 0;
		int maxIndexLength = 0;
		int firstOne = -1;
		
		for(int i = 0; i < seatsLength; i++) {
			if(seats[i] == 1) {
				if(firstOne == -1) firstOne = i;
				if(currentIndexLength > maxIndexLength) {
					maxIndexLength = currentIndexLength;
				}
				currentIndexLength = 0;
			} else {
				currentIndexLength++;
			}
		}
		
		//if max at end of array
		if(currentIndexLength > (maxIndexLength/2) + (maxIndexLength%2)
				&& currentIndexLength > firstOne) {
			return currentIndexLength;
		}
		//if max at start of array
		if(firstOne > (maxIndexLength/2) + (maxIndexLength%2)) return firstOne;
		
		return (maxIndexLength/2) + (maxIndexLength%2);
    }

}
