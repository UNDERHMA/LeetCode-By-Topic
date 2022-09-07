package leetcode.LeetCode.Graph.UnionFind;

public class NumberOfProvinces {


	public int findCircleNum(int[][] isConnected) {
        
		if(isConnected == null || isConnected.length == 0) return 0;
		int isConnectedLength = isConnected.length;
		
		UnionFind unionFind = new UnionFind(isConnectedLength);
		for(int y = 0; y < isConnectedLength; y++) {
			for(int x = 0; x < isConnectedLength; x++) {
				if(isConnected[y][x] == 1) unionFind.union(y, x);
			}
		}
		
		int provinces = 0;
		for(int i = 0; i < isConnectedLength; i++) {
			if(i == unionFind.root[i]) provinces++;
		}
		return provinces;
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
