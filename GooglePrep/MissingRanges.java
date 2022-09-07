package GooglePrep.GooglePrep;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

	public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        
		List<String> resultList = new ArrayList<String>();
		int numsLength = nums.length;
        if(numsLength == 0) {
        	if(lower==upper) resultList.add(String.valueOf(lower));
        	else resultList.add(String.valueOf(lower)+"->"+String.valueOf(upper));
        	return resultList;
        }
        if(lower < nums[0]) {
        	if(lower==nums[0]-1) resultList.add(String.valueOf(lower));
        	else resultList.add(String.valueOf(lower)+"->"+String.valueOf(nums[0]-1));
        }
		int currentLow;
		int currentHigh;
		
		for(int i = 0; i < numsLength-1; i++) {
			currentLow = nums[i];
			currentHigh = nums[i+1];
			if(currentHigh-currentLow==1) {
				continue;
			}
			else if(currentHigh-currentLow==2) {
				resultList.add(String.valueOf(currentLow+1));
			}
			else if(currentHigh-currentLow>2) {
				resultList.add(String.valueOf(currentLow+1)+"->"+String.valueOf(currentHigh-1));
			}
		}
		
		if(nums[numsLength-1] == upper-1) { 
			resultList.add(String.valueOf(upper));
		}
		else if(nums[numsLength-1] < upper-1) {
				resultList.add(String.valueOf(nums[numsLength-1]+1)+"->"+String.valueOf(upper));
		}
		return resultList;
    }
	

}
