package AmazonPrep.AmazonPrep;

public class TrappingRainWater {
	
	public int trap(int[] height) {
        
		if(height == null) return 0;
		int heightLength = height.length;
		if(heightLength == 0) return 0; 
		
		int rollingTotal = 0;
		int currentMax = -1;
		int currentHeight = 0;
		int lastMax = 0;
		int rainWaterTrapped = 0;
		
		for(int i = 0; i < heightLength; i++) {
			currentHeight = height[i];
			if(currentHeight > currentMax) {
				rainWaterTrapped += rollingTotal;
				rollingTotal = 0;
				lastMax = i;
				currentMax = currentHeight;
			}
			else {
				rollingTotal += (currentMax - currentHeight);
			}
		}
		rollingTotal = 0;
		currentMax = 0;
		for(int i = heightLength-1; i > lastMax; i--) {
			currentHeight = height[i];
			if(currentHeight > currentMax) {
				rainWaterTrapped += rollingTotal;
				rollingTotal = 0;
				currentMax = currentHeight;
			}
			else {
				rollingTotal += (currentMax - currentHeight);
			}
		}
		return rainWaterTrapped;
    }

}
