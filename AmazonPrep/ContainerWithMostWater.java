package AmazonPrep.AmazonPrep;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		
		int startPointer = 0;
		int endPointer = height.length-1;
		int maxSize = 0;
		int currentSize;
		
		while(startPointer < endPointer) {
			if(height[startPointer] < height[endPointer]) {
				currentSize = height[startPointer] * (endPointer - startPointer);
				startPointer++;
			} else {
				currentSize = height[endPointer] * (endPointer - startPointer);
				endPointer--;
			}
			maxSize = Math.max(maxSize, currentSize);
		}
		return maxSize;
    }
	
}
