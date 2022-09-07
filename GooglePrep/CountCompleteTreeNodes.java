package GooglePrep.GooglePrep;

public class CountCompleteTreeNodes {

public int countNodes(TreeNode root) {
        
		if(root == null) return 0;
		int depth = 0;
		TreeNode currentNode = root;
		
		while(currentNode.left != null) {
			currentNode = currentNode.left;
			depth++;
		}
		
		int leftBound = 1;
		int rightBound = (int) (Math.pow(2,depth));
		int pivot;
		
		while(leftBound <= rightBound) {
			pivot = leftBound + ((rightBound - leftBound)/2);
			if(binarySearch(pivot,depth,root)) {
				leftBound = pivot+1;
			} else {
				rightBound = pivot-1;
			}
		}
		
		return rightBound + (int) Math.pow(2,depth) - 1;
    }
	
	
	public boolean binarySearch(int originalPivot, int depth, TreeNode node) {

		int leftBound = 1;
		int rightBound = (int) (Math.pow(2,depth));
		int pivot;
		for(int i = 0; i < depth; i++) {
			pivot = leftBound + ((rightBound - leftBound)/2);
			if(pivot >= originalPivot && i != depth-1) {
				node = node.left;
				rightBound = pivot;
			} else if (pivot < originalPivot){
				node = node.right;
				leftBound = pivot+1;
			} else {
                if(originalPivot % 2 == 0) node = node.right;
                else node = node.left;
            }
		}
		
		if(node == null) return false;
		return true;
	}

}
