package leetcode.LeetCode.Graph.UnionFind;

public class GraphValidTree {

	public boolean validTree(int n, int[][] edges) {
        
		if(n == 0 || edges == null) return false;
		int edgesLength = edges.length;
		
		UnionFind unionFind = new UnionFind(n);
		for(int y = 0; y < edgesLength; y++) {
			if(edges[y].length < 2) continue;
			if(unionFind.connected(edges[y][0],edges[y][1])) return false;	
			unionFind.union(edges[y][0],edges[y][1]);
		}
		
		int root = unionFind.find(unionFind.root[0]);
		for(int i : unionFind.root) {
			if(unionFind.find(i) != root) return false;
		}
		return true;
    }
	
	private class UnionFind {
		
		private int[] root;
		private int[] rank;
		
		public UnionFind(int size) {
			this.root = new int[size];
			this.rank = new int[size];
			for(int i = 0; i < size; i++) {
				root[i] = i;
				rank[i] = i;
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
			if(rootX != rootY) {
				if(rank[rootX] > rank[rootY]) {
					root[rootY] = rootX;
				} else if(rank[rootX] < rank[rootY]) {
					root[rootX] = rootY;
				} else {
					root[rootY] = rootX;
					rootX++;
				}
			}
		}
		
	}
}
