// binary tree from inorder and postorder


class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
	int inStart = 0;
	int inEnd = inorder.length - 1;
	int postStart = 0;
	int postEnd = postorder.length - 1;
 
	return helper(inorder, inStart, inEnd, postorder, postStart, postEnd);
}
    
public TreeNode helper(int[] inorder, int inStart, int inEnd,
		int[] postorder, int postStart, int postEnd) {
	if (inStart > inEnd || postStart > postEnd)
		return null;
 
	int rootValue = postorder[postEnd];
	TreeNode root = new TreeNode(rootValue);
 
	int pos = 0;
	for (int i = 0; i < inorder.length; i++) {
		if (inorder[i] == rootValue) {
			pos = i;
			break;
		}
	}
 
	root.left = helper(inorder, inStart, pos - 1, postorder, postStart,
			postStart + pos - (inStart + 1));
	// Becuase k is not the length, it it need to -(inStart+1) to get the length
	root.right = helper(inorder, pos + 1, inEnd, postorder, postStart + pos- inStart, postEnd - 1);
	// postStart+k-inStart = postStart+k-(inStart+1) +1
 
	return root;
}
}
