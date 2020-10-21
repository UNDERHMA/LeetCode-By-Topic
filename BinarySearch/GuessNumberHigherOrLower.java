package leetcode.LeetCode.BinarySearch;

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessNumberHigherOrLower {
	public int guessNumber(int n) {
        
        double start = 0;
        double end = Integer.MAX_VALUE;
        double temp = 0.0;
        int mid = n;
        
        int currentGuessStatus = guess(mid);
        if(currentGuessStatus == 0) {
            return mid;
        }
        else if(currentGuessStatus == -1) {
            end = mid;
        }
        else {
            start = mid;
        }
        
        while(start < end) {
        	temp =  (start + end) / 2.0;
        	mid = (int) temp;
            currentGuessStatus = guess(mid);
            if(currentGuessStatus == 0) {
                return mid;
            }
            else if(currentGuessStatus == -1) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        return mid;
    }
}
