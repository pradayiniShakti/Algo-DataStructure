package tree;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
	static TreeNode curr;
	public static void main(String[] args) {
		IncreasingOrderSearchTree ld = new IncreasingOrderSearchTree();
		TreeNode root;
		root = new TreeNode(5);
		root.left = new TreeNode(1);
		root.right = new TreeNode(7);
		//root.left.right = new TreeNode(5);
		TreeNode result = increasingOrder(root);
		printNode(result);
		
	}
	
	

	private static void printNode(TreeNode node) {
		if(node==null) return;
		System.out.println(node.val);
		printNode(node.left);
		printNode(node.right);
		
	}



	private static TreeNode increasingOrder(TreeNode root) {
		TreeNode ans = new TreeNode(0);
		curr = ans;
		getIncreasing(root);
		
		return ans.right ;
		
	}

	private static void getIncreasing(TreeNode node) {
		if(node==null) return;
		getIncreasing(node.left);
		node.left =null;
		curr.right = node;
		curr = node;
		
		getIncreasing(node.right);
		
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
