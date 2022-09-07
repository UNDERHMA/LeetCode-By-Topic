package GooglePrep.GooglePrep;

import java.util.Arrays;

public class NextPermutation {

	public void nextPermutation(int[] nums) {
		if(nums == null) return;
		int numsLength = nums.length;
		if(numsLength < 2) return;
		boolean swapped = false;
		
		int j;
		for(int i = numsLength-1; i > 0; i--) {
			j = i-1;
			if(nums[j] < nums[i]) {
				int swapElementVal = nums[i];
				int swapElementIndex = i;
				i++;
				while(i < numsLength) {
					if(nums[i] > nums[j] && nums[i] < swapElementVal) {
						swapElementVal = nums[i];
						swapElementIndex = i;
					}
					i++;
				}
				int temp = nums[j];
				nums[j] = nums[swapElementIndex];
				nums[swapElementIndex] = temp;
				Arrays.sort(nums,j+1,numsLength);
				swapped = true;
				break;
			}
		}
		if(!swapped) Arrays.sort(nums);
    }

}
