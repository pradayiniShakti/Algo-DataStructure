package tree;

import java.util.ArrayList;
import java.util.List;

public class LongestDiameter {
	private static int diameter =0 ;
	 static List<Integer> li = new ArrayList<Integer>();
	public static void main(String[] args) {
		LongestDiameter ld = new LongestDiameter();
		TreeNode root;
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.left.left = new TreeNode(4);
		
		int result = longestDiameter(root);
		System.out.println(result);
		
	}
	
	

	private static int longestDiameter(TreeNode res) {
		//diameter = 0;
		diameter = getLongestPath(res);
		
		return diameter;
	}



	private static int getLongestPath(TreeNode node) {
		if(node == null) return 0;
		int leftPath = getLongestPath(node.left);
		int rightPath = getLongestPath(node.right);
		diameter = Math.max(diameter, leftPath+rightPath);
		
		return Math.max(leftPath, rightPath)+1;
		
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
