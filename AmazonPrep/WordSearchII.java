package AmazonPrep.AmazonPrep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchII {

	private Set<String> resultSet; 
	
	public List<String> findWords(char[][] board, String[] words) {
		
		if(board == null || board.length == 0 || board[0].length == 0 
				|| words == null || words.length == 0) return new ArrayList<>();
		resultSet = new HashSet<>();
		TrieNode root = new TrieNode();
		
		root = constructTrieList(words);
		
		int yLength = board.length;
		int xLength = board[0].length;
		for(int y = 0; y < yLength; y++) {
			for(int x = 0; x < xLength; x++) {
				searchForWords(board,root,y,x,new boolean[yLength][xLength],yLength,xLength);
			}
		}
		List<String> resultList = new ArrayList<>();
		for(String s : resultSet) {
			resultList.add(s);
		}
		return resultList;
	}
	
	public TrieNode constructTrieList(String[] words) {
		
		TrieNode root = new TrieNode();
		TrieNode currentTrieNode = null;
		TrieNode newNode = null;
		for(String s : words) {
			currentTrieNode = root;
			for(char c : s.toCharArray()) {
				if(currentTrieNode.children.containsKey(c)) {
					currentTrieNode = currentTrieNode.children.get(c);
				} else {
					newNode = new TrieNode();
					newNode.val = c;
					newNode.parent = currentTrieNode;
					currentTrieNode.children.put(c, newNode);
					currentTrieNode = newNode;
				}
			}
			currentTrieNode.wordText = s;
		}
		return root;
	}
	
	public void searchForWords(char[][] board, TrieNode root, int yIndex, 
			int xIndex, boolean[][] visited, int yLength, int xLength) {
		
		if(visited[yIndex][xIndex]) return;
		if(root.children.containsKey(board[yIndex][xIndex])) {
			root = root.children.get(board[yIndex][xIndex]);
			visited[yIndex][xIndex] = true;
			if(root.wordText != null) {
				resultSet.add(root.wordText);
				if(root.children.isEmpty()) pruneTrie(root);
			}
			if(!root.children.isEmpty()) {
				if(yIndex + 1 < yLength) {
					searchForWords(board,root,yIndex+1,xIndex,visited,yLength,xLength);
				}
				if(yIndex - 1 > -1) {
					searchForWords(board,root,yIndex-1,xIndex,visited,yLength,xLength);
				}
				if(xIndex + 1 < xLength) {
					searchForWords(board,root,yIndex,xIndex+1,visited,yLength,xLength);
				}
				if(xIndex - 1 > -1) {
					searchForWords(board,root,yIndex,xIndex-1,visited,yLength,xLength);
				}
			}
		}
		visited[yIndex][xIndex] = false;
		return;
	}
	
	public void pruneTrie(TrieNode node) {
		
		TrieNode currentNode;
		while(node.wordText == null && node.children.isEmpty()) {
			currentNode = node.parent;
			currentNode.children.remove(node.val);
			node = currentNode;
		}	
	}
}
