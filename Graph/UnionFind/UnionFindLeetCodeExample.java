package leetcode.LeetCode.Graph.UnionFind;

// comes from https://leetcode.com/explore/learn/card/graph/618/disjoint-set/3844/

public class UnionFindLeetCodeExample {

	private int[] root;
	private int[] rank;
	
	
	public UnionFindLeetCodeExample(int size) {
		this.root = new int[size];
		this.rank = new int[size];
		for(int i = 0; i < size; i++) {
				root[i] = i;
				rank[i] = 1; 
		}
	}
	
	public boolean connected(int x, int y) {
		return find(x) == find(y);
	}
	
	//optimized with path compression
	public int find(int x) {
	    while (x != root[x]) {
	        x = root[x];
	    }
	    return x;
	}
	
	//Optimized by union by rank
	public void union(int x, int y) {
	    int rootX = find(x);
	    int rootY = find(y);
	    if (rootX != rootY) {
	        if (rank[rootX] > rank[rootY]) {
	            root[rootY] = rootX;
	        } else if (rank[rootX] < rank[rootY]) {
	            root[rootX] = rootY;
	        } else {
	            root[rootY] = rootX;
	            rank[rootX] += 1;
	        }
	    }
	}
}
