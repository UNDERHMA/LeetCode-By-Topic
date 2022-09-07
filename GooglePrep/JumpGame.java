package GooglePrep.GooglePrep;

public class JumpGame {

	
	public boolean canJump(int[] nums) {
		if(nums == null) return false;
		int numsLength = nums.length;
		if(numsLength < 1) return false;
		int greatestJump = 0;
		int currentJump;
		for(int i = 0; i < numsLength; i++) {
			if(greatestJump < i) return false;
			currentJump = i + nums[i];
			greatestJump = Math.max(greatestJump, currentJump);
		}
		if(greatestJump >= numsLength-1) return true;
		return false;
	}
}
	
