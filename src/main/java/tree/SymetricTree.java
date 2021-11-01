package tree;

import java.util.ArrayList;
import java.util.List;

public class SymetricTree {
	 static List<Integer> li = new ArrayList<Integer>();
	public static void main(String[] args) {
		SymetricTree ld = new SymetricTree();
		TreeNode root;
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.right = new TreeNode(3);
		root.right.right = new TreeNode(3);
		
		boolean flag = isSymetric(root);
		System.out.println(flag);
		
	}
	
	

	private static boolean isSymetric(TreeNode res) {
		return isMirror(res, res);
	}



	private static boolean isMirror(TreeNode t1, TreeNode t2) {
		if(t1 == null && t2 == null) return true;
		if(t1==null || t2==null) return false;
		
		
		return (t1.val==t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
		
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
