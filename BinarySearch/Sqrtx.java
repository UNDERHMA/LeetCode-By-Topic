package leetcode.LeetCode.BinarySearch;

public class Sqrtx {
	public int mySqrt(int x) {
        
        if(x == 1) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        
        double xd = x;
        double start = 0;
        double end = xd;
        double mid = 0;
        
        while(true) {
            mid = (end+start) / 2.0;
            double squared = Math.pow(mid,2);
            if(Math.abs(squared - xd) < .01) {
                return (int) mid;
            }
            else if(squared > xd){
                end = mid;
            }
            else{
                start = mid;
            }
        }
    }
}
