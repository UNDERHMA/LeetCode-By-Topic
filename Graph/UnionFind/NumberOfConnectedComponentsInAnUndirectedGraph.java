package leetcode.LeetCode.Graph.UnionFind;

public class NumberOfConnectedComponentsInAnUndirectedGraph {

	public int countComponents(int n, int[][] edges) {
        
		if(edges == null || n == 0) return 0;
		int edgesLength = edges.length;
		
		UnionFind unionFind = new UnionFind(n);
		for(int y = 0; y < edgesLength; y++) {
			unionFind.union(edges[y][0], edges[y][1]);
		}
		
		int components = 0;
		for(int i = 0; i < n; i++) {
			if(i == unionFind.root[i]) components++;
		}
		return components;
    }

	private class UnionFind {
		
		private int[] root;
		private int[] rank;
		
		public UnionFind(int size) {
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
		
		public int find(int x) {
			if(root[x] == x) {
				return x;
			}
			root[x] = find(root[x]);
			return root[x];
		}
		
		public void union(int x, int y) {
			int rootX = find(x);
	        int rootY = find(y);
	        if (rootX != rootY) {
				if(rank[rootX] > rank[rootY]) {
					root[rootY] = root[rootX];
				} else if(rank[rootX] < rank[rootY]){
					root[rootX] = root[rootY];
				} else {
					root[rootY] = rootX;
					rank[rootX]++;
				}
	        }
		}
		
	}
}
