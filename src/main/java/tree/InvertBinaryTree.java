package tree;

import java.util.ArrayList;
import java.util.List;

public class InvertBinaryTree {
	 static List<Integer> li = new ArrayList<Integer>();
	public static void main(String[] args) {
		//InvertBinaryTree ld = new InvertBinaryTree();
		TreeNode root;
		root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		
		TreeNode res = invertTree(root);
		printTreeNode(res);
		
	}
	
	

	private static void printTreeNode(TreeNode res) {
		if(res == null) return;
		System.out.println(res.val);
		
		printTreeNode(res.left);
		printTreeNode(res.right);
	}



	private static TreeNode invertTree(TreeNode root) {
		if(root==null) return null;
		TreeNode right = invertTree(root.right);
		TreeNode left = invertTree(root.left);
		root.left = right;
		root.right = left;
		
		return root;
		
	}

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val){
			this.val = val;
		}
		
		TreeNode(int val, TreeNode left, TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
		}

}
	
}
