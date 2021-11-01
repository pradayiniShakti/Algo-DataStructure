package tree;

import java.util.ArrayList;
import java.util.List;

public class MinimumDiffOfNodes {
	private static Integer prev, minDiff;
	public static void main(String[] args) {
		MinimumDiffOfNodes ld = new MinimumDiffOfNodes();
		TreeNode root;
		root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.right = new TreeNode(3);
		root.left.left = new TreeNode(1);
		int result = minDiffOfNode(root);
		
		System.out.println(result);

	}
	
	

	private static int minDiffOfNode(TreeNode root) {
		prev = null;
		minDiff = Integer.MAX_VALUE;
		getMin(root);
		return minDiff;
		
	}

	private static void getMin(TreeNode node) {
		if(node==null) return;
		getMin(node.left);
		if(prev!=null) {
			minDiff = Math.min(minDiff, node.val - prev);
		}
		prev = node.val;
		getMin(node.right);
		
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
