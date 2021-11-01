package tree;

import java.util.ArrayList;
import java.util.List;

public class RangeSumBST {
	static int sum;
	public static void main(String[] args) {
		TreeNode root;
		int low = 7, high = 15;
		root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.right = new TreeNode(7);
		root.left.left = new TreeNode(3);
		root.right.right = new TreeNode(18);
		int result = rangeSum(root, low,high);
		System.out.println(result);
		
	}
	
	

	private static void printNode(TreeNode node) {
		if(node==null) return;
		System.out.println(node.val);
		printNode(node.left);
		printNode(node.right);
		
	}



	private static int rangeSum(TreeNode root,int low, int high) {
		sum = 0;
		dfs(root,low,high);
		return sum;
		
	}

	private static void dfs(TreeNode node,int l, int h) {
		if(node!=null) {
			if(node.val >=l && node.val <=h) {
				sum = sum + node.val;
			}
			if(l< node.val) {
				dfs(node.left, l, h);
			}
			if(h>node.val) {
				dfs(node.right, l , h);
			}
		}
		
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
