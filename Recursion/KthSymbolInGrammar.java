package leetcode.LeetCode.Recursion;

public class KthSymbolInGrammar {
	
	public static void main(String[] args) {
		KthSymbolInGrammar k = new KthSymbolInGrammar();
		k.kthGrammar(1,1);
		k.kthGrammar(2,1);
		k.kthGrammar(2,2);
		k.kthGrammar(4,1);
		k.kthGrammar(4,2);
		k.kthGrammar(4,3);
		k.kthGrammar(4,4);
		k.kthGrammar(4,5);
		k.kthGrammar(4,6);
		k.kthGrammar(4,7);
		k.kthGrammar(4,8);
		k.kthGrammar(4,9);
	}

	public int kthGrammar(int N, int K) {
        if(N < 1 || K < 1) return -1;
        if(K == 1) return 0;
        if(Math.pow(2,N-1) < K) return -1; //impossible, K is greater than row Ns size
        int powerOf2AboveK = 1;
        while(powerOf2AboveK < K) {
        	powerOf2AboveK *= 2;
        }
        K = K - powerOf2AboveK/2;
        return findK(1,K);
    }
	
	public int findK(int flips, int K) {
        if(K == 1) if(flips % 2 == 0) return 0; else return 1;
        if(K == 2) if(flips % 2 == 0) return 1; else return 0;
        int powerOf2AboveK = 1;
        while(powerOf2AboveK < K) {
        	powerOf2AboveK *= 2;
        }
        K = K - powerOf2AboveK/2;
        return findK(flips+1,K);
    }
}
