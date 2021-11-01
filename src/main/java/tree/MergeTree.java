package tree;

import java.util.ArrayList;
import java.util.List;

import tree.InvertBinaryTree.TreeNode;

public class MergeTree {
	private static int diameter =0 ;
	 static List<Integer> li = new ArrayList<Integer>();
	public static void main(String[] args) {
		MergeTree ld = new MergeTree();
		TreeNode root;
		TreeNode root2;
		root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.left.left = new TreeNode(4);
		
		root2 = new TreeNode(4);
		root2.left = new TreeNode(3);
		root2.right = new TreeNode(6);
		
		TreeNode result = mergeTree(root, root2);
		printTreeNode(result);
		
	}
	
	private static void printTreeNode(TreeNode res) {
		if(res == null) return;
		System.out.println(res.val);
		
		printTreeNode(res.left);
		printTreeNode(res.right);
	}
	

	private  static TreeNode mergeTree(TreeNode t1, TreeNode t2) {
		if(t1==null) return t2;
		if(t2==null) return t1;
		
		t1.val = t1.val + t2.val;
		t1.left = mergeTree(t1.left, t2.left);
		t1.right = mergeTree(t1.right, t2.right);
		
		return t1;
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
