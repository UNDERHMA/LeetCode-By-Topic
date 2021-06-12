package leetcode.LeetCode.Recursion;

public class PowXN {
	
	public static void main(String[] args) {
		PowXN p = new PowXN();
		p.myPow(2.0, 10);
		p.myPow(34.00515, -3);
		p.myPow(2.10, 3);
		p.myPow(0.44894, -5);
		p.myPow(0.44894, 3);
		p.myPow(0.00001,2147483647);
		p.myPow(2,-2);
		p.myPow(8.84372,-5);
	}
	public double myPow(double x, int n) {
		if(n == 0) return 1;
		if(n < 0) x = 1/x ;
		if(n == 1 || n == -1) return x;
		else if(n%2 == 1 || n%2 == -1) return x * calculatePow(x*x,n/2);
		return calculatePow(x*x,n/2);
    }
	
	public double calculatePow(double x, int n) {
		if(n == 1 || n == -1) return x;
		else if(n%2 == 1 || n%2 == -1) return x * calculatePow(x*x,n/2);
		return calculatePow(x*x,n/2);
    }
	
}
